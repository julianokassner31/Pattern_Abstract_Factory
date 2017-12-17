package br.com.algaworks.factory.enums;

import br.com.algaworks.factory.gerador.boleto.GeradorBoleto;
import br.com.algaworks.factory.gerador.boleto.GeradorBoletoBB;
import br.com.algaworks.factory.gerador.boleto.GeradorBoletoItau;
import br.com.algaworks.factory.gerador.boleto.GeradorBoletoSantander;

public enum EnumBancos {

	
	BANCO_DO_BRASIL(1, new GeradorBoletoBB()),
	ITAU(2, new GeradorBoletoItau()),
	SANTANDER(3, new GeradorBoletoSantander());
	
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
