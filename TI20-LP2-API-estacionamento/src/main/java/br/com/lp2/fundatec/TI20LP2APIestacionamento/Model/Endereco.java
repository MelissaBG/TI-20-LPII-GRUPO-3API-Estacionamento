package br.com.lp2.fundatec.TI20LP2APIestacionamento.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ENDERECO")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_endereco;

    @Column(nullable = false, name = "LOGRADOURO")
    private String logradouro;

    @Column(nullable = false, name = "NUMERO")
    private  String numero;

    @Column(nullable = false, name = "CEP")
    private String cep;
}
