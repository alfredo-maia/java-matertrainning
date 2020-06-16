
package capitulo6;

/**
 *
 * @author Alfredo
 * */

public class Aluno {
    //Atributos
    private int codigo;
    private String nome;
    
    //Construtor
    public Aluno(int codigo, String nome) {    
        this.codigo = codigo;
        this.nome = nome;
    }

    //Métodos
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

    @Override
    public String toString() {
        return "Aluno{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }
    
    
}
