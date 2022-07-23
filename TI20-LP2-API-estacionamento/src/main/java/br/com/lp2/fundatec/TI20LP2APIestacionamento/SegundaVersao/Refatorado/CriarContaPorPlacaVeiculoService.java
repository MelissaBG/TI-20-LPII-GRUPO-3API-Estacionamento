package br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado;

import java.time.LocalDateTime;

public class CriarContaPorPlacaVeiculoService {
    private final ContaRepository contaRepository;
    private final BuscarVeiculoPorPlacaService buscarVeiculoPorPlacaService;
   // private final CriarContaValidation validation;

    public Conta criar(String placa){
        Veiculo veiculo = recuperarVeiculoDaConta(placa);
        Conta conta = buildConta(veiculo);
       // validation.validar(conta);
        return contaRepository.save(conta);
    }
    private Veiculo recuperarVeiculoDaConta(String placa){

        return buscarVeiculoPorPlacaService.findByPlaca(placa);
    }
    private Conta buildConta(Veiculo veiculo){
        return Conta.builder()
                .veiculo(veiculo)
                .entrada(LocalDateTime.now())
                .build();
    }
}
