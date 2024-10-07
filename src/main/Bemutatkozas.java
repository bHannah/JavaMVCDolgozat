package main;

import modell.Ember;
import nezet.KonzolNezet;
import vezerlo.KonzolVezerlo;

public class Bemutatkozas {

    public static void main(String[] args) {
        KonzolNezet nezet = new KonzolNezet();
        Ember modell = new Ember(nezet.bekeresNev(), nezet.bekeresKor(), nezet.bekeresNyelvek());
        KonzolVezerlo vezerlo = new KonzolVezerlo(modell, nezet);
    }
    
}
