
package capitulo8;

/**
 *
 * @author Alfredo
 */
public class Vendedor extends Funcionario{

    @Override
    public double getSalarioTotal() {
        return getSalario() + 500;
    }
    
}
