package br.com.lp2.fundatec.TI20LP2APIestacionamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.UF;
import lombok.Data;

@Data
@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	private UF uf;
	
	@Column(nullable = false, name = "cidade")
	private String cidade;
	
	@Column(nullable = false, name = "bairro")
	private String bairro;
	
	@Column(nullable= false,  name = "CEP")
	private String cep;
	
	@Column(nullable = false, name = "rua")
	private String rua;
	
	@Column(nullable= false, name = "numero")
	private Integer numero;
	
	@Column(nullable= false, name = "complemento")
	private String complemento;
}
