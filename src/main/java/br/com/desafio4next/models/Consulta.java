package br.com.desafio4next.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalTime;
import java.util.Calendar;

@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome_paciente")
    @NotNull
    private String nome;
    @Column
    @NotNull
    private String nome_medico;
    @Column
    @Temporal(TemporalType.DATE)
    Calendar data_consulta;
    @Column
    @JsonFormat(pattern = "HH:mm:ss")
    LocalTime hora_consulta;
    @Enumerated(EnumType.STRING)
    private Consultorio consultorio;
}