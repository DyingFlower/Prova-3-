import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Painel extends JPanel{
	public Painel(Janela janela) {
		JButton botao = new JButton();
		botao.setText("Avançar");
		JLabel frase = new JLabel();
		frase.setText("Descreva a Carta marcada");
		JTextField texto = new JTextField();
		setLayout(new GridLayout(1,3));
		add(frase);
		add(texto);
		add(botao);
		setBackground(Color.lightGray);
		setVisible(true);
	}
}
