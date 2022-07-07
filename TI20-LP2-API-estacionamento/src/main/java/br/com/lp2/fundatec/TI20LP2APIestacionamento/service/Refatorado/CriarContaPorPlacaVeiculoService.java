package br.com.lp2.fundatec.TI20LP2APIestacionamento.service.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.controller.Veiculo.BuscarVeiculoPorPlacaController;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Veiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.ContaRepository;

import java.time.LocalDateTime;

public class CriarContaPorPlacaVeiculoService {
    private final ContaRepository contaRepository;
    private final BuscarVeiculoPorPlacaService buscarVeiculoPorPlacaService;
    private final CriarContaValidation validation;

    public Conta criar(String placa){
        Veiculo veiculo = recuperarVeiculoDaConta(placa);
        Conta conta = buildConta(veiculo);
        validation.validar(conta);
        return contaRepository.save(conta);
    }
    private Veiculo recuperarVeiculoDaConta(String placa){
        return buscarVeiculoPorPlacaService.buscarPorPlaca(placa);
    }
    private Conta buildConta(Veiculo veiculo){
        return Conta.builder()
                .veiculo(veiculo)
                .dth_entrada(LocalDateTime.now())
                .build();
    }
}
