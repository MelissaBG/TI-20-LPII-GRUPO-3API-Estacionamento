package br.com.lp2.fundatec.TI20LP2APIestacionamento.Model;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TipoVeiculo;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity(name = "TARIFA")
public class Tarifa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tarifa;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true, name = "TIPO_VEICULO")
    private TipoVeiculo tipoVeiculo;

    @Column(nullable = true, name = "VALOR")
    private BigDecimal valor;
}