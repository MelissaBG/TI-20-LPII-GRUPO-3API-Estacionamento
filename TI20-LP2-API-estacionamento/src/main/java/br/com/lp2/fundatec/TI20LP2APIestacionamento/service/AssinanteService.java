package br.com.lp2.fundatec.TI20LP2APIestacionamento.service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.ResponseAssinanteDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.AssinanteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Optional;

public class AssinanteService {
    @Autowired
    private AssinanteRepository assinanteRepository;

    public AssinanteService(AssinanteRepository assinanteRepository){

        this.assinanteRepository = assinanteRepository;
    }

    //Por Id
    public Optional<Assinante> findById(Long idAssinante){
        return assinanteRepository.findById(idAssinante);
    }
    //Iterable -percorre uma coleção de assiantes
    public Iterable<Assinante> findAll(){

        return assinanteRepository.findAll();
    }
    //Salvar um assinante
    public ResponseAssinanteDTO salvarAssinante(Assinante responseAssinanteDTO){
        return ResponseAssinanteDTO.converterParaResponse(assinanteRepository.save(responseAssinanteDTO);
    }
    //Atualizar um assinante
    public Assinante atualizarAssinante(Assinante assinante){

        return assinanteRepository.save(assinante);
    }
    //Deletar assinante
    public void deleteById(Long id_Assinante){
        assinanteRepository.findById(id_Assinante);
        assinanteRepository.deleteById(id_Assinante);
    }
    public Assinante fazerRecarga(Long id_Assinante, BigDecimal creditoDisponível){
        Assinante assinante = assinanteRepository.findAllById(id_Assinante);
        BigDecimal creditoAtual = assinante.getCreditoDiponivel();
        BigDecimal creditoAtualizado = creditoAtual.add(creditoDisponível);
        assinante.setCreditoDiponivel(creditoAtualizado);
        return ResponseAssinanteDTO.converterParaResponse(assinanteRepository.save()).get();
    }
}
