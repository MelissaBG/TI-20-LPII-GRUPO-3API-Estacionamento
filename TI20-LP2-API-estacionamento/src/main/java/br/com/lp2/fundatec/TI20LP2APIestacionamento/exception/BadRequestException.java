package br.com.lp2.fundatec.TI20LP2APIestacionamento.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class BadRequestException 
	extends RuntimeException {

	private final String mensagem;
	
}
