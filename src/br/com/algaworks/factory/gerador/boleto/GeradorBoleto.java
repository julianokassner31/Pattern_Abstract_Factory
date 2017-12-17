package br.com.algaworks.factory.gerador.boleto;

import br.com.algaworks.factory.pojo.Boleto;
import br.com.algaworks.factory.pojo.NotaFiscalEletronica;

public interface GeradorBoleto {

	public Boleto gerar(NotaFiscalEletronica nfe);
}
