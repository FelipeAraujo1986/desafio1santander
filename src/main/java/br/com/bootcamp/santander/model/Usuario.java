package br.com.bootcamp.santander.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    private Long id;
    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    @Column(name = "nome")
    private String nome;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private  JornadaTrabalho jornadaTrabalho;
    @Column(name = "tolerancia")
    private BigDecimal tolerancia;
    @Column(name = "inicioJornada")
    private LocalDateTime inicioJornada;
    @Column(name = "finalJornada")
    private LocalDateTime finalJornada;
}
