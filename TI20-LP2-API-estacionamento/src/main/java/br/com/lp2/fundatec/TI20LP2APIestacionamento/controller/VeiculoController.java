package br.com.lp2.fundatec.TI20LP2APIestacionamento.controller;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.RequestVeiculoDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.ResponseVeiculoDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Veiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.service.VeiculoService;
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
    public ResponseEntity<ResponseVeiculoDTO> salvarVeiculo(@RequestBody RequestVeiculoDTO requestVeiculoDTO){
        ResponseVeiculoDTO responseVeiculoDTO = veiculoService(requestVeiculoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseVeiculoDTO);
    }
    @GetMapping
    public ResponseEntity<List<Veiculo> findAll(){
        List<Veiculo> responseVeiculoDTO = veiculoService.findAll();
        return ResponseEntity.ok(responseVeiculoDTO);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id){
        veiculoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
