
package capitulo5;

/**
 * @author Alfredo
 */
public class Capitulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Cliente cli = new Cliente();
            
            //Atribuindo valores aos atributos
            cli.setCodigo(10);
            cli.setNome("Alfredo");
            cli.setSalario(2500);
            
            System.out.println("Código: " + cli.getCodigo());
            String nome = cli.getNome();
            System.out.println("Nome: " + nome);
            double salario = cli.getSalario();
            System.out.println("Salário: " + cli.getSalario());
            //Testando Overloading
            System.out.println("Salário com comissão: " + cli.getSalario(0.3));
            System.out.println("Salário com comissão e Hr Extra: " +
                                cli.getSalario(0.3, 200));
            
            System.out.println("-----------------------------");
            Cliente cli2 = new Cliente(20, "Alexandre");
            System.out.println("Código: " + cli2.getCodigo());
            System.out.println("Nome: " + cli2.getNome());
            
            Cliente cli3 = new Cliente(1);
            cli3.setNome("Maria");
            
            System.out.println("-----------------------------");
            System.out.println("Código: " + cli3.getCodigo());
            System.out.println("Nome: " + cli3.getNome());
            
            //Para usar o finalize temos que atribuir o objeto a null
            
            cli3 = null;
            //Chamdo o gabage colletor (coletor de lixo do Java)
            System.gc();
            
            //Testando atributo de classe 
            Cliente.setDesconto(10);
            
            System.out.println("---------------------------------");
            System.out.println("Desconto: " + Cliente.getDesconto());
            
            //Trabalhando com Herança
            System.out.println("--------------HERANÇA------------");
            
            Funcionario func = new Funcionario(10              ,
                                               "Helen Martins" ,
                                               "Goiânia"       ,
                                               "6232898404",
                                                1255.50        ,
                                                'M'
                                                );
            
            Fornecedor forn = new Fornecedor(  11              ,
                                               "João Marcos" ,
                                               "Ap. de Goiânia"       ,
                                               "623288974",
                                                "J"        ,
                                                10000
                                                );
            
            System.out.println("########### Funcionário ##############");
            System.out.println("Dados do Funcionário: \n" + func.getPessoa());
            System.out.println("########### Fornecedor ##############");
            System.out.println("Dados do Fornecedor: \n" + forn.getPessoa());
            
            System.out.println("----------------------------------------------");
            Produto pro1 = new Produto();
            pro1.setPreco(10);
            pro1.setQuantidade(7);
            
            System.out.println("Preco: " + pro1.getPreco());
            System.out.println("Quantidade: " + pro1.getQuantidade());
            System.out.println("Total: " + pro1.getTotal());
            
            System.out.println("-----------------------------------------------");
            
            CD cd = new CD(120, "DC", 12, "CD do Batman", 52, 25);
            
            CD cd2 = new CD(125,"Nandi",54,"Bruna Martins",20,10);
            
            System.out.println("CD: " + cd.getNome() + " Valor Total: " + cd.getTotal());
          
            DVD dvd = new DVD(120, "MARVEL", 12, "Vingadores END Game", 10, 50);
            
            System.out.println("DVD: " + dvd.getNome() + "Valor Total: " + " Total: " + dvd.getTotal());
            
            System.out.println("\n-----------VARARGS-----------------\n");
            
            CD.getVars(cd2,cd);
    }
    
    
    
}
