package br.com.bootcamp.santander.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
public class BancoHoras {


    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    @SuppressWarnings("unused")
    public  class BancoHorasId implements Serializable{
		private static final long serialVersionUID = 1L;
		private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;


    }
    @EmbeddedId
    private BancoHorasId bancoHorasId;
    @Column(name = "dataTrabalhada")
    private LocalDateTime dataTrabalhada;
    @Column(name = "quantidadeHoras")
    private BigDecimal quantidadeHoras;
    @Column(name = "saldoHoras")
    private BigDecimal saldoHoras;

}
