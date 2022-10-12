package it.unisa.diem.oop22.veicoli;

public class Moto extends Veicolo {

  private Boolean guidaLibera;

  public Moto(String numTelaio, String modello, String alimentazione, String targa, Boolean guidaLibera) {
    super(numTelaio, modello, alimentazione, targa);
    this.guidaLibera = guidaLibera;
  }

  public Boolean getGuidaLibera() {
    return guidaLibera;
  }

  @Override
  public boolean controllaTarga() {
    if (this.getTarga().length() == 7) {
      if (this.getTarga().substring(0, 2).matches("[A-Z]{2}")) {
        if (this.getTarga().substring(2, 7).matches("[0-9]{5}")) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return super.toString() + ", Guida libera = " + this.guidaLibera;
  }

}
