package main;

import java.util.Random;

public class Jatek {

    void start() {
        System.out.println("Gondoltam egy számra, 0..9 között...");
        int szam = new Random().nextInt(10);//0..9
        System.out.println("A kitalálandó szám: " + szam);
        
        Jatekos jatekos1 = new Jatekos();
        Jatekos jatekos2 = new Jatekos();
        Jatekos jatekos3 = new Jatekos();
        
        /* a játék menete, amíg vaki(k) nem talál */
    }
}
