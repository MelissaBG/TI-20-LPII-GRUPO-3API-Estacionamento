package br.com.lp2.fundatec.TI20LP2APIestacionamento.service.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.VeiculoRepository;
import org.springframework.data.crossstore.ChangeSetPersister;

public class BuscarVeiculoPorPlacaService {
    private final VeiculoRepository veiculoRepository;

    public Veiculo buscarCarroPlaca(String placa){
        return veiculoRepository.findByPlaca(placa)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);
    }
}
