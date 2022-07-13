package br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Assinante;

import java.time.LocalDate;

public class Veiculo {
    private Long id_veiculo;
    private LocalDate ano;
    private String cor;
    private String marca;
    private String modelo;
    private  String placa;
    private TipoVeiculo tipoVeiculo;
    private  boolean assinante;
    public boolean temAssinante(assinante) {
        if ( assinante == true) {
            return true;
        }
        return false;
    }


}
