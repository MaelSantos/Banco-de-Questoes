package view;

import javax.swing.JOptionPane;

public class Mensagem {

	public static void exibirMensagem(String mensagem)
	{
		JOptionPane.showMessageDialog(null, mensagem, "Erro!!!", JOptionPane.ERROR_MESSAGE);
	}
	
}
