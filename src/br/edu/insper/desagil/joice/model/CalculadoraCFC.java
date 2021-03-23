package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {

	public CalculadoraCFC() {
		super("Cúbica de Face Centrada");
	}

	@Override
	public double calcula(double peso, double raio) {
		double ladoQuadrado = (2*raio*Math.pow(2, 0.5)) * Math.pow(10, -7);
		double volume = Math.pow(ladoQuadrado, 3);
		
		double mol = 6.02 * Math.pow(10, 23);
	
		double pesoTotal = 4*(peso);
		
		return (double) (pesoTotal/(mol*volume));
	}

}
