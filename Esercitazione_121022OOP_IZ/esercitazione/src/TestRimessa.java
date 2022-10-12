/*
* To change this license header, choose License Headers in Project
Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/* GESTIRE direttive package e import
*/

import it.unisa.diem.oop22.box.Autorimessa;
import it.unisa.diem.oop22.veicoli.*;

/**
 *
 * @author lucagreco
 */
public class TestRimessa {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Autorimessa a = new Autorimessa(5, "Parcheggio E1");

    a.entra(new Camion("sdf244", "Fiat CX45", "Gasolio", "TT656671", 4));
    a.entra(new Camion("spl265", "Volvo PTG", "Gasolio", "YH96671", 6));
    a.entra(new Autovettura("mk23t", "Fiat Punto", "Metano", "EA566FM", 5));
    a.entra(new Autovettura("cgt612", "Fiat Idea", "Gasolio", "AQ9Y7UUU", 5));
    a.entra(new Moto("das7896", "Honda Hornet", "Benzina", "AT51233", false));
    a.entra(new Moto("gdt7896", "Suzuki Bandit", "Benzina", "AT5123N", false));

    System.out.println(a);

  }

}