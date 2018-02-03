package br.com.algaworks.decorator.pojo.adicional;

import br.com.algaworks.decorator.pojo.Bebida;
import br.com.algaworks.decorator.pojo.Item;

public abstract class AdicionalDecorator extends Item implements Cloneable{
	
	protected Item item;
	private double preco;
	
	public AdicionalDecorator(Item item, double preco){
		
		try {
			
			if(!(item instanceof Bebida)) {
				this.item = item;
				this.preco = preco;
			
			}else {
				throw new Exception(String.format("Bebida %s não recebe adicionais", item.getDescricao()));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public double getPreco() {
		return this.preco + item.getPreco();
	}
	
	public abstract String getDescricao();
	
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
