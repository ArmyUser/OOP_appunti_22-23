package it.unisa.diem.oop.spazi;

import it.unisa.diem.oop.persone.Studente;

public class Laboratorio {

  private Studente studenti[];
  private final int maxPosti;
  private int testa;
  private int coda;
  private int riemp;

  public Laboratorio(int maxPosti) {
    this.maxPosti = maxPosti;
    testa = 0;
    coda = 0;
    riemp = 0;
    studenti = new Studente[maxPosti];
  }

  public boolean isEmpty() {
    return riemp == 0;
  }

  public boolean isFull() {
    return riemp == maxPosti;
  }

  public void entra(Studente s) {

    if (isFull()) {
      System.out.println("Il laboratorio è pieno!");
      return;
    }

    studenti[coda] = s;
    riemp++;
    coda = ++coda % maxPosti;
  }

  public Studente esce() {

    if (isEmpty()) {
      System.out.println("Il laboratorio è vuoto!");
      return null;
    }

    Studente s = studenti[testa];
    studenti[testa] = null;
    testa = ++testa % maxPosti;
    riemp--;

    return s;
  }

  public void stampaStudenti() {

    int printPos = testa;

    while (printPos != coda) {
      studenti[printPos].stampaInfo();
      printPos = ++printPos % maxPosti;
    }
  }

}
