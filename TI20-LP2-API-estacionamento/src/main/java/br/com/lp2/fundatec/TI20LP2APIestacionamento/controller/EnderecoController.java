package br.com.lp2.fundatec.TI20LP2APIestacionamento.controller;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Endereco;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.EnderecoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public class EnderecoController {
    private final EnderecoService service;

    public EnderecoController (EnderecoService enderecoService) {
        this.service = enderecoService;
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Iterable <Endereco> findAll(){
        return service.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Endereco salvar(@RequestBody Endereco enderco){
        return service.save(endereco);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Endereco atualizar(@RequestBody Endereco endereco){
        return service.atualizar(endereco);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id){
        service.delete(id);
    }
}
