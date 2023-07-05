package view;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame {
	protected PainelCartas painel1 = new PainelCartas(this);
	protected Painel painel2 = new Painel(this);
	protected List<Jogador> jogadores;
	private JLabel jogadorLabel;
	protected int jogadorDaVez = 0;

	public Janela() {
		setTitle("Jogo de Cartas");
		setLayout(new BorderLayout());
		jogadores = new ArrayList<>();
		configurarJogadores(); // Configura os jogadores antes de acessar a lista
		jogadorLabel = new JLabel("Jogador da Vez: " + jogadores.get(jogadorDaVez).getNome());
		add(jogadorLabel, BorderLayout.NORTH);
		add(painel1, BorderLayout.CENTER);
		add(painel2, BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(520, 570);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void configurarJogadores() {
		jogadores.add(new Jogador("Jogador 1"));
		jogadores.add(new Jogador("Jogador 2"));
		jogadores.add(new Jogador("Jogador 3"));
		jogadores.add(new Jogador("Jogador 4"));
	}

	public void atualizarJogadorDaVez() {
		jogadorDaVez++;
		if (jogadorDaVez >= jogadores.size()) {
			jogadorDaVez = 0; // Volta para o primeiro jogador
		}
		jogadorLabel.setText("Jogador da Vez: " + jogadores.get(jogadorDaVez).getNome());
	}

}
