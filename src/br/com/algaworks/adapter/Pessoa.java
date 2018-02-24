package br.com.algaworks.adapter;

public abstract class Pessoa {

	private String nome;
	private String ocupacao;
	
	public Pessoa(String nome, String ocupacao) {
		this.nome = nome;
		this.ocupacao = ocupacao;
	}
	
	public void falarNomeEOcupcao() {
		System.out.print("Meu nome é "+ this.nome);
		ocupacao();
		
	}
	
	public abstract void ocupacao();
	
	public String getOcupacao() {
		return this.ocupacao;
	} 
}
