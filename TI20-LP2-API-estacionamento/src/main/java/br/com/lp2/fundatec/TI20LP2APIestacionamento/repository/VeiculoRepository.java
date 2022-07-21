package br.com.lp2.fundatec.TI20LP2APIestacionamento.repository;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {
    br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Veiculo findByPlaca (String placa);

    Optional <Veiculo> findByAssinante (Assinante assinante);
}
