package br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.Refatorado;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ContaResponseDTO implements ResponseDTO{
    private Long id;
    private String placa;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private Long tempoEmMinutos;
    private BigDecimal valor;

}
