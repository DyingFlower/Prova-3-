import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Carta extends JButton{
	protected String foto;
	public Carta() {
		foto ="C:\\Users\\arthu\\Downloads/naldo_benny_ce61ca2b6c9b173593297ce4f587a2b969f6eaf1_4399a8644bba9e19a78325904e43bbb70ef4d98e.jpeg";
		ImageIcon imagem = new ImageIcon(foto);
		ImageIcon imagemRedimensionada = new ImageIcon(
		            imagem.getImage().getScaledInstance(1000, 1000, java.awt.Image.SCALE_SMOOTH)
		        );
		setIcon(imagemRedimensionada);
		setSize(700,500);
		setVisible(true);
	}
}
