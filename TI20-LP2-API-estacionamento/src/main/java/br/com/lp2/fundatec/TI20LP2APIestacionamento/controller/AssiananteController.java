package br.com.lp2.fundatec.TI20LP2APIestacionamento.controller;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.ResponseAssinanteDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.service.AssinanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping()
public class AssiananteController {
    @Autowired
    private AssinanteService assinanteService;

    public AssiananteController(AssinanteService assinanteService){

        this.assinanteService = assinanteService;
    }
    //GET
    //Assinante por Id
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<Assinante> findAssinanteById(@PathVariable Long id_Assinante){
        Optional<Assinante> assinantePorId = assinanteService.findById(id_Assinante);
        return ResponseEntity.ok(assinantePorId);
    }
    // Todos os assinantes
    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<List<Assinante>> findAll() {
        Iterable<Assinante> assinanteDTO = assinanteService.findAll();
        return ResponseEntity.ok(assinanteDTO);

    }
    //Salva/Cria assinante
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Assinante> salvarAssinante(@RequestBody Assinante assinante){
        ResponseAssinanteDTO assinanteCriado = assinanteService.salvarAssinante(assinante);
        return ResponseEntity.ok(assinanteCriado);
    }
    //Atualizo assinante
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Assinante> atualizarAssinante(@RequestBody Assinante assinante){
        Assinante assinanteAtualizado = assinanteService.atualizarAssinante(assinante);
        return ResponseEntity.ok(assinanteAtualizado);
    }
    //Deletar Assinante
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Long id_Assinante) {
        assinanteService.deleteById(id_Assinante);
    }


}
