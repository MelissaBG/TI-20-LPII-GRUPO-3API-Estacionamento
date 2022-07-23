package br.com.lp2.fundatec.TI20LP2APIestacionamento.Controller;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Service.AssinanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<Assinante> findAssinanteById(@PathVariable Long idAssinante){
        Assinante assinante = assinanteService.findById(idAssinante);
        return ResponseEntity.ok(assinante);
    }
    // Todos os assinantes
    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<Assinante> findAll(){
        Iterable <Assinante> assinantes = assinanteService.findAll();
        //Duvida de o que vem a seguir.
        List<Assinante> assinantes =;
        return ResponseEntity.ok(assinantes);
    }
    //Salva/Cria assinante
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Assinante> salvarAssinante(@RequestBody Assinante assinante){
        Assinante assinante = assinanteService.salvarAssinante(assinante);
        return ResponseEntity.ok(assinante);
    }
    //Atualizo assinante
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Assinante> atualizarAssinante(@RequestBody Assinante assinante){
        Assinante assinante = assinanteService.atualizarAssinante(assinante);
        return ResponseEntity.ok(assinante);
    }
    //Deletar Assinante
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable Integer id) {
        service.delete(idAssinante);
    }


}
