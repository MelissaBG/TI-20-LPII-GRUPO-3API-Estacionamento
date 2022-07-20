package br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo;

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

    @Column(name = "valor")
    private Double valor;

    public Double retornarValor(Tarifa tarifa){
        return tarifa.getValor();
    }
}
