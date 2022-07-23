package br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado.Enums.TipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado.Enums.TipoVeiculo;

public class Tarifa {
    id_tarifa;
    TipoVeiculo;
    TipoTarifa;
    valor;
    public Double retornarValor(Tarifa tarifa){
        return tarifa.getValor();
    }
}
