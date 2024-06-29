package main;

import java.util.Random;

public class Jatekos {
    int tipp;
    
    int tippel(){
        int tipp = new Random().nextInt(10);
        System.out.println("tippelésem: " + tipp);
        return tipp;
    }
}
