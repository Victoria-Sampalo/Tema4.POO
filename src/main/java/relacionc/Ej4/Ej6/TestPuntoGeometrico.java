/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionc.Ej4.Ej6;

/**
 *
 * @author victoria
 */
public class TestPuntoGeometrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo p1 dandole el valor
        PuntoGeometrico punto1=new PuntoGeometrico(2,1);
        
        //P2 que coja los valores por defecto del constructor parametrizado
        PuntoGeometrico punto2 = new PuntoGeometrico ();
        
        
        //modifico la x e imprimo punto1
        punto1.setX(2);
        System.out.println("1: "+ punto1.toString());
        
        //imprimo punto2
        System.out.println("2: "+punto2.toString());
        
        //creo objeto de clase linea con dichos dos puntos
        Linea linea1 = new Linea (puntoA, puntoB); 
        
        System.out.println(linea1.toString());
        
        
        /*
         PuntoGeometrico prueba1 = new PuntoGeometrico(1, 1);
        PuntoGeometrico prueba2 = new PuntoGeometrico();
        Linea linea = new Linea(prueba2, prueba1);
        System.out.println(prueba1.toString());
        prueba1.setX(4);
        System.out.println(prueba1.toString());
        System.out.println(prueba2);
        System.out.println("------------------");
        System.out.println(linea.mostrarLinea());
        */
        
        
    }
    
}
