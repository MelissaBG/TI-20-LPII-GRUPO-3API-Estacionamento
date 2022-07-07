package br.com.lp2.fundatec.TI20LP2APIestacionamento.service.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.AssinanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IncluirAssinanteService {
    private final SalvarAssinantValidation salvarAssinantValidation;
    private final AssinanteRepository assinanteRepository;

    public Assinante incluir (Assiante assinante){}
    salvarAssinanteValidation validar(assinante);
    return assinanteepositoru.save(assiante);
}
