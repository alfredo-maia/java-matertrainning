
package capitulo5;

/**
 *
 * @author Alfredo
 */
public class Produto {
    //Atributos de instância
    private int codigo;
    private String nome;
    private double quantidade;
    private double preco;
    
    //Método Construtor
    
    public Produto(){
        
    }
    
    public Produto(int codigo, String nome, double quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    //Métodos de instância 
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

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getTotal(){
        return this.quantidade * this.preco;
    }
    
}
