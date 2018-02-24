package br.com.algaworks.command;

public class Curtain {

	private boolean aberta = false;
	
	public Curtain() {}
	
	public void abrirFechar() {
		
		if(!aberta) {
			aberta = !aberta;
			System.out.println("Abrindo Janela.");
		}else {
			System.out.println("Fechando Janela.");
		}
	}
		
}
