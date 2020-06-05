
package br.social.venda;

import br.social.estoque.Produto;
/**
 *
 * @author Alfredo
 */
public class Curso extends Produto{
    //Atributos 
    private int cargaHoraria;
    private char turno;
    private final float VALOR_HORA = 100f;
    
     //Metodo construtor
    public Curso(int p_codigo, String p_nome, 
                     double p_preco,  int p_quantidade){
        
        super(p_codigo,p_nome,
              p_preco,p_quantidade);
    }
    
    public Curso(int p_codigo, 
                     String p_nome, 
                     double p_preco, 
                     int p_quantidade,
                     int p_cargaHoraria, 
                     char p_turno){
        super(p_codigo,p_nome,p_preco,p_quantidade);
        setCargaHoraria(p_cargaHoraria);
        setTurno(p_turno);
    }
    
    //Métodos 
    public double getPreco(float valorHora){
        return (float)this.cargaHoraria * valorHora;
    }
    
    @Override
    public double getPreco(){
        return (float)this.cargaHoraria * VALOR_HORA;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }
    
    //Método Finalize 
    public void finalize(){
        //Libera todos os recursos alocados pela classe
        System.out.println("Instância sendo coletada pelo GC");
    }
    
}
