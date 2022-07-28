package br.com.lp2.fundatec.TI20LP2APIestacionamento.service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Enums.TempoTipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Enums.TipoVeiculo;
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
        Tarifa tarifa = tarifaRepository.save(tarifa);
        return
    }
    //Listar tarifas
    public List<Tarifa> findAll(){
        return tarifaRepository.findAll();
    }
    //Devolve tarifa com base no tempo e no tipo de veiculo
    public Tarifa findByTempoTipoTarifaAndTipoVeiculo(TempoTipoTarifa tempoTipoTarifa, TipoVeiculo tipoVeiculo){
        return tarifaRepository.findByTempoTipoTarifaAndTipoVeiculo(tempoTipoTarifa, tipoVeiculo);
    }
    public Tarifa atualizaValor(Long id_tarifa, BigDecimal valor){
        Tarifa tarifa = findById(id_tarifa);
        tarifa.setValor(valor);
        return tarifaRepository.save(tarifa);
    }

    public Tarifa findByTipoTarifaAndTipoVeiculo(TempoTipoTarifa tempoTipoTarifa, TipoVeiculo tipoVeiculo) {
        return null;
    }
}
