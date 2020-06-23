
package capitulo10_exemplo_evento;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Classe de Manipulação do Evento
class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Ação ocorrida");
            System.out.println("O comando do Botao : " + ae.getActionCommand());
        }
        
}

 //Classe de Manipulação da GUI
public class TestaBotao {
    
    JButton bnt;
    JFrame frame;
        
    public TestaBotao(){
        frame = new JFrame("Teste");
        bnt = new JButton("Clique aqui");
        bnt.setActionCommand("BotaoPressionado");
    }
        
    public void iniciaFrame(){
        //Adicionando Listener
        bnt.addActionListener(new ButtonHandler());
        frame.add(bnt, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(300,200);
        }
   
    
    //Método Principal
    public static void main(String[] args) {
         TestaBotao tst = new TestaBotao();
         tst.iniciaFrame();
        
    }
    
}
