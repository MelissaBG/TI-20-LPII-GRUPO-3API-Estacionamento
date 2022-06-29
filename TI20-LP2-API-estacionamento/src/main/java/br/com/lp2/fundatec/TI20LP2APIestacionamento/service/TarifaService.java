package br.com.lp2.fundatec.TI20LP2APIestacionamento.service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.TarifaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TarifaService {

    private final TarifaRepository tarifaRepository;

    public TarifaService(TarifaRepository tarifaRepository){
        this.tarifaRepository = tarifaRepository;
    }

    public Optional<Tarifa> calcularTarifa(Tarifa valor) {
        /*
        valor.setValor()
        verificarQualConstant
        return valor * constant.getConstant
        */
        return null;
    }


}
