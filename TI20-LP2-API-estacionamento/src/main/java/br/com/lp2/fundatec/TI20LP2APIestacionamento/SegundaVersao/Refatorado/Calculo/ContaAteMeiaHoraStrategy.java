package br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado.Calculo;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado.ContaStrategy;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado.Enums.TipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Tarifa;

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
