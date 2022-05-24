package br.com.desafio4next.models;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_consulta")
public class Consulta {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name = "nome_paciente") @NotNull
    private String nome;
    @Column @NotNull
    private LocalDateTime data;
    @Column(name="id_Medico")
    private Integer id_medico;
    @Enumerated (EnumType.STRING)
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

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Integer getId_medico() {
        return id_medico;
    }

    public void setId_medico(Integer id_medico) {
        this.id_medico = id_medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
}
