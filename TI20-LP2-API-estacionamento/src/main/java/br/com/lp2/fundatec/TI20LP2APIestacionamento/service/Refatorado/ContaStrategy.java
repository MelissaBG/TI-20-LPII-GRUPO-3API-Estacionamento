package br.com.lp2.fundatec.TI20LP2APIestacionamento.service.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Tarifa;

import java.math.BigDecimal;

public interface ContaStrategy {
    boolean contEhDoTipoTarifa(Tarifa tarifa);

    double calcularValor(Conta conta, Tarifa tarifa);
    //Pega o valor e seta na conta mesmo
    default void aplicarValor(Conta conta, Tarifa tarifa){
        conta.setValor(BigDecimal.valueOf(calcularValor(conta, tarifa)));
    }
}
