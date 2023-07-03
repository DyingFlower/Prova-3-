import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Carta extends JButton{
	protected int id;
	protected String foto;
	protected Boolean selecionada=false;
	public Carta(String foto) {
		this.foto=foto;
		ImageIcon imagem = new ImageIcon(foto);
		ImageIcon imagemRedimensionada = new ImageIcon(
		            imagem.getImage().getScaledInstance(1000, 1000, java.awt.Image.SCALE_SMOOTH)
		        );
		setIcon(imagemRedimensionada);
		setSize(700,500);
		setVisible(true);
	}
}