package br.com.lp2.fundatec.TI20LP2APIestacionamento.Calculo;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TempoTipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Tarifa;


public class ContaAteMeiaHora implements ContaStrategy {
    @Override
    public boolean contaEhDoTipoTarifa(Tarifa tarifa){
        return TempoTipoTarifa.ATE_MEIA_HORA == tarifa.getTipoTarifa();
    }
    @Override
    public double calcularValor(Conta conta, Tarifa tarifa){
        return tarifa.getValor().doubleValue();
    }
}
