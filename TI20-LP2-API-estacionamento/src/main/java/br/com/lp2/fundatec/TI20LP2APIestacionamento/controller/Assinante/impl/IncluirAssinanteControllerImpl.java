package br.com.lp2.fundatec.TI20LP2APIestacionamento.controller.Assinante.impl;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.controller.Assinante.IncluirAssinanteController;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.Refatorado.AssinanteResponseDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Assinante;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class IncluirAssinanteControllerImpl implements IncluirAssinanteController {
    private final IncluirAssinanteService service;
    private final AssinanteRequestCoverter requestCoverter;
    private final AssinanteResponseConverter responseConverter;

    @Override
    public ResponseEntity <AssinanteResponseDTO> incluir (
            AssinanteRequestDTO assinanteRequestDTO) {
        Assinante assinante = responseConverter.convert(assinanteRequestDTO);
        Assinante assinanteIncluido = service.incluir(assinante);
        AssinanteResponseDTO assinanteResponseDTO = responseConverter.convert(assinante);
        return ResponseEntity.status(HttpStatus.CREATED).body(assinanteResponseDTO);
    }
}
