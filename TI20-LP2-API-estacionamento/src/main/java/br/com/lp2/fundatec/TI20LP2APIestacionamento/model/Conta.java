package br.com.lp2.fundatec.TI20LP2APIestacionamento.model;

<<<<<<< HEAD:TI20-LP2-API-estacionamento/src/main/java/br/com/lp2/fundatec/TI20LP2APIestacionamento/model/Conta.java
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Enums.Status;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Enums.TipoCliente;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Enums.TipoVeiculo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
=======
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.Status;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TipoCliente;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TipoVeiculo;
import lombok.*;
>>>>>>> b8582e9853ed6d4a8cd6758e4476db8ec9e41795:TI20-LP2-API-estacionamento/src/main/java/br/com/lp2/fundatec/TI20LP2APIestacionamento/Model/Conta.java

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tbl_conta")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idconta;

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
