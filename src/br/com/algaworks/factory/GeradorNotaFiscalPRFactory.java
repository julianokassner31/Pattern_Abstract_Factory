package br.com.algaworks.factory;

import br.com.algaworks.factory.enums.EnumBancos;
import br.com.algaworks.factory.imposto.CalculoImposto;
import br.com.algaworks.factory.imposto.CalculoImpostoPR;

public class GeradorNotaFiscalPRFactory extends GeradorNotaFiscalFactory{

	public GeradorNotaFiscalPRFactory(EnumBancos banco) {
		super(banco);
	}

	@Override
	public CalculoImposto getCalculoImposto() {
		return new CalculoImpostoPR();
	}
}
