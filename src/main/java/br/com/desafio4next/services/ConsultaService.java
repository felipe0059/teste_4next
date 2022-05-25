package br.com.desafio4next.services;

import br.com.desafio4next.dtos.NovaConsulta;
import br.com.desafio4next.models.Consulta;
import br.com.desafio4next.repositories.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository repository;

    public void save (NovaConsulta novaConsulta) {
        Consulta consulta = new Consulta();
        consulta.setNome(novaConsulta.getNome());
        consulta.setData_consulta(novaConsulta.getData_consulta());
        consulta.setHora_consulta(novaConsulta.getHora_consulta());
        consulta.setConsultorio(novaConsulta.getConsultorio());
        consulta.setNome_medico(novaConsulta.getNome_medico());

        repository.save(consulta);

    }

    public void delete(String nome) {
        repository.deleteByNome(nome);
    }
}
