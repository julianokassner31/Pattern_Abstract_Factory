package br.com.algaworks.factory_method.volks;

import br.com.algaworks.factory_method.Carro;
import br.com.algaworks.factory_method.FabricaDeCarro;

public class FabricaVolks implements FabricaDeCarro{

	@Override
	public Carro criarCarro() {
		return new CarroVolks();
	}

}
