package br.com.lp2.fundatec.TI20LP2APIestacionamento.service.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Tarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Veiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.ContaRepository;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.TarifaRepository;
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
    private final VeiculoService veiculoService;

    public ContaService(ContaRepository contaRepository, VeiculoService veiculoService,
                        TarifaRepository tarifaRepository, AssinanteService assinanteService){
        this.contaRepository = contaRepository;
        this.veiculoService = veiculoService;
        this.assinanteService = assinanteService;
        this.tarifaRepository = tarifaRepository;
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
}
