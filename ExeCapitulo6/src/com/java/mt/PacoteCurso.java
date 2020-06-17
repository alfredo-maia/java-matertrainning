
package com.java.mt;

import br.social.venda.Curso;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Iterator;

/**
 * @author Alfredo
 */

public class PacoteCurso {
    //Atributos
    private ArrayList<Curso> curso;
    private String dataCriacao;
    
    //Construtor
    public PacoteCurso(){
        curso = new ArrayList();
        SimpleDateFormat padrao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.dataCriacao = padrao.format(new Date());
    }
    
    //Métodos
    public void setCurso(Curso e){
        int qtd = curso.size();
        if ( (qtd+1) == 10){
            System.out.println("Foram armazenados 10 Cursos");
            this.curso.add(e);
        }else{
            this.curso.add(e);
        }
    }
    
    public Curso getCurso(int pos){
        return this.curso.get(pos);
    }
    
    //Imprimindo o curso
    @Override
    public String toString() {
        String retorno = "";
       
        Iterator it = curso.iterator();
        
        while(it.hasNext()){
            Curso c;
            c = (Curso) it.next();
            if (retorno.equals("") == true){
                retorno = c.toString();
                retorno = retorno + "\n" 
                          + "Data: " + dataCriacao + '\n' 
                + "-----------------------\n";
                
            }
            else{
                retorno = retorno + c.toString() 
                          + "\n" + "Data:" + dataCriacao + "\n"
                          + "-----------------------\n";;
            }
        }
        return retorno;
    }
    
    //Retornando o valor Total do Curso
    public double getVlrTot(){
        double vlrTot = 0;
        for(Curso c : curso){
            vlrTot = vlrTot + c.getPreco();
        }
        return vlrTot;
    }
    
    //Retornando os nomes dos curso
    public String getNomesCurso(){
        StringBuilder s = new StringBuilder();
        
        Iterator i = curso.iterator();
        
        while(i.hasNext()){
           Curso o = (Curso) i.next();
            s.append("\t\t" + o.getNome()+"\n");
        }
        
        return s.toString();
        //return "a";
    }
    
    
}
