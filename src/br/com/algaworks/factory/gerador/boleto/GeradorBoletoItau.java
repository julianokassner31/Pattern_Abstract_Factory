package br.com.algaworks.factory.gerador.boleto;

import br.com.algaworks.factory.pojo.Boleto;
import br.com.algaworks.factory.pojo.NotaFiscalEletronica;

public class GeradorBoletoItau implements GeradorBoleto{

	@Override
	public Boleto gerar(NotaFiscalEletronica nfe) {
		Boleto boleto = new Boleto();
		boleto.setCodigoBarras("1234567890");
		boleto.setBanco("Itau");
		boleto.setValor(nfe.getValorTotalNota());
		boleto.setListProdutos(nfe.getListProdutos());
		boleto.setFavorecido(nfe.getEmissor());
		boleto.setPagador(nfe.getNomeCliente());
		return  boleto;
	}

}
