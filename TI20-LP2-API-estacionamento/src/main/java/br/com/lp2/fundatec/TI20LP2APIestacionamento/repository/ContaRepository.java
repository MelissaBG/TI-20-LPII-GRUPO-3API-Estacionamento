package br.com.lp2.fundatec.TI20LP2APIestacionamento.repository;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContaRepository extends JpaRepository <Conta, Long> {
    //Retorna uma lista de contas em aberto para a placa passada como paramentro
    List <Conta> findByVeiculoPlaca(String placa);

    Optional<Conta> findByVeiculo (Veiculo veiculo);

}
