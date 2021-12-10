/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionc.Ej4.Ej5;

/**
 *
 * @author victoria
 */
public class TestPuntoGeometrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        PuntoGeometrico punto1=new PuntoGeometrico();
        PuntoGeometrico punto2 = new PuntoGeometrico (4,5);
        //modifico la x e imprimo punto1
        punto1.setX(2);
        System.out.println(punto1);
        
        //imprimo punto2
        System.out.println(punto2);
        
        
        
        
    }
    
}
