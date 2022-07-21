package br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Assinante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "telefone")
	private String telefone;

	@Column(name = "crédito")
	private BigDecimal credito;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_endereco", referencedColumnName = "id")
	private Endereco endereco;


    public void debitarCredito(double doubleValue) {
    }
}
