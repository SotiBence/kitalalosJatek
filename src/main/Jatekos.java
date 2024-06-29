package main;

import java.util.Random;

public class Jatekos {
    /* ADATTAGOK */
    private static Random rnd = new Random();
    
    private int tipp;
    
    /* TAGFÜGGVÉNYEK */
    public void tippel(){
        tipp = rnd.nextInt(Jatek.MAX_TIPP);
        System.out.println("tippelésem: " + tipp);
    }
}
