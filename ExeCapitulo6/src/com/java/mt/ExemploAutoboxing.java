
package com.java.mt;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alfredo
 */
public class ExemploAutoboxing {
    
    private static ArrayList<Integer> lista;
            
    public static void main(String[] args) {
        
        int vlr1 = 1;
        int vlr2 = 2;
        int vlr3 = 3;
        int vlr4 = 4;
        int vlr5 = 5;
        
        ExemploAutoboxing.lista.add(vlr1);
        ExemploAutoboxing.lista.add(vlr2);
        ExemploAutoboxing.lista.add(vlr3);
        ExemploAutoboxing.lista.add(vlr4);
        ExemploAutoboxing.lista.add(vlr5);
        
        /*
        for (Iterator<Integer> iterator = ExemploAutoboxing.lista.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            int a = ExemploAutoboxing.lista.get(next.intValue());
            System.out.println("Valor: " + a);
        }*/
    }
}
