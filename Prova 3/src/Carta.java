
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Carta extends JButton{
		
		protected int id;
		protected String foto;
		protected Boolean selecionada=false;
		protected ArrayList<String> listaDeImagens;
		
		public Carta(String foto) {
			this.foto=foto;
			listaDeImagens = new ArrayList<>();
			ImageIcon imagem = new ImageIcon(foto);
			ImageIcon imagemRedimensionada = new ImageIcon(
			            imagem.getImage().getScaledInstance(1000, 1000, java.awt.Image.SCALE_SMOOTH)
			        );
			setIcon(imagemRedimensionada);
			setSize(700,500);
			listaDeImagens.add(foto);
			setVisible(true);
		}
	}
