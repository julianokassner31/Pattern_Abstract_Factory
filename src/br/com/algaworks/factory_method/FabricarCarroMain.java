package br.com.algaworks.factory_method;

import br.com.algaworks.factory_method.fiat.FabricaFiat;
import br.com.algaworks.factory_method.volks.FabricaVolks;

/**
 * 
 * @author kassner
 * Padrao Factory Method
 * Padrao de cria��o de objetos, cria-se um interface
 * com um m�todo construtor que passa a responsabilidade
 * da cria��o para as subclasses que h� implement�o
 */
public class FabricarCarroMain {

	public static void main(String[] args) {
		
		FabricaDeCarro fabrica = new FabricaFiat();
		Carro fiat = fabrica.criarCarro();
		fiat.exibirInfoCarro();
		
		fabrica = new FabricaVolks();
		Carro gol = fabrica.criarCarro();
		gol.exibirInfoCarro();
	}

}
