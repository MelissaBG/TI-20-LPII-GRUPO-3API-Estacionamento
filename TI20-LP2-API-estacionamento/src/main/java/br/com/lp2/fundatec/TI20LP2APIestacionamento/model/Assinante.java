package br.com.lp2.fundatec.TI20LP2APIestacionamento.model;

//import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Endereco;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TipoCliente;
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
@Table(name = "tbl_assinante")
public class Assinante {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Assinante;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(nullable = false, name = "Veiculo")
    @OneToOne
    private Veiculo veiculo;

    @Column(nullable = false, name = "Total_do_credito")
    private BigDecimal creditoDiponivel;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true, name = "Tipo_cliente")
    private TipoCliente tipoCliente;

    @OneToOne()
    @JoinColumn(name = "enderereco")
    private Endereco endereco;

    public Assinante(Long id_Assinante, String nome, String cpf,
                     Veiculo veiculo, BigDecimal creditoDiponivel,
                     TipoCliente tipoCliente, Endereco endereco) {
        this.id_Assinante = getId_Assinante();
        this.nome = nome;
        this.cpf = cpf;
        this.veiculo = veiculo;
        this.creditoDiponivel = creditoDiponivel;
        this.tipoCliente = tipoCliente;
        this.endereco = endereco;
    }
}
