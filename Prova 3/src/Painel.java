

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
		JButton botaoPassarVez = new JButton("Passar a Vez"); // seria interessante criar uma classe pra esse botão, ja que vai criar varias janelas varias vezes.
		botaoPassarVez.addActionListener(PassarVez);
		setLayout(new GridLayout(1, 3));
		add(frase);
		add(texto);
		add(botaoPassarVez);
		setBackground(Color.pink);
		setVisible(true);
	}

	ActionListener PassarVez = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			JanelaJogador2 janelaSecundaria = new JanelaJogador2(descricaoCarta);
			janelaSecundaria.setVisible(true);
			janela.dispose(); // fechar janela aberta e abrir uma nova
		}
	};

}