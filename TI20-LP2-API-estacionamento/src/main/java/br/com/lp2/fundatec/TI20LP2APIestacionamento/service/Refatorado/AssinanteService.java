package br.com.lp2.fundatec.TI20LP2APIestacionamento.service.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Assinante;
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

    public Optional<Assinante> findByCpf(String cpf){return repository.findByCpf(cpf);}

    public Iterable<Assinante> findAll(){return repository.findAll();}


}
