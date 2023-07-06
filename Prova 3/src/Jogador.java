import java.util.ArrayList;

public class Jogador {
	private String nome;
	protected int contador; // saber quando os 4 jogadores ja jogaram
	protected ArrayList<Carta> cartasmarcadas;
	public Jogador() {
		cartasmarcadas= new ArrayList<Carta>();
	}
	public Jogador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}