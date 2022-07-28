package br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums;

public enum TempoTipoTarifa {
    ATE_MEIA_HORA,
    ATE_UMA_HORA,
    HORA_ADICIONAL,
    DIARIA;

    public static TempoTipoTarifa obterTempoEmMinutos(long tempoEmMinutos){
        if (tempoEmMinutos <= 30){
            return TempoTipoTarifa.ATE_MEIA_HORA;
        }
        if(tempoEmMinutos <= 60){
            return TempoTipoTarifa.ATE_UMA_HORA;
        }
        if (tempoEmMinutos <= 60 * 6){
            return TempoTipoTarifa.HORA_ADICIONAL;
        }
        return DIARIA;
    }
}
