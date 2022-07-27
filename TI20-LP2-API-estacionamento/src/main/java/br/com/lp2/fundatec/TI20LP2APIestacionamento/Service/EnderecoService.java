package br.com.lp2.fundatec.TI20LP2APIestacionamento.Service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Endereco;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    private  salvarEndereco(){
        Endereco endereco =enderecoRepository.save(endereco);
        return
        //Duvida: Está certo?
    }
}
