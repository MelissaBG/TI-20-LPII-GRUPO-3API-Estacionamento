package br.com.lp2.fundatec.TI20LP2APIestacionamento.converter;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.RequestTarifaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;

public class ConverterRequestTarifa {

    public static RequestTarifaDTO converterParaDTO(Tarifa entity) {
        RequestTarifaDTO request = new RequestTarifaDTO();
        request.setId(entity.getId());
        request.setTipoTarifa(entity.getTipoTarifa());
        request.setTipoVeiculo(entity.getTipoVeiculo());
        request.setValor(entity.getValor());
        return request;
    }

}
