package br.com.lp2.fundatec.TI20LP2APIestacionamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoVeiculo;
import lombok.Data;

@Data
@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "Tipo do veículo")
	private TipoVeiculo tipoVeiculo;
	
	@Column(name = "Placa")
	private String placa;
	
	@Column(nullable = true)
	private Assinante assinante;
	
	@Column(name = "Cor")
	private String cor;
}
