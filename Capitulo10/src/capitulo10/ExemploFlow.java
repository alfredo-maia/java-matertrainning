
package capitulo10;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class ExemploFlow {
    private JFrame frame;
    private JButton botao1, botao2, botao3, botao4, botao5;
    
    public ExemploFlow(){
        frame = new JFrame("FlowLayout");
        botao1 = new JButton("Botão 1");
        botao2 = new JButton("Botão 2");
        botao3 = new JButton("Botão 3");
        botao4 = new JButton("Botão 4");
        botao5 = new JButton("Botão 5");
    }
    
    public void criaFrame(){
        frame.setLayout(new FlowLayout());
        frame.add(botao1);
        frame.add(botao2);
        frame.add(botao3);
        frame.add(botao4);
        frame.add(botao5);
        frame.pack();
        frame.setVisible(true);
    }
}
