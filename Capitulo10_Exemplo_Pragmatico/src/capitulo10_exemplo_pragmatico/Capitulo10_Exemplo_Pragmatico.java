
package capitulo10_exemplo_pragmatico;

import javax.swing.SwingUtilities;

public class Capitulo10_Exemplo_Pragmatico {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                HelloWordSwing.criaMostraGUI();
            }
        });
    }
    
}
