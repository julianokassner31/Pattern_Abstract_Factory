package br.com.algaworks.state;

public class PortaFechadaState implements EstadoDaPorta{

	InteracaoPorta interacao;
	
	public PortaFechadaState(InteracaoPorta interacao) {
		this.interacao = interacao;
	}
	
	@Override
	public void abrir() {
		System.out.println("Abrindo a porta");
		interacao.setEstadoDaPorta(interacao.getAberta());
	}

	@Override
	public void fechar() {
		System.out.println("A porta já esta fechada.");
	}
	
	@Override
	public String toString() {
		return "Porta fechada";
	}
}
