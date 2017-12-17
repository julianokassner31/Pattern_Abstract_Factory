package br.com.algaworks.factory.imposto;

public class CalculoImpostoSP implements CalculoImposto{

	@Override
	public double calcularImposto(double valor){
		return valor * 0.05;
	}
}
