/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relC.Ej4.Ej6;

/**
 *
 * @author Victoria
 */
public class TestPuntoYLinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //creo objeto con constructor vacio
        PuntoGeometrico puntoA = new PuntoGeometrico();
        //defino las coordenadas.
        puntoA.setX(2);
        puntoA.setY(4);
        System.out.println(puntoA);
        
        PuntoGeometrico puntoB= new PuntoGeometrico();
        
        
       
        //creo objeto de linea
        Linea linea1 = new Linea(puntoA, puntoB);
        System.out.println(linea1);
        
        //pruebo los métodos creados
        
        linea1.mueveDerecha(2);
        System.out.println(linea1);
        
        
      
        
      
    }
    
}
