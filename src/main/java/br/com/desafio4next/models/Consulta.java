package br.com.desafio4next.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "nome_paciente")
    private String nome;

    @Column(name = "nome_medico")
    @NotBlank
    private String nomeMedico;

    @Column(name="data_consulta")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @NotNull(message ="Data é obrigatória")
    private LocalDate dataConsulta;

    @Column(name="hora_consulta")
    @NotNull(message ="Hora é obrigatória")
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime horaConsulta;

    @Column(name="numero_consultorio")
    @NotNull(message ="Numero do consultório é obrigatório!")
    private Integer numeroConsultorio;



}