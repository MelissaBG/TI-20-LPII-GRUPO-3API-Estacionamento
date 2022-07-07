package br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContaRepository extends JpaRepository <Conta, Long> {
    //Retorna uma lista de contas em aberto para a placa passada como paramentro
    List <Conta> findByVeiculoPlacaAndSaidaIsNullAnndValorIsNull(String placa);
}
