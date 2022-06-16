package br.com.lp2.fundatec.TI20LP2APIestacionamento.model;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoVeiculo;
import com.sun.istack.NotNull;

import javax.persistence.Column;

public class Tarifa {

    private Integer id;
    private TipoTarifa tipoTarifa;
    private TipoVeiculo tipoVeiculo;

    @NotNull(message = "É obrigatorio cadastrar um valor.")
    @Column(name = "")
    private Double valor;
}
