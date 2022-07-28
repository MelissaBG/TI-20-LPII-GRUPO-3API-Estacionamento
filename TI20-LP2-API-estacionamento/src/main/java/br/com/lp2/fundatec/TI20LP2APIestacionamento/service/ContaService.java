package br.com.lp2.fundatec.TI20LP2APIestacionamento.service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.ResponseContaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Enums.Status;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Enums.TempoTipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Enums.TipoCliente;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.AssinanteRepository;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class ContaService {
    @Autowired
    private ContaRepository contaRepository;

    private AssinanteRepository assinanteRepository;

    private TarifaService tarifaService;
    public Conta fecharConta(Conta conta){
        Conta conta = new Conta();
        TipoVeiculo tipoVeiculo =conta.getTipoVeiculo() //Duvida: é conta.get?
        conta.setTipoVeiculo(tipoVeiculo);
        conta.setValor(conta.getValor());
        conta.setEntrada(conta.getEntrada());
        conta.setSaida(conta.getSaida());
        conta.setStatus(conta.getStatus());
        conta.setTipoCliente(conta.getTipoCliente());
        TempoTipoTarifa tempoTipoTarifa = ContaCalcular.calcularPorTempo(conta);
        Tarifa valorTarifaFinal = tarifaService.findByTipoTarifaAndTipoVeiculo(tempoTipoTarifa, tipoVeiculo);
        conta.setValor(valorTarifaFinal.getValor());
        aplicarDesconto(conta);
        return ContaRepository.save(conta);
    }

    public Conta aplicarDesconto(Conta conta){
        if (conta.getTipoCliente().equals(TipoCliente.ASSINANTE)){
            BigDecimal valor = conta.getValor();
            BigDecimal porcentagemDesconto = new BigDecimal(0.15);
            BigDecimal valorComDesconto = valor.multiply(porcentagemDesconto);
            conta.setValor(valorComDesconto);
            return conta;
        }
        return conta;
    }
    public ResponseContaDTO pagarConta(Long idConta, Long idAssinante){
        Assinante assinante = assinanteRepository.findAllById(idAssinante).get();
        Conta conta = contaRepository.findById(idConta);
        BigDecimal valor = conta.getValor();
        BigDecimal creditoDisponivel = assinante.getCreditoDiponivel();
        BigDecimal restante = creditoDisponivel.subtract(valor);
        conta.setStatus(Status.INATIVA);
        assinante.setCreditoDiponivel(restante);
        return ResponseContaDTO.converterParaResponse(conta);
    }
}
