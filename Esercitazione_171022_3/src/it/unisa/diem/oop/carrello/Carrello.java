/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.carrello;
import it.unisa.diem.oop.prodotti.Prodotto;
        

/**
 *
 * @author 39349
 */
public class Carrello {
    
    private Prodotto prodotti[];
    public final int maxProdotti;
    private int riemp;

    public Carrello() {
        maxProdotti = 5;
        riemp = 0;
        this.prodotti =  new Prodotto[maxProdotti];
    }
    
    public void aggiungi(Prodotto p){
        if(isFull()){
            System.out.println("il carrello è pieno!!!");
            return;
        }
        
        prodotti[riemp] = p;
        riemp++;
        
    }
    
    private boolean isFull(){
        return riemp == maxProdotti;
    }
    
    private boolean isEmpty(){
        return riemp == 0;
    }
    
    public float calcolaTotale(){
        
        if (isEmpty()){
            System.out.println("il carrello è vuoto");
            return 0f;
        }
        
        float sconto = 0f;
        
        for(int i = 0; i < riemp; i++){
            prodotti[i].applicaSconto();
            sconto += prodotti[i].getPrezzo();
        }
        
        return sconto;
        
    }
    
    @Override
    public String toString() {
      StringBuffer s = new StringBuffer();
      s.append( "Il carrello contiene:\n");
      for(int i = 0; i < riemp; i++){
            s.append(prodotti[i]);
            s.append("\n");
        }
      return s.toString();
      
}
}