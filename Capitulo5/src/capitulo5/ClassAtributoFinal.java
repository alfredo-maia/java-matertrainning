package capitulo5;

/**
 *
 * @author Alfredo
 */
public class ClassAtributoFinal {
    
    private final static int VALOR = 1;
    
    public static void main(String[] args) {
        
    
        /******************************************* 
           
           Dá erro pq não podemos alterar o valor 
           de um atributo com o modificador final
            
           valor = 2;  
           
           ->>> A variável é definida em maiúsculo 
                porque ela é constante
        *********************************************/
        
        System.out.println("Valor Final: " + VALOR);
        
    }  
}
