package br.com.algaworks.factory;

import br.com.algaworks.factory.enums.EnumBancos;
import br.com.algaworks.factory.imposto.CalculoImposto;
import br.com.algaworks.factory.imposto.CalculoImpostoSP;

public class GeradorNotaFiscalSPFactory extends GeradorNotaFiscalFactory{

	public GeradorNotaFiscalSPFactory(EnumBancos banco) {
		super(banco);
	}
	
	@Override
	public CalculoImposto getCalculoImposto() {
		return CalculoImpostoSP.getInstance();
	}

}
