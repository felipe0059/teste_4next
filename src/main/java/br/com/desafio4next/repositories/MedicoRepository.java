package br.com.desafio4next.repositories;

import br.com.desafio4next.models.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico,Long> {

    void deleteByNome(String nome);
}
