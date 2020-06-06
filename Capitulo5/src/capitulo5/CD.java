
package capitulo5;

/**
 *
 * @author Alfredo
 */
public class CD extends Produto{
    private int duracao;
    private String produtor;

    public CD(int duracao    , String produtor   , int codigo, 
                  String nome, double quantidade, 
                  double preco) {
        super(codigo, nome, quantidade, preco);
        this.duracao = duracao;
        this.produtor = produtor;
    }
    
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
        return super.getQuantidade() * super.getPreco() * 2;
    }
    
}
