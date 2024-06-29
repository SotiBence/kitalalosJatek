package main;

public class Jatek {

    void start() {
        Jatekos jatekos1 = new Jatekos();
        Jatekos jatekos2 = new Jatekos();
        System.out.println("jatekos1.tipp: " + jatekos1.tipp);
        jatekos1.tipp = 7;
        System.out.println("tippelés után --> jatekos1.tipp: " + jatekos1.tipp);
    }
}
