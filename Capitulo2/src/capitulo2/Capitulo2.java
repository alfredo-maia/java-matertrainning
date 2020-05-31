/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo2;

/**
 *
 * @author alfre
 */
public class Capitulo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Trabalhando com variáveis 
      
      //Inteiros 
       
      int a = 10;
      int b = 2;
      
      int c = (a + b) / 2;
      
      System.out.println("Resultado: " + c);
      
      
      //Trabalhando com ponto flutuante 32 bits
      
      float valor = 1.99f;
      float quantidade = 10;
      float total = valor * quantidade;
      System.out.println("Resultado: " + total);
      
      //Trabalhando com ponto flutuante 64 bitas
      
      double valor1 = 1.99;
      double quantidade1 = 10;
      double total1 = valor1 * quantidade1;
      System.out.println("Resultado: " + total1);
       
      
     //Trabalhando com tipo boolean
     boolean b1 = true;
     boolean b2 = a < b;
     System.out.println("B1: " + b1);
     System.out.println("B2: " + b2);
    
     if (b1 == true ){
         System.out.println("Verdadeiro");
     }else{
          System.out.println("Falso");
    }
     
     
    //Trabalhando com Strings (Não é tipo primitivo)
    
    
    String nome = "Alfredo";
    String sobrenome = "Maia";
    String completo = nome + " - " + sobrenome;
    System.out.println(completo);
    

    //Trabalhando com Char
    char ch1 = 'A';
    char ch2 = 168;
    System.out.println("Resultado: " + ch1);
    System.out.println("Resultado: " + ch2);
    
    
    //Trabalhando com Short
    short sh = 1000;
    byte by = 127;
    long lo = 5000l;
    
    System.out.println(lo);
    
    
    //Criando várias variáveis ao mesmo tempo;
    String c1 = "A", c2 = "b";
    
    
    //Conversão de Tipos 
    
    String numero = "8";
    int oito = Integer.valueOf(numero);
    System.out.println("Resultado: " + oito);
    
    double num = Double.valueOf(numero);
    System.out.println("Resultado: " + num);
    
    float n = Float.valueOf(numero);
    System.out.println("Resultado: " + n);
    
    String resultado = String.valueOf(num);
    System.out.println("Resultado para String: " + resultado);
    
    //Exemplo de Casting (Mais comum em classes e objetos) 
    byte bt = (byte) oito;
    
    //Operador ternário
    a = 100;
    b = 20;
    String r;
    
    if (a > b){ //Se a maior que b então
        r = "A maior que B";
    }else {    //Senão entre aqui
        r = "B maior que A";
    }
    
    System.out.println(r);
    
    String r2 = (a>b)?"A maior que B" : "B maior que A";
    System.out.println("Resultado do operador ternário: " + r2);
    
    int x = (a > b && b == 10 )?a:b;
    System.out.println(x);
    
    
    //Operadores de atribuição
    a = 10;
    a = a + 1;
    a++;
    System.out.println("Valor de a: " + a);
    
    b = 10;
    b = b - 1;
    b = b--;
    System.out.println(b);
    
    c = 10;
    c = c + 1;
    c += 1;
    System.out.println("Valor de c: " + c);
    
    
    a = 5;
    b = 5;
    c = a++ + b++;
    System.out.println("Valor de a + b = " + c);
    
    a = 5;
    b = 5;
    c = ++a + ++b;
    System.out.println("Resultado final: " + c);
    
}
    
}
