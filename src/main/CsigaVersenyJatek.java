package main;

import java.util.Random;

public class CsigaVersenyJatek extends Jatek{
    
    private static final Random rnd = new Random();
    private Csiga[] csigak;
    
    public CsigaVersenyJatek(){
        csigak = new Csiga[3];
    }
    
    @Override
    public void start(){
        System.out.println("Csigaverseny elindult...");
        Csiga cs1 = new Csiga("P");
        cs2 = new Csiga("K");
        cs3 = new Csiga("Z");
    }
}
