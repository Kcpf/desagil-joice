package br.edu.insper.desagil.joice.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraCFCTest {
	
	private CalculadoraCFC calc;
	private static double DELTA = 0.05;
	
	@BeforeEach
	public void antes() {
		calc = new CalculadoraCFC();
	}
	
	@Test
	public void testaCobre() {
		double peso = 63.55;
		double raio = 0.128;
		
		double resultado = calc.calcula(peso, raio);
		
		assertEquals(resultado, 8.89, DELTA);
	}
	
	@Test
	public void testaOuro() {
		double peso = 196.97;
		double raio = 0.144;
		
		double resultado = calc.calcula(peso, raio);
		
		assertEquals(resultado, 19.36, DELTA);
	}
	
	@Test
	public void testaPrata() {
		double peso = 107.87;
		double raio = 0.144;
		
		double resultado = calc.calcula(peso, raio);
		
		assertEquals(resultado, 10.60, DELTA);
	}
}
