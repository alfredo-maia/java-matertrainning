package br.social.venda;

/**
 *
 * @author Alfredo
 */
public class TestaCurso {
    public static void main(String[] args) {
        
        Curso java = new Curso( 10, 
                                "Java", 
                                100.0, 
                                1,
                                20, 
                                'V');
        
        java.getCurso();
        
        java = null;
        
        System.gc();
    }

    
}
