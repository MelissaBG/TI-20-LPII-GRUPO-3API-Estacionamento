package br.com.lp2.fundatec.TI20LP2APIestacionamento.Controller;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.TarifaService;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Tarifa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tarifa")
public class TarifaController {
    private TarifaService tarifaService;

    public  TarifaController(TarifaService tarifaService){
        this.tarifaService = tarifaService;
    }
    @PostMapping
    public ResponseEntity <Tarifa> salvaTarifa(@RequestBody Tarifa tarifa){
        Tarifa tarifa = tarifaService.salvarTarifa(tarifa);
        return ResponseEntity.status(HttpStatus.CREATED).body(tarifa);
    }
    @GetMapping
    public ResponseEntity <Tarifa> findAll(){
        List<Tarifa> tarifas = tarifaService.findAll();
        return ResponseEntity.ok(tarifas);
    }
}
