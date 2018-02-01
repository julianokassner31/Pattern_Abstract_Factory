package br.com.algaworks.decorator.pojo;

import br.com.algaworks.decorator.EnumTamanhoDoPao;
import br.com.algaworks.decorator.EnumTipoPao;

public abstract class Sanduiche extends Item{
	
	private EnumTipoPao tipoPao;
	private EnumTamanhoDoPao tamanho;
	private double preco;
	
	public Sanduiche(EnumTipoPao tipoPao, EnumTamanhoDoPao tamanho, double preco) {
		this.tipoPao = tipoPao;
		this.tamanho = tamanho;
		this.preco = preco;
	}
	
	public EnumTipoPao getTipoPao() {
		return tipoPao;
	}

	public EnumTamanhoDoPao getTamanho() {
		return tamanho;
	}
	
	@Override
	public double getPreco() {
		return preco +(preco * getTamanho().getFator());
	}
}
