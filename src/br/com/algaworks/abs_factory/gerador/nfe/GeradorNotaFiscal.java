package br.com.algaworks.abs_factory.gerador.nfe;

import java.util.List;

import br.com.algaworks.abs_factory.GeradorNotaFiscalFactory;
import br.com.algaworks.abs_factory.gerador.boleto.GeradorBoleto;
import br.com.algaworks.abs_factory.imposto.CalculoImposto;
import br.com.algaworks.abs_factory.pojo.Boleto;
import br.com.algaworks.abs_factory.pojo.NotaFiscalEletronica;
import br.com.algaworks.abs_factory.pojo.Produto;

public class GeradorNotaFiscal{

	private CalculoImposto calculoImposto;
	private GeradorBoleto geradorBoleto;
	
	public GeradorNotaFiscal(GeradorNotaFiscalFactory factory){
		this.calculoImposto = factory.getCalculoImposto();
		this.geradorBoleto = factory.getGeradorBoleto();
	}
	
	public double valorImposto(double valor){
		return calculoImposto.calcularImposto(valor);
	}
	
	private void gerarBoleto(NotaFiscalEletronica nfe){
		
		try{
			
			Boleto boleto = geradorBoleto.gerar(nfe);
			System.out.println("Valor total dos produtos: " + nfe.getValorTotalProdutos());
			System.out.println("Valor do Imposto: " + nfe.getValorImposto());
			System.out.println("Boleto gerado com sucesso!");
			System.out.println("Banco: " +boleto.getBanco());
			System.out.printf("Número boleto: %s\n", boleto.getCodigoBarras());
			System.out.printf("Favorecido: %s\n", boleto.getFavorecido());
			System.out.printf("Valor total: %.2f\n\n", boleto.getValor());
		
		}catch(Exception e){
			System.out.println("Boleto não foi gerado!");
		}
	}
	
	private double calcularValorTotalProdutos(List<Produto> produtos){
		return produtos.stream().mapToDouble(p-> p.getValor()).sum();
	}
	
	public void gerarNotaFiscal(String nome, List<Produto> produtos){
		
		try{
			
			double valorTotalProdutos = this.calcularValorTotalProdutos(produtos);

			NotaFiscalEletronica nfe = new NotaFiscalEletronica();
			nfe.setValorTotalProdutos(valorTotalProdutos);
			nfe.setValorImposto( this.valorImposto(valorTotalProdutos) );
			nfe.setListProdutos(produtos);
			nfe.setNomeCliente(nome);
			nfe.setEmissor("Stop Lan House Eletronics");
			gerarBoleto(nfe);
		
		}catch(Exception e){
			System.out.println("Erro ao gerar nfe!");
		}
	}
}
