package br.com.algaworks.adapter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
	
		ListPessoasEnumeration listPessoas = new ListPessoasEnumeration();
		
		System.out.println("Percorrendo lista de pessoas com Enumeration");
		while(listPessoas.hasMoreElements()) {
			Pessoa pessoa = listPessoas.nextElement();
			pessoa.falarNomeEOcupcao();
		}
		
		System.out.println("");
		System.out.println("Percorrendo lista de pessoas com Iterator -> lista enumeration adaptada para iterator");
		ListPessoasAdapterToIterator listaAdaptada = new ListPessoasAdapterToIterator(new ListPessoasEnumeration());
		while(listaAdaptada.hasNext()) {
			try {
				Pessoa pessoa = listaAdaptada.next();
				pessoa.falarNomeEOcupcao();
				listaAdaptada.remove();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
