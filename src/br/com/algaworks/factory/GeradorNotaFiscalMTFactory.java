package br.com.algaworks.factory;

import br.com.algaworks.factory.enums.EnumBancos;
import br.com.algaworks.factory.imposto.CalculoImposto;
import br.com.algaworks.factory.imposto.CalculoImpostoMT;

public class GeradorNotaFiscalMTFactory extends GeradorNotaFiscalFactory {

	public GeradorNotaFiscalMTFactory(EnumBancos banco) {
		super(banco);
	}

	@Override
	public CalculoImposto getCalculoImposto() {
		return new CalculoImpostoMT();
	}

}
