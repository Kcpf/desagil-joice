package br.edu.insper.desagil.joice.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraCCCTest {
	
	private CalculadoraCCC calc;
	
	@BeforeEach
	public void antes() {
		calc = new CalculadoraCCC();
	}
	
	
	@Test
	public void testaNiobio() {
		double peso = 92.91;
		double raio = 0.143;
		
		double resultado = calc.calcula(peso, raio);
		
		assertEquals(resultado, 8.57, 0.05);
	}
	
	@Test
	public void testaTungstenio() {
		double peso = 183.84;
		double raio = 0.137;
		
		double resultado = calc.calcula(peso, raio);
		
		assertEquals(resultado, 19.28, 0.05);
	}
	
	
	@Test
	public void testaLitio() {
		double peso = 6.94;
		double raio = 0.152;
		
		double resultado = calc.calcula(peso, raio);
		
		assertEquals(resultado, 0.53, 0.05);
	}
	
}
