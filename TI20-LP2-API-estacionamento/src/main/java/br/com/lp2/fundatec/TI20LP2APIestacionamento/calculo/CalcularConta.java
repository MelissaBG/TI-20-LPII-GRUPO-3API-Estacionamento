package br.com.lp2.fundatec.TI20LP2APIestacionamento.calculo;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Conta;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcularConta {
    public static calcularTarifaComBaseNoTempo(Conta conta){
        LocalDateTime entrada = conta.getEntrada();
        LocalDateTime saida = conta.getSaida();
        Long calculoTempoEmMinutos = ChronoUnit.MINUTES.between(entrada, saida);
        return calcularTarifaComBaseNoTempo.obterTempo(calculoTempoEmMinutos);
    }
}
