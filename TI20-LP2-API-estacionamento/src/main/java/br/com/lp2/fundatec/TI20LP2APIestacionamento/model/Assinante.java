package br.com.lp2.fundatec.TI20LP2APIestacionamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
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
	
	
	private Endereco endereco;

	
	private Plano plano;
}
