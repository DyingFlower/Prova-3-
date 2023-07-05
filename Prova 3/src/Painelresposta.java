
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painelresposta extends JPanel{
	protected JLabel frase;
	protected String descricao;
	public Painelresposta(String descricao) {
		this.descricao=descricao;
		JButton passarvez = new JButton();
		passarvez.setText("Passar vez");
		setLayout(new GridLayout(1,2));
		frase = new JLabel();
		frase.setText("A Frase do jogador foi: "+descricao);
		setBackground(Color.gray);
		add(frase);
		add(passarvez);
		setVisible(true);
	}
}
