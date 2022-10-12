package it.unisa.diem.oop22.veicoli;

public class Camion extends Veicolo {

  private int numeroAssi;

  public Camion(String numTelaio, String modello, String alimentazione, String targa, int numeroAssi) {
    super(numTelaio, modello, alimentazione, targa);
    this.numeroAssi = numeroAssi;
  }

  public int getnumeroAssi() {
    return numeroAssi;
  }

  @Override
  public boolean controllaTarga() {
    if (this.getTarga().length() == 8) {
      if (this.getTarga().substring(0, 2).matches("[A-Z]{2}")) {
        if (this.getTarga().substring(2, 8).matches("[0-9]{6}")) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return super.toString() + ", Numero assi = " + this.numeroAssi;
  }

}
