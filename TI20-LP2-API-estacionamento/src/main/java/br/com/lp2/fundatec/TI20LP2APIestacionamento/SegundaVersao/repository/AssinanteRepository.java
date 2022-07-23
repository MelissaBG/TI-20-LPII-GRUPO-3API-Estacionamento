package br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.repository;


import br.com.lp2.fundatec.TI20LP2APIestacionamento.SegundaVersao.Refatorado.Assinante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AssinanteRepository extends JpaRepository<Assinante, Integer> {
    Optional<Assinante> findByCpf(String cpf);

    List<Assinante> findByNome(String nome);
}
