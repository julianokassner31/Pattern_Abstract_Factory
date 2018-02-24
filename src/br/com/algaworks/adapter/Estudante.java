package br.com.algaworks.adapter;

public class Estudante extends Pessoa{

	public Estudante(String nome, String ocupacao) {
		super(nome, ocupacao);
	}

	@Override
	public void ocupacao() {
		System.out.printf( String.format(" sou %s\n", getOcupacao()) );
	}

}
