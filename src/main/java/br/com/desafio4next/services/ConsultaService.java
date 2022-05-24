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
        consulta.setData(novaConsulta.getData());
        consulta.setConsultorio(novaConsulta.getConsultorio());

        repository.save(consulta);

    }
}
