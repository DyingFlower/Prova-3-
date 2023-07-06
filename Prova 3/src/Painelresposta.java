
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painelresposta extends JPanel{
	protected JFrame janela2;
	protected JLabel frase;
	protected String descricao;
	public Painelresposta(String descricao,JFrame janela2 ) {
		this.janela2 = janela2;
		this.descricao=descricao;
		JButton passarvez = new JButton();
		passarvez.setText("Passar vez");
		passarvez.addActionListener(PassarVez);
		setLayout(new GridLayout(1,2));
		frase = new JLabel();
		frase.setText("A Frase do jogador foi: "+descricao);
		setBackground(Color.gray);
		add(frase);
		add(passarvez);
		setVisible(true);
	}
	ActionListener PassarVez = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			JanelaJogador2 janelaSecundaria = new JanelaJogador2(descricao, janela2);
			janelaSecundaria.setVisible(true);
			janela2.dispose(); // fechar janela aberta e abrir uma nova
		}
	};
}
