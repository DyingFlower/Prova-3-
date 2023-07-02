import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Painel extends JPanel{
	public Painel() {
		JLabel frase = new JLabel();
		frase.setText("Descreva a Carta marcada");
		JTextField texto = new JTextField();
		setLayout(new GridLayout(1,2));
		add(frase);
		add(texto);
		setBackground(Color.lightGray);
		setVisible(true);
	}
}
