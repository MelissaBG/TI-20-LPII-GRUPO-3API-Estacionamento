package br.com.lp2.fundatec.TI20LP2APIestacionamento.Model;

//import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Endereco;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Endereco;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TipoCliente;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Assinante")
public class Assinante {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAssinante;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(nullable = false, name = "Total_do_credito")
    private BigDecimal creditoDiponivel;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true, name = "Tipo_cliente")
    private TipoCliente tipoCliente;

    @OneToOne()
    @JoinColumn(name = "enderereco")
    private Endereco endereco;
}