package br.com.desafio4next.repositories;

import br.com.desafio4next.models.Consulta;
import br.com.desafio4next.models.Consultorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    void deleteByNome(String nome);

    List<Consulta> findAllByConsultorio(Consultorio consultorio);
}
