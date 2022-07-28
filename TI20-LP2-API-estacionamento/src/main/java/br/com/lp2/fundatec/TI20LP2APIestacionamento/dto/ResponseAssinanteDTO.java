package br.com.lp2.fundatec.TI20LP2APIestacionamento.dto;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Endereco;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TipoCliente;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Veiculo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Data
@Getter
@Setter
public class ResponseAssinanteDTO {
    private Long id;
    private String nome;
    private String cpf;
    private Endereco endereco;
    private Veiculo veiculo;
    private BigDecimal creditoDisponivel;
    private TipoCliente tipoCliente;

    public ResponseAssinanteDTO(Long id, String nome, String cpf,
                                Endereco endereco, Veiculo veiculo,
                                BigDecimal creditoDisponivel, TipoCliente tipoCliente) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.veiculo = veiculo;
        this.creditoDisponivel = creditoDisponivel;
        this.tipoCliente = tipoCliente;
    }
}
