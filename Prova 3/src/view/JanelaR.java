package view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaR extends JFrame { // acho que é bom mudar esse nome, colocar algo mais descritivo tipo JanelaJogador2 ou coisa do tipo
	
	public JanelaR(Painel painel) {
		setTitle("Jogo de Cartas");
		JLabel descricao = new JLabel(painel.getDescricaoCarta());
		JPanel painelJanelaR = new JPanel();
		painelJanelaR.add(descricao);
		painelJanelaR.setVisible(true); // tentei colocar a descricao fornecida na janela nova mas n ta indo nada
		add(painelJanelaR);		
		setLayout(new BorderLayout());
		setBackground(Color.black); // nem a cor ta indo
		setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(false);
	}
}
