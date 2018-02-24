package br.com.algaworks.command;

public class CurtainCommand implements Command{

	private Curtain curtain;
	
	public CurtainCommand(Curtain curtain) {
		this.curtain = curtain;
	}
	
	@Override
	public void execute() {
		curtain.abrirFechar();
		
	}

}
