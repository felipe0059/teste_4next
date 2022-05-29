package br.com.desafio4next.services;

import br.com.desafio4next.models.Medico;
import br.com.desafio4next.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.Optional;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository repository;

    public Optional<Medico> cadastrarMedico(Medico medico) {

        if (repository.findByCrm(medico.getCrm()).isPresent())
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "CRM já cadastrado!", null);

        return Optional.of(repository.save(medico));
    }

}
