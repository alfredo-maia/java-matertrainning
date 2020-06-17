package br.social.estoque;

/**
 *
 * @author Alfredo
 */
public class Produto {
    //Atributo
   
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;
    
    //Metodo construtor
    
    public Produto(){
        
    }
    
    public Produto(int p_codigo, String p_nome, double p_preco, int p_quantidade){
        this.codigo = p_codigo;
        this.nome = p_nome;
        this.preco = p_preco;
        this.quantidade = p_quantidade;
    }
    
    //Metodos guetters seters 
    public void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setNome(String p_nome){
        this.nome = p_nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setPreco(double p_preco){
        this.preco = p_preco;
    }
    public double getPreco(){
        return this.preco;
    }
    
    public void setQuantidade(int p_quantidade){
        this.quantidade = p_quantidade;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public double getTotal(){
        return this.quantidade * this.preco;
    }
}
