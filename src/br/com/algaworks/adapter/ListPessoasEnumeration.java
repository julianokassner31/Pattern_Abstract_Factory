package br.com.algaworks.adapter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class ListPessoasEnumeration implements Enumeration<Pessoa> {

	List<Pessoa> pessoas = new ArrayList<>();
	int count = 0;
	
	
	public ListPessoasEnumeration() {
		pessoas.add(new Estudante("Jo�zinho da Silva", "Estudante"));
		pessoas.add(new Trabalhador("J�o", "Programad�z�o"));
		pessoas.add(new Trabalhador("J�j�o", "Progamd� Amad�"));
	}
	
	@Override
	public boolean hasMoreElements() {
		
		
		if(count + 1 <= pessoas.size()) {
			System.out.println("pr�ximo elemento\n");
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
