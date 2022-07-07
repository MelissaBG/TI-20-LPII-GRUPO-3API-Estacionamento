package br.com.lp2.fundatec.TI20LP2APIestacionamento.controller.Assinante;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.Refatorado.AssinanteResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping{"/api/assinante"}
public class IncluirAssinanteController {
    @PostMapping
    ResponseEntity <AssinanteResponseDTO> incluir(
        @Valid @RequestBody AssinanteRequestDTO assinanteRequestDTO);
    }
}
