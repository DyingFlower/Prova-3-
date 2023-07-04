import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class PainelCartas extends JPanel{
	protected ArrayList<Carta> cartas=new ArrayList<Carta>();
	protected Janela janela;
	public PainelCartas(Janela janela) {
		this.janela=janela;
		for(int i=0;i<6;i++) {	
			Carta carta = new Carta("C:\\Users\\arthu\\Downloads/naldo_benny_ce61ca2b6c9b173593297ce4f587a2b969f6eaf1_4399a8644bba9e19a78325904e43bbb70ef4d98e.jpeg");
			carta.id=i+1;
			carta.addActionListener(selectcard);
			add(carta);
			cartas.add(carta);
		}
		setLayout(new GridLayout(2,3));
		setBackground(Color.gray);
		setVisible(true);
	}
	ActionListener selectcard = new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			Carta clickedCard = (Carta) e.getSource();
			clickedCard.selecionada=true;
			JOptionPane.showMessageDialog(null, "você escolheu a carta " + clickedCard.id, "Carta escolhida",JOptionPane.WARNING_MESSAGE);
			for(int i=0;i<cartas.size();i++) { // limpar caso a pessoa mude a escolha da carta.
				if(cartas.get(i).id!=clickedCard.id) {
					cartas.get(i).selecionada=false;
				}
			}
			
			
		}
		
		
	};
}
