package br.com.bootcamp.santander.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {
    @Id
    private  long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @Column(name = "descricao")
    private String descricao;
}
