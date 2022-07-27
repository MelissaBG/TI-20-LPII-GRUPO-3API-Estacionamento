package br.com.lp2.fundatec.TI20LP2APIestacionamento.Converter;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.DTO.RequestAssinanteDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Assinante;

public class ConverterRequestAssinate {
    public static RequestAssinanteDTO converterParaDTO(Assinante assinante){
        RequestAssinanteDTO requestAssinanteDTO = new RequestAssinanteDTO();
        requestAssinanteDTO.setId(assinante.getIdAssinante());
        requestAssinanteDTO.setNome(assinante.getNome());
        requestAssinanteDTO.setCpf(assinante.getCpf());
        requestAssinanteDTO.setEndereco(assinante.getEndereco());
        requestAssinanteDTO.setVeiculo(assinante.getVeiculo());
        requestAssinanteDTO.setCreditoDisponivel(assinante.getCreditoDiponivel());
        requestAssinanteDTO.setTipoCliente(assinante.getTipoCliente());
        return requestAssinanteDTO;
    }
}
