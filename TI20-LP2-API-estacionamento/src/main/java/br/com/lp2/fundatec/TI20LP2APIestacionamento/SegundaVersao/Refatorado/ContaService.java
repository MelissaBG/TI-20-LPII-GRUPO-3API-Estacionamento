package br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.repository.AssinanteRepository;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.repository.ContaRepository;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.repository.TarifaRepository;
import org.springframework.stereotype.Service;

import java.io.NotActiveException;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ContaService {

    private final ContaRepository contaRepository;
    private final TarifaRepository tarifaRepository;
    private final AssinanteService assinanteService;
    private final List <ContaStrategy> contaStrategies;
    private final ContaStrategy contaStrategy;
    private final VeiculoService veiculoService;
    private final AssinanteRepository assinanteRepository;

    public ContaService(ContaRepository contaRepository, VeiculoService veiculoService,
                        TarifaRepository tarifaRepository, AssinanteService assinanteService, ContaStrategy contaStrategy){
        this.contaRepository = contaRepository;
        this.veiculoService = veiculoService;
        this.assinanteService = assinanteService;
        this.tarifaRepository = tarifaRepository;
        this.contaStrategy = contaStrategy;
    }
    public Conta encerrar (Long id) {
        Conta conta = recuperarContaParaEncerrar(id);
        Tarifa tarifa = recuperarTarifa(conta);
        calcularValorConta(conta, tarifa);
        aplicarDescontoParaAssinantes(conta);
        return contaRepository.save(conta);
    }

    public Conta recuperar(String placa){
        List<Conta> contas = contaRepository.findByVeiculoPlaca(placa);
        return contas.get(0);
    }

    public Conta criar(String placa){
        Veiculo veiculo = recuperarVeiculoDaConta(placa);
        Conta conta = buildConta(veiculo);
        return contaRepository.save(conta);
    }

    private Veiculo recuperarVeiculoDaConta(String placa){
        return veiculoService.findByPlaca(placa);
    }

    private Conta buildConta(Veiculo veiculo){
        return Conta.builder()
                .veiculo(veiculo)
                .entrada(LocalDateTime.now())
                .build();
    }

    private Conta recuperarContaParaEncerrar(Long id){
        Conta conta = contaRepository.findById(id).orElseThrow(NotActiveException::new);
        conta.setSaida(LocalDateTime.now());
        return conta;
    }

    private Tarifa recuperarTarifa(Conta conta){
        return tarifaRepository.findByTipoTarifaAndTipoVeiculo(conta.getTipoTarifa(), conta.getVeiculo().getTipoVeiculo());
    }
    private void calcularValorConta(br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Conta conta, br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Tarifa tarifa){
        ContaStrategy contaStrategy = contaStrategies
                .stream()
                .filter(strategy -> strategy.contaSeEhDoTipoTarifa()
                .findFirst()
                .orElseThrow());
        contaStrategy.aplicarValor(conta, tarifa);
    }
    private void debitarValorContaDoCreditoEmContaAssinante(Conta conta){
        Assinante assinante = conta.getVeiculo().getAssinante();
        assinante.debitarCredito(conta.getValor().doubleValue());
        assinanteRepository.save(assinante);
    }

}
