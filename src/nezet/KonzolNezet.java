package nezet;

import java.util.Scanner;

public class KonzolNezet {
    private static final Scanner sc = new Scanner(System.in);
    
    public String bekeresNev(){
        konzolKiir("Mi a neved?:" );
        return sc.next();
    }
    
    public int bekeresKor(){
        konzolKiir("Hány éves vagy?: ");
        return sc.nextInt();
    }
    
    public String bekeresNyelvek(){
            konzolKiir("Milyen nyelven/nyelveken beszélsz?(ha nincs, húzd ki: - ): ");
            String szoveg = sc.next();
            if("-".equals(szoveg)){
                return "";
            }else{
                return szoveg;
            }
    }
    
    public void konzolKiir(String szoveg){
        System.out.println(szoveg);
    }
    
    public boolean szulinap(){
        konzolKiir("Szülinapod volt?(igen/nem): ");
        String szoveg = sc.next();
        return "igen".equals(szoveg);
    }
    
    public void bemutatkozas(String nev, int kor, String nyelvek){
        konzolKiir("A nevem: " + nev + ", " + kor +" éves vagyok.");
        konzolKiir("A következő nyelveken beszélek: " + nyelvek);
    }
}
