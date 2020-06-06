
package capitulo5;

/**
 *
 * @author Alfredo
 */

/*
public final class ClassFinal {

    -> Não deixa a classe ClassHerdaFinal herda da classe!!!!
*/
public class ClassFinal {
    /*
        O modificador final bloqueia:
            - Herança de classes
            - Sobrescrita de métodos
            - Alteração de atributos de instância
    */
    protected String nome;
    
    public String getNome(){
        return this.nome;
    }
    
    /*******************************************************
    
    public final String getNome(){
        return this.nome;
    }
    
      -> O modificador final não deixa eu 
         fazer a sobrescrita (Override)
         *
    *********************************************************/
    
}
