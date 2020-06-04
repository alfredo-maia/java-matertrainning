
package br.social.cadastro;

/**
 * JavaDoc
 * Esta classe serve para cadastrar clientes
 * @author alfredo
 */
public class Cliente {
    
    private int codigo;
    private String nome;
    
    /**
     * Metódo retorna código do cliente
     * @return 
     */
    public int getCodigo() {
        return codigo;
    }
    
    /**
     * Atuliza código do cliete
     * @param codigo 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    /**
     * Teste com dois paramêtros
     * @param codigo
     * @param codigo2 
     */
    public void setCodigo(int codigo, int codigo2) {
        this.codigo = codigo;
    }
    
    /**
     * 
     * @return 
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
