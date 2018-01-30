package br.com.algaworks.abs_factory;

import br.com.algaworks.abs_factory.enums.EnumBancos;
import br.com.algaworks.abs_factory.imposto.CalculoImposto;
import br.com.algaworks.abs_factory.imposto.CalculoImpostoPR;

public class GeradorNotaFiscalPRFactory extends GeradorNotaFiscalFactory{

	public GeradorNotaFiscalPRFactory(EnumBancos banco) {
		super(banco);
	}

	@Override
	public CalculoImposto getCalculoImposto() {
		return new CalculoImpostoPR();
	}
}
