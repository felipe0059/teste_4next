package br.com.desafio4next.controllers;

import br.com.desafio4next.dtos.MedicoDto;
import br.com.desafio4next.models.Medico;
import br.com.desafio4next.repositories.MedicoRepository;
import br.com.desafio4next.services.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/medicos")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @Autowired
    private MedicoService service;
     //MÉTODO CADASTRA UM NOVO MEDICO
    @PostMapping("/cadastrar")
    public ResponseEntity<Medico> postMedico(@Valid @RequestBody Medico medico){
        return service.cadastrarMedico(medico)
                .map(respostaCadastrar -> ResponseEntity.status(HttpStatus.CREATED).body(respostaCadastrar))
                .orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
    }

    //MÉTODO LISTA POR NOME DO MÉDICO
    @GetMapping("/{nome}")
    public ResponseEntity<MedicoDto> listaPorNome(@PathVariable String nome) {
        Optional<Medico> medico = repository.findAllByNomeContainingIgnoreCase(nome);
        return medico.map(value ->
                ResponseEntity.ok(new MedicoDto(value))).orElseGet(() ->
                ResponseEntity.notFound().build());
    }
}