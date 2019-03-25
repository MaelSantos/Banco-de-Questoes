package view;

import javax.swing.JFrame;

public abstract class Tela extends JFrame {

	private static final long serialVersionUID = 1L;

	public Tela(int largura, int altura, String titulo) {
		
		super(titulo);
		
		setSize(largura, altura);
		
		setLayout(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
//		setResizable(false);
		
		setVisible(false);
		
		
	}
	
}
