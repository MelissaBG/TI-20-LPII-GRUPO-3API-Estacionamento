package br.com.lp2.fundatec.TI20LP2APIestacionamento.repository;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Enums.TipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarifaRepository extends JpaRepository <Tarifa, Long> {
    Tarifa findByTipoTarifaAndTipoVeiculo(TipoTarifa tipoTarifa, TipoVeiculo tipoVeiculo);
}
