/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Social;

/**
 *
 * @author alfre
 */
public class Meme {
    
    private int codigo;
    private String nome;
    private double porcentagem;
    
    
    
    //Metodo construtor
    
    public Meme(int codigo, String nome, double porcentagem){
        this.codigo = codigo;
        this.nome = nome;
        this.porcentagem = porcentagem;
    };

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }
    
    public String getMeme(){
        String retorno = this.codigo + "\n" +
                        this.nome + "\n" +
                        this.porcentagem + "%" ;
        
        return retorno;
    }
    
}
