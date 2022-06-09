package br.com.lp2.fundatec.TI20LP2APIestacionamento.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoVeiculo;
import lombok.Data;

@Data
@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "tipo_veiculo")
	@Enumerated(EnumType.STRING)
	private TipoVeiculo tipoVeiculo;
	
	@Column(name = "placa")
	private String placa;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(nullable = true, name = "id_assinante", referencedColumnName = "id")
	private Assinante assinante;
	
	@Column(name = "cor")
	private String cor;
}
