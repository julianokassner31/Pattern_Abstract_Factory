package br.com.algaworks.decorator.pojo;

import br.com.algaworks.decorator.EnumTamanhoDoPao;
import br.com.algaworks.decorator.EnumTipoPao;

public class SanduicheFrangoTeriyaki extends Sanduiche{

	private static double preco = 10.50;
	
	public SanduicheFrangoTeriyaki(EnumTipoPao tipoPao, EnumTamanhoDoPao tamanho) {
		super(tipoPao, tamanho, preco);
		this.descricao = "Sanduíche Frango Teriyaki";
	}
}
