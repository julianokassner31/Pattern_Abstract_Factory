package br.com.algaworks.abs_factory.pojo;

public class Produto {
	
	private String nome;
	private String descricao;
	private double valor;
	
	public Produto(String nome, double valor){
		this.nome = nome;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
