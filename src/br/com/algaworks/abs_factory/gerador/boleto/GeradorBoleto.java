package br.com.algaworks.abs_factory.gerador.boleto;

import java.util.Random;

import br.com.algaworks.abs_factory.pojo.Boleto;
import br.com.algaworks.abs_factory.pojo.NotaFiscalEletronica;

public class GeradorBoleto{

	private String nomeBanco;
	
	public GeradorBoleto(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public Boleto gerar(NotaFiscalEletronica nfe){
		int numero = new Random().nextInt(1000000000);
		numero = numero < 0 ? numero * -1 : numero;
		Boleto boleto = new Boleto();
		boleto.setCodigoBarras( String.valueOf(numero));
		boleto.setBanco( this.nomeBanco );
		boleto.setValor(nfe.getValorTotalNota());
		boleto.setListProdutos(nfe.getListProdutos());
		boleto.setFavorecido(nfe.getEmissor());
		boleto.setPagador(nfe.getNomeCliente());
		return  boleto;
	}
}
