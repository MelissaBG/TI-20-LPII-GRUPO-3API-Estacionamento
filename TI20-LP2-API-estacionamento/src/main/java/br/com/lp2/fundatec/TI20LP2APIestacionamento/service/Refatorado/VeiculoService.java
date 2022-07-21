package br.com.lp2.fundatec.TI20LP2APIestacionamento.service.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Veiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

    private final VeiculoRepository repository;

    public VeiculoService(VeiculoRepository repository){this.repository = repository;}

    public Veiculo findByPlaca(String placa){
        return repository.findByPlaca(placa);
    }


}
