
package capitulo5;

/**
 *
 * @author Alfredo
 */
public class DVD extends Produto{
    //Atributos de instância 
    private int duracao;
    private String produtor;
    
    //Método construtor
    public DVD(int duracao, String produtor   , int codigo, 
               String nome, double quantidade, double preco) {
        super(codigo, nome, quantidade, preco);
        this.duracao = duracao;
        this.produtor = produtor;
    }
    
    //Metodos de Instância
    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getProduto() {
        return produtor;
    }

    public void setProduto(String produto) {
        this.produtor = produto;
    }
    
    @Override
    public double getTotal(){
        return super.getQuantidade() * super.getPreco() * 3;
    }
}
