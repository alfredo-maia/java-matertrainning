package capitulo5;


/**
 *
 * @author Alfredo
 */
public class Varargs {
    
    /*
        Varags permite passarmos uma quantidade infinitas de variáeis
        como argumentos...
    */
    
    public static void main(String[] args) {
        String nomeA = "Alfredo";
        String nomeB = "Bia";
        String nomeC = "Carlos";
        String nomeD = "Demosteners";
        String nomeF = "Fábio";
        
        Varargs.foo(nomeA,nomeB,nomeC,nomeD, nomeF);
    }
    
    public static void foo(String... args){
        for(int i = 0; i < args.length ; i++){
            String arg = args[i];
            System.out.println("Valor de ARGS: " + arg);
        }
    }
}
