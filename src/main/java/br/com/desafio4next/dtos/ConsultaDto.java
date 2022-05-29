package br.com.desafio4next.dtos;


import br.com.desafio4next.models.Consulta;
import br.com.desafio4next.models.Consultorio;
import br.com.desafio4next.models.Medico;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultaDto {

    private Long id;

    private String nome;

    private LocalDate dataConsulta;

    private LocalTime horaConsulta;

    private String nomeMedico;

    private Integer numeroConsultorio;

    public ConsultaDto(Consulta consulta) {

        this.id = consulta.getId();
        this.nome = consulta.getNome();
        this.dataConsulta = consulta.getDataConsulta();
        this.horaConsulta = consulta.getHoraConsulta();
        this.numeroConsultorio = consulta.getNumeroConsultorio();
        this.nomeMedico = consulta.getNomeMedico();

    }

    public static Page<ConsultaDto> convert(Page<Consulta> consulta) {
        return consulta.map(ConsultaDto::new);
    }
}