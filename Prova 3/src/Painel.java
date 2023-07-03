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
	public Painel() {
		JButton botao = new JButton();
		botao.setText("Avançar");
		JLabel frase = new JLabel();
		frase.setText("Descreva a Carta marcada");
		JTextField texto = new JTextField();
		JButton botaoPassarVez = new JButton("Passar a Vez");
		botaoPassarVez.addActionListener(new PassarVez());
		setLayout(new GridLayout(1, 4));
		add(frase);
		add(texto);
		add(botao);
		add(botaoPassarVez);
		setBackground(Color.pink);
		setVisible(true);
	}
}

class PassarVez implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		//fazer o action para que o outro jogadador possa jogar, escondendo as cartas do jogador anterior e mostrando as sdele
	}
	
}
