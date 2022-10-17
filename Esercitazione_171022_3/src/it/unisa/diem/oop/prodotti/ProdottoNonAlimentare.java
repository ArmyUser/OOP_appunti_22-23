/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.prodotti;

/**
 *
 * @author 39349
 */
public class ProdottoNonAlimentare extends Prodotto{
    private String materiale;
    private boolean riciclabile;

    public ProdottoNonAlimentare( String codiceABarre, String descrizione, float prezzo, String materiale, boolean riciclabile) {
        super(codiceABarre, descrizione, prezzo);
        this.materiale = materiale;
        this.riciclabile = riciclabile;
    }

    @Override
    public void applicaSconto(){
        if(riciclabile){
            prezzo *= 0.9;
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + ", materiale = " + materiale + ", riciclabile = " + riciclabile;
    }
    
    
}
