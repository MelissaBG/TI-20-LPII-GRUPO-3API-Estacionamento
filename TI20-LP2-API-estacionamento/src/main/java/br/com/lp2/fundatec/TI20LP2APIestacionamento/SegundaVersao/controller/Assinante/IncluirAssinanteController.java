package br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.controller.Assinante;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado.AssinanteRequestDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.Refatorado.AssinanteResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping{"/api/assinante"}
public class IncluirAssinanteController {
    @PostMapping
    ResponseEntity<AssinanteResponseDTO> incluir(
            @RequestBody AssinanteRequestDTO assinanteRequestDTO);
}
}
