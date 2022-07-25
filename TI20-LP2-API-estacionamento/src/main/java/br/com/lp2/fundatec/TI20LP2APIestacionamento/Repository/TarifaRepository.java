package br.com.lp2.fundatec.TI20LP2APIestacionamento.Repository;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TempoTipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarifaRepository extends JpaRepository<Tarifa, Long> {
    Tarifa findByTempoTipoTarifaAndTipoVeiculo(TempoTipoTarifa tempoTipoTarifa, TipoVeiculo tipoVeiculo);
}
