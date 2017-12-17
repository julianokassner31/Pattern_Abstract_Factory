package br.com.algaworks.factory.pojo;

import java.util.ArrayList;
import java.util.List;

public class Boleto {

	private String codigoBarras;
	private List<Produto> listProdutos = new ArrayList<>();
	private double valor;
	private String banco;
	private String pagador;
	private String favorecido;
	
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public List<Produto> getListProdutos() {
		return listProdutos;
	}
	public void setListProdutos(List<Produto> listProdutos) {
		this.listProdutos = listProdutos;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getPagador() {
		return pagador;
	}
	public void setPagador(String pagador) {
		this.pagador = pagador;
	}
	public String getFavorecido() {
		return favorecido;
	}
	public void setFavorecido(String favorecido) {
		this.favorecido = favorecido;
	}
}
