package br.com.lp2.fundatec.TI20LP2APIestacionamento;

import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Conta;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.Status;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TipoCliente;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.model.enums.TipoVeiculo;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.repository.ContaRepository;
import br.com.lp2.fundatec.TI20LP2APIestacionamento.service.ContaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class ContaServiceTests {



	@ExtendWith(MockitoExtension.class)
	class ContaServiceTest {

		@Mock
		ContaRepository repository;

		@InjectMocks
		ContaService service;

		Conta conta = new Conta(1L, TipoCliente.ASSINANTE, Status.ATIVA, TipoVeiculo.CARRO, LocalDateTime.now(), null, BigDecimal.ONE);

		@Test
		void deveFecharContaComSucesso() {
			String status = Status.INATIVA.toString();
			String statusConta =  conta.getStatus().toString();
			assertEquals(status, statusConta);
		}


	}
