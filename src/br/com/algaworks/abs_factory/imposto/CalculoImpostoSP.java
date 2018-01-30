package br.com.algaworks.abs_factory.imposto;

public class CalculoImpostoSP implements CalculoImposto{

	
	private static CalculoImposto calculoImposto;
	
	private CalculoImpostoSP() {}
	
	
	//Usado padrao Singleton
	public static CalculoImposto getInstance() {
		
		if(calculoImposto == null) {
			return new CalculoImpostoSP();
		
		}else {
			return calculoImposto;
		}
	}
	
	@Override
	public double calcularImposto(double valor){
		return valor * 0.05;
	}
}
