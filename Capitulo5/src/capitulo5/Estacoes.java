package capitulo5;

/**
 *
 * @author Alfredo
 */
public class Estacoes {
    /*
        Exemplo de enumeração
    */
    
    enum estacoes{INVERNO,VERAO,OUTONO,PRIMAVERA};
        
    //Imprimindo estações
    public static void main(String[] args) {
        
        System.out.println("Estação - " + estacoes.INVERNO);
        System.out.println("Estação - " + estacoes.VERAO);
        System.out.println("Estação - " + estacoes.OUTONO);
        System.out.println("Estação - " + estacoes.PRIMAVERA);
        
        Estacoes.foo(estacoes.values());
        
    }
    
    public static void foo(estacoes... est){
        for(estacoes e : est) {
        System.out.println(e.ordinal());
        System.out.println(e.name());
        System.out.println("----------------------\n");
        }
    }
    
}
