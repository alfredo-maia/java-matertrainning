
package capitulo10_exemplo_evento;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Capitulo10_Exemplo_Evento {
    //Classe de Manipulação do Evento
    public class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Ação ocorrida");
            System.out.println("O comando do Botao : " + ae.getActionCommand());
        }
        
    }
    //Classe de Manipulação da GUI
    public class TestaBotao{
        JButton bnt;
        JFrame frame;
        
        public TestaBotao(JButton bnt, JFrame quadro){
            quadro = new JFrame("Teste");
            bnt = new JButton("Clique aqui");
            bnt.setActionCommand("BotaoPressionado");
        }
        
        public void iniciaFrame(JButton bnt, JFrame quadro){
            bnt.addActionListener(new ButtonHandler());
            quadro.add(bnt, BorderLayout.CENTER);
            quadro.pack();
            quadro.setVisible(true);
        }
    }
    
    //Método Principal
    public static void main(String[] args) {
        JButton bnt;
        JFrame frame;
        // TestaBotao tst = new TestaBotao(bnt,frame);
        // bnt.iniciaFrame();
        
    }
    
}
