package br.com.lp2.fundatec.TI20LP2APIestacionamento.Service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.DTO.ResponseContaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.Status;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TempoTipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TipoCliente;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Tarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Repository.AssinanteRepository;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Repository.ContaRepository;
import lombok.extern.java.Log;
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
