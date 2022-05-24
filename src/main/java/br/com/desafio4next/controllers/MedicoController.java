package br.com.desafio4next.controllers;

import br.com.desafio4next.dtos.NovoMedico;
import br.com.desafio4next.models.Medico;
import br.com.desafio4next.repositories.MedicoRepository;
import br.com.desafio4next.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @Autowired
    private MedicoService service;

    @PostMapping("/cadastrar")
    public void save(@RequestBody NovoMedico medico){
        service.save(medico);
    }

    @PutMapping("/atualizar/{nome}")
    public Medico update(@RequestBody Medico medico, @PathVariable String crm) {
        return service.update(medico, crm);
    }

   @DeleteMapping("/{nome}")
    public void deleteByNome(@RequestBody String nome) {
        service.delete(nome);
    }
}
