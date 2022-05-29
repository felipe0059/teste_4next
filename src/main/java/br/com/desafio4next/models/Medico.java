package br.com.desafio4next.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_medico")
public class Medico {

    @Id
    @Column(name = "nome_medico", unique = true)
    @NotBlank(message = "Por favor digite o nome do médico:")
    private String nome;

    @Column(name = "crm_medico", unique = true)
    @NotBlank
    private String crm;

    @NotNull
    @Column
    private Integer idade;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "nome_medico")
    @JsonIgnoreProperties("medico")
    private List<Consulta> consultas;

}