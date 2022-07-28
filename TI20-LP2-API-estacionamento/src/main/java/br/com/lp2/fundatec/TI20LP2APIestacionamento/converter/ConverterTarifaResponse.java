package br.com.lp2.fundatec.TI20LP2APIestacionamento.converter;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.ResponseTarifaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;

public class ConverterTarifaResponse {

    public static ResponseTarifaDTO converterParaResponse(Tarifa tarifa) {
        ResponseTarifaDTO dto = new ResponseTarifaDTO();
        dto.setTipoTarifa(tarifa.getTipoTarifa());
        dto.setTipoVeiculo(tarifa.getTipoVeiculo());
        dto.setValor(tarifa.getValor());
        return dto;
    }

}
