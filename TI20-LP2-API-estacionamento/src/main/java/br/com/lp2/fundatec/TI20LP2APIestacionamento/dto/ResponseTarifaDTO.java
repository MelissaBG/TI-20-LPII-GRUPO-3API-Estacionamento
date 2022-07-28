package br.com.lp2.fundatec.TI20LP2APIestacionamento.dto;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TempoTipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Data
@NoArgsConstructor
public class ResponseTarifaDTO {

    private TempoTipoTarifa tipoTarifa;
    private TipoVeiculo tipoVeiculo;
    private BigDecimal valor;


    public void TarifaResponseDTO(Tarifa tarifa){
        tipoTarifa = tarifa.getTipoTarifa();
        tipoVeiculo = tarifa.getTipoVeiculo();
        valor = tarifa.getValor();
    }
}
