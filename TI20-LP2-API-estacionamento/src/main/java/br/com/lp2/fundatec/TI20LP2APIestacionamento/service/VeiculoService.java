package br.com.lp2.fundatec.TI20LP2APIestacionamento.service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.RequestVeiculoDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Veiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> findAll(){
        return veiculoRepository.findAll();
    }

    public Veiculo salvarVeiculo(RequestVeiculoDTO requestVeiculoDTO){

        return RequestVeiculoDTO.coverterParaResponse(veiculoRepository.save(veiculo)).get();
    }
    public void deleteById(Long id){

        veiculoRepository.deleteById(id);
    }
}
