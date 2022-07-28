package br.com.lp2.fundatec.TI20LP2APIestacionamento.repository;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TempoTipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarifaRepository extends JpaRepository<Tarifa, Long> {
    Tarifa findByTempoTipoTarifaAndTipoVeiculo(TempoTipoTarifa tempoTipoTarifa, TipoVeiculo tipoVeiculo);
}
