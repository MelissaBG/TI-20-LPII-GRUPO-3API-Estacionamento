package br.com.lp2.fundatec.TI20LP2APIestacionamento.Service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Tarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.TarifaService;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TipoCliente;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Repository.AssinanteRepository;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Repository.ContaRepository;
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
        ValorTarifaPorTempo valorTarifaPorTempo = ContaCalcular.calcularPorTempo(conta);
        Tarifa valorTarifaFinal = tarifaService.findByTipoTarifaAndTipoVeiculo(valorTarifaPorTempo, tipoVeiculo);
        conta.setValor(valorTarifaFinal.getValor());
        aplicarDesconto(conta);
        return ContaRepository.save(conta);
    }

    public Conta aplicarDesconto(Conta conta){
        if (conta.getTipoCliente().equals(TipoCliente.ASSINANTE)){
            BigDecimal valor = conta.getValor();
            BigDecimal porcentagemDesconto = new BigDecimal(); // Como passar o descontp?
            BigDecimal valorComDesconto = valor.multiply(porcentagemDesconto);
            conta.setValor(valorComDesconto);
            return conta;
        }
        return conta;
    }
}
