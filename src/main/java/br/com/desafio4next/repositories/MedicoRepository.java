package br.com.desafio4next.repositories;

import br.com.desafio4next.models.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MedicoRepository extends JpaRepository<Medico,Long> {

    Optional<Medico> findByNome(String nome);

    void updateByNome(String nome);

    void deleteByNome(String nome);
}
