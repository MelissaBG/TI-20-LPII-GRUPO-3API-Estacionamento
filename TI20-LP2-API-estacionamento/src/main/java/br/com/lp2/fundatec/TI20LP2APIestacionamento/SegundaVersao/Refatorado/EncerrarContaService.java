package br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Tarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.repository.AssinanteRepository;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.repository.ContaRepository;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.repository.TarifaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.NotActiveException;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EncerrarContaService {
    private final ContaRepository contaRepository;
    private final TarifaRepository tarifaRepository;
    private final AssinanteRepository assinanteRepository;
    private final List <ContaStrategy> contaStrategies;

    public Conta encerrar (Long id) {
        Conta conta = recuperarContaParaEncerrar(id);
        Tarifa tarifa = recuperarTarifa(conta);
        calcularValorConta(conta, tarifa);
        aplicarDescontoParaAssinantes(conta);
        return contaRepository.save(conta);
    }
    private Conta recuperarContaParaEncerrar(Long id){
        Conta conta = contaRepository.findById(id).orElseThrow(NotActiveException::new);
        conta.setDth_saida(LocalDateTime.now());
        return conta;
    }
    private Tarifa recuperarTarifa(Conta conta){
        return tarifaRepository.findByTipoTarifaAndTipoVeiculo(conta.getTipoTarifa(),conta.getVeiculo().getTipo());
    }
    private void calcularValorConta(Conta conta, Tarifa tarifa){
        ContaStrategy contaStrategy = contaStrategies
                .stream()
                .filter(strategy -> strategy.
                .findFirst()
                .orElseThrow());
        contaStrategy.aplicarValor(conta, tarifa);
    }
    private void debitarValorContaDoCreditoEmContaAssinante(Conta conta){
        Assinante assinante = conta.getVeiculo().getAssinate();
        assinante.debitarCredito(conta.getValor().doubleValue());
        assinanteRepository.saveAllAndFlush(assinante);
    }
}
