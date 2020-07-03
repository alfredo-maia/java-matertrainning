
package execapitulo10_calculadora;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 * @author Alfredo
 */
public class Calculadora implements ActionListener{
        JFrame framePai;
        JPanel frameFilhoNorte;
        JPanel frameFilhoSul;
        JTextPane visor = new JTextPane();
        JButton botao1;
        JButton botao2;
        JButton botao3;
        JButton botao4;
        JButton botao5;
        JButton botao6;
        JButton botao7;
        JButton botao8;
        JButton botao9;
        JButton botao0;
        JButton botaoMais;
        JButton botaoMenos;
        JButton botaoDivido;
        JButton botaoMultiplicando;
        JButton botaoResultado;
        ArrayList<Integer> memoria = new ArrayList();


    /**
     * @param args conjunto de argumentos
     */
        
    //Método Construtor 
    public Calculadora(){
        
        framePai           = new JFrame("Calculadora");
        frameFilhoNorte    = new JPanel();
        frameFilhoSul      = new JPanel();
       	botao1		   = new JButton("1");
        botao2             = new JButton("2");
        botao3             = new JButton("3");
        botao4             = new JButton("4");
        botao5             = new JButton("5");
        botao6             = new JButton("6");
        botao7             = new JButton("7");
        botao8             = new JButton("8");
        botao9             = new JButton("9");
        botao0             = new JButton("0");
        botaoMais          = new JButton("+");
        botaoMenos         = new JButton("-");
        botaoDivido        = new JButton("/");
        botaoMultiplicando = new JButton("*");
        botaoResultado     = new JButton("=");
        
        //Adicionando Listener nos meus botoes
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);
        botao4.addActionListener(this);
        botao5.addActionListener(this);
        botao6.addActionListener(this);
        botao7.addActionListener(this);
        botao8.addActionListener(this);
        botao9.addActionListener(this);
        botao0.addActionListener(this);
        botaoMais.addActionListener(this);
        botaoMenos.addActionListener(this);
        botaoDivido.addActionListener(this);
        botaoMultiplicando.addActionListener(this);
        botaoResultado.addActionListener(this);
        
    }
    
    public void iniciaFrame(){
        
        framePai.add(frameFilhoNorte, BorderLayout.NORTH);
        frameFilhoSul.setLayout(new GridLayout(5,3));
        frameFilhoNorte.add(visor);
        framePai.add(frameFilhoSul, BorderLayout.SOUTH);
        frameFilhoSul.add(botao1); 
        frameFilhoSul.add(botao2); 
        frameFilhoSul.add(botao3); 
        frameFilhoSul.add(botao4); 
        frameFilhoSul.add(botao5); 
        frameFilhoSul.add(botao6); 
        frameFilhoSul.add(botao7); 
        frameFilhoSul.add(botao8); 
        frameFilhoSul.add(botao9); 
        frameFilhoSul.add(botao0); 
        frameFilhoSul.add(botaoMais); 
        frameFilhoSul.add(botaoMenos); 
        frameFilhoSul.add(botaoDivido); 
        frameFilhoSul.add(botaoMultiplicando); 
        frameFilhoSul.add(botaoResultado);
        framePai.pack();
        frameFilhoSul.setSize(300, 250);
        framePai.setSize(300, 250);
        framePai.setVisible(true);
        framePai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.iniciaFrame();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String texto = ae.getActionCommand();
        
        if (texto.trim().equals("+") 
           || texto.trim().equals("-") 
           || texto.trim().equals("/")
           || texto.trim().equals("*") ) {
            
            //Mostrando no Visor
            visor.setText(visor.getText() + " "+ texto + " ");
            //Adicionando numero em memoria
            memoria.add(-1);
            
        }else{
            
            //Mostrando no Visor
            visor.setText(visor.getText()+ texto );
            //Adicionando numero em memoria
            memoria.add(Integer.valueOf(texto));
        }
        
      
       
        
    }
    
}
