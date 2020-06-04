/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo4;

/**
 *
 * @author alfre
 */
public class Capitulo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        int c = 30;
        
        //Exemplo de IF -- ELSE ( SE -- SENAO )
        if (a>b){
            System.out.println("A maior que B");
        }else{
            System.out.println("B maior que A");
        }
        
        b = 30;
        a = 30;
        //ELSE IF
        if (a > b){
            System.out.println("A maior que B");
        }else if(b>a){
           System.out.println("B maior que A");
        }else{
           System.out.println("Iguais");
        }
        
        b = 30;
        a = 40;
        c = 50;
        
        if ( a > b && a > c){
            System.out.println("A maior");
        }else if(b > a && b > c){
            System.out.println("B maior");
        }else{
            System.out.println("C maior");
        }
        
        //Exemplo com OR
        b = 6;
        a = 8;
        c = 5;
        
        if (a > b || b == 5) {
            System.out.println("A maior que B -- XXX");
        }
        
        b = 10;
        a = 20;
        
        //Operador ternário
        String res = (a>b) ? "A maior" : "B maior";
        System.out.println("Resultado ternário: " + res);
        
        if (a > b){
            System.out.println(" Resultado IF A maior");
        }else{
            System.out.println(" Resultado IF B maior");
        }
        
        int x = (a > b) ? a : b;
        
        System.out.println("Resultado valor de X:" + x);
        
        boolean r = (a > b) ? true : false;
        System.out.println("Resultado de r: " + r);
        
        boolean r2 = (a>b);
        
        //Trabalhando com String lowercase, uppercase, length, replace, substring
        
        String nome = "Alfredo";
        
        //Imprimindo nome
        System.out.println("Nome: " + nome);
        
        //Imprimindo em maiúsculo
        System.out.println("Nome: " + nome.toUpperCase());
        
        //Imprimindo em minuscúlo
        System.out.println("Nome: " + nome.toLowerCase());
        
        //Mostrando tamanho, length (conta quantos caracteres tem uma string)
        int tamanho = nome.length();
        System.out.println("Resultado :" + tamanho);
        
        //Função replace 
        String nome2 = "Alfredo Souza Maia";
        System.out.println("Nome2 : " + nome2.replace("o", "#"));
        
        //Replace First (Remove apenas a primeira ocorrencia)
         System.out.println("Nome2 : " + nome2.replaceFirst("a", ""));
        
         //Substring
         
         res = nome2.substring(0, 3);
         
         System.out.println("Substring : " + res.toUpperCase());
         
         //Copiar a ultima letra
         String ultima = "Alfredo Souza Maia";
         
         int tam = ultima.length();
         
         System.out.println("Resultado ultima letra: " + ultima.substring(tam -1,tam).toUpperCase());
         
         //Usando o contains (Quero saber se o nome contém alguma sequencia de caracteres)
         String nome3 = "Enon Junio";
         
         boolean r5 = nome3.contains("Enon");
         
         System.out.println("Contém: " + r5);
         
        //Laços de Repetição
        
        //While
        
        int v = 0;
        
        while(v <= 10){
            System.out.println("While :" + v);
            v = v + 1;
        }
        
        System.out.println("Fim do While");
        
        //Trabalhando com Do While
         x = 0;
        do {
            System.out.println("Valor de X: " + x);
        }while(x <= 10); //Equanto x for menor ou igual a 10
        System.out.println("Fim Do While");
        
        
    }
    
}
