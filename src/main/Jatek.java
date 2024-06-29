package main;

import java.util.Random;

public class Jatek {

    void start() {
        System.out.println("Gondoltam egy számra, 0..9 között...");
        int szam = new Random().nextInt(10);//0..9
        
        boolean vanTalalat;
        boolean talalt1, talalt2, talalt3;
        do {
            System.out.println("A kitalálandó szám: " + szam);
        
            Jatekos jatekos1 = new Jatekos();
            Jatekos jatekos2 = new Jatekos();
            Jatekos jatekos3 = new Jatekos();

            /* a játék menete, amíg vaki(k) nem talál */
            /* ez NEM OOP megközelíatés: */
            //int tipp1 = jatekos1.tippel();

            /* OOP szemlélettel: */
            jatekos1.tippel();
            int tipp1 = jatekos1.tipp;

            jatekos2.tippel();
            int tipp2 = jatekos2.tipp;
            jatekos3.tippel();
            int tipp3 = jatekos3.tipp;

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
