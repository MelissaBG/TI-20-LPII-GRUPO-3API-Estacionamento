package br.com.lp2.fundatec.TI20LP2APIestacionamento.service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TempoTipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.TarifaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TarifaService {
    @Autowired
    TarifaRepository tarifaRepository;
    public Tarifa salvarTarifa(Tarifa tarifa){
        return tarifaRepository.save(tarifa);
    }
    //Listar tarifas
    public List<Tarifa> findAll(){
        return tarifaRepository.findAll();
    }
    //Devolve tarifa com base no tempo e no tipo de veiculo
    public Tarifa findByTempoTipoTarifaAndTipoVeiculo(TempoTipoTarifa tempoTipoTarifa, TipoVeiculo tipoVeiculo){
        return tarifaRepository.findByTempoTipoTarifaAndTipoVeiculo(tempoTipoTarifa, tipoVeiculo);
    }
    public Tarifa atualizaValor(Long id, BigDecimal valor){
        Tarifa tarifa = tarifaRepository.findById(id).orElseThrow(() -> new RuntimeException("id não existente"));
        tarifa.setValor(valor);
        return tarifaRepository.save(tarifa);
    }

    public Tarifa findByTipoTarifaAndTipoVeiculo(TempoTipoTarifa tempoTipoTarifa, TipoVeiculo tipoVeiculo) {
        return null;
    }
}
