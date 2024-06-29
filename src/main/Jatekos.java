package main;

import java.util.Random;

public class Jatekos {
    int tipp;
    
    void tippel(){
        tipp = new Random().nextInt(10);
        System.out.println("tippelésem: " + tipp);
    }
}
