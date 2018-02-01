package br.com.algaworks.decorator;

public enum EnumTipoPao {

	PAO_9_GRAOS(1, "9 grãos"), 
	PAO_9_GRAOS_AVEIA_MEL(2, "9 grãos com aveia e mel"),
	PAO_ITALIANO(3, "Italiano"),
	PAO_PARMESAO_OREGANO(4, "Parmesão e orégano"),
	PAO_TRES_QUEIJOS(5, "Três Queijos");

	private int id;
	private String nome;

	private EnumTipoPao(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public static EnumTipoPao getTipoDePao(int id) throws Exception {

		for (EnumTipoPao e : EnumTipoPao.values()) {
			if (e.getId() == id) {
				return e;
			}
		}

		throw new Exception("Este pão não existe em nosso cardápio");
	}
	
	public static String mostrarOpcoesDisponiveis() {
		StringBuilder sb = new StringBuilder();
		
		for (EnumTipoPao e : EnumTipoPao.values()) {
			sb.append(e.getId()+" = "+e.getNome()+"\n");
		}
		
		return sb.toString(); 
	}
}
