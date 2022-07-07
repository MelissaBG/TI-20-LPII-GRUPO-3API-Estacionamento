package br.com.lp2.fundatec.TI20LP2APIestacionamento.service.Refatorado.Calculo;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Enums.TipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Tarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.service.Refatorado.ContaStrategy;

public class ContaHoraAdicional implements ContaStrategy {
    return TipoTarifa.HORA_ADICIONAL == tarifa.getTipoTarifa();
}

@Override
public double calcularValor(Conta conta, Tarifa tarifa){
    double valorAteUmaHora = recuperarValorAteUmHora(conta);
    double valorHoraAdiconal = tarifa.getValor().doubleValue();
    long horasEcedentes = conta.getHorasExedentes();

    return valorAteUmaHora = valorHoraAdiconal * horasExcedentes;
}

private double recuperarValorAteUmHora(Conta conta){
    TipoVeiculo tipoVeiculo = conta.getVeiculo().getTipo();
    return tarifaRepository.findByTipoTarifaAndTipoVeiculo(TipoTarifa.ATE_UMA_HORA, tipoVeiculo).getValor().doubleValor();
}