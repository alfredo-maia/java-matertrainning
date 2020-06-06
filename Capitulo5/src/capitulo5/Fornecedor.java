
package capitulo5;

/**
 *
 * @author Alfredo
 */
public class Fornecedor extends Pessoa{
    //Atributos de Instância   
    private String tipo;
    private double limite;
    
     //Método construtor 
    public Fornecedor(){
        
    }
    
    public Fornecedor(int p_codigo, String p_nome, 
                       String p_cidade, String p_telefone,
                       String p_tipo, double p_limite){
           
                super(p_codigo,p_nome,p_cidade,p_telefone);
                this.tipo = p_tipo;
                this.limite = p_limite;
        
    }
    
    //Métodos de Instância
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
        
    @Override
    public String getPessoa(){
        String retorno = super.getPessoa() + "\n"
                + "Tipo: " + this.getTipo() + "\n"
                + "Limite: " + this.getLimite();
        
        return retorno;
    }    
}
