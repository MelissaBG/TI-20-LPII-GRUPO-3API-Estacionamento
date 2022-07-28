package br.com.lp2.fundatec.TI20LP2APIestacionamento.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ResponseEnderecoDTO {
    private String logradouro;
    private  String cep;
}
