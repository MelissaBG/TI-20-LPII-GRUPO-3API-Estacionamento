package br.com.lp2.fundatec.TI20LP2APIestacionamento.controller.Conta;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.Refatorado.ContaResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
public interface RecuperarContaPorPlacaController {
    @GetMapping("/em-aberto")
    ResponseEntity <ContaResponseDTO> recuperar(@PathVariable("placa") String placa);
}
