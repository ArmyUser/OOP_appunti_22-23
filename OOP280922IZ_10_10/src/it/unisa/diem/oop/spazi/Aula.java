/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.spazi;

import it.unisa.diem.oop.persone.Studente;

/**
 *
 * @author lucagreco
 */
public class Aula {
    
    public final int maxPosti;
    private Studente studenti[];
    private int posizioneLibera;

    public Aula(int maxPosti) {
        this.maxPosti = maxPosti;
        this.posizioneLibera = 0;
        studenti = new Studente[maxPosti];
        
    }
    
    
    public boolean aulaVuota() {
    
        return posizioneLibera == 0;
    
    }
    
    public boolean aulaPiena() {
    
        return posizioneLibera == maxPosti;
    
    
    }
    
    
    public void entra(Studente s) {
        
        if(aulaPiena()) {
        
            System.out.println("L'aula è piena.");
            return;
        
        }
        
        studenti[posizioneLibera] = s;
        posizioneLibera++;
        
    
    }
    
    public Studente esce() {
    
        if(aulaVuota()) {
        
            System.out.println("L'aula è vuota");
            return null;
            
        }
        
        
        posizioneLibera--;
        
        Studente s = studenti[posizioneLibera];
        
        studenti[posizioneLibera] = null;
        
        return s;
    
        
    
    }
    
    public void stampaStudentiInAula() {
    
    
        for(int i = 0; i < posizioneLibera; i++) {
        
        
            studenti[i].stampaInfo();
        
        }
    
    
    }
    
    
}
