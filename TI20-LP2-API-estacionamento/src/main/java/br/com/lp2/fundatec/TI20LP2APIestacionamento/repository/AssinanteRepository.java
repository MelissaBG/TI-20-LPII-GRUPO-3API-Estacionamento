package br.com.lp2.fundatec.TI20LP2APIestacionamento.repository;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Assinante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AssinanteRepository extends JpaRepository<Assinante, Integer> {
    Optional<Assinante> findByCpf(String cpf);

    Optional<Assinante> findByNome(String nome);
}
