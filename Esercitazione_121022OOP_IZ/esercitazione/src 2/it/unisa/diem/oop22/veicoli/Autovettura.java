package it.unisa.diem.oop22.veicoli;

public class Autovettura extends Veicolo {

  private int numeroPosti;

  public Autovettura(String numTelaio, String modello, String alimentazione, String targa, int numeroPosti) {
    super(numTelaio, modello, alimentazione, targa);
    this.numeroPosti = numeroPosti;
  }

  public int getNumeroPosti() {
    return numeroPosti;
  }

  @Override
  public boolean controllaTarga() {
    if (this.getTarga().length() == 7) {
      if (this.getTarga().substring(0, 2).matches("[A-Z]{2}") && this.getTarga().substring(5, 7).matches("[A-Z]{2}")) {
        if (this.getTarga().substring(2, 5).matches("[0-9]{3}")) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return super.toString() + ", Numero posti = " + this.numeroPosti;
  }

}