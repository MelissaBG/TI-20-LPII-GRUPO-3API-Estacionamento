package br.com.lp2.fundatec.TI20LP2APIestacionamento.controller;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.service.AssinanteService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/assinante")
public class AssinanteController {
    private final AssinanteService assinanteService;

    public AssinanteController(AssinanteService assinanteService){
        this.assinanteService = assinanteService;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        assinanteService.delete(id);
    }

    @PostMapping
    public void salvar(@RequestBody Assinante assinante) {
        assinanteService.salvar(assinante);
    }

    @PutMapping
    public void atualizar(@RequestBody Assinante assinante) {
        assinanteService.atualizar(assinante);
    }


    @GetMapping("/{nome}")
    public Assinante findAssinanteByNome(@PathVariable String nome){
        Optional<Assinante> optionalAssinante = assinanteService.findByNome(nome);
        if (optionalAssinante.isPresent()) {
            return optionalAssinante.get();
        }
        return null;
    }

    @GetMapping
    public Iterable<Assinante> findAll() {
        return assinanteService.findAll();
    }

    @GetMapping("/{id}")
    public Assinante findAssinanteById(@PathVariable Integer id) {
        Optional<Assinante> optionalAssinante = assinanteService.findByID(id);
        if (optionalAssinante.isPresent()) {
            return optionalAssinante.get();
        }
        return null;
    }

    @GetMapping("/{cpf}")
    public Assinante findAssinanteByCpf(@PathVariable String cpf) {
        Optional<Assinante> optionalAssinante = assinanteService.findByCpf(cpf);
        if (optionalAssinante.isPresent()) {
            return optionalAssinante.get();
        }
        return null;
    }
}
