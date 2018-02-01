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
import br.com.algaworks.decorator.pojo.adicional.EnumAdicionais;
import br.com.algaworks.decorator.pojo.adicional.MolhoFrangoTeriyaki;
import br.com.algaworks.decorator.pojo.adicional.QueijoSuico;
/**
 * Demonstrando o funcionamento do Padrao de Projeto Decorator
 * O mesmo e usado quando se tem um objeto que pode ter caracteristicas adicionadas
 * em tempo de execução recebendo novos metodos de uma classe decoradora de mesmo tipo
 * da classe decorada
 * Utilizado outros Padrões como Strategy e Factory Method
 * @author kassner
 */
public class ClienteSubeUai {

	public static void main(String[] args) throws Exception {
		
		JOptionPane.showMessageDialog(null,"Seja bem vindo ao SubeUai");
		int idSanduiche = Integer.parseInt(JOptionPane.showInputDialog("Por favor nos diga qual o sanduíche desejado dentre as opções abaixo\n"
				+ EnumTiposDeSanduicheStrategy.mostrarOpcoesDisponiveis()));
		
		SanduicheFactory sanduicheFactory = EnumTiposDeSanduicheStrategy.getSanduicheById(idSanduiche);
		
		EnumTipoPao tipoDePao = EnumTipoPao.getTipoDePao(Integer.parseInt(JOptionPane.showInputDialog("Qual o pão desejado?\n"
				+ EnumTipoPao.mostrarOpcoesDisponiveis())));
		
		EnumTamanhoDoPao tamanhoDoPao = EnumTamanhoDoPao.getTamanhoDoPao(Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho desejado?\n"
				+ EnumTamanhoDoPao.mostrarOpcoesDisponiveis())));
		
		Sanduiche sanduiche = sanduicheFactory.criarSanduiche(tipoDePao, tamanhoDoPao);
		
		boolean adicional = false;
		
		do {
			int idAdicional = Integer.parseInt(JOptionPane.showInputDialog("Deseja mais algum Adicional?\n"
					+ EnumAdicionais.mostrarOpcoesDisponiveis()));
			if(adicional) {
				
			}
			
		}while(adicional);
		
		//Adicionais
		Item adicionalQueijoSuico = new QueijoSuico(sanduiche);
		Item adicionalMolhoFrangoTeriyaki = new MolhoFrangoTeriyaki(adicionalQueijoSuico);
		
		//Bebidas
		Item cocaCola = new CopoCocaCola();
		
		//Pedido
		Pedido pedido = new Pedido();
		pedido.getItens().add(cocaCola);
		pedido.getItens().add(cocaCola);
		pedido.getItens().add(adicionalMolhoFrangoTeriyaki);
		pedido.getItens().add(adicionalMolhoFrangoTeriyaki);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy 'ás' HH:mm");
		System.out.printf("Pedido feito em %s\n", sdf.format(new Date()));
		System.out.println("########## Lista de itens do pedido ##########");
		
		Map<Item, Long> mapDeItens = pedido.getItens().stream().collect(Collectors.groupingBy( Function.identity(), Collectors.counting()));
		
		mapDeItens.forEach( (i, l) -> System.out.printf("%d X %s = R$%.2f\n", l, i.getDescricao(), i.getPreco() * l));
		System.out.printf("Valor total: %.2f",pedido.total());

	}

}
