package br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Enums;

public enum TipoTarifa {
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
