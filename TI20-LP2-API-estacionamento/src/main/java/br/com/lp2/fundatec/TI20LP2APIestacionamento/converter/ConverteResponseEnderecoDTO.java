package br.com.lp2.fundatec.TI20LP2APIestacionamento.converter;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.ResponseEnderecoDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Endereco;

public class ConverteResponseEnderecoDTO {
    public static ResponseEnderecoDTO converterParaResponse(Endereco endereco){
        ResponseEnderecoDTO responseEnderecoDTO = new ResponseEnderecoDTO();
        responseEnderecoDTO.setLogradouro(endereco.getLogradouro());
        responseEnderecoDTO.setCep(endereco.getCep());
        return responseEnderecoDTO;
    }
}
