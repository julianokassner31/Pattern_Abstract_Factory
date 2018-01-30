package br.com.algaworks.abs_factory.enums;

import br.com.algaworks.abs_factory.gerador.boleto.GeradorBoleto;

public enum EnumBancos {

	BB(1, new GeradorBoleto("Banco do Brasil")),
	ITAU(2, new GeradorBoleto("Itau Unibanco")),
	SANTANDER(3, new GeradorBoleto("Santander"));
	
	private GeradorBoleto geradorBoleto;
	private int id;
	
	EnumBancos(int id, GeradorBoleto geradorBoleto){
		this.geradorBoleto = geradorBoleto;
		this.id = id;
	}

	public GeradorBoleto getGeradorBoleto() {
		return geradorBoleto;
	}

	public int getId() {
		return id;
	}
}
