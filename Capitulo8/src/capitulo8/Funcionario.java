
package capitulo8;

/**
 *
 * @author Alfredo
 */
public abstract class Funcionario {
    protected int codigo;
    protected String nome;
    protected double salario;
    
    /*
    Objetivo:
        A classe serve para ser herdada, ela define 
        o padrão que todas as subclasses devem ter..
    */
    
    public double getSalario(){
        return salario * 1.15;
    }
    
    /*
        Não temos retorno, somente a assinatura
    */
    public abstract double getSalarioTotal();
    
}
