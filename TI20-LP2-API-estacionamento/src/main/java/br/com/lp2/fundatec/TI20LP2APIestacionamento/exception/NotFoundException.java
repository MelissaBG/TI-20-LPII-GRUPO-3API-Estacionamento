package br.com.lp2.fundatec.TI20LP2APIestacionamento.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class NotFoundException
	extends RuntimeException {

	private final String mensagem;
	
}
