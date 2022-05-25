package br.com.desafio4next.dtos;

import br.com.desafio4next.models.Consulta;
import br.com.desafio4next.models.Especialidade;
import br.com.desafio4next.models.Medico;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NovoMedico {

    private String nome;
    private String crm;
    private Integer idade;
    private Especialidade especialidade;
    private List<Consulta> consulta;

    public NovoMedico (Medico medico) {
        this.nome = medico.getNome();
        this.crm = medico.getCrm();
        this.idade = medico.getIdade();
        this.especialidade = medico.getEspecialidade();
        this.consulta = medico.getConsulta();

     }
}
