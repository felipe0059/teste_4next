package br.com.desafio4next.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "tb_consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome_paciente")
    @NotNull
    private String nome;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    Calendar data_consulta;
    @Column(name = "hora")
    @JsonFormat(pattern = "HH:mm:ss")
    LocalTime hora_consulta;
    @Column(name = "nome_medico")
    private String nomeMedico;
    @Enumerated(EnumType.STRING)
    private Consultorio consultorio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
}