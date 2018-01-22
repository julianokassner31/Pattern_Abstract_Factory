package br.com.algaworks.factory_method.fiat;

import br.com.algaworks.factory_method.Carro;
import br.com.algaworks.factory_method.FabricaDeCarro;

public class FabricaFiat implements FabricaDeCarro{

	@Override
	public Carro criarCarro() {
		return new CarroFiat();
	}

}
