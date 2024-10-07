/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import modell.Ember;
import nezet.KonzolNezet;

/**
 *
 * @author both.orsolya
 */
public class KonzolVezerlo {
    private Ember ember;
    private KonzolNezet nezet;

    public KonzolVezerlo(Ember ember, KonzolNezet nezet) {
        this.ember = ember;
        this.nezet = nezet;
        start();
    }
    
    private void start(){
        nezet.bemutatkozas(ember.getNev(), ember.getKor(), ember.getNyelvek());
        ember.nyelvHozzaadas(nezet.bekeresNyelvek());
        ember.oregedes(nezet.szulinap());
        nezet.bemutatkozas(ember.getNev(), ember.getKor(), ember.getNyelvek());
    }
}
