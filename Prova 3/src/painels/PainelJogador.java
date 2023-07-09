package painels;

import controle.Controle;
import entidades.Jogador;
import janelas.JanelaTentativaJogador;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class PainelJogador extends JPanel {
	protected Painelresposta painelJanelaR;
	protected PainelCartas painelcartas;
	public PainelJogador(String descricaocarta, JanelaTentativaJogador janela, Controle controle) {
		painelcartas= new PainelCartas(controle);
		painelJanelaR = new Painelresposta(descricaocarta, janela,controle);
		setLayout(new BorderLayout());
		add(painelJanelaR,BorderLayout.NORTH);	
		add(painelcartas,BorderLayout.CENTER);
		setVisible(true);
	}
}