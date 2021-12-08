/*
 *
 */
package relacionc;


public class TestCafetera {

    
    public static void main(String[] args) {
        Cafetera c1= new Cafetera(8);
        System.out.println(c1);
        
        Cafetera c2 = new Cafetera ();
        System.out.println(c2);
                
        Cafetera c3= new Cafetera (100, 200);
        System.out.println(c3); //da 100 y 100
                
        c2.llenarCafetera();
        System.out.println(c2);
        
        c2.servirTaza(500);
        System.out.println("Despues de servir "+ c2);
        
        c2.servirTaza(502);
        System.out.println("Despues de servir la segunda vez, me quedan "+ c2);
        
        System.out.println("Cafetera 3 tiene: "+ c3);
        
        c2.llenarCafetera();
        System.out.println("La cafetera 2 tiene " +c2);
        
        c2.vaciarCafetera();
        System.out.println("Si vacío la cafetera, entonces "+ c2);
        
        
        //creo nueva cafetera c4
        Cafetera c4 = new Cafetera();
        c4.agregarCafe(500);
        System.out.println(c4);
        c4.agregarCafe(600);
        System.out.println(c4);
        System.out.println("La cantidad actual es" + c4.getCantidadActual());
        
        c4.vaciarCafetera();
        System.out.println(c4);
    }
    
    
    
    
}
