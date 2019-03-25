package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Calculos;
import model.Xml;
import view.TelaOperacao;

public class Controle implements ActionListener {

	private Calculos calculadora;

	private TelaOperacao telaOperacao;

	public Controle(TelaOperacao telaOperacao) {
		this.telaOperacao = telaOperacao;
		calculadora = new Calculos();
		control();
	}

	private void control() {

		telaOperacao.getBtn0().addActionListener(this);
		telaOperacao.getBtn1().addActionListener(this);
		telaOperacao.getBtn2().addActionListener(this);
		telaOperacao.getBtn3().addActionListener(this);
		telaOperacao.getBtn4().addActionListener(this);
		telaOperacao.getBtn5().addActionListener(this);
		telaOperacao.getBtn6().addActionListener(this);
		telaOperacao.getBtn7().addActionListener(this);
		telaOperacao.getBtn8().addActionListener(this);
		telaOperacao.getBtn9().addActionListener(this);

		telaOperacao.getBtnIgual().addActionListener(this);
		telaOperacao.getBtnMenos().addActionListener(this);
		telaOperacao.getBtnMais().addActionListener(this);
		telaOperacao.getBtnMultiplicar().addActionListener(this);
		telaOperacao.getBtnDividir().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();

		if (obj instanceof JButton) {
			JButton button = (JButton) obj;
			
			String op = button.getText();
			String texto = telaOperacao.getTfdTexto().getText();

			if(op.equals("="))
			{
				Xml.salvar(texto + " = "+ calculadora.calculadora(telaOperacao.getTfdTexto().getText()));
				telaOperacao.getTfdTexto().setText(calculadora.calculadora(telaOperacao.getTfdTexto().getText()));
			}
			else if(texto.trim().isEmpty())
			{
				if(op.matches("[0-9]*"))
					telaOperacao.getTfdTexto().setText(texto + op);						
			}
			else if(!texto.trim().isEmpty())
			{
				if(op.matches("[0-9]*"))
					telaOperacao.getTfdTexto().setText(texto + op);
				else if(texto.substring(texto.length()-1, texto.length()).matches("[0-9]*"))
					telaOperacao.getTfdTexto().setText(texto + op);
				else
					telaOperacao.getTfdTexto().setText(texto.substring(0, texto.length()-1) + op);
			}
		}

	}

}
