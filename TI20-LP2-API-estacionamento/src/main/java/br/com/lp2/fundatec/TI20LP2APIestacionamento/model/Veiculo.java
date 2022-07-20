package br.com.lp2.fundatec.TI20LP2APIestacionamento.model;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoVeiculo;

import javax.persistence.*;

@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_veiculo;
	
	@Column(nullable = false, name = "tipo_veiculo")
	@Enumerated(EnumType.STRING)
	private TipoVeiculo tipoVeiculo;

	public TipoVeiculo EhTipoVeiculo() {
		return tipoVeiculo;
	}

	@Column(name = "placa", length = 7, unique = true, nullable = false)
	private String placa;
	
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(nullable = true, name = "id_assinante", referencedColumnName = "id")
	private Assinante assinante;

	public boolean possuiAssinatura (){
		return assinante != null;
	}
	
	@Column(name = "conta")
	private Conta conta;
}
