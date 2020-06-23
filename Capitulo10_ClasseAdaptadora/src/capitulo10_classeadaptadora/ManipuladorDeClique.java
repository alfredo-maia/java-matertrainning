
package capitulo10_classeadaptadora;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
 
//Queremos apenas o manipulador mouseClick
//por isso usamos um adaptador para evitar a necessidade
//de escrever todos os metodos de manipulação de eventos

public class ManipuladorDeClique extends MouseAdapter {
    private JFrame frame;
    private JTextField field;
    
    public ManipuladorDeClique(){
        frame = new JFrame("Exemplo dois Listeners");
        field = new JTextField(30);
    }
    
     //Método de Inicialização
    public void iniciaFrame(){
        JLabel label = new JLabel("Clique e arraste!");
        //Adicionando Componente ao Frame
        frame.add(label, BorderLayout.NORTH);
        frame.add(field,BorderLayout.SOUTH);
        //Dimensionar o frame e torna-ló visivel
        frame.setSize(800,400);
        frame.setVisible(true);
        //Adicionando Evento
        frame.addMouseListener(this);
        //ajusta ação da janela quando for fechada
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void mouseClicked(MouseEvent e){
        String s = "Estou clicando";
        field.setText(s);
    }
    
    public static void main(String[] args) {
        ManipuladorDeClique m = new ManipuladorDeClique();
        m.iniciaFrame();
    }
    
}
