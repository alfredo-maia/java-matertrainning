
package capitulo5;

/**
 *
 * @author Alfredo
 */
public class Pessoa {
    private int codigo;
    private String nome;
    private String cidade;
    private String telefone;
    
    //Construtor
    public Pessoa(){
        
    }
    
    public Pessoa(int p_codigo, String p_nome, 
                  String p_cidade, String p_telefone){
        this();
        this.codigo = p_codigo;
        this.nome = p_nome;
        this.cidade = p_cidade;
        this.telefone = p_telefone;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getPessoa(){
        String retorno = "Código: " + this.getCodigo() + "\n"
                        + "Nome: " + this.getNome() + "\n"
                        + "Cidade: " + this.getCidade() + "\n"
                        +  "Telefone " + this.getTelefone();
        return retorno;
   }
}
