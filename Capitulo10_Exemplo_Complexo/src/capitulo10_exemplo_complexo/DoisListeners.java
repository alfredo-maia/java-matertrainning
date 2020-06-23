package capitulo10_exemplo_complexo;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DoisListeners implements MouseMotionListener, MouseListener {
    
    private JFrame frame;
    private JTextField field;
    
    //Método Construtor
    public DoisListeners(){
        frame = new JFrame("Exemplo dois Listeners");
        field = new JTextField(30);
    }
    
    //Método de Inicialização
    public void iniciaFrame(){
        JLabel label = new JLabel("Clique e arraste!");
        //Adicionando Componente ao Frame
        frame.add(label, BorderLayout.NORTH);
        frame.add(field,BorderLayout.SOUTH);
        //Adicionar este objeto como consulta
        frame.addMouseMotionListener(this);
        frame.addMouseListener(this);
        //Dimensionar o frame e torna-ló visivel
        frame.setSize(800,400);
        frame.setVisible(true);
    }
    
    //Aqui começam os métodos dos eventos do MouseMotionListener
   
    @Override
    public void mouseDragged(MouseEvent me) {
        String s = "Mouse arrastando X = " + me.getX() +
                  "Y = " + me.getY();
       
        field.setText(s);
    }
    
    @Override
    public void mouseEntered(MouseEvent me) {
        String s = "O mouse entrou na janela";
        field.setText(s);
    }
    
    @Override
    public void mouseExited(MouseEvent me) {
        String s = "O mouse saiu da janela";
        field.setText(s);
    }
    
    //Eventos abaixo não serão utilizados
    @Override
    public void mouseMoved(MouseEvent me) {}

    @Override
    public void mouseClicked(MouseEvent me) {}

    @Override
    public void mousePressed(MouseEvent me) {}

    @Override
    public void mouseReleased(MouseEvent me) {}

     //Método Principal
    public static void main(String[] args) {
        DoisListeners doisListeners = new DoisListeners();
        doisListeners.iniciaFrame();
    }

}
