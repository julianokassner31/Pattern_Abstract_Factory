package br.com.algaworks.decorator.pojo.adicional;

import br.com.algaworks.decorator.pojo.Item;

public class QueijoPrato extends AdicionalDecorator {

	private static double preco;
	
	public QueijoPrato(Item item) {
		super(item, preco);
	}

	@Override
	public String getDescricao() {
		return item.getDescricao()+" Adic. Queijo Prato";
	}

}
