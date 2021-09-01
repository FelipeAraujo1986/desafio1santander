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
public class NivelAcesso {
    @Id
    private long id;
    @Column(name = "descricao")
    private String descricao;
}
