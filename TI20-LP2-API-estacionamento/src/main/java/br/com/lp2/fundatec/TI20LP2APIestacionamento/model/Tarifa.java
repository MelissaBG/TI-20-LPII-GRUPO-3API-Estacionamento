package br.com.lp2.fundatec.TI20LP2APIestacionamento.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoTarifa;
import lombok.Data;

@Data
@Entity
public class Tarifa {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Veiculo veiculo;
	
	private LocalDateTime entrada;
	
	private LocalDateTime saida;
	
	@Enumerated(EnumType.STRING)
	private TipoTarifa tipoTarifa;
	
}
