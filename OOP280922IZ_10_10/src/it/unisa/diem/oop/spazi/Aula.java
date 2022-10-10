/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.oop.spazi;

import it.unisa.diem.oop.persone.Persona;

/**
 *
 * @author lucagreco
 */
public class Aula extends Spazio {

    private Persona persone[];
    private int posizioneLibera;

    public Aula(int maxPosti, String nome) {
        super(maxPosti, nome);
        persone = new Persona[maxPosti];
        posizioneLibera = 0;
    }

    public boolean aulaVuota() {

        return posizioneLibera == 0;

    }

    public boolean aulaPiena() {

        return posizioneLibera == maxPosti;

    }

    @Override
    public void entra(Persona s) {

        if (aulaPiena()) {

            System.out.println("L'aula è piena.");
            return;

        }

        persone[posizioneLibera] = s;
        posizioneLibera++;

    }

    @Override
    public Persona esce() {

        if (aulaVuota()) {

            System.out.println("L'aula è vuota");
            return null;

        }

        posizioneLibera--;

        Persona s = persone[posizioneLibera];

        persone[posizioneLibera] = null;

        return s;

    }

    @Override
    public String toString() {
        String s = super.toString() + "\n";

        for (int i = 0; i < posizioneLibera; i++) {
            s += persone[i].toString() + "\n";
        }
        return s;
    }

}
