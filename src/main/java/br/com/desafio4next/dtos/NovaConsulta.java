package br.com.desafio4next.dtos;

import br.com.desafio4next.models.Consultorio;
import java.time.LocalTime;
import java.util.Calendar;

public class NovaConsulta {

    private String nome;
    private Calendar data_consulta;
    private LocalTime hora_consulta;
    private Consultorio consultorio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getData_consulta() {
        return data_consulta;
    }

    public void setData_consulta(Calendar data_consulta) {
        this.data_consulta = data_consulta;
    }

    public LocalTime getHora_consulta() {
        return hora_consulta;
    }

    public void setHora_consulta(LocalTime hora_consulta) {
        this.hora_consulta = hora_consulta;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
}
