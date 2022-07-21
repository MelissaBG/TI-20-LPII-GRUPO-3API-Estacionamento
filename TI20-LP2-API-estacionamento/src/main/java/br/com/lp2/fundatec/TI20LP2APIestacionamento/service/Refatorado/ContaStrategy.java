package br.com.lp2.fundatec.TI20LP2APIestacionamento.service.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Tarifa;

public interface ContaStrategy {
    boolean contaSeEhDoTipoTarifa(Tarifa tarifa);

    double calcularValor(Conta conta, Tarifa tarifa);
    //Pega o valor e seta na conta mesmo
    default void aplicarValor(Conta conta, Tarifa tarifa){
        conta.setValor(Double.valueOf(calcularValor(conta, tarifa)));
    }
    public
}
