package br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.CodigoAntigo.Tarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado.Enums.TipoTarifa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Conta {
    @Id
    @GeneratedValue
    private Long id_conta;
    @Column(name = "dth_entrada", nullable = false)
    private LocalDateTime entrada;
    @Column(name = "dth_saida", nullable = false)
    private LocalDateTime saida;

    @ManyToOne
    @JoinColumn(name = "id_veiculo", nullable = false)
    private Veiculo veiculo;
    @Column(precision = 9, scale = 2, nullable = false)
    private BigDecimal valor;

    public long getTempoEmMinutos(){
        if (entrada == null || saida == null){
            return 0L;
        }
        return ChronoUnit.MINUTES.between(entrada, saida);
    }
    public long getHorasExcedentes(){

        return (getTempoEmMinutos() - 1) / 60;
    }
    public TipoTarifa getTipoTarifa(){

        return TipoTarifa.obterPorTempoEmMinutos(getTempoEmMinutos());
    }
    public void aplicarDescontoParaAssinantes(){
        if(veiculo.temAssinante()) {
            double desconto = MathUtils.calcularPercentual(valor.doubleValue());
            valor = valor.subtract(BigDecimal.valueOf(desconto));
          }
        }
    }
    public boolean estaEncerrada(){
    return valor != null;
    }
    public boolean contaSeEhDoTipoTarifa(Tarifa tarifa){
    return
    }
}
