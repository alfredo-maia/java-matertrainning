/*
 * Meu código comentado
 */
package Social;

import br.social.vendedor.Vendedor;
import br.social.estoque.Produto;
import br.social.cadastro.Cliente;

/**
 *
 * @author alfredo
 */


public class Capitulo3 {

    private double desconto;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaração de Referência
        Produto produto;
        
        //Transformar em Objeto
        produto = new Produto();
        
        /* Forma errada
        produto.codigo = 10;
        */
        
        //Definindo atributos do produto
        produto.setCodigo(10);
        produto.setNome("KM098");
        produto.setPreco(92.5);
        produto.setQuantidade(10);
        
        //Mostrando o código do produto
        System.out.println("Código do produto: " + produto.getCodigo());
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preco do produto: " + produto.getPreco());
        System.out.println("Quantidade do produto: " + produto.getQuantidade());
        System.out.println("Quantidade do produto: " + produto.getTotal());
        
        
        //Criando e instanciando a classe
        
        Vendedor almison = new Vendedor();
        
        almison.setCodigo(10);
        almison.setNome("Amilson");
        almison.setComissao(45);
        
        System.out.println("Codigo do Vendedor: " + almison.getCodigo());
        System.out.println("Nome do Vendedor: " + almison.getNome());
        System.out.println("Comissao do Vendedor: " + almison.getComissao());
        
        
        //Trabalhando com atribuições/referências de objetos
        
        Vendedor diego = new Vendedor();
        
        diego = almison;
        
        
        
        Meme sucupira = new Meme(1,"Drogadassoooo",100);
        
        System.out.println(sucupira.getMeme());
        
        
        Cliente cliente = new Cliente();
        
        Cliente cliente2 = new Cliente();
        
        
    }
    
}
