package br.com.lp2.fundatec.TI20LP2APIestacionamento.utils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateUtils {
    private DateUtils() {
        throw new UnsupportedOperationException();
    }

    public static long obterTempoEmMinutos(LocalDateTime inicio, LocalDateTime fim) {
        return ChronoUnit.MINUTES.between(inicio, fim);
    }
}
