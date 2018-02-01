package br.com.algaworks.decorator.pojo.adicional;

import br.com.algaworks.decorator.pojo.Item;

public class QueijoPratoFactory implements AdicionalFactory{

	@Override
	public AdicionalDecorator criarAdicional(Item item) {
		return new QueijoPrato(item);
	}

}
