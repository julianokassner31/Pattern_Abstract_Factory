package br.com.algaworks.decorator.pojo.adicional;

import br.com.algaworks.decorator.pojo.Item;

public class QueijoSuico extends AdicionalDecorator{

	public QueijoSuico(Item item){
		super(item);
	}

	@Override
	public String getDescricao() {
		return item.getDescricao()+" Adic. Queij Suiço";
	}

	@Override
	public double getPreco() {
		return 2.00 + item.getPreco();
	}

}
