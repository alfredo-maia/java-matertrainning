
package execapitulo7;

/**
 *
 * @author Alfredo
 */
public class Produto {
    private int codigo;
    private String nome;
    private double valor;
    
    //Contrutor
    public Produto(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        setValor(valor);
    }

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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws ValidacaoException{
        
        this.valor = (valor/valor + valor) -1;
            //Lançar a Exceção
        throw new ValidacaoException("O valor do produto não pode ser 0");
    }
    
    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + '}';
    }
    
}
