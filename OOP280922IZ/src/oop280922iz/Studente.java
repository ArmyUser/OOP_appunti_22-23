package oop280922iz;

public class Studente {

  private String matricola;
  private String nome;
  private String cognome;

  public Studente(String matricola, String nome, String cognome) {
    this.matricola = matricola;
    this.nome = nome;
    this.cognome = cognome;
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
