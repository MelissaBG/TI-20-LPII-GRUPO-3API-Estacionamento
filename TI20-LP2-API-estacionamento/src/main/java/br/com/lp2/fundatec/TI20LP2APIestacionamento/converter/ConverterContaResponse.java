package br.com.lp2.fundatec.TI20LP2APIestacionamento.converter;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.ResponseContaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Conta;

public class ConverterContaResponse {
    public static ResponseContaDTO converterParaResponse(Conta conta){
        ResponseContaDTO responseContaDTO = new ResponseContaDTO();
        responseContaDTO.setStatus(conta.getStatus());
        responseContaDTO.setValor(conta.getValor());
        return responseContaDTO;
    }
}
