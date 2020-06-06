
package capitulo5;

/**
 *
 * @author Alfredo
 */
public class Cliente {
    //Atributos da Instância
    private int codigo;
    private String nome;
    private double salario;
    
    //Atributos de Classe (Variáveis Estáticas)
    private static double desconto;
    
    //Inicializador statico de código
    static{
        desconto = 10;
    }
    
    //Constructor of class
    public Cliente(){
         System.out.println("Método Construtor Original");
    }
    
    public Cliente(int codigo){
        this();
        setCodigo(codigo);
        System.out.println("Construtor do Código");
    }
    
    public Cliente(int codigo, String nome){
        this(codigo);
        setNome(nome);
        System.out.println("Construtor Segundário");
    }
    
    //Methods of class
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return this.codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    
   
    public double getSalario(double comissao){
        return this.salario * comissao + this.salario;
    }
    
     public double getSalario(double comissao, int horaExtra){
        return this.salario * comissao + this.salario + horaExtra;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Método Finalize 
    @Override
    public void finalize(){
        System.out.println("Objeto vai ser destruído");
    }
    
    //Método de alteração de atributo de classe
    public static void setDesconto(double desconto){
        Cliente.desconto = desconto;
    }
    
    /*
     public static void setDesconto(double desc){
        desconto = desconto;
    }   
    */
    
    public static double getDesconto(){
        return Cliente.desconto;
    }
}
