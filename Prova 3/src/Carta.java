

import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Carta extends JButton {

	protected int id;
	protected String foto;
	protected Boolean selecionada = false;
	protected ArrayList<String> listaDeImagens;
	protected Boolean jaUsada;

	public Carta(String imagem) {
		foto=imagem;
		ImageIcon icon = createImageIcon(imagem);
		if (icon != null) {
			Image image = icon.getImage().getScaledInstance(400, 450, Image.SCALE_SMOOTH);
			setIcon(new ImageIcon(image));
		}
		setPreferredSize(new Dimension(1000, 800));
	}

	protected ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = getClass().getResource(path);
		return new ImageIcon(imgURL);

	}
}