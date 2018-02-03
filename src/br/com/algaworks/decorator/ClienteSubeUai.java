package br.com.algaworks.decorator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import br.com.algaworks.decorator.factory.SanduicheFactory;
import br.com.algaworks.decorator.pojo.CopoCocaCola;
import br.com.algaworks.decorator.pojo.Item;
import br.com.algaworks.decorator.pojo.Pedido;
import br.com.algaworks.decorator.pojo.Sanduiche;
import br.com.algaworks.decorator.pojo.adicional.AdicionalDecorator;
import br.com.algaworks.decorator.pojo.adicional.AdicionalFactory;
import br.com.algaworks.decorator.pojo.adicional.EnumAdicionais;
/**
 * Demonstrando o funcionamento do Padrao de Projeto Decorator
 * O mesmo e usado quando se tem um objeto que pode ter caracteristicas adicionadas
 * em tempo de execu��o recebendo novos metodos de uma classe decoradora de mesmo tipo
 * da classe decorada
 * Utilizado outros Padr�es como Strategy e Factory Method
 * @author kassner
 */
public class ClienteSubeUai {

	public static void main(String[] args) throws Exception {
		
		JOptionPane.showMessageDialog(null,"Seja bem vindo ao SubeUai");
		int idSanduiche = Integer.parseInt(JOptionPane.showInputDialog("Por favor nos diga qual o sandu�che desejado dentre as op��es abaixo\n"
				+ EnumTiposDeSanduicheStrategy.mostrarOpcoesDisponiveis()));
		
		SanduicheFactory sanduicheFactory = EnumTiposDeSanduicheStrategy.getSanduicheById(idSanduiche);
		
		EnumTipoPao tipoDePao = EnumTipoPao.getTipoDePao(Integer.parseInt(JOptionPane.showInputDialog("Qual o p�o desejado?\n"
				+ EnumTipoPao.mostrarOpcoesDisponiveis())));
		
		EnumTamanhoDoPao tamanhoDoPao = EnumTamanhoDoPao.getTamanhoDoPao(Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho desejado?\n"
				+ EnumTamanhoDoPao.mostrarOpcoesDisponiveis())));
		
		Sanduiche sanduiche = sanduicheFactory.criarSanduiche(tipoDePao, tamanhoDoPao);
		
		int idAdicional = 0;
		AdicionalFactory adicionalFactory = null;
		AdicionalDecorator adicionalDecorator = null;
		
		do {
			idAdicional = Integer.parseInt(JOptionPane.showInputDialog("Mais algum Adicional?\nQual?\n"
					+ EnumAdicionais.mostrarOpcoesDisponiveis()));
			
			if(idAdicional > 0 ) {
				
				if(adicionalDecorator == null) {
					adicionalFactory = EnumAdicionais.getAdicionalFactory(idAdicional);
					adicionalDecorator = adicionalFactory.criarAdicional(sanduiche);
				
				}else {
					adicionalFactory = EnumAdicionais.getAdicionalFactory(idAdicional);
					AdicionalDecorator ad = adicionalFactory.criarAdicional(adicionalDecorator);
					adicionalDecorator = null;
					adicionalDecorator = (AdicionalDecorator) ad.clone();
				}
			}
				
		}while(idAdicional > 0 );
		
		//Bebidas
		Item cocaCola = new CopoCocaCola();
		
		//Pedido
		Pedido pedido = new Pedido();
		pedido.getItens().add(cocaCola);
		
		if(adicionalDecorator == null) {
			pedido.getItens().add(sanduiche);
		
		}else {
			pedido.getItens().add(adicionalDecorator);
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy '�s' HH:mm");
		System.out.printf("Pedido feito em %s\n", sdf.format(new Date()));
		System.out.println("########## Lista de itens do pedido ##########");
		
		Map<Item, Long> mapDeItens = pedido.getItens().stream().collect(Collectors.groupingBy( Function.identity(), Collectors.counting()));
		
		mapDeItens.forEach( (i, l) -> System.out.printf("%d X %s = R$%.2f\n", l, i.getDescricao(), i.getPreco() * l));
		System.out.printf("Valor total: %.2f",pedido.total());

	}

}
