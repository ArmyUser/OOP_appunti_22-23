package oop280922iz;

public class TestStudenti {

  /**
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Studente s1, s2, s3;

    System.out.println(Studente.getContatore());
    s1 = new Studente("Mario", "Rossi", "47326487236");
    System.out.println(Studente.getContatore());
    s2 = new Studente("Luigi", "Bros", "47386487326578246");
    System.out.println(Studente.getContatore());
    s3 = new Studente("Gigi", "Verdi", "457386857365863485623");
    System.out.println(Studente.getContatore());

    s1.stampaInfo();
    s2.stampaInfo();
    s3.stampaInfo();
  }

}
