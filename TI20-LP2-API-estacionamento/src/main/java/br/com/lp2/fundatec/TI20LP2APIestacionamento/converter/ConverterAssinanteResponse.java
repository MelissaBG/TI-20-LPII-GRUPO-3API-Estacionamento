package br.com.lp2.fundatec.TI20LP2APIestacionamento.converter;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.ResponseAssinanteDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Assinante;

public class ConverterAssinanteResponse {
    public static ResponseAssinanteDTO converterParaResponse(Assinante assinante){
        ResponseAssinanteDTO responseAssinanteDTO = new ResponseAssinanteDTO();
        responseAssinanteDTO.setNome(assinante.getNome());
        responseAssinanteDTO.setCpf(assinante.getCpf());
        responseAssinanteDTO.setEndereco(assinante.getEndereco());
        responseAssinanteDTO.setCreditoDisponivel(assinante.getCreditoDiponivel());
        responseAssinanteDTO.setVeiculo(assinante.getVeiculo());
        responseAssinanteDTO.setTipoCliente(assinante.getTipoCliente());
        return responseAssinanteDTO;
    }
}
