package br.com.algaworks.decorator.pojo.adicional;

import br.com.algaworks.decorator.pojo.Item;

public class QueijoSuico extends AdicionalDecorator{

	private static double preco = 2;
	
	public QueijoSuico(Item item){
		super(item, preco);
	}

	@Override
	public String getDescricao() {
		return item.getDescricao()+" Adic. Queij Suiço";
	}

}
