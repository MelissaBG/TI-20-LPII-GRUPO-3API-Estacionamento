package br.com.lp2.fundatec.TI20LP2APIestacionamento.controller;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.RequestEnderecoDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.ResponseEnderecoDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/enderaco")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    public ResponseEntity<ResponseEnderecoDTO> salvarEndereco(@RequestBody RequestEnderecoDTO requestEnderecoDTO){
        ResponseEnderecoDTO responseEnderecoDTO = enderecoService.salvarEndereco(requestEnderecoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseEnderecoDTO);
    }
}
