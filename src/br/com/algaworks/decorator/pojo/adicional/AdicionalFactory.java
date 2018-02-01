package br.com.algaworks.decorator.pojo.adicional;

import br.com.algaworks.decorator.pojo.Item;

public interface AdicionalFactory {

	AdicionalDecorator criarAdicional(Item item);
}
