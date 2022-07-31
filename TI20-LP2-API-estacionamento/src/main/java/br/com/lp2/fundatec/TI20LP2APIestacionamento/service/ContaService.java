package br.com.lp2.fundatec.TI20LP2APIestacionamento.service;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.calculo.CalcularConta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.RequestContaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.dto.ResponseContaDTO;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Assinante;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.Status;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TempoTipoTarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TipoCliente;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Tarifa;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.AssinanteRepository;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class ContaService {
    @Autowired
    private ContaRepository contaRepository;
    private CalcularConta calcularConta;
    private AssinanteRepository assinanteRepository;

    private TarifaService tarifaService;
    public ResponseContaDTO fecharConta(RequestContaDTO requestContaDTO){
        Conta contaFechada = new Conta();
        TipoVeiculo tipoVeiculo = requestContaDTO.getTipoVeiculo();
        contaFechada.setTipoVeiculo(tipoVeiculo);
        contaFechada.setValor(requestContaDTO.getValor());
        contaFechada.setEntrada(requestContaDTO.getEntrada());
        contaFechada.setSaida(requestContaDTO.getSaida());
        contaFechada.setStatus(requestContaDTO.getStatus());
        contaFechada.setTipoCliente(requestContaDTO.getTipoCliente());
        TempoTipoTarifa tempoTipoTarifa = CalcularConta.calcularTarifaComBaseNoTempo(contaFechada);
        Tarifa valorTarifaFinal = tarifaService.findByTipoTarifaAndTipoVeiculo(tempoTipoTarifa, tipoVeiculo);
        contaFechada.setValor(valorTarifaFinal.getValor());
        aplicarDesconto(contaFechada);
        return ContaRepository.save(contaFechada);
    }

    public Conta aplicarDesconto(Conta conta){
        if (conta.getTipoCliente().equals(TipoCliente.ASSINANTE)){
            BigDecimal valor = conta.getValor();
            BigDecimal porcentagemDesconto = new BigDecimal(0.15);
            BigDecimal valorComDesconto = valor.multiply(porcentagemDesconto);
            conta.setValor(valorComDesconto);
            return conta;
        }
        return conta;
    }
    public ResponseContaDTO pagarConta(Long idConta, Long idAssinante){
        Assinante assinante = assinanteRepository.findAllById(idAssinante);
        Conta conta = contaRepository.findById(idConta);
        BigDecimal valor = conta.getValor();
        BigDecimal creditoDisponivel = assinante.getCreditoDiponivel();
        BigDecimal restante = creditoDisponivel.subtract(valor);
        conta.setStatus(Status.INATIVA);
        assinante.setCreditoDiponivel(restante);
        return ResponseContaDTO.converterParaResponse(conta);
    }
}
