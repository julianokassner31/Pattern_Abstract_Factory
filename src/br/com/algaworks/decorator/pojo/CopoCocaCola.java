package br.com.algaworks.decorator.pojo;

public class CopoCocaCola extends Bebida{

	@Override
	public String getDescricao() {
		return "Copo Coca-Cola 500ml";
	}
	
	@Override
	public double getPreco() {
		return 3.50;
	}
}
