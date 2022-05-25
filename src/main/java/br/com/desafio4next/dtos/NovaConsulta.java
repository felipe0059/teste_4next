package br.com.desafio4next.dtos;


import br.com.desafio4next.models.Consulta;
import br.com.desafio4next.models.Consultorio;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalTime;
import java.util.Calendar;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NovaConsulta {

    private String nome;
    private Calendar data_consulta;
    private LocalTime hora_consulta;
    private String nome_medico;
    private Consultorio consultorio;

    public NovaConsulta(Consulta consulta) {
        this.nome = consulta.getNome();
        this.data_consulta = consulta.getData_consulta();
        this.hora_consulta = consulta.getHora_consulta();
        this.consultorio = consulta.getConsultorio();
        this.nome_medico = consulta.getNome_medico();

    }
}
