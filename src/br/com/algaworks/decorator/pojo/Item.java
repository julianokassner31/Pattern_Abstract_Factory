package br.com.algaworks.decorator.pojo;

public abstract class Item implements Cloneable{
	
	protected String descricao;
	
	public String getDescricao() {
		return this.descricao;
	}

	abstract public double getPreco();
}
