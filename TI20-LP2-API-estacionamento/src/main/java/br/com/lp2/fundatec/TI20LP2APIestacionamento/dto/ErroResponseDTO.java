package br.com.lp2.fundatec.TI20LP2APIestacionamento.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ErroResponseDTO implements ResponseDTO {

	private final String mensagem;
	private final LocalDateTime dataHora;
	
	public ErroResponseDTO(String mensagem) {
		this.mensagem = mensagem;
		this.dataHora = LocalDateTime.now();
	}
	
}
