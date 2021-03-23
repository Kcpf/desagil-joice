package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora {
	
	public CalculadoraCCC() {
		super("Cúbica de Corpo Centrado");
	}

	@Override
	public double calcula(double peso, double raio) {
		double ladoQuadrado = ((4 * raio) / Math.pow(3, 0.5)) * Math.pow(10, -7);
		double volume = Math.pow(ladoQuadrado, 3);
		
		double mol = 6.02 * Math.pow(10, 23);
	
		double pesoTotal = 2*(peso);
		
		return (double) (pesoTotal/(mol*volume));
	}

}
