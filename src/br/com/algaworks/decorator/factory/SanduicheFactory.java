package br.com.algaworks.decorator.factory;

import br.com.algaworks.decorator.EnumTamanhoDoPao;
import br.com.algaworks.decorator.EnumTipoPao;
import br.com.algaworks.decorator.pojo.Sanduiche;

public interface SanduicheFactory {

	public Sanduiche criarSanduiche(EnumTipoPao tipoPao, EnumTamanhoDoPao tamanho);
	
}
