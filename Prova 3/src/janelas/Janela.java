package janelas;

import controle.Controle;

import javax.swing.*;

public class Janela extends JFrame {
	public Janela(Controle control) {
		setTitle("Inicio");
		add(new JanelaJogadores(this,control));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 800);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}