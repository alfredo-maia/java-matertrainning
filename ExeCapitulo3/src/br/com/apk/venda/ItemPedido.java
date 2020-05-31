
package br.com.apk.venda;

import br.com.apk.estoque.Produto;

/**
 * Clase do item do produto
 * @author Alfredo
 */
public class ItemPedido {
    private int quantidade;
    private Produto produto;
    /**
     * Retorna a quantidade negociada
     * @return 
     */
    public int getQuantidade() {
        return quantidade;
    }
    
    /**
     * Atualiza a quantidade negociada 
     * @param quantidade 
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    /**
     * Busca o código do produto
     * @return 
     */
    public Produto getProduto() {
        return produto;
    }
    
    /**
     * Atualiza o produto
     * @param produto 
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
