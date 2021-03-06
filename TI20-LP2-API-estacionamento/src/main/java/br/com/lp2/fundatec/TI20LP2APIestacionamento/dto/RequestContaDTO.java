package br.com.lp2.fundatec.TI20LP2APIestacionamento.dto;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.Status;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TipoVeiculo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
public class RequestContaDTO {
    private Long idConta;
    private br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Enums.TipoCliente tipoCliente;
    private Status status;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private BigDecimal valor;
    private TipoVeiculo tipoVeiculo;

    public RequestContaDTO(Long idConta, br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Enums.TipoCliente tipoCliente, Status status, LocalDateTime entrada, LocalDateTime saida, BigDecimal valor, TipoVeiculo tipoVeiculo) {
        this.idConta = idConta;
        this.tipoCliente = tipoCliente;
        this.status = status;
        this.entrada = entrada;
        this.saida = saida;
        this.valor = valor;
        this.tipoVeiculo = tipoVeiculo;
    }
}
