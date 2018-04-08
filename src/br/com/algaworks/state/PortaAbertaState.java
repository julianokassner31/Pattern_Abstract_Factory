package br.com.algaworks.state;

public class PortaAbertaState implements EstadoDaPorta {

	InteracaoPorta interacao;
	
	public PortaAbertaState(InteracaoPorta interacao) {
		this.interacao = interacao;
	}
	
	@Override
	public void abrir() {
		System.out.println("A porta já esta aberta.");
	}

	@Override
	public void fechar() {
		System.out.println("fechando a porta");
		interacao.setEstadoDaPorta(interacao.getFechada());
	}
	
	@Override
	public String toString() {
		return "Porta aberta";
	}
}
