package br.com.lp2.fundatec.TI20LP2APIestacionamento.controller.Conta.Impl;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.controller.Conta.EncerrarContaPorPlacaController;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.Refatorado.ContaResponseDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Conta;
import org.springframework.http.ResponseEntity;

public class EncerrarContaPorPlacaControllerImpl implements EncerrarContaPorPlacaController {
    private final EncerrarContaPorPlacaService encerrarContaPorPlacaService;
    private final ContaResponseConverter responseConverter;

    @Override
    public ResponseEntity <ContaResponseDTO> encerrar (String placa, Long id){
        Conta contaEncerrada = encerrarContaPorPlacaService.encerrar(id);
        return ResponseEntity.ok(responseConverter.convert(contaEncerrada));
    }
}
