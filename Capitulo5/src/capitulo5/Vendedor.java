
package capitulo5;

/**
 *
 * @author Alfredo
 */
public class Vendedor extends Funcionario{
    private double comissao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    @Override
    public double getSalario() {
        return this.salario + this.comissao;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
