package br.com.algaworks.state;

public class ClientePorta {

	public static void main(String[] args) {
		InteracaoPorta interacao = new InteracaoPorta();
		interacao.getEstadoDaPorta();
		
		interacao.abrir();
		System.out.println("Status da porta:" + interacao.getEstadoDaPorta().toString()+"\n\n");
		
		interacao.abrir();
		System.out.println("Status da porta:" + interacao.getEstadoDaPorta().toString()+"\n\n");
		
		interacao.fechar();
		System.out.println("Status da porta:" + interacao.getEstadoDaPorta().toString()+"\n\n");
		
		interacao.fechar();
		System.out.println("Status da porta:" + interacao.getEstadoDaPorta().toString()+"\n\n");
		
		InteracaoPorta interacao2 = new InteracaoPorta(true);
		System.out.println("Status da porta:" + interacao2.getEstadoDaPorta().toString()+"\n\n");
		
		interacao2.abrir();
		System.out.println("Status da porta:" + interacao2.getEstadoDaPorta().toString()+"\n\n");
		
		interacao2.fechar();
		System.out.println("Status da porta:" + interacao2.getEstadoDaPorta().toString()+"\n\n");
	}

}
