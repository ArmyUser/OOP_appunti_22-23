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
public class Studente extends Persona {

    private String matricola;
    private static int contatore = 0;

    public Studente(String nome, String cognome, String codFiscale, String matricola) {
        super(nome, cognome, codFiscale);
        this.matricola = matricola;
    }

    public Studente(String nome, String cognome, String codFiscale) {
        this(nome, cognome, codFiscale, "06127000" + contatore);
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

    @Override
    public String toString() {
        return super.toString() + "Matricola: " + matricola + "\n";
    }
}
