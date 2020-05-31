
package br.com.apk;

import br.com.apk.estoque.Produto;
import br.com.apk.venda.ItemPedido;

/**
 * Classe Principal da Aplicação
 * @author Alfredo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaração do produto
        Produto prod = new Produto();
        
        prod.setCodigo(String.valueOf(20877));
        prod.setDescricao("ZM501");
        prod.setDesconto(10);
        prod.setPreco(200);
        
        ItemPedido item = new ItemPedido();
        
        item.setProduto(prod);
        item.setQuantidade(10);
        prod.setEmVenda(true);
        
        //Imprimindo os dados 
        System.out.println("Código do Produto: " + prod.getCodigo());
        System.out.println("Descrição do Produto: " + prod.getDescricao());
        System.out.println("Valor do Desconto: " + prod.getDesconto() * item.getQuantidade());
        System.out.println("Valor Unitário: " + prod.getPreco());
        System.out.println("Quantidade Negociada: " + item.getQuantidade());
        System.out.println("Valor total: " + item.getQuantidade() * (prod.getPreco() - prod.getDesconto()));
    }
    
}
