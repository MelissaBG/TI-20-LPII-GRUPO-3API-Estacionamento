package br.com.lp2.fundatec.TI20LP2APIestacionamento.repository;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa, Integer> {

  Optional<Tarifa> findByTipoTarifaAndTipoVeiculo(TipoTarifa tipoTarifa, TipoVeiculo tipoVeiculo);

}
