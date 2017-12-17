package br.com.algaworks.factory;

import br.com.algaworks.factory.gerador.boleto.GeradorBoleto;
import br.com.algaworks.factory.imposto.CalculoImposto;

public interface GeradorNotaFiscalFactory {

	public CalculoImposto getCalculoImposto();
	public GeradorBoleto getGeradorBoleto();
}
