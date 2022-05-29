package br.com.desafio4next.controllers;

import br.com.desafio4next.models.Consulta;
import br.com.desafio4next.repositories.ConsultaRepository;
import br.com.desafio4next.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import org.springframework.data.domain.Pageable;


@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaRepository repository;

    @Autowired
    private ConsultaService service;

    @PostMapping("/agendar")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Consulta> agendaConsulta(@Valid @RequestBody Consulta consulta) {
        return service.agendarConsulta(consulta)
                .map(respostaCadastrar -> ResponseEntity.status(HttpStatus.CREATED).body(respostaCadastrar))
                .orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
    }

    @GetMapping
    public Page<Consulta> retornaPorData(@PageableDefault(sort = {"dataConsulta","horaConsulta"}, direction = Sort.Direction.ASC) Pageable pageable) {
        return repository.findAll(pageable);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduto(@PathVariable Long id) {

        return repository.findById(id)
                .map(resposta -> {
                    repository.deleteById(id);
                    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
                })
                .orElse(ResponseEntity.notFound().build());
    }


}

