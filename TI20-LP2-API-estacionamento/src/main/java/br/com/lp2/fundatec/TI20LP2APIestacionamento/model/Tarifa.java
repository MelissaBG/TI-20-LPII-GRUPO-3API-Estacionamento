package br.com.lp2.fundatec.TI20LP2APIestacionamento.model;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoVeiculo;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Tarifa {

    @Id
    private Integer id;

    @Enumerated(EnumType.STRING)
    private TipoTarifa tipoTarifa;

    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;

    //@NotNull(message = "É obrigatorio cadastrar um valor.")
    @Column(name = "valor")
    private Double valor;
}
