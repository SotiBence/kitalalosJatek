package main;

public class JatekIndito {

    public static void main(String[] args) {
        
        /* Példányosítjuk a Jatek osztály egy objektumát */
        
        /* nem adunk referenciát az objektumra, azaz
        nem érhető el az az objektum, de 
        létezik a memóriában:
        */
        new Jatek().start();
        
        /* példányosítás után adtunk referenciát az objektumra, 
        majd az objektum metódusát meghívjuk: */
        //Jatek jatek = new Jatek();
        //jatek.start();
        
        /* ha az osztály metódusa static, akkor nincs példányosítás és
        az osztály nevével hivatkozunk a static metódusára:
        */
        //Jatek.start();
    }
}
