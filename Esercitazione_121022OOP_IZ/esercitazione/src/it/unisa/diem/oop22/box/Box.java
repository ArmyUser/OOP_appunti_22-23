package it.unisa.diem.oop22.box;

import it.unisa.diem.oop22.veicoli.Veicolo;

public abstract class Box {
  public int maxPosti;
  private String nome;

  public Box(int maxPosti, String nome) {
    this.maxPosti = maxPosti;
    this.nome = nome;
  }

  abstract void entra(Veicolo v);

  abstract Veicolo esce();

  @Override
  public String toString() {
    return "Nome Box = " + nome + " , Capienza = " + maxPosti + "\n";
  }

}
