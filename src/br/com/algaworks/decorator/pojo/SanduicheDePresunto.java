package br.com.algaworks.decorator.pojo;

import br.com.algaworks.decorator.EnumTamanhoDoPao;
import br.com.algaworks.decorator.EnumTipoPao;

public class SanduicheDePresunto extends Sanduiche {

	private static double preco = 8.00;
	public SanduicheDePresunto(EnumTipoPao tipoPao, EnumTamanhoDoPao tamanho) {
		super(tipoPao, tamanho, preco);
	}
}
