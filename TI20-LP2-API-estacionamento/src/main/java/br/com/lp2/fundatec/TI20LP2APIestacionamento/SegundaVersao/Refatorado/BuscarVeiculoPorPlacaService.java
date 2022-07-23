package br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.repository.VeiculoRepository;
import org.springframework.data.crossstore.ChangeSetPersister;

public class BuscarVeiculoPorPlacaService {
    private final VeiculoRepository veiculoRepository;


    public BuscarVeiculoPorPlacaService(VeiculoRepository repository){
        this.veiculoRepository = repository;
    }
    public Veiculo findByPlaca(String placa){
        return veiculoRepository.findByPlaca(placa)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);
    }

}
