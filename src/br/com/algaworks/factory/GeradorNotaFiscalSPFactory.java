package br.com.algaworks.factory;

import br.com.algaworks.factory.enums.EnumBancos;
import br.com.algaworks.factory.gerador.boleto.GeradorBoleto;
import br.com.algaworks.factory.gerador.boleto.GeradorBoletoBB;
import br.com.algaworks.factory.imposto.CalculoImposto;
import br.com.algaworks.factory.imposto.CalculoImpostoSP;

public class GeradorNotaFiscalSPFactory implements GeradorNotaFiscalFactory{

	private EnumBancos banco;
	
	public GeradorNotaFiscalSPFactory(EnumBancos banco) {
		this.banco = banco;
	}
	
	@Override
	public CalculoImposto getCalculoImposto() {
		return new CalculoImpostoSP();
	}

	@Override
	public GeradorBoleto getGeradorBoleto() {
		return banco.getGeradorBoleto();
	}

}
