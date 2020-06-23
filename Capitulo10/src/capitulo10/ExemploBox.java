
package capitulo10;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;


public class ExemploBox {
     private JFrame frame;
     private JPanel panel;
     private JButton botao1, botao2, botao3, botao4, botao5;
    
     public ExemploBox(){
        frame = new JFrame("BorderLayout");
        panel = new JPanel();
        botao1 = new JButton("Botão 1");
        botao2 = new JButton("Botão 2");
        botao3 = new JButton("Botão 3");
        botao4 = new JButton("Botão 4");
        botao5 = new JButton("Botão 5");
    }
    
    public void criaFrame(){
        
        BoxLayout box = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(box);
        panel.add(botao1);
        panel.add(botao2);
        panel.add(botao3);
        panel.add(botao4);
        panel.add(botao5);
        panel.setVisible(true);
        frame.setSize(800,600);
    }
}
