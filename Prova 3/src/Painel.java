package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Painel extends JPanel {
	protected Janela janela; // necessario para interagir com a janela.
	protected String descricaoCarta;

	public Painel(Janela janela) {
		this.janela = janela;
		JLabel frase = new JLabel();
		frase.setText("Descreva a Carta marcada");
		JTextField texto = new JTextField();
		descricaoCarta = texto.getText();
		JButton botaoPassarVez = new JButton("Passar a Vez");
		botaoPassarVez.addActionListener(new PassarVez());
		setLayout(new GridLayout(1, 3));
		add(frase);
		add(texto);
		add(botaoPassarVez);
		setBackground(Color.pink);
		setVisible(true);
	}
	
	public String getDescricaoCarta() {
		return descricaoCarta;
	}
}

class PassarVez implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		Janela j = new Janela();
		Painel painel = new Painel(j);
		JanelaR janelaSecundaria = new JanelaR(painel);
		janelaSecundaria.setVisible(true);
		j.setVisible(false);
		// fazer o action para que o outro jogadador possa jogar, escondendo as cartas
		// do jogador anterior e mostrando as sdele
	}

}
