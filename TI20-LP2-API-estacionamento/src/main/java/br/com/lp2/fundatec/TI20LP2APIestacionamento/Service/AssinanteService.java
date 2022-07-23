package br.com.lp2.fundatec.TI20LP2APIestacionamento.Service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Repository.AssinanteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class AssinanteService {
    @Autowired
    private AssinanteRepository assinanteRepository;

    public AssinanteService(AssinanteRepository assinanteRepository){
        this.assinanteRepository = assinanteRepository;
    }

    //Por Id
    public Assinante findById(Long idAssinante){
        return assinanteRepository.findById(idAssinante);
    }
    //Iterable -percorre uma coleção de assiantes
    public Iterable<Assinante> findAll(){
        return assinanteRepository.findAll();
    }
    //Salvar um assinante
    public Assinante salvarAssinante(Assinante assinante){
        return assinanteRepository.save(assinante);
    }
    //Atualizar um assinante
    public Assinante atualizarAssinante(Assinante assinante){
        return assinanteRepository.save(assinante);
    }
    //Deletar assinante
    public void deletarAssinante(Long idAssinante){
        assinanteRepository.deleteById(idAssinante);
    }
    public Assinante fazerRecarga(Long idAssinante, BigDecimal creditoDisponível){
        Assinante assinante = assinanteRepository.findAllById(idAssinante);
        BigDecimal creditoAtual = assinante.getCreditoDiponivel();
        BigDecimal creditoAtualizado = creditoAtual.add(creditoDisponível);
        assinante.setCreditoDiponivel(creditoAtualizado);
        //Duvida o que retorna.
        return
    }
}
