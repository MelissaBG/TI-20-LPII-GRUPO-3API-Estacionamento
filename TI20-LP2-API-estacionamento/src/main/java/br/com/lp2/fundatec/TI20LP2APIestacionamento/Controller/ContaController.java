package br.com.lp2.fundatec.TI20LP2APIestacionamento.Controller;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.DTO.RequestContaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.DTO.ResponseContaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/conta")
public class ContaController {
    @Autowired
    private ContaService contaService;

    @PostMapping
    public ResponseEntity<ResponseContaDTO> criarConta(@RequestBody RequestContaDTO requestContaDTO){
        ResponseContaDTO responseContaDTO = contaService.fecharConta(requestContaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(requestContaDTO);
    }
    @PutMapping(value = "/{idConta}/{idCliente}")
    public ResponseEntity<RequestContaDTO> pagarConta(@PathVariable Long idConta, @PathVariable Long idClienta){
        ResponseContaDTO responseContaDTO = contaService.pagarConta(idConta, idClienta);
        return ResponseEntity.ok(responseContaDTO);
    }
}
