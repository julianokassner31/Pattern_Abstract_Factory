package br.com.algaworks.factory;

import java.util.Arrays;
import java.util.List;

import br.com.algaworks.factory.enums.EnumBancos;
import br.com.algaworks.factory.gerador.nfe.GeradorNotaFiscal;
import br.com.algaworks.factory.pojo.Produto;

public class DesafioAbsFactory {

	public static void main(String[] args) {
		
		GeradorNotaFiscalFactory factory = new GeradorNotaFiscalSPFactory(EnumBancos.BB);
		GeradorNotaFiscal geradorNFE = factory.getGeradorNotaFiscal();
		System.out.println("Gerando nota fiscal e boleto para São Paulo!");
		geradorNFE.gerarNotaFiscal("Juliano", getProdutos());
		
		factory = new GeradorNotaFiscalPRFactory(EnumBancos.ITAU);
		geradorNFE = factory.getGeradorNotaFiscal();
		System.out.println("Gerando nota fiscal e boleto para o Paraná!");
		geradorNFE.gerarNotaFiscal("Juliano", getProdutos());
		
		factory = new GeradorNotaFiscalMTFactory(EnumBancos.SANTANDER);
		geradorNFE = factory.getGeradorNotaFiscal();
		System.out.println("Gerando nota fiscal e boleto para o Mato Grosso!");
		geradorNFE.gerarNotaFiscal("Juliano", getProdutos());
	}
	
	public static List<Produto> getProdutos(){
		return Arrays.asList(
					new Produto("Televisão 50\"", 1599.00),
					new Produto("PlayStation 4", 1800.00),
					new Produto("Cama box", 1400.00)
				);
	}
}
