package br.com.algaworks.decorator.pojo.adicional;

import br.com.algaworks.decorator.pojo.Item;

public class MolhoFrangoTeriyaki extends AdicionalDecorator{

	public MolhoFrangoTeriyaki(Item item){
		super(item);
	}

	@Override
	public String getDescricao() {
		return item.getDescricao() +" Adic. Mol Frang Teriy";
	}

	@Override
	public double getPreco() {
		return 2.00 + item.getPreco();
	}

}
