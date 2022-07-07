package br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Endereco;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AssinanteResponseDTO implements ResponseDTO {
    private Long id;
    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private BigDecimal credito;
    private EnderecoResponseDTO endereco;
}
