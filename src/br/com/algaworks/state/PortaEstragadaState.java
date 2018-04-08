package br.com.algaworks.state;

public class PortaEstragadaState implements EstadoDaPorta{

	InteracaoPorta interacao;
	
	public PortaEstragadaState(InteracaoPorta interacao) {
		this.interacao = interacao;
	}
	
	@Override
	public void abrir() {
		System.out.println("Não é possível abrir a porta a mesma encontra-se estragada!");
		this.interacao.setEstadoDaPorta(interacao.getEstragada());
	}

	@Override
	public void fechar() {
		System.out.println("Não é possível fechar a porta a mesma encontra-se estragada!");
		this.interacao.setEstadoDaPorta(interacao.getEstragada());
	}
	
	@Override
	public String toString() {
		return "Porta estragada";
	}

}
