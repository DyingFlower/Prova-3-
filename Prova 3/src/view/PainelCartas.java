package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PainelCartas extends JPanel {

	protected ArrayList<Carta> cartas = new ArrayList<>();
	protected Janela janela;
	protected int jogadorDaVez;

	public PainelCartas(Janela janela) {
		this.janela = janela;
		String[] arquivos = { "/imagens/apito.jpg", "/imagens/banaja.jpg", "/imagens/banato.jpg", "/imagens/banema.jpg",
				"/imagens/barulho.jpg", "/imagens/baskete.jpg", "/imagens/coelhujo.jpg", "/imagens/drake.jpg",
				"/imagens/escova.jpg", "/imagens/frango.jpg", "/imagens/franto.jpg", "/imagens/frog.jpg",
				"/imagens/galeixe.jpg", "/imagens/gorijela.jpg", "/imagens/kiwi.jpg", "/imagens/minion.jpg",
				"/imagens/musica.jpg", "/imagens/petovo.jpg", "/imagens/pinguim.jpg", "/imagens/polvo.jpg",
				"/imagens/raposa.jpg", "/imagens/scooby.jpg", "/imagens/senhor.jpg", "/imagens/som.jpg", };

		gerarCartasAleatorias(arquivos);

		setLayout(new GridLayout(2, 3));
		setBackground(Color.gray);
		setVisible(true);
	}

	private void gerarCartasAleatorias(String[] arquivos) {
		List<String> listaArquivos = new ArrayList<>(Arrays.asList(arquivos));
		Collections.shuffle(listaArquivos);

		for (int i = 0; i < 6; i++) {
			String nomeArquivo = listaArquivos.get(i);
			Carta carta = new Carta(nomeArquivo);
			carta.id = i + 1;
			carta.addActionListener(selectcard);
			add(carta);
			cartas.add(carta);

			listaArquivos.remove(nomeArquivo);
		}
	}

	ActionListener selectcard = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Carta clickedCard = (Carta) e.getSource();
			clickedCard.selecionada = true;
			JOptionPane.showMessageDialog(null, "Você escolheu a carta " + clickedCard.id, "Carta escolhida",
					JOptionPane.WARNING_MESSAGE);
			for (int i = 0; i < cartas.size(); i++) {
				if (cartas.get(i).id != clickedCard.id) {
					cartas.get(i).selecionada = false;
				}
			}
		}
	};
}
