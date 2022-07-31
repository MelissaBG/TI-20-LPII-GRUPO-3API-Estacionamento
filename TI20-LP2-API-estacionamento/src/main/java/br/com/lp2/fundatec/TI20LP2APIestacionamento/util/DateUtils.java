package br.com.lp2.fundatec.TI20LP2APIestacionamento.util;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public final class DateUtils {

	private DateUtils() {

		throw new UnsupportedOperationException();
	}

	public static long obterTempoEmMinutos(LocalDateTime inicio, LocalDateTime fim) {
		return ChronoUnit.MINUTES.between(inicio, fim);
	}

}
