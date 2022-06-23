package br.com.lp2.fundatec.TI20LP2APIestacionamento.service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.AssinanteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssinanteService {

    private final AssinanteRepository repository;

    public AssinanteService(AssinanteRepository repository) {
        this.repository = repository;
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Assinante salvar(Assinante assinante){return repository.save(assinante);}
    public Assinante atualizar(Assinante assinante){return repository.save(assinante);}

    public Optional<Assinante> findByID(Integer id){return repository.findById(id);}
    public Optional<Assinante> findByNome(String nome){return repository.findByNome(nome);}

    public Iterable<Assinante> findAll(){return repository.findAll();}
}
