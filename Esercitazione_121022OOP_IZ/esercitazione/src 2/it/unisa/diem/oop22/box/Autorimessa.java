package it.unisa.diem.oop22.box;

import it.unisa.diem.oop22.veicoli.Veicolo;

public class Autorimessa extends Box {
  private Veicolo veicoli[];
  private int testa;
  private int coda;
  private int riemp;

  public Autorimessa(int maxPosti, String nome) {
    super(maxPosti, nome);
    testa = 0;
    coda = 0;
    riemp = 0;
    veicoli = new Veicolo[maxPosti];
  }

  private Boolean autorimessaPiena() {
    return riemp == maxPosti;
  }

  private Boolean autorimessaVuota() {
    return riemp == 0;
  }

  public void entra(Veicolo v) {
    if (autorimessaPiena()) {
      System.out.println("L'autorimessa è piena");
      return;
    }
    if (!v.controllaTarga()) {
      System.out.println("Targa non valida, ingresso vietato");
      return;
    }

    veicoli[coda] = v;
    riemp++;
    coda = ++coda % maxPosti;
  }

  public Veicolo esce() {
    if (autorimessaVuota()) {
      System.out.println("L'autorimessa è vuota");
      return null;
    }

    Veicolo v = veicoli[testa];
    veicoli[testa] = null;
    testa = ++testa % maxPosti;
    riemp--;
    return v;
  }

  @Override
  public String toString() {
    String s = super.toString() + "Veicoli presenti: \n";

    int ptr = testa;

    while (ptr != coda) {
      s += veicoli[ptr].toString() + "\n";
      ptr = ++ptr % maxPosti;
    }

    return s;

  }

}
