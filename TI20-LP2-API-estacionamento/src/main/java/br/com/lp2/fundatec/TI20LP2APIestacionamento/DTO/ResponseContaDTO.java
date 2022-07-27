package br.com.lp2.fundatec.TI20LP2APIestacionamento.DTO;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.Model.Enums.Status;
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
