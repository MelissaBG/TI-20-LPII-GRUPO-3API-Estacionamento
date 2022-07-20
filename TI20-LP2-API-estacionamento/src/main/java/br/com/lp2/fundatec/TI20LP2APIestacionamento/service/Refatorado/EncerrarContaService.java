package br.com.lp2.fundatec.TI20LP2APIestacionamento.service.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.AssinanteRepository;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.ContaRepository;
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
    private final EncerraContaValidation validation;

    public Conta encerrar (Long id) {
        Conta conta = recuperarContaParaEncerrar(id);
        validation.validar(conta);
        Tarifa tarifa = recuperarTarifa(conta);
        calcularValorConta(conta, tarifa);
        aplicarDescontoParaAssinates(conta);
        return contaRepository.save(conta);
    }
    private Conta recuperarContaParaEncerrar(Long, id){
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
                .filter(strategy -> strategy.contaSeEhDoTipoDeTarifa(tarifa))
                .findFirst()
                .orElseThriw());
        contaStrategy.aplicarValor(conta, tarifa);
    }
    private void debitarValorContaDoCreditoEmContaAssinante(Conta conta){
        Assinante assinante = conta.getVeiculo().getAssinate();
        assinante.debitarCredito(conta.getValor().doubleValue());
        assinanteRepository.saveAllAndFlush(assinante);
    }
}
