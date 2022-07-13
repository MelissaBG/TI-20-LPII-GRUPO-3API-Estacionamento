package br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Endereco;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Assinate {
    @Id
    @GeneratedValue
    private Long id_assinante;
    @Column(nullable = false, length = 12)
    private String cpf;
    @Column(nullable = false, precision = 9, scale = 2)
    private BigDecimal credito;
    @Column(name = "dt_nascimento", nullable = false)
    private LocalDate data_nascimento;
    @Column(nullable = false, length = 100)
    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    //FK
    private Endereco endereco;

    public void debitarCredito(double debito){
        credito = credito.subtract(BigDecimal.valueOf(debito));
    }

}
