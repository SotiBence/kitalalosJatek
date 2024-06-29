package main;

import java.util.Random;

public class Jatekos {
    /* ADATTAGOK */
    static Random rnd = new Random();
    
    int tipp;
    
    /* TAGFÜGGVÉNYEK */
    void tippel(){
        tipp = rnd.nextInt(Jatek.MAX_TIPP);
        System.out.println("tippelésem: " + tipp);
    }
}
