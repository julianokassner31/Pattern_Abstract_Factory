package br.com.algaworks.decorator.pojo.adicional;

import br.com.algaworks.decorator.pojo.Item;

public class MolhoFrangoTeriyaki extends AdicionalDecorator{

	private static double preco;
	
	public MolhoFrangoTeriyaki(Item item){
		super(item, preco);
	}

	@Override
	public String getDescricao() {
		return item.getDescricao() +" Adic. Mol Frang Teriy";
	}

}
