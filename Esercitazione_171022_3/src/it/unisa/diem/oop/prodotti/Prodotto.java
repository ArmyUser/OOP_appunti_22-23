/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.diem.oop.prodotti;

/**
 *
 * @author 39349
 */
public abstract class Prodotto {
    private String codiceABarre;
    private String descrizione;
    protected float prezzo;

    public Prodotto(String codiceABarre, String descrizione, float prezzo) {
        this.codiceABarre = codiceABarre;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }
    
    public String getCodiceABarre() {
        return codiceABarre;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public float getPrezzo() {
        return prezzo;
    }
    
    public abstract void applicaSconto();

    @Override
    public String toString() {
        return "Prodotto codice = " + codiceABarre + ", descrizione = " + descrizione + ", prezzo = " + prezzo;
    }
    
    
    
    
}

