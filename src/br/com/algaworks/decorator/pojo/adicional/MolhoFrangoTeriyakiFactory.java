package br.com.algaworks.decorator.pojo.adicional;

import br.com.algaworks.decorator.pojo.Item;

public class MolhoFrangoTeriyakiFactory implements AdicionalFactory{

	@Override
	public AdicionalDecorator criarAdicional(Item sanduiche) {
		return new MolhoFrangoTeriyaki(sanduiche);
	}

}
