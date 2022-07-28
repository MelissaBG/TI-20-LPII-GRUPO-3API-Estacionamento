package br.com.lp2.fundatec.TI20LP2APIestacionamento.service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.RequestEnderecoDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.ResponseEnderecoDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    public ResponseEnderecoDTO salvarEndereco(RequestEnderecoDTO requestEnderecoDTO){
        return ResponseEnderecoDTO.converterParaResponse(requestEnderecoDTO).get();
    }
}
