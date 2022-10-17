/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// INCLUDERE DIRETTIVE PACKAGE E IMPORT

/**
 *
 * @author GRUPPO 52
 */
import it.unisa.diem.oop.prodotti.*;
import it.unisa.diem.oop.carrello.*;
import java.time.LocalDate;
        
public class TestProdotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Prodotto p1 = new ProdottoAlimentare("A1", "pane", 2, LocalDate.of(2022, 10, 31));
        Prodotto p2 = new ProdottoAlimentare("A2", "latte", 2, LocalDate.of(2022, 10, 18));
        Prodotto p3 = new ProdottoNonAlimentare("N3", "piatti", 2, "plastica", false);
        Prodotto p4 = new ProdottoNonAlimentare("N4", "bicchieri", 2, "carta", true);

        Carrello c = new Carrello();

        c.aggiungi(p1);
        c.aggiungi(p2);
        c.aggiungi(p3);
        c.aggiungi(p4);

        System.out.println(c);

        System.out.println("Il totale scontato è: " + c.calcolaTotale());


    }

}
