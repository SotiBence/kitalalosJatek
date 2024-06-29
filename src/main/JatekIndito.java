package main;

public class JatekIndito {

    public static void main(String[] args) {
        
        /* Példányosítjuk a Jatek osztály egy objektumát */
        
        /* nem adunk referenciát az objektumra, azaz
        nem érhető el az az objektum, de 
        létezik a memóriában:
        */
        //new TippelosJatek().start();
        
        /* példányosítás után adtunk referenciát az objektumra, 
        majd az objektum metódusát meghívjuk: */
        //Jatek jatek = new Jatek();
        //jatek.start();
        
        /* ha az osztály metódusa static, akkor nincs példányosítás és
        az osztály nevével hivatkozunk a static metódusára:
        */
        //Jatek.start();
        
        /* Meglévő osztály típusok használata: */
//        TippelosJatek tippelos = new TippelosJatek();
//        tippelos.start();
//        
//        CsigaVersenyJatek csigas = new CsigaVersenyJatek();
//        csigas.indito();
        
        /* Öröklődés és polimorfizmus bemutatása: */
        Jatek jatek = null;
        jatek = new TippelosJatek();
        ((TippelosJatek)jatek).start();
        
        jatek = new CsigaVersenyJatek();
        ((CsigaVersenyJatek)jatek).indito();
    }
}
