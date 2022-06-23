package br.com.lp2.fundatec.TI20LP2APIestacionamento.controller;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.service.AssinanteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/v1/assinante")
public class AssinanteController {
    private final AssinanteService assinanteService;

    public AssinanteController(AssinanteService assinanteService){this.assinanteService = assinanteService; }

    @GetMapping("/{nome}")
    public Assinante findAssinanteByNome(@PathVariable String nome){
        Optional<Assinante> optionalAssinante = assinanteService.findByNome(nome);
        if (optionalAssinante.isPresent())
            return optionalAssinante.get();
        return null;
    }
}
