package br.com.lp2.fundatec.TI20LP2APIestacionamento.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RequestEnderecoDTO {
    private Long idEndereco;
    private String logradouro;
    private String numero;
    private String cep;

    public RequestEnderecoDTO(Long idEndereco, String logradouro, String numero, String cep) {
        this.idEndereco = idEndereco;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }
}
