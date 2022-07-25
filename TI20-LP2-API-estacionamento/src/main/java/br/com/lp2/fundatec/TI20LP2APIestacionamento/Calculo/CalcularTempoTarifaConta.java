package br.com.lp2.fundatec.TI20LP2APIestacionamento.Calculo;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Conta;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcularTempoTarifaConta {
    @Autowired
    private Conta conta;
    public static calcularTarifaComBaseNoTempo(Conta conta){
        LocalDateTime entrada = conta.getEntrada();
        LocalDateTime saida = conta.getSaida();
        Long calculoTempoEmMinutos = ChronoUnit.MINUTES.between(entrada, saida);
        return calcularTempoTarifaConta.obterTempo(calculoTempoEmMinutos);
    }
}
