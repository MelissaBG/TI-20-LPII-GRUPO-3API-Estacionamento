package br.com.lp2.fundatec.TI20LP2APIestacionamento.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EnderecoDTO {
        private Integer id;
        private String uf;
        private String cidade;
        private String bairro;
        private String cep;
        private String rua;
        private Integer numero;
        private String complemento;
    }

