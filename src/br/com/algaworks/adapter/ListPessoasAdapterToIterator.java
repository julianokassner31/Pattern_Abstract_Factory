package br.com.algaworks.adapter;
import java.util.Iterator;

public class ListPessoasAdapterToIterator implements Iterator<Pessoa>{

	ListPessoasEnumeration listPessoasEnumeration;
	
	public ListPessoasAdapterToIterator(ListPessoasEnumeration listPessoasEnumeration) {
		this.listPessoasEnumeration = listPessoasEnumeration;
	}
	
	@Override
	public boolean hasNext() {
		return listPessoasEnumeration.hasMoreElements();
	}

	@Override
	public Pessoa next() {
		return listPessoasEnumeration.nextElement();
	}
	
	@Override
	public void remove() {
		System.out.println("Método remove não é capaz de ser executado em uma lista Enumerada");
	}

}
