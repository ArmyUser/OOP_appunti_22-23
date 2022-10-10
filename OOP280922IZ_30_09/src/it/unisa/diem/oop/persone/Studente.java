package it.unisa.diem.oop.persone;

public class Studente {

  private String matricola;
  private String nome;
  private String cognome;

  private static int contatore = 0;

  public Studente(String nome, String cognome, String matricola) {
    this.matricola = matricola;
    this.nome = nome;
    this.cognome = cognome;

    contatore++;
  }

  public Studente(String nome, String cognome) {
    this(nome, cognome, "06127000" + contatore);
  }

  public static int getContatore() {
    return contatore;
  }

  public String getMatricola() {
    return this.matricola;
  }

  public void setMatricola(String matricola) {
    this.matricola = matricola;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCognome() {
    return this.cognome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public void stampaInfo() {
    System.out.println("***");
    System.out.println("Nome: " + this.nome);
    System.out.println("Cognome: " + this.cognome);
    System.out.println("Matricola: " + this.matricola);
    System.out.println("***");
  }

}
