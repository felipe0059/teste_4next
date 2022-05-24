package br.com.desafio4next.controllers;

import br.com.desafio4next.dtos.NovaConsulta;
import br.com.desafio4next.models.Consulta;
import br.com.desafio4next.repositories.ConsultaRepository;
import br.com.desafio4next.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaRepository repository;

    @Autowired
    private ConsultaService service;

    @PostMapping("/agendar")
    public void save(@RequestBody NovaConsulta consulta){
        service.save(consulta);
    }

    @GetMapping
    public List<Consulta> findAllConsultas(){
        return repository.findAll();

    }
}
