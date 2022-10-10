package oop280922iz;

import it.unisa.diem.oop.persone.Docente;
import it.unisa.diem.oop.persone.Persona;
import it.unisa.diem.oop.persone.Studente;

public class TestPersona {

  public static void main(String[] args) {

    Persona p = new Persona("Mario", "Rossi", "MRRRSS01");
    Docente d = new Docente("Paolo", "Rossi", "PRRRSS02", "OOP");
    Studente s = new Studente("Ernesto", "Rossi", "ERRRSS03");

    // nel caso generale, toString (ereditato dalla classe generale Object)
    // restituisce
    // una stringa del tipo 'nomeClasse@hexCode', dove:
    // - nomeClasse è ottenuta con getClass().getName() e contiene anche il nome del
    // package
    // - hexCode è la rappresentazione esadecimale della classe (con attributi etc)

    // della classe toString è però generalmente fatto l'override, così da ottenere
    // una stringa
    // contenente informazioni più rilevanti

    System.out.println(p);
    System.out.println(d);
    System.out.println(s);

    // se istanzio una sottoclasse come superclasse sto effettuando un UPCAST
    // è una cosa che si può fare; è lecita, ma limita i metodi che posso utilizzare
    // infatti saranno utilizzabili SOLO i metodi di Persona (nel caso in esame) e
    // non
    // quelli di Studente
    Persona p1 = new Studente("Studente1", "Studente Upcast", "STDUP09G");

    // Per la questione del LateBinding, ovvero in questo caso viene recuperato il
    // metodo
    // implementato in Studente e NON quello in persona.
    // in questo caso, infatti, il print MOSTRA la matricola (usa quindi il
    // toString() di Studente)
    // mentre non potremmo usare metodi che sono definiti in Studente e non in
    // Persona
    // come, ad esempio, getMatricola(), che restituirebbe errore.
    System.out.println(p1);

  }

}
