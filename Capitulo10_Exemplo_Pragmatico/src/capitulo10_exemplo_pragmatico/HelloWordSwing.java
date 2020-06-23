package capitulo10_exemplo_pragmatico;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWordSwing {
    public static void criaMostraGUI(){
        JFrame frame = new JFrame("HelloWordSwing");
        //ajusta ação da janela quando for fechada
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World");
        //adiciona label ao frame
        frame.add(label);
        //redimenciona tamanho da janela
        frame.setSize(300, 200);
        //Exibe a janela
        frame.setVisible(true);

    }
}
