package br.edu.insper.desagil.joice.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculadoraCFCTest {
	
	@BeforeEach
	public void antes() {
		CalculadoraCFC calc = new CalculadoraCFC();
	}
	
	@Test
	public void testaCobre() {
		double peso = 63.55;
		double raio = 0.128;
		
		double resultado = calc.calcula(peso, raio);
		
		assertEquals(resultado, 8.89, 0.05);
	}
	
	@Test
	public void testaOuro() {
		double peso = 196.97;
		double raio = 0.144;
		
		double resultado = calc.calcula(peso, raio);
		
		assertEquals(resultado, 19.36, 0.05);
	}
	
	@Test
	public void testaPrata() {
		double peso = 107.87;
		double raio = 0.144;
		
		double resultado = calc.calcula(peso, raio);
		
		assertEquals(resultado, 10.60, 0.05);
	}
}
