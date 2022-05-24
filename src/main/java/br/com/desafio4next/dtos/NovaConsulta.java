package br.com.desafio4next.dtos;

import br.com.desafio4next.models.Consultorio;

import java.time.LocalDateTime;

public class NovaConsulta {

    private String nome;
    private LocalDateTime data;
    private Consultorio consultorio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
}
