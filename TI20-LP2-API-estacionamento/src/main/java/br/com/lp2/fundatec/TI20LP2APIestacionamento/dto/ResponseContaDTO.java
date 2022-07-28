package br.com.lp2.fundatec.TI20LP2APIestacionamento.dto;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.Status;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@Getter
@Setter
public class ResponseContaDTO {
    private Status status;
    private BigDecimal valor;

    public ResponseContaDTO(Status status, BigDecimal valor) {
        this.status = status;
        this.valor = valor;
    }
}
