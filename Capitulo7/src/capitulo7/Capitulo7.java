
package capitulo7;

/**
 *
 * @author Alfredo
 */
public class Capitulo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tratamento de Exceções : try, catch e finally
        try{
           
            //ArithmeticException
            //int u = 100/0;
             int x = 10/2;
            
            //ArrayIndexOutOfBoundsException
            int []array = new int[2];
             array[1] = 2;
           // array[3] = 9;
            
            //
            //int inteiro = Integer.valueOf("5");
            //int inteiro = Integer.valueOf("Cinco");

            System.out.println("OK");
            
            metodo1();
            
            //Forçando erro com regra de Negócio
            try{
                testeExcecao();
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
            
        }catch(NumberFormatException e){
            System.out.println("Erro de Formatação " + e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro de atribuição: " + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Erro de cálculo: " + e.getMessage());
        }catch(Exception e){
            System.out.println("Erro Geral " + e.getClass());
        }finally{
            System.out.println("Executa mesmo com erros");
    } //Fim da Classe
        
    } //Fim do Main
    
    public static void metodo1(){
        try{
            metodo2();
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void metodo2() throws Exception{
        metodo3();
    }
    
    public static void metodo3() throws Exception{
        int x = 10 /0;
    }
    
    public static void testeExcecao() throws Exception{
        int x = 10;
        if(x<20){
            throw new Exception("Número muito baixo");
        }
    }
}//Fim da classe
