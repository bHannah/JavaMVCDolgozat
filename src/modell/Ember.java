package modell;

public class Ember {
    //adattagok
    String nev;
    int kor;
    String nyelvek;
    //konstruktor

    public Ember(String nev, int kor) {
        this(nev, kor, "-");
    }
    
    public Ember(String nev, int kor, String nyelvek) {
        this.nev = nev;
        this.kor = kor;
        this.nyelvek = nyelvek;
    }
    
    //tagfüggvények
    public void oregedes(boolean oregedett){
        this.kor += 1;
    }
    
    public void nyelvHozzaadas(String szoveg){
        nyelvek += szoveg + ", ";
    }
    
    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }
    
    public String getNyelvek() {
        return nyelvek;
    }
    
}
