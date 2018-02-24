package br.com.algaworks.adapter;

public class Trabalhador extends Pessoa{

	public Trabalhador(String nome, String ocupacao) {
		super(nome, ocupacao);
	}

	@Override
	public void ocupacao() {
		System.out.printf( String.format(" sou %s\n", getOcupacao()) );
	}

}
