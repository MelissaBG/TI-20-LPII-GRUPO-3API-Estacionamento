package br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContaRepository extends JpaRepository <Conta, Long> {
    List <Conta> findBtVeiculoPlacaAndSaidaIsNullAnndValorIsNull(String placa);
}
