package br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.repository.ContaRepository;

import java.util.List;

public class RecuperarContaEmAbertoPorPlacaService {
    private final ContaRepository contaRepository;
    //Metodo que devolve uma lista de contas para validar se não há mais de uma conta em aberto.
    public Conta recuperar(String placa){
        List <Conta> contas = contaRepository.findByPlaca(placa);
        return contas.get(0);
    }
}
