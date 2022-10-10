/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop280922iz;

import it.unisa.diem.oop.persone.Studente;
import it.unisa.diem.oop.spazi.Aula;

/**
 *
 * @author lucagreco
 */
public class TestAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Aula a1 = new Aula(3);
        
        
       Studente s1, s2, s3, s4;
 
       
       s1 = new Studente( "Mario", "Rossi");
      
       s2 = new Studente( "Ernesto", "Rossi");
       
       s3 = new Studente("Davide", "Rossi");
       
       s4 = new Studente("Nicola", "Rossi");
       
       a1.entra(s1);
       a1.entra(s2);
       a1.entra(s3);
       
       a1.esce();
       
       a1.entra(s4);
       
       a1.stampaStudentiInAula();
       
        
        
        
    }
    
}
