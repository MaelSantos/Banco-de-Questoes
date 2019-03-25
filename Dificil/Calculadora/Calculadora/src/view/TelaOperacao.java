package view;

import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaOperacao extends Tela {

	private static final long serialVersionUID = 1L;

	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
	private JButton btnIgual, btnMais, btnMenos, btnMultiplicar, btnDividir;
	private JTextField tfdTexto;
	
	private JPanel pnlTeclas, pnlOperacao, pnl;
	
	public TelaOperacao(int largura, int altura) {
		super(largura, altura, "Calculadora");
	
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4"); 
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7"); 
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btn0 = new JButton("0");
		
		btnIgual = new JButton("=");
		btnMais = new JButton("+");
		btnMenos = new JButton("-");
		btnMultiplicar = new JButton("*");
		btnDividir = new JButton("/");
		
		tfdTexto = new JTextField(10);
	
		pnlTeclas = new JPanel();
		pnlTeclas.setLayout(new GridLayout(3, 3));
		
		pnlTeclas.add(btn7);
		pnlTeclas.add(btn8);
		pnlTeclas.add(btn9);
		pnlTeclas.add(btn4);
		pnlTeclas.add(btn5);
		pnlTeclas.add(btn6);
		pnlTeclas.add(btn1);
		pnlTeclas.add(btn2);
		pnlTeclas.add(btn3);
		
		
		pnlOperacao = new JPanel();
		pnlOperacao.setLayout(new GridLayout(4, 1));
		
		pnlOperacao.add(btnMais);
		pnlOperacao.add(btnMenos);
		pnlOperacao.add(btnMultiplicar);
		pnlOperacao.add(btnDividir);
		
		pnl = new JPanel();
		pnl.setLayout(new GridLayout(2, 4));
		
		pnl.add(btn0);
		pnl.add(btnIgual);
		pnl.add(new Label(""));
		pnl.add(new Label(""));
		
		add(tfdTexto).setBounds(0, 0, getWidth(), 30);
		add(pnlTeclas).setBounds(0, tfdTexto.getHeight(), 350, 400);
		add(pnlOperacao).setBounds(pnlTeclas.getWidth(), tfdTexto.getHeight(), 150, 400);
		add(pnl).setBounds(0, 430, getWidth(), 200);
		
	}

	public JButton getBtn1() {
		return btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public JButton getBtn5() {
		return btn5;
	}

	public JButton getBtn6() {
		return btn6;
	}

	public JButton getBtn7() {
		return btn7;
	}

	public JButton getBtn8() {
		return btn8;
	}

	public JButton getBtn9() {
		return btn9;
	}

	public JButton getBtn0() {
		return btn0;
	}

	public JButton getBtnIgual() {
		return btnIgual;
	}

	public JButton getBtnMais() {
		return btnMais;
	}

	public JButton getBtnMenos() {
		return btnMenos;
	}

	public JButton getBtnMultiplicar() {
		return btnMultiplicar;
	}

	public JButton getBtnDividir() {
		return btnDividir;
	}

	public JTextField getTfdTexto() {
		return tfdTexto;
	}

}
