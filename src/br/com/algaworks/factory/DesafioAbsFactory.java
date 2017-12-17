package br.com.algaworks.factory;

import java.util.Arrays;
import java.util.List;

import br.com.algaworks.factory.enums.EnumBancos;
import br.com.algaworks.factory.gerador.nfe.GeradorNotaFiscal;
import br.com.algaworks.factory.gerador.nfe.GeradorNotaFiscalSP;
import br.com.algaworks.factory.pojo.Produto;

public class DesafioAbsFactory {

	public static void main(String[] args) {
		
		GeradorNotaFiscalFactory factory = new GeradorNotaFiscalSPFactory(EnumBancos.BANCO_DO_BRASIL);
		GeradorNotaFiscal geradorNFE = new GeradorNotaFiscalSP(factory);
		geradorNFE.gerarNota("Juliano", getProdutos());
	}
	
	public static List<Produto> getProdutos(){
		return Arrays.asList(
					new Produto("Televisão 50\"", 1599.00),
					new Produto("PlayStation 4", 1800.00),
					new Produto("Cama box", 1400.00)
				);
	}
}
