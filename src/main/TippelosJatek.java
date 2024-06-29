package main;

import java.util.Random;

public class TippelosJatek extends Jatek{

    /* ADATTAGOK */
    private static Random rnd = new Random();
    public static final int MAX_TIPP = 10;
    
    private Jatekos jatekos1, jatekos2, jatekos3;
    
    /* TAGFÜGGVÉNYEK */
    public void start() {
        System.out.printf("Gondoltam egy számra, 0..%d között...%n", TippelosJatek.MAX_TIPP-1);
        int szam = TippelosJatek.rnd.nextInt(TippelosJatek.MAX_TIPP);
        
        /* a játékos példányok csak itt érhetőek el, a start-on kívül már nem: */
//        Jatekos jatekos1 = new Jatekos();
//        Jatekos jatekos2 = new Jatekos();
//        Jatekos jatekos3 = new Jatekos();

        /* így már a filedeket minden metódus eléri: */
        jatekos1 = new Jatekos();
        jatekos2 = new Jatekos();
        jatekos3 = new Jatekos();
        
        boolean vanTalalat;
        boolean talalt1, talalt2, talalt3;
        do {
            System.out.println("A kitalálandó szám: " + szam);
        
            /* HIBA: minden körben új Jatekos jön létre, 
            illetve a new művelet minden körben lefut, de ez "drága": */
//            Jatekos jatekos1 = new Jatekos();
//            Jatekos jatekos2 = new Jatekos();
//            Jatekos jatekos3 = new Jatekos();

            /* a játék menete, amíg vaki(k) nem talál */
            /* ez NEM OOP megközelíatés: */
            //int tipp1 = jatekos1.tippel();

            /* OOP szemlélettel, adatrejtés neélkül: */
            jatekos1.tippel();
            //int tipp1 = jatekos1.tipp;
            
            /* OOP szemlélettel, adatrejtéssel: */
            int tipp1 = jatekos1.lekerdezTipp();

            jatekos2.tippel();
            int tipp2 = jatekos2.lekerdezTipp();
            jatekos3.tippel();
            int tipp3 = jatekos3.lekerdezTipp();

            /* +1 tippet kérek az adott játékostól: */
            //int tipp1 = jatekos1.tippel();

            System.out.println("1. játékos tippje: " + tipp1);
            System.out.println("2. játékos tippje: " + tipp2);
            System.out.println("3. játékos tippje: " + tipp3);
            talalt1 = tipp1 == szam;
            talalt2 = tipp2 == szam;
            talalt3 = tipp3 == szam;
            vanTalalat = talalt1 || talalt2 || talalt3;
            if(!vanTalalat){
                System.out.println("A játékosok újra próbálkoznak!");
            }
        } while (!vanTalalat);
        
        System.out.println("Van nyertes!");
        System.out.println("1. játékos tippje? " + talalt1);
        System.out.println("2. játékos tippje? " + talalt2);
        System.out.println("3. játékos tippje? " + talalt3);
        
        System.out.println("A játék vége!");
    }
}
