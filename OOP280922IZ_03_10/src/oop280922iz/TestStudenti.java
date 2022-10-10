package oop280922iz;

import it.unisa.diem.oop.persone.Studente;

public class TestStudenti {

  /**
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Studente s1, s2, s3;

    System.out.println(Studente.getContatore());
    s1 = new Studente("Mario", "Rossi");
    System.out.println(Studente.getContatore());
    s2 = new Studente("Luigi", "Bros");
    System.out.println(Studente.getContatore());
    s3 = new Studente("Gigi", "Verdi");
    System.out.println(Studente.getContatore());

    s1.stampaInfo();
    s2.stampaInfo();
    s3.stampaInfo();
  }

}
