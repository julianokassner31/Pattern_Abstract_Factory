package br.com.algaworks.decorator;

public enum EnumTamanhoDoPao {
	
	QUINZE_CM(1, "15cm", 1),
	TRINTA_CM(2, "30cm", 1.5);
	
	private int id;
	private String tamanho;
	private double fator;
	
	private EnumTamanhoDoPao(int id, String tamanho, double fator) {
		this.id = id;
		this.tamanho = tamanho;
		this.fator = fator;
	}
	
	public int getId() {
		return id;
	}

	public String getTamanho() {
		return tamanho;
	}
	
	public double getFator() {
		return fator;
	}
	
	public static EnumTamanhoDoPao getTamanhoDoPao(int id) throws Exception {

		for (EnumTamanhoDoPao i : EnumTamanhoDoPao.values()) {
			if (i.getId() == id) {
				return i;
			}
		}

		throw new Exception("Este tamanho não existe em nosso cardápio");
	}
	
	public static String mostrarOpcoesDisponiveis() {
		StringBuilder sb = new StringBuilder();
		
		for (EnumTamanhoDoPao e : EnumTamanhoDoPao.values()) {
			sb.append(e.getId()+" = "+e.getTamanho()+"\n");
		}
		
		return sb.toString(); 
	}
	
}
