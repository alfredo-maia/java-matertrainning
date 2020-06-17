
package com.java.mt;

import br.social.venda.Curso;

/**
 *
 * @author Alfredo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cursos
        /*
               Paramêtros do Curso:
                                    Código
                                    Nome
                                    Valor
                                    Quantidade
                                    Carga Horária
                                    Turno
        */
        Curso curso1 = new Curso(1, "Matemática",100,10,5,'M');
        Curso curso2 = new Curso(2, "Português",50,25,1,'V');
        Curso curso3 = new Curso(3, "Inglês",20,12,10,'N');
        Curso curso4 = new Curso(4, "Geografia",20,12,10,'N');
        Curso curso5 = new Curso(5, "História",20,12,10,'N');
        Curso curso6 = new Curso(6, "Bilogia",20,12,10,'N');
        Curso curso7 = new Curso(7, "Sociologia",20,12,10,'N');
        Curso curso8 = new Curso(8, "Física",20,12,10,'N');
        Curso curso9 = new Curso(9, "Química",20,12,10,'N');
        Curso curso10 = new Curso(10, "Filosofia",20,12,10,'N');

        
        //Pacote de Cursos
        PacoteCurso pkt = new PacoteCurso();
        pkt.setCurso(curso1);
        pkt.setCurso(curso2); 
        pkt.setCurso(curso3);
        pkt.setCurso(curso4);
        pkt.setCurso(curso5);
        pkt.setCurso(curso6);
        pkt.setCurso(curso7);
        pkt.setCurso(curso8);
        pkt.setCurso(curso9);
        pkt.setCurso(curso10);
        
        //Mostrando Pacote de Cursos
        System.out.println("Cursos: \n" + pkt);
        
        System.out.println("Valor Total dos Cursos: " + pkt.getVlrTot());
        System.out.println("\n----------------------\n");
        System.out.println("Nomes dos Cursos: " + "\n" + pkt.getNomesCurso());
    }
    
}
