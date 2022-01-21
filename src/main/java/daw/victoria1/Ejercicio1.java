/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.victoria1;

/**
 *Escribe un programa que muestre cada elemento de 
 * un array de enteros y sume todos sus elementos. 
 * Instancia e inicializa el array en el programa, 
 * sin leer nada por teclado, con los siguientes 
 * valores {1, 2, 3, 4, 5, 6}.

 * @author victoria
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int[] numero= {1,2,3,4,5,6};
       int suma=0;
       for (int i=0; i<numero.length; i++){
           System.out.println("Numero["+ i+ "] es "+ numero[i]);
       
       }
       
       for (int i=0; i<numero.length; i++){
           //el valor de suma, es el valor de suma mas i
           suma+=numero[i];
           System.out.println(suma);
       }
       
       
    //https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-arrays-de-java/   
           
       
        
    }
    
}
