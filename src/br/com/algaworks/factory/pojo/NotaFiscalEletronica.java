package br.com.algaworks.factory.pojo;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscalEletronica {

	private String nomeCliente;
	private List<Produto> listProdutos = new ArrayList<>();
	private double valorTotalProdutos = 0.0;
	private double valorImposto = 0.0;
	private double valorTotalNota = 0.0;
	private String emissor;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public List<Produto> getListProdutos() {
		return listProdutos;
	}
	public void setListProdutos(List<Produto> listProdutos) {
		this.listProdutos = listProdutos;
	}
	public double getValorTotalProdutos() {
		return valorTotalProdutos;
	}
	public void setValorTotalProdutos(double valorTotalProdutos) {
		this.valorTotalProdutos = valorTotalProdutos;
	}
	public double getValorImposto() {
		return valorImposto;
	}
	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}
	public double getValorTotalNota() {
		return valorTotalNota;
	}
	public void setValorTotalNota(double valorTotalNota) {
		this.valorTotalNota = valorTotalNota;
	}
	public String getEmissor() {
		return emissor;
	}
	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}
}
