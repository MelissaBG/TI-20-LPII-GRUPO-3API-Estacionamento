package br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoTarifa;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Conta {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_conta;
	
	@ManyToOne
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;
	
	private LocalDateTime entrada;
	
	private LocalDateTime saida;

	private Double valor;
	
	@Enumerated(EnumType.STRING)
	private TipoTarifa tipoTarifa;
	
}