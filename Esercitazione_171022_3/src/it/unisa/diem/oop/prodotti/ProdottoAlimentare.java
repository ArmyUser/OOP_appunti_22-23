/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.prodotti;
import java.time.LocalDate;

/**
 *
 * @author 39349
 */
public class ProdottoAlimentare extends Prodotto{
    private LocalDate scadenza;

    public ProdottoAlimentare(String codiceABarre, String descrizione, float prezzo, LocalDate scadenza) {
        super(codiceABarre, descrizione, prezzo);
        this.scadenza = scadenza;
    }

    public LocalDate getScadenza() {
        return scadenza;
    }
    
    @Override
    public void applicaSconto(){
        if(scadenza.isBefore(LocalDate.now().plusDays(10))){
          prezzo *= 0.8;
        }
        
    }    

    @Override
    public String toString() {
        return super.toString() + ", dataScadenza = " + scadenza;
    }
    
    
}
