package br.com.lp2.fundatec.TI20LP2APIestacionamento.dto;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TempoTipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Data
@NoArgsConstructor
public class RequestTarifaDTO {

    private Long id;
    private TempoTipoTarifa tipoTarifa;
    private TipoVeiculo tipoVeiculo;
    private BigDecimal valor;


    public void TarifaRequestDTO(Tarifa tarifa) {
        id = tarifa.getId();
        tipoTarifa = tarifa.getTipoTarifa();
        tipoVeiculo = tarifa.getTipoVeiculo();
        valor = tarifa.getValor();
    }

}
