package capitulo6;

/**
 *
 * @author alfre
 */
public class Capitulo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome = "Alfredo";
        System.out.println("Nome: " + nome);
        
        String sobrenome = new String("Maia");
        
        System.out.println("Nome Completo: " + nome + " " + sobrenome);
        
        /* 
           Concat:
           Concatena Strings, similar ao operador +
        */
        String peso = "100";
        String altura = "1.78";
        
        System.out.println("Peso: " + peso.concat("KG"));
        System.out.println("Altura: " + altura.concat("M"));
        
        /*
            CharAt:
            Procura letra indexada pela posição
        */
        String s = "Maria";
        System.out.println("Valor da posição 2: " + s.charAt(2));
        
       /*
            IndexOf:
            Procura primeiro termo e retorna a primeira posição dele
        */
        s = "Fabrica de brinquedos";
        System.out.println("Posição do termo br: " + s.indexOf("br"));
        /*
            LastIndexOf:
            Procura o último termo e retorna a primeira posição dele
        */
        System.out.println("Posição do termo br: " + s.lastIndexOf("br"));
        
        /*
            Equals:
            Comparando Strings, retorna true se for verdade
        */
        String senha = "123";
        
        if (senha.equals("123")){
            System.out.println("Válida");
        }else{
            System.out.println("Inválida");
        }
        
         /*
            EqualsIgnoreCase:
            Comparando Strings sem case sensitive, retorna true se for verdade
        */
         
         String login = "alfredo";
         if(login.equalsIgnoreCase("Alfredo")){
            System.out.println("Login válido");
         } else{
             System.out.println("Login inválida");
         }
          /*
            Conversões
         */
          String sete = "7";
          int isete = Integer.valueOf(sete);
          System.out.println("Sete: " + isete);
          
          double dSete = 7.0;
          String sSete = String.valueOf(dSete);
          System.out.println("Double Sete: " + sSete);
          
          /*
            StringBuilder e StringBuffer
          */
          
          String texto = "Primeira Linha\n";
          texto = texto + "Segunda Linha\n";
          texto = texto + "Terceira Linha";
          
          System.out.println("Texto: \n" + texto);
          
          //String Buffer - Thread
          StringBuffer sb = new StringBuffer();
          sb.append("Texto: \n");
          sb.append("Primeira linha \n");
          sb.append("Segunda linha \n");
          sb.append("Terceira linha \n");
          
          System.out.println("-------------------------------");
          
          System.out.println(sb);
          
          System.out.println("-------------------------------");
          
          //String Buider - Thread
          StringBuilder sb1 = new StringBuilder();
          sb1.append("Texto: \n");
          sb1.append("Primeira linha \n");
          sb1.append("Segunda linha \n");
          sb1.append("Terceira linha \n");
          
          System.out.println(sb);
          
          /*
            Arrays:
          */
          
          //Array simples   (Vetor)
          int [] numeros = new int[3];
          numeros[0] = 10;
          numeros[1] = 11;
          numeros[2] = 12;
          
          //Array Muldimensional (Matriz)
          int [][] nums = new int[2][2];
          nums[0][0] = 1;
          nums[0][1] = 2;
          nums[1][0] = 3;
          nums[1][1] = 4;
          
          System.out.println("Nums: " + nums[0][1]);
          System.out.println("Nums: " + nums[1][1]);
          
          //Array de Objetos
           Produto prod[] = new Produto[10];
           
           prod[0] = new Produto(1,"PC",2000.0);
          
          System.out.println(prod[0]);
    }
    
}
	