
package br.com.apk.estoque;

/**
 * Classe responsável por gerenciar os 
 * produtos da aplicação
 * @author Alfredo
 */
public class Produto {
    private String codigo;
    private String descricao;
    private float preco;
    private boolean emVenda;
    private float desconto;

    /**
     * Busca código do cliente
     * @return 
     */
    public String getCodigo() {
        return codigo;
    }
    
    /**
     * Atualiza código do cliente
     * @param codigo 
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    /**
     * Busca código do cliente
     * @return 
     */
    public String getDescricao() {
        return descricao;
    }
    
    /**
     * Atualiza código do cliente 
     * @param descricao 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    /**
     * Busca código do cliente
     * @return 
     */
    public float getPreco() {
        return preco;
    }
    
    /**
     * Atualiza código do cliente
     * @param preco 
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    /**
     * Retorna se o produto está em venda
     * @return 
     */
    public boolean isEmVenda() {
        return emVenda;
    }
    
    /**
     * Atualiza se o produto está em venda
     * @param emVenda 
     */
    public void setEmVenda(boolean emVenda) {
        this.emVenda = emVenda;
    }
    
    /**
     * Busca desconto do produto
     * @return 
     */
    public float getDesconto() {
        return desconto;
    }
    
    /**
     * Atualiza desconto do produto
     * @param desconto 
     */
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
      
}
