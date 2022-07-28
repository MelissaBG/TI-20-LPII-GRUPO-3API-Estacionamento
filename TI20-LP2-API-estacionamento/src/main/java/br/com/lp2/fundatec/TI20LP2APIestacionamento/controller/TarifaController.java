package br.com.lp2.fundatec.TI20LP2APIestacionamento.Controller;


import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.RequestTarifaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.ResponseTarifaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.service.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "/tarifa")
public class TarifaController {

    @Autowired
    private TarifaService tarifaService;

    public  TarifaController(TarifaService tarifaService){
        this.tarifaService = tarifaService;
    }
    @PostMapping
    public ResponseEntity<Tarifa> salvaTarifa(@RequestBody RequestTarifaDTO tarifa) {
        ResponseTarifaDTO tarifaDTO = tarifaService.salvarTarifa(tarifa);
        return ResponseEntity.status(HttpStatus.CREATED).body(tarifaDTO);
    }

    @GetMapping
    public ResponseEntity <Tarifa> findAll(){
        Iterable<Tarifa> tarifas = tarifaService.findAll();
        return ResponseEntity.ok(tarifas);
    }


}
