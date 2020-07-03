package capitulo10_menu;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;

/**
 *
 * @author Alfredo
 */
public class ExemploMenu implements ActionListener{
    JFrame frame;
    JMenuBar menuBar;
    JMenu menuArquivo;
    JMenu menuEditar;
    JMenu menuAjuda;
    JMenuItem itemNovo;
    JMenuItem itemSalvar;
    JMenuItem itemAbrir;
    JMenuItem itemSair;
    JCheckBoxMenuItem itemChecBox;
    
    //Métodos
    private void iniciarFrame(){
        //Criando a janela e a barra de menus
        frame = new JFrame("Exemplo de menu");
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        //Criando os menus e adicionando a barras de menus
        menuArquivo = new JMenu("Arquivo");
        menuEditar = new JMenu("Editar");
        menuAjuda  = new JMenu("Ajuda");
        menuBar.add(menuArquivo);
        menuBar.add(menuEditar);
        menuBar.add(menuAjuda);
        //Criando os itens de um menu
        itemNovo = new JMenuItem("Novo");
        itemSalvar = new JMenuItem("Salvar");
        itemAbrir = new JMenuItem("Abrir");
        itemSair = new JMenuItem("Sair");
        //Adicionando os listeners
        itemNovo.addActionListener(this);
        itemSalvar.addActionListener(this);
        itemAbrir.addActionListener(this);
        itemSair.addActionListener(this);
        //Adicionando itens a um menu
        menuArquivo.add(itemNovo);
        menuArquivo.add(itemSalvar);
        menuArquivo.add(itemAbrir);
        menuArquivo.add(itemSair);
        //Adicionando item de menu com checkbox
        itemChecBox = new JCheckBoxMenuItem("Salvar Automático");
        itemChecBox.addActionListener(this);
        menuArquivo.add(itemChecBox);
        //Alterando a cor
        Color cor = new Color(105,89,205);
        menuBar.setBackground(cor);
        frame.setSize(600,400);
        frame.setVisible(true);
    }
  
    @Override
    public void actionPerformed(ActionEvent ae){
        System.out.println("Implementando Interface");
    }
    
    public static void main(String[] args) {
        new ExemploMenu().iniciarFrame();
    }
    
}
