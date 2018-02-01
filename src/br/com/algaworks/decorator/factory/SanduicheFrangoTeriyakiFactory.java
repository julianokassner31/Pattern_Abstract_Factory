package br.com.algaworks.decorator.factory;

import br.com.algaworks.decorator.EnumTamanhoDoPao;
import br.com.algaworks.decorator.EnumTipoPao;
import br.com.algaworks.decorator.pojo.Sanduiche;
import br.com.algaworks.decorator.pojo.SanduicheFrangoTeriyaki;

public class SanduicheFrangoTeriyakiFactory implements SanduicheFactory {

	@Override
	public Sanduiche criarSanduiche(EnumTipoPao tipoPao, EnumTamanhoDoPao tamanho) {
		return new SanduicheFrangoTeriyaki(tipoPao, tamanho);
	}

}
