package capitulo10_evento_interno;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import capitulo10_classeadaptadora.ManipuladorDeClique;

public class TesteInner {
    private JFrame frame;
    private JTextField field;
    
    public TesteInner(){
        frame = new JFrame("Exemplo de inner classes");
        field = new JTextField(30);
    }
    
    //Minha classe de evento
    class MeuListenerDeMovimentoDoMouse extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e){
            String s = "Mouse arrastando X = " + e.getX()
                       + " Y = " + e.getY();
            field.setText(s);
        }
    }
    
    public void iniciaFrame(){
        JLabel label = new JLabel("Clique e arraste");
        //Adicionando componentes ao Frame 
        frame.add(label,BorderLayout.NORTH);
        frame.add(field,BorderLayout.SOUTH);
        //Adiciona ao listener interno
        frame.addMouseMotionListener( new MeuListenerDeMovimentoDoMouse());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setVisible(true);
      
    }
    
    public static void main(String[] args) {
        TesteInner test = new TesteInner();
        test.iniciaFrame();
    }
    
}
