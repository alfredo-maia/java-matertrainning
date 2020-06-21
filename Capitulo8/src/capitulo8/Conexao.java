package capitulo8;

/**
 *
 * @author Alfredo
 */
public interface Conexao {
    /*
        Interface não possui declaração de metodo,
        possui apenas declaração de metodo
    */
    
    public String getConn();
    
    public void setClose();
    
    public String getStatus();
}
