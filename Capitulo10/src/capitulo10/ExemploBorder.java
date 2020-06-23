
package capitulo10;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
  
public class ExemploBorder {
    private JFrame frame;
    private JButton botaoNorte, botaoSul, botaoLeste, botaoOeste,botaoCentro;
    
    public ExemploBorder(){
        frame = new JFrame("BorderLayout");
        botaoNorte = new JButton("Norte");
        botaoSul = new JButton("Sul");
        botaoOeste = new JButton("Oeste");
        botaoLeste = new JButton("Leste");
        botaoCentro = new JButton("Centro");
    }
    
    public void criaFrame(){
        frame.add(botaoNorte, BorderLayout.NORTH);
        frame.add(botaoSul, BorderLayout.SOUTH);
        frame.add(botaoLeste, BorderLayout.EAST);
        frame.add(botaoOeste, BorderLayout.WEST);
        frame.add(botaoCentro, BorderLayout.CENTER);
        frame.setSize(800,600);
        frame.setVisible(true);
    }
    
}
