package br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado.Enums.TipoTarifa;

import javax.persistence.Enumerated;

@Enumerated
public enum TempoTipoTarifa {
    ATE_MEIA_HORA,
    ATE_UMA_HORA,
    HORA_ADICIONAL,
    DIARIA;

    public static TipoTarifa obterTempoEmMinutos(long tempoEmMinutos){
        if (tempoEmMinutos <= 30){
            return ATE_MEIA_HORA;
        }
        if(tempoEmMinutos <= 60){
            return ATE_UMA_HORA;
        }
        if (tempoEmMinutos <= 60 * 6){
            return HORA_ADICIONAL;
        }
        return DIARIA;
    }
}
