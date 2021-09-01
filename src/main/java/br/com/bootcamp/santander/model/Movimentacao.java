package br.com.bootcamp.santander.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentacao {

        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable
        public  class  MovimentacaoId implements Serializable{
			private static final long serialVersionUID = 1L;
			@Column(name = "idMovimento")
            private long idMovimento;
            @Column(name = "idUsuario")
            private long idUsuario;
        }
        @Id
        @EmbeddedId
        @Column(name = "movimentacaoId")
        private MovimentacaoId movimentacaoId;
        @Column(name = "dataEntrada")
        private LocalDateTime dataEntrada;
        @Column(name = "dataSaida")
        private LocalDateTime dataSaida;
        @Column(name = "periodo")
        private BigDecimal periodo;
        @ManyToOne
        private Ocorrencia ocorrencia;
        @ManyToOne
        private Calendario calendario;
}
