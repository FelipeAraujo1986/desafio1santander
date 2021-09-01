package br.com.bootcamp.santander.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {
    @Id
    private Long id;
    @ManyToOne
    private TipoData tipoData;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "dataEspecial")
    private LocalDateTime dataEspecial;
}
