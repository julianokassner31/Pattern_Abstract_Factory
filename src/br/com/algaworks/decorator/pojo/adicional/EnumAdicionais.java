package br.com.algaworks.decorator.pojo.adicional;

public enum EnumAdicionais {

	MOLHO_FRANGO_TERIYAKI(1, "Molho Frango Teriyaki", new MolhoFrangoTeriyakiFactory()),
	QUEIJO_SUICO(2, "Queijo Suiço", new QueijoSuicoFactory()),
	QUEIJO_PRATO(3, "Queijo Prato", new QueijoPratoFactory());
	
	private int id;
	private String nome;
	private AdicionalFactory adicionalFactory;
	
	private EnumAdicionais(int id, String nome, AdicionalFactory adicionalFactory) {
		this.id = id;
		this.nome = nome;
		this.adicionalFactory = adicionalFactory;
	}

	public static String mostrarOpcoesDisponiveis() {
		StringBuilder sb = new StringBuilder();
		
		for (EnumAdicionais e : EnumAdicionais.values()) {
			sb.append(e.getId()+" = "+e.getNome()+"\n");
		}
		
		return sb.toString(); 
	}

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}
	
	public AdicionalFactory getAdicionalFactory() {
		return adicionalFactory;
	}
}