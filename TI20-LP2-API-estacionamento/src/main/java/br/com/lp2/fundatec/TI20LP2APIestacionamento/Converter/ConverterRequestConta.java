package br.com.lp2.fundatec.TI20LP2APIestacionamento.Converter;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.DTO.RequestContaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Conta;

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
