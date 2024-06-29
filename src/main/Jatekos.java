package main;

import java.util.Random;

public class Jatekos {
    /* ADATTAGOK */
    private static Random rnd = new Random();
    
    private int tipp;
    
    /* TAGFÜGGVÉNYEK */
    //beállító:
    public void tippel(){
        tipp = rnd.nextInt(Jatek.MAX_TIPP);
        System.out.println("tippelésem: " + tipp);
    }
    
    //lekérdező:
    public int lekerdezTipp(){
        return tipp;
    }
}
