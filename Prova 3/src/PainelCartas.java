import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class PainelCartas extends JPanel{
	protected Carta carta;
	public PainelCartas() {
		for(int i=0;i<6;i++) {
			carta = new Carta();
			add(carta);
		}
		setLayout(new GridLayout(2,3));
		setBackground(Color.gray);
		setVisible(true);
	}
}
