package br.com.lp2.fundatec.TI20LP2APIestacionamento.Repository;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository <Veiculo, Long> {
}
