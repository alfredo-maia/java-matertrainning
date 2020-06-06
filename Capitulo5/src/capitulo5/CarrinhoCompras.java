package capitulo5;

/**
 *
 * @author Alfredo
 */
public class CarrinhoCompras {
    
    public void addItem(Produto prod){
         System.out.println("Total: " + prod.getTotal());
    }
    
    public static void main(String[] args) {
        
        /*************************************************************************
            Exemplos de poliformismo
        
            Conceito:
            Definimos Polimorfismo como um princípio a partir do qual 
            as classes derivadas de uma única classe base são capazes 
            de invocar os métodos que, embora apresentem a mesma assinatura, 
            comportam-se de maneira diferente para cada uma das classes derivadas.
            
        ***************************************************************************/
        
        CD cd = new CD(25, "CD1", 1, "CD1", 10, 1);
        DVD dvd = new DVD(20, "DVD2", 10, "DVD2", 10, 1);
        
        CarrinhoCompras cc = new CarrinhoCompras();
        
        cc.addItem(cd);  //x2
        cc.addItem(dvd); //x3
        
    }
}
