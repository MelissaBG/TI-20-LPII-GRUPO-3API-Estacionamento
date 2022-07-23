package br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.controller.Conta;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.Refatorado.ContaResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface EncerrarContaPorPlacaController {
    @PatchMapping("/{id}")
    ResponseEntity <ContaResponseDTO> encerrar(@PathVariable("placa") String placa,@PathVariable("id") Long id);
}
