package br.com.desafio4next.services;

import br.com.desafio4next.models.Consulta;
import br.com.desafio4next.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.Optional;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository repository;

    public Optional<Consulta> agendarConsulta(Consulta consulta) {

        if ((repository.findByNome(consulta.getNome()).isPresent()) && (repository.findByDataConsulta(consulta.getDataConsulta()).isPresent()))
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "O mesmo paciente só pode agendar uma consulta na data selecionada!", null);

        if (repository.findByHoraConsulta(consulta.getHoraConsulta()).isPresent())
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Não é permitido o registro de consultas em um mesmo horário!", null);

        return Optional.of(repository.save(consulta));
    }
}
