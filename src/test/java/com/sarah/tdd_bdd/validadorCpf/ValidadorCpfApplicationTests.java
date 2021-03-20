package com.sarah.tdd_bdd.validadorCpf;

import com.sarah.tdd_bdd.validadorCpf.models.Cliente;

import java.util.InputMismatchException;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ValidadorCpfApplicationTests {

	@Test
	void fazendoTestedeCpfValido() {
		Cliente cliente = new Cliente(); 
		cliente.setNome("Ana");
		cliente.setCpf("21649805063");
		assertEquals(true, cliente.validarCPF());
	}
    
	@Test
	void fazendoTestedeCpfInvalido() {
		Cliente cliente = new Cliente(); 
		cliente.setNome("Sarah");
		cliente.setCpf("216498050632");
		assertEquals(false, cliente.validarCPF());
	}

	@Test
	void fazendoTestedeCpfComDigitoAmenops() {
		Cliente cliente = new Cliente(); 
		cliente.setNome("Maria");
		cliente.setCpf("2164980506");
		assertEquals(false, cliente.validarCPF());
	}

	@Test
	void fazendoTestedeCpfValidoComPontos() {
		Cliente cliente = new Cliente(); 
		cliente.setNome("Bruna");
		cliente.setCpf("216.498.050-63");
		assertEquals(true, cliente.validarCPF());
	}

	@Test
	void fazendoTestedeCpfValidoComEspacoNoComeco() {
		Cliente cliente = new Cliente(); 
		cliente.setNome("Lucas");
		cliente.setCpf(" 216.498.050-63");
		assertEquals(true, cliente.validarCPF());
	}

	
}


