package it.unisa.diem.oop.spazi;

import it.unisa.diem.oop.persone.Studente;

public class Aula {

  // private int maxPosti;
  public final int maxPosti; // espone la variabile come costante, in sola lettura
  private Studente studenti[];
  private int posLibera;

  public Aula(int maxPosti) {
    this.maxPosti = maxPosti;
    this.studenti = new Studente[maxPosti];
    this.posLibera = 0;
  }

  public int getMaxPosti() {
    return this.maxPosti;
  }

  public Studente[] getStudenti() {
    return this.studenti;
  }

  public boolean isEmpty() {
    return posLibera == 0;
  }

  public boolean isFull() {
    return posLibera == maxPosti;
  }

  public void addStudente(Studente studente) {
    if (isFull()) {
      System.out.println("L'aula è piena!");
      return;
    }
    studenti[posLibera] = studente;
    posLibera++;

  }

  public Studente remStudente() {
    if (isEmpty()) {
      System.out.println("L'aula è vuota!");
      return null;
    }
    posLibera--;
    Studente stud = studenti[posLibera];
    studenti[posLibera] = null;
    return stud;
  }

}
