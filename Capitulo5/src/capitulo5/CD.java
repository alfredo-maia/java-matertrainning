
package capitulo5;

/**
 *
 * @author Alfredo
 */
public class CD extends Produto{
    private int duracao;
    private String produtor;

    public CD(int duracao    , String produtor   , int codigo, 
                  String nome, double quantidade, 
                  double preco) {
        super(codigo, nome, quantidade, preco);
        this.duracao = duracao;
        this.produtor = produtor;
    }
    
    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProduto(String produto) {
        this.produtor = produto;
    }
    
    @Override
    public double getTotal(){
        return super.getQuantidade() * super.getPreco() * 2;
    }
    
    //Testando Varags para imprimir vários objetos
    public static void getVars(CD... args){
        String ret = null;
        
        for (CD arg : args) {
            
            if (ret == null){
               
                ret = 
                        "Código: "     + arg.getCodigo()   + "\n" 
                        + "Nome: "       + arg.getNome()     + "\n"
                        + "Produtor: "   + arg.getProdutor() + "\n" 
                        + "Duração: "    + arg.getDuracao()  + "\n" 
                        + "Preço: "      + arg.getPreco()    + "\n" 
                        + "Quantidade: " + arg.getQuantidade()
                        +"\n\n------------------------------------\n\n";
            }else {
                 ret = 
                        ret 
                        + "Código: "     + arg.getCodigo()   + "\n" 
                        + "Nome: "       + arg.getNome()     + "\n"
                        + "Produtor: "   + arg.getProdutor() + "\n" 
                        + "Duração: "    + arg.getDuracao()  + "\n" 
                        + "Preço: "      + arg.getPreco()    + "\n" 
                        + "Quantidade: " + arg.getQuantidade()
                        +"\n\n------------------------------------\n\n";
            }    
        }
        
        System.out.println(ret);
    }
}
