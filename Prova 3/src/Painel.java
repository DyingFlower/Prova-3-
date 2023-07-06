

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Painel extends JPanel {
	protected Janela janela; // necessario para interagir com a janela.
	protected JTextField texto;
	protected PainelCartas painelcartas;
	public Painel(Janela janela,PainelCartas painelcartas ) {
		this.janela = janela;
	    this.painelcartas =  painelcartas;
		JLabel frase = new JLabel();
		frase.setText("Descreva a Carta marcada");
		texto = new JTextField();
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
			JanelaJogador2 janelaSecundaria = new JanelaJogador2(texto.getText(), janela);
			janelaSecundaria.setVisible(true);
			for(int i =0;i<painelcartas.cartas.size();i++) {
				if(painelcartas.cartas.get(i).selecionada) {
					janela.jogador.cartasmarcadas.add(painelcartas.cartas.get(i)); // salvar cartas marcadas para por no painel final
				}
			}
			janela.dispose(); // fechar janela aberta e abrir uma nova
		}
	};

}