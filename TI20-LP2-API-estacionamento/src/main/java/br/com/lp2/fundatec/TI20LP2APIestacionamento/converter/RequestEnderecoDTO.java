package br.com.lp2.fundatec.TI20LP2APIestacionamento.converter;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RequestEnderecoDTO {
    private  Long id;
    private String logradouro;
    private String numero;
    private  String cep;

}
