package br.com.lp2.fundatec.TI20LP2APIestacionamento.repository;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Assinante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssinanteRepository extends JpaRepository<Assinante, Integer>
{
}
