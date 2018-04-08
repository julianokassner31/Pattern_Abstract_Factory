package br.com.algaworks.state;

public class InteracaoPorta implements EstadoDaPorta{

	EstadoDaPorta fechada;
	EstadoDaPorta aberta;
	EstadoDaPorta estragada;
	EstadoDaPorta estadoDaPorta;
	
	public InteracaoPorta() {
		fechada = new PortaFechadaState(this);
		aberta = new PortaAbertaState(this);
		estragada = new PortaEstragadaState(this);
		estadoDaPorta = fechada;
	}
	
	public InteracaoPorta(boolean portaEstragada) {
		
		if(portaEstragada) {
			estragada = new PortaEstragadaState(this);
			estadoDaPorta = estragada;
		
		}else {
			estadoDaPorta = new PortaFechadaState(this);
		}
	}
	
	public EstadoDaPorta getEstadoDaPorta(){
		return estadoDaPorta;
	}
	
	public void setEstadoDaPorta(EstadoDaPorta estadoDaPorta){
		this.estadoDaPorta = estadoDaPorta;
	}
	
	public EstadoDaPorta getFechada() {
		return fechada;
	}

	public EstadoDaPorta getAberta() {
		return aberta;
	}

	public EstadoDaPorta getEstragada() {
		return estragada;
	}

	@Override
	public void abrir() {
		estadoDaPorta.abrir();
		
	}

	@Override
	public void fechar() {
		estadoDaPorta.fechar();
	}
}
