package br.com.lp2.fundatec.TI20LP2APIestacionamento.Converter;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.DTO.ResponseContaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Conta;

public class ConverterContaResponse {
    public static ResponseContaDTO converterParaResponse(Conta conta){
        ResponseContaDTO responseContaDTO = new ResponseContaDTO();
        responseContaDTO.setStatus(conta.getStatus());
        responseContaDTO.setValor(conta.getValor());
        return responseContaDTO;
    }
}
