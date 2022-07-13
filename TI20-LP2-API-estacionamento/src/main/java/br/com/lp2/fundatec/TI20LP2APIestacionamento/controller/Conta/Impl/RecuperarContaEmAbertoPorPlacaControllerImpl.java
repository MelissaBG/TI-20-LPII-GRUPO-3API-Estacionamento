package br.com.lp2.fundatec.TI20LP2APIestacionamento.controller.Conta.Impl;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.ConverterResponse.ContaResponseConverter;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.controller.Conta.RecuperarContaEmAbertoPorPlacaController;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.Refatorado.ContaResponseDTO;
import org.springframework.http.ResponseEntity;

public class RecuperarContaEmAbertoPorPlacaControllerImpl implements RecuperarContaEmAbertoPorPlacaController {
    private final RecuperarContaPorPlacaService service;
    private final ContaResponseConverter.responseConverter;

    @Override
    public ResponseEntity <ContaResponseDTO> (String placa){
        ContaResponseDTO contaEmAberto = responseConverter.convert(service.recuperar)
                return ResponseEntity.ok(contaEmAberto);
    }
}
