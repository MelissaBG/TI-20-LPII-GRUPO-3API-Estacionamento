package br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.controller.Conta.Impl;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.controller.Conta.CriarContaPorPlacaVeiculoController;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.Refatorado.ContaResponseDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado.CriarContaPorPlacaVeiculoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CriarContaPorPlacaVeicuLControllerImpl implements CriarContaPorPlacaVeiculoController {
    private final CriarContaPorPlacaVeiculoService service;
    private final ContaResponseConverter responseConverter;

    @Override
    public ResponseEntity <ContaResponseDTO> criar (String placa){
        Conta contaCriada = service.criar(placa);
        return  ResponseEntity.status(HttpStatus.CREATED)
                .body(responseConverter.convert(contaCriada));
    }
}
