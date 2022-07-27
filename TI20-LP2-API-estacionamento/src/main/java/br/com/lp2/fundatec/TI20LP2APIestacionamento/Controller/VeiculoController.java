package br.com.lp2.fundatec.TI20LP2APIestacionamento.Controller;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Veiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoController {
    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public ResponseEntity<Veiculo> salvarVeiculo(@RequestBody Veiculo veiculo){
        Veiculo veiculo = veiculoService.findAll();
        return ResponseEntity.status(HttpStatus.CREATED).body(veiculo);
    }
    @GetMapping
    public ResponseEntity<Veiculo> findAll(){
        List<Veiculo> veiculos = veiculoService.findAll();
        return ResponseEntity.ok(veiculos);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id){
        veiculoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
