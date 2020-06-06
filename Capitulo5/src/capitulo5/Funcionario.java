
package capitulo5;

/**
 *
 * @author Alfredo
 */
public class Funcionario extends Pessoa{
    //Atributos de Instância 
    protected double salario;
    private char turno;
    
    //Método construtor 
    public Funcionario(int p_codigo, String p_nome, 
                       String p_cidade, String p_telefone,
                       double p_salario, char p_turno){
           
                super(p_codigo,p_nome,p_cidade,p_telefone);
                this.salario = p_salario;
                this.turno = p_turno;
        
    }
    
    public Funcionario(){
        
    }
    
    //Métodos de Instância
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }
    
    @Override
    public String getPessoa(){
        String retorno = super.getPessoa() + "\n"
                + "Salario: " + this.getSalario() + "\n"
                + "Turno: " + this.getTurno();
        return retorno;
    }
}
