package br.com.algaworks.decorator.pojo.adicional;

import br.com.algaworks.decorator.pojo.Item;

public class QueijoPrato extends AdicionalDecorator {

	public QueijoPrato(Item item) {
		super(item);
	}

	@Override
	public String getDescricao() {
		return item.getDescricao()+" Adic. Queijo Prato";
	}

	@Override
	public double getPreco() {
		return 1.0;
	}

}
