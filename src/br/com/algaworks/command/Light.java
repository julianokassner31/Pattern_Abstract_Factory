package br.com.algaworks.command;

public class Light {

	private boolean ligada = false;
	
	public Light() {}
	
	public void OnOff() {
		
		if(!ligada) {
			ligada = !ligada;
			System.out.println("Ligando a Luz.");
		}else {
			System.out.println("Apagando a Luz.");
		}
	}
}
