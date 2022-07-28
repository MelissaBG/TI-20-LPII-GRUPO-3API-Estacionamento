package br.com.lp2.fundatec.TI20LP2APIestacionamento.converter;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.RequestContaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Conta;

public class ConverterRequestConta {
    public static RequestContaDTO converterParaDTO(Conta conta){
        RequestContaDTO requestContaDTO = new RequestContaDTO();
        requestContaDTO.setIdConta(conta.getIdconta());
        requestContaDTO.setStatus(conta.getStatus());
        requestContaDTO.setTipoCliente(conta.getTipoCliente());
        requestContaDTO.setTipoVeiculo(conta.getTipoVeiculo());
        requestContaDTO.setValor(conta.getValor());
        return requestContaDTO;
    }
}
