package app;

import controle.Controle;
import view.TelaOperacao;

public class App {

	public static void main(String[] args) {
		
		TelaOperacao operacao = new TelaOperacao(500, 570);
		new Controle(operacao);
		
		operacao.setVisible(true);

	}

}
