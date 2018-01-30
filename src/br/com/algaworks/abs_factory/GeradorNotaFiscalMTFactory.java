package br.com.algaworks.abs_factory;

import br.com.algaworks.abs_factory.enums.EnumBancos;
import br.com.algaworks.abs_factory.imposto.CalculoImposto;
import br.com.algaworks.abs_factory.imposto.CalculoImpostoMT;

public class GeradorNotaFiscalMTFactory extends GeradorNotaFiscalFactory {

	public GeradorNotaFiscalMTFactory(EnumBancos banco) {
		super(banco);
	}

	@Override
	public CalculoImposto getCalculoImposto() {
		return new CalculoImpostoMT();
	}

}
