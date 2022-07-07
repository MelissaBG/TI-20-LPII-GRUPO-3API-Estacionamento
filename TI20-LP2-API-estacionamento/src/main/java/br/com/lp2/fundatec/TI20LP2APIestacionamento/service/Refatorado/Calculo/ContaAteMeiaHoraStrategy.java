package br.com.lp2.fundatec.TI20LP2APIestacionamento.service.Refatorado.Calculo;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Enums.TipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.service.Refatorado.ContaStrategy;

import javax.swing.plaf.PanelUI;

public class ContaAteMeiaHoraStrategy implements ContaStrategy {
    @Override
    public boolean contaEhDoTipoTarifa(Tarifa tarifa){
        return TipoTarifa.ATE_MEIA_HORA == tarifa.getTipoTarifa();
    }
    @Override
    public double calcularValor(Conta conta, Tarifa tarifa){
        return tarifa.getValor().doubleValue();
    }
}
