package br.com.bootcamp.santander.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Ocorrencia {
    @Id
    private long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "descricao")
    private String descricao;
}
