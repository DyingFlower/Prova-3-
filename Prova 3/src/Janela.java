package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Janela extends JFrame {
	protected PainelCartas painel1 = new PainelCartas(this);
	protected Painel painel2 = new Painel(this);

	public Janela() {
		setTitle("Jogo de Cartas");
		setLayout(new BorderLayout());
		add(painel1, BorderLayout.CENTER);
		add(painel2, BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
