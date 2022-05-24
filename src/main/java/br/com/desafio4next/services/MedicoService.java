package br.com.desafio4next.services;

import br.com.desafio4next.dtos.NovoMedico;
import br.com.desafio4next.models.Medico;
import br.com.desafio4next.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository repository;

    public void save (NovoMedico novoMedico) {
        Medico medico = new Medico();
        medico.setNome(novoMedico.getNome());
        medico.setCrm(novoMedico.getCrm());
        medico.setIdade(novoMedico.getIdade());
        medico.setEspecialidade(novoMedico.getEspecialidade());

        repository.save(medico);
    }

    public Medico update(Medico medico, String crm) {
        medico.setCrm(crm);
        return repository.save(medico);
    }

    public void delete(String nome) {
        repository.deleteByNome(nome);
    }
}
