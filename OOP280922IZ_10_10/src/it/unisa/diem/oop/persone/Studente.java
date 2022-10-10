/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.persone;

/**
 *
 * @author lucagreco
 */
public class Studente {
    
    private String matricola;
    private String nome;
    private String cognome;
    private static int contatore = 0;
    
    
    
    

    public Studente(String matricola, String nome, String cognome) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        contatore++;
        
    }

    public Studente(String nome, String cognome) {
     
        this("06127000" + contatore, nome, cognome);
        
    }
    
  
    
    
    
    public static int getContatore() { 
    
        return contatore;
    
    }
    

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String m) {
        matricola = m;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    
    
    
    public void stampaInfo() {
    
        System.out.println("***");
        
        System.out.print("Nome: ");
        System.out.println(nome);
        
        System.out.print("Cognome: ");
        System.out.println(cognome);
        
        System.out.print("Matricola: ");
        System.out.println(matricola);
    
    
    
    }
    
    
    
}
