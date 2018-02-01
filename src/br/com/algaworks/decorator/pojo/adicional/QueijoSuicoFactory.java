package br.com.algaworks.decorator.pojo.adicional;

import br.com.algaworks.decorator.pojo.Item;

public class QueijoSuicoFactory implements AdicionalFactory{

	@Override
	public AdicionalDecorator criarAdicional(Item sanduiche) {
		return new QueijoSuico(sanduiche);
	}

}
