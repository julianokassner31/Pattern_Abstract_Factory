package br.com.algaworks.factory;

import br.com.algaworks.factory.enums.EnumBancos;
import br.com.algaworks.factory.gerador.boleto.GeradorBoleto;
import br.com.algaworks.factory.gerador.nfe.GeradorNotaFiscal;
import br.com.algaworks.factory.imposto.CalculoImposto;

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
