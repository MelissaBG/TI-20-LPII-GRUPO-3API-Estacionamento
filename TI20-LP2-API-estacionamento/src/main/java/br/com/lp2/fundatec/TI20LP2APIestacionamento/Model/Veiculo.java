package br.com.lp2.fundatec.TI20LP2APIestacionamento.Model;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TipoVeiculo;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "VEICULO")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "TIPO_VEICULO")
    private TipoVeiculo tipoVeiculo;

    @Column(nullable = false, name = "PLACA")
    private String placa;
}
