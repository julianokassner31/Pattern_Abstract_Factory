package br.com.algaworks.decorator.pojo.adicional;

import br.com.algaworks.decorator.pojo.Item;

public abstract class AdicionalDecorator extends Item{
	
	protected Item item;
	
	public AdicionalDecorator(Item item){
		
		try {
			
			if(item instanceof Item)
				this.item = item;
			
		}catch (Exception e) {
			new Exception(String.format("Bebida %s não recebe adicionais", item.getDescricao()));
		}
	}
	
	public abstract String getDescricao();
	
}
