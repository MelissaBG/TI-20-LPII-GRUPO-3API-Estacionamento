package br.com.lp2.fundatec.TI20LP2APIestacionamento.service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.EnderecoDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Endereco;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService {

    private final EnderecoRepository repository;

    public Iterable <Endereco> findAll(){
        return repository.findAll();
    }
    public Endereco salvar(Endereco endereco){
        return repository.save(endereco);
    }
    public Endereco atualizar(Endereco endereco){
        return repository.save(endereco);
    }
    public void delete(Integer id){
    repository.deleteById(id);
    }
}
