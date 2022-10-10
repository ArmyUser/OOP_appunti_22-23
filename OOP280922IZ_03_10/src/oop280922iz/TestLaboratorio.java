package oop280922iz;

import it.unisa.diem.oop.spazi.Laboratorio;
import it.unisa.diem.oop.persone.Studente;

public class TestLaboratorio {

  public static void main(String args[]) {

    Laboratorio lab;
    Studente s1, s2, s3;

    s1 = new Studente("Ale", "Pol");
    s2 = new Studente("Sars", "imp");
    s3 = new Studente("simo", "mastro");

    lab = new Laboratorio(5);

    lab.entra(s1);
    lab.entra(s2);
    lab.entra(s3);

    lab.stampaStudenti();

    lab.esce();

    System.out.println("ao ho appena tolto ale polv");

    lab.stampaStudenti();

  }

}
