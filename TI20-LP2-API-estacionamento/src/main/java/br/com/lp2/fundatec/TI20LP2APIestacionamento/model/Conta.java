package br.com.lp2.fundatec.TI20LP2APIestacionamento.model;

import java.time.LocalDateTime;

import javax.persistence.*;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoTarifa;
import lombok.Data;

@Data
@Entity
public class Conta {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;
	
	private LocalDateTime entrada;
	
	private LocalDateTime saida;

	private Double valor;
	
	@Enumerated(EnumType.STRING)
	private TipoTarifa tipoTarifa;
	
}
