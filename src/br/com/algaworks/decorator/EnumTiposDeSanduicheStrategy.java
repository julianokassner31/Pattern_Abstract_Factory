package br.com.algaworks.decorator;

import br.com.algaworks.decorator.factory.SanduicheFactory;
import br.com.algaworks.decorator.factory.SanduicheFrangoTeriyakiFactory;
import br.com.algaworks.decorator.factory.SanduicheDePresuntoFactory;;

public enum EnumTiposDeSanduicheStrategy {
	FRANGO_TERIYAKI(1, "Frango Teriyaki", new SanduicheFrangoTeriyakiFactory()),
	PRESUNTO(2, "Presunto", new SanduicheDePresuntoFactory());
	
	private int id;
	private String nome;
	private SanduicheFactory sanduicheFactory;
	
	private EnumTiposDeSanduicheStrategy(int id, String nome, SanduicheFactory sanduicheFactory) {
		this.id = id;
		this.nome = nome;
		this.sanduicheFactory = sanduicheFactory;
	}

	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public SanduicheFactory getSanduicheFactory() {
		return sanduicheFactory;
	}
	
	public static SanduicheFactory getSanduicheById(int id) throws Exception {
		for (EnumTiposDeSanduicheStrategy e : EnumTiposDeSanduicheStrategy.values()) {
			if(e.getId() == id) {
				return e.getSanduicheFactory();
			}
		}
		
		throw new Exception("Sanduiche não existe em nosso cardápio");
	}
	
	public static String mostrarOpcoesDisponiveis() {
		StringBuilder sb = new StringBuilder();
		
		for (EnumTiposDeSanduicheStrategy e : EnumTiposDeSanduicheStrategy.values()) {
			sb.append(e.getId()+" = "+e.getNome()+"\n");
		}
		
		return sb.toString(); 
	}
}
