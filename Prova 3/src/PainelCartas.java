package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PainelCartas extends JPanel {
	protected Carta carta;
	protected Janela janela;

	public PainelCartas(Janela janela) {
		this.janela = janela;
		for (int i = 0; i < 6; i++) {
			carta = new Carta(
					"/img/wp9170585-ordem-paranormal-wallpapers.jpg");
			carta.id = i;
			carta.addActionListener(selectcard);
			add(carta);
		}
		setLayout(new GridLayout(2, 3));
		setBackground(Color.pink);
		setVisible(true);
	}

	ActionListener selectcard = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			janela.painel1.carta.selecionada = true;
			JOptionPane.showMessageDialog(null, "você escolheu a carta " + janela.painel1.carta.id, "Carta escolhida",
					JOptionPane.WARNING_MESSAGE);
		}

	};
}