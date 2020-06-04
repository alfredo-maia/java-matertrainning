/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.social.estoque;

/**
 *
 * @author alfredo
 */
public class Produto {
    //Atributo
    
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;
    
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
