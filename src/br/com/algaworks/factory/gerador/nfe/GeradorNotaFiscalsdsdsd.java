package br.com.algaworks.factory.gerador.nfe;

import java.util.List;

import br.com.algaworks.factory.pojo.NotaFiscalEletronica;
import br.com.algaworks.factory.pojo.Produto;

public interface GeradorNotaFiscal {

	public void gerarNota(String nome, List<Produto> produtos);
	public void gerarBoleto(NotaFiscalEletronica nfe);
}
