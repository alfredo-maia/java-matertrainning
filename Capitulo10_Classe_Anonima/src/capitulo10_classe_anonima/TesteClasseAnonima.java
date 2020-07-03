package capitulo10_classe_anonima;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import capitulo10_classeadaptadora.ManipuladorDeClique;

public class TesteClasseAnonima {
    private JFrame frame;
    private JTextField field;
    
    //Construtor
    public TesteClasseAnonima(){
        frame = new JFrame("Exemplo de classe anonima");
        field = new JTextField(30);
    }
    
    //Metodos
    public void iniciaFrame(){
        JLabel label = new JLabel("Clique e arraste");
        //Adicionando componentes ao frame
        frame.add(label, BorderLayout.NORTH);
        frame.add(field, BorderLayout.SOUTH);
        //Adiciona esta a classe interna
        frame.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent e){
                String s = "Mouse arrastando X = " + e.getX() +
                           " Y = " + e.getY();
                field.setText(s);
            }
        });
        frame.addMouseListener(new ManipuladorDeClique());
        //Dimensionar o frame e torna-lo visivel
        frame.setSize(800,600);
        frame.setVisible(true);
        }
   
    
    public static void main(String[] args) {
        TesteClasseAnonima teste = new TesteClasseAnonima();
        teste.iniciaFrame();
    }
}