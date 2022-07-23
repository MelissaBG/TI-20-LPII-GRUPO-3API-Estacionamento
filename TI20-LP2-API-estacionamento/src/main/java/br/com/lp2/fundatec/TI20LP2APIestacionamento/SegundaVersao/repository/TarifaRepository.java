package br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.repository;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado.Enums.TipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado.Enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TarifaRepository extends JpaRepository <Tarifa, Long> {

    Optional<Tarifa> findByTipoTarifaAndTipoVeiculo(TipoTarifa tipoTarifa, TipoVeiculo tipoVeiculo);
}
