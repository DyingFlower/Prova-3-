
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaJogador2 extends JFrame { 
	protected Painelresposta painelJanelaR;
	protected PainelCartas painelcartas;
	public JanelaJogador2(String descricaocarta) {
		setTitle("Jogo de Cartas");
		painelJanelaR = new Painelresposta(descricaocarta);
		painelcartas= new PainelCartas();
		setLayout(new BorderLayout());
		add(painelJanelaR,BorderLayout.NORTH);	
		add(painelcartas,BorderLayout.CENTER);
		setBackground(Color.black);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 800);
		setVisible(true);
	}
}