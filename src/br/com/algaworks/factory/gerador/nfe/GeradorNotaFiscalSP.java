package br.com.algaworks.factory.gerador.nfe;

import java.util.List;

import br.com.algaworks.factory.GeradorNotaFiscalFactory;
import br.com.algaworks.factory.enums.EnumBancos;
import br.com.algaworks.factory.gerador.boleto.GeradorBoleto;
import br.com.algaworks.factory.imposto.CalculoImposto;
import br.com.algaworks.factory.pojo.Boleto;
import br.com.algaworks.factory.pojo.NotaFiscalEletronica;
import br.com.algaworks.factory.pojo.Produto;
import sun.management.snmp.jvmmib.EnumJvmMemManagerState;

public class GeradorNotaFiscalSP implements GeradorNotaFiscal {

	private CalculoImposto calculoImposto;
	private GeradorBoleto geradorBoleto;
	
	public GeradorNotaFiscalSP(GeradorNotaFiscalFactory factory){
		this.calculoImposto = factory.getCalculoImposto();
		this.geradorBoleto = factory.getGeradorBoleto();
	}
	
	public double valorImposto(double valor){
		return calculoImposto.calcularImposto(valor);
	}
	
	public void gerarBoleto(NotaFiscalEletronica nfe){
		
		try{
			Boleto boleto = geradorBoleto.gerar(nfe);
			System.out.println("Boleto gerado com sucesso!");
			System.out.println("Banco: " +boleto.getBanco());
			System.out.printf("Número boleto: %s\n", boleto.getCodigoBarras());
			System.out.printf("Favorecido: %s\n", boleto.getFavorecido());
			System.out.printf("Valor total: %.2f\n", boleto.getValor());
		
		}catch(Exception e){
			System.out.println("Boleto não foi gerado!");
		}
	}
	
	private double calcularValorTotalProdutos(List<Produto> produtos){
		return produtos.stream().mapToDouble(p-> p.getValor()).sum();
	}
	
	public void gerarNota(String nome, List<Produto> produtos){
		
		try{
			double valorTotalProdutos = this.calcularValorTotalProdutos(produtos);
			double valorImposto = this.valorImposto(valorTotalProdutos);
	
			NotaFiscalEletronica nfe = new NotaFiscalEletronica();
			nfe.setValorTotalProdutos(valorTotalProdutos);
			nfe.setValorImposto( valorImposto );
			nfe.setValorTotalNota(  valorTotalProdutos + this.valorImposto(valorTotalProdutos) );
			nfe.setListProdutos(produtos);
			nfe.setNomeCliente(nome);
			gerarBoleto(nfe);
		
		}catch(Exception e){
			System.out.println("Erro ao gerar nfe!");
		}
	}
}
