package br.com.lp2.fundatec.TI20LP2APIestacionamento.model;


import lombok.Getter;
import lombok.Setter;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TempoTipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TipoVeiculo;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Getter
@Setter
@Entity
@Table(name = "tbl_tarifa")
@NoArgsConstructor
@AllArgsConstructor
public class Tarifa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true, name = "tipo_veiculo")
    private TipoVeiculo tipoVeiculo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true, name = "tipo_tarifa")
    private TempoTipoTarifa tipoTarifa;


    @Column(nullable = true, name = "valor")
    private BigDecimal valor;
}
}
