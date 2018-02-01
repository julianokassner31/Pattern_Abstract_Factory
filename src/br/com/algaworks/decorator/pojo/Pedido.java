package br.com.algaworks.decorator.pojo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private List<Item> itens = new ArrayList<Item>();

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public double total() {
		return itens.stream().mapToDouble( i -> i.getPreco()).sum();
	}
	
}
