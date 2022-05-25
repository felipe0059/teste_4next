package br.com.desafio4next.controllers;

import br.com.desafio4next.dtos.NovaConsulta;
import br.com.desafio4next.models.Consulta;
import br.com.desafio4next.models.Consultorio;
import br.com.desafio4next.repositories.ConsultaRepository;
import br.com.desafio4next.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody NovaConsulta consulta){
        service.save(consulta);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Consulta> findAllConsultas(){
        return repository.findAll();

    }

    @GetMapping("/{consultorio}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Consulta> findByConsultorio(@RequestBody Consultorio consultorio){
        return repository.findAllByConsultorio(consultorio);

    }

    @DeleteMapping("/{nome}")
    @ResponseStatus(HttpStatus.GONE)
    public void deleteByNome(@RequestParam String nome) {
        service.delete(nome);
    }
}
