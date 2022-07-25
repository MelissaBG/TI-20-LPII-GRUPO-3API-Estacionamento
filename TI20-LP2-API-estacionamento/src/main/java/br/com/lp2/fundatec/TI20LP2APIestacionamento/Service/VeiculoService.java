package br.com.lp2.fundatec.TI20LP2APIestacionamento.Service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.Veiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Repository.VeiculoRepository;
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

    public Veiculo salvarVeiculo( Veiculo veiculo){
        return veiculoRepository.save(veiculo);
    }
    public void deleteById(Long id){
        veiculoRepository.deleteById(id);
    }
}
