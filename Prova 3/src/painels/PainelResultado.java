package painels;

import controle.Controle;
import entidades.Jogador;
import janelas.JanelaTentativaJogador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelResultado extends JPanel {
    private Controle controle;
    private  JanelaTentativaJogador janela;
    public PainelResultado(Controle controle, JanelaTentativaJogador janela) {
        this.controle=controle;
        this.janela=janela;
        setLayout(new BorderLayout());
        JLabel card = new JLabel(controle.getCartaEscolhida().getIcon());
        JPanel jp = painelDeCima();
        jp.add(criarTitulo(),BorderLayout.NORTH);
        jp.add(card,BorderLayout.CENTER);
        JPanel mid = new JPanel(); //painel do meio
        mid.setLayout(new GridLayout(4,1));
        for (Jogador jogadore : controle.getJogadores()) {
            mid.add(new JLabel(jogadore.getNome()+": "+jogadore.getPontos()));
        }
        add(mid,BorderLayout.CENTER);
        botaoContinuar();
    }
    private void botaoContinuar(){
        JButton botao = new JButton("Continuar");
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                controle.trocarJogadorDaVez();
                janela.setVisible(false);

            }
        });
        add(botao,BorderLayout.SOUTH);
    }
    private JLabel criarTitulo(){
        JLabel titulo= new JLabel("A carta correta é:");
        titulo.setPreferredSize(new Dimension(50,50));
        titulo.setForeground(Color.WHITE);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setAlignmentY(TOP_ALIGNMENT);
        return titulo;
    }
    private JPanel painelDeCima(){
        JPanel jp= new JPanel(); //painel de cima pontuacao + carta
        jp.setLayout(new BorderLayout());
        add(jp,BorderLayout.NORTH);
        jp.setBackground(Color.DARK_GRAY);
        JLabel label = new JLabel("Pontuação:");
        label.setForeground(Color.WHITE);
        jp.add(label,BorderLayout.SOUTH);
        return jp;
    }
}
