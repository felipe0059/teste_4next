package br.com.desafio4next.models;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_medico")
public class Medico {
    @Id
    @Column(name = "nome_medico")
    @NotNull
    private String nome;
    @Column
    @NotNull
    private String crm;
    @Column
    @NotNull
    private Integer idade;
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @OneToMany
    @JoinColumn(name = "nome_medico")
    private List<Consulta> consulta;
}