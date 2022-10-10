package it.unisa.diem.oop.spazi;

import it.unisa.diem.oop.persone.Persona;

public abstract class Spazio {

  public final int maxPosti;
  private String nome;

  public Spazio(int maxPosti, String nome) {
    this.maxPosti = maxPosti;
    this.nome = nome;
  }

  public abstract void entra(Persona p);

  public abstract Persona esce();

  @Override
  public String toString() {
    return "###\n" + "Nome: " + nome + "\nPosti occupabili: " + maxPosti + "\n";
  }

}
