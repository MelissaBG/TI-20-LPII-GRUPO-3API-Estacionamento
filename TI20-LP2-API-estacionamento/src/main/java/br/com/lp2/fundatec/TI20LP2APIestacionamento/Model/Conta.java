package br.com.lp2.fundatec.TI20LP2APIestacionamento.Model;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.Status;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TipoCliente;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TipoVeiculo;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table
@Builder
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_contaS;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true, name = "TIPO_CLIENTE")
    private TipoCliente tipoCliente;

    @Column(nullable = true, name = "STATUS")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,name = "VEICULO")
    private TipoVeiculo tipoVeiculo;

    @Column(nullable = false, name = "ENTRADA")
    private LocalDateTime entrada;

    @Column(nullable = false, name = "SAIDA")
    private LocalDateTime saida;

    @Column(nullable = false, name = "VALOR")
    private BigDecimal valor;
}
