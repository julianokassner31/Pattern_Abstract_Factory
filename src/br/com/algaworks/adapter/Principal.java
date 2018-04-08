package br.com.algaworks.adapter;
import java.io.IOException;


/**
 * 
 * @author kassner
 *Estudo do padrao de projeto Adapter - Seguindo exemplos do livro use a cabeça - Desinger Patterns
 */
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
			Pessoa pessoa = listaAdaptada.next();
			pessoa.falarNomeEOcupcao();
			listaAdaptada.remove();
		}
	}
}
