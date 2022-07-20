package br.com.lp2.fundatec.TI20LP2APIestacionamento.service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TarifaService {

    private final TarifaRepository tarifaRepository;

    public TarifaService(TarifaRepository tarifaRepository){
        this.tarifaRepository = tarifaRepository;
    }

    public Optional<Tarifa> findByTipoTarifaAndTipoVeiculo(TipoTarifa tipoTarifa, TipoVeiculo tipoVeiculo) {
        return tarifaRepository.findByTipoTarifaAndTipoVeiculo(tipoTarifa, tipoVeiculo);
    }

    public Iterable<Tarifa> findAll(){
        return tarifaRepository.findAll();
    }

    public Tarifa salvar(Tarifa tarifa) {
        return tarifaRepository.save(tarifa);
    }

    public Tarifa update(Tarifa tarifa) {
        return tarifaRepository.save(tarifa);
    }

    public void delete(Integer id) {
        tarifaRepository.deleteById(id);
    }


}
