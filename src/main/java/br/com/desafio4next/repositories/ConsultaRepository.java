package br.com.desafio4next.repositories;

import br.com.desafio4next.models.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    Optional<Consulta> findByNome(String nome);

    Optional<Consulta> findByDataConsulta(LocalDate dataConsulta);

    Optional<Consulta> findByHoraConsulta(LocalTime horaConsulta);
}
