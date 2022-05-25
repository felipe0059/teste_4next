package br.com.desafio4next.controllers;

import br.com.desafio4next.dtos.NovoMedico;
import br.com.desafio4next.models.Medico;
import br.com.desafio4next.repositories.MedicoRepository;
import br.com.desafio4next.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @Autowired
    private MedicoService service;

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody NovoMedico medico){
        service.save(medico);
    }

    @GetMapping("/{nome}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<NovoMedico> listaPorNome(@PathVariable String nome) {
        Optional<Medico> medico = repository.findByNome(nome);
        return medico.map(value -> ResponseEntity.ok(new NovoMedico(value))).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/atualizar/{nome}")
    public void atualizaPorNome(@PathVariable String nome) {
        try {
            service.updateByNome(nome);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

   @DeleteMapping("/{nome}")
   @ResponseStatus(HttpStatus.GONE)
    public void deletaPorNome(@PathVariable String nome) {
        try {
            service.deleteByNome(nome);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
