package br.com.algaworks.abs_factory;

import br.com.algaworks.abs_factory.enums.EnumBancos;
import br.com.algaworks.abs_factory.gerador.boleto.GeradorBoleto;
import br.com.algaworks.abs_factory.gerador.nfe.GeradorNotaFiscal;
import br.com.algaworks.abs_factory.imposto.CalculoImposto;

public abstract class GeradorNotaFiscalFactory {

	private EnumBancos banco;
	
	public GeradorNotaFiscalFactory(EnumBancos banco) {
		this.banco = banco;
	}
	
	public GeradorNotaFiscal getGeradorNotaFiscal() {
		return new GeradorNotaFiscal(this);
	}
	
	public GeradorBoleto getGeradorBoleto() {
		return banco.getGeradorBoleto();
	}

	public abstract CalculoImposto getCalculoImposto();
}
