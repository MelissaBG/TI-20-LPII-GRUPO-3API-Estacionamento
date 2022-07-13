package br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.Refatorado;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Builder
public class ContaResponseDTO {
    private Long id;
    private String placa;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private Long tempoEmMinutos;
    private BigDecimal valor;

}
