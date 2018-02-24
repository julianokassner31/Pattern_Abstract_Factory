package br.com.algaworks.adapter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ListPessoasEnumeration implements Enumeration<Pessoa> {

	List<Pessoa> pessoas = new ArrayList<>();
	int count = 0;
	
	
	public ListPessoasEnumeration() {
		pessoas.add(new Estudante("Joãzinho da Silva", "Estudante"));
		pessoas.add(new Trabalhador("Jão", "Programadôzão"));
		pessoas.add(new Trabalhador("Jãjão", "Progamdô Amadô"));
	}
	
	@Override
	public boolean hasMoreElements() {
		
		
		if(count + 1 <= pessoas.size()) {
			System.out.println("próximo elemento\n");
			return true;
		}
		
		System.out.println("acabaram os elementos\n");
		return false;
	}

	@Override
	public Pessoa nextElement() {
		Pessoa pessoa = pessoas.get(count);
		count ++;
		return pessoa;
	}

}
