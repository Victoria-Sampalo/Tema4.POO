/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cancion;

import java.util.Scanner;

/**
 *
 * @author victoria
 */
public class TestCancion {

    
    public static void main(String[] args) {
      
     String cancion = "";
     String autor = "";
     
     Cancion song1 = new Cancion(cancion, autor);
     
     //método scanner para meter los datos por teclado
         Scanner sc = new Scanner(System.in);
         
         //PRUEBO SET Y 
         //PRUEBO EL MÉTODO STRING
        System.out.println("La canción es "+ song1.toString());
        System.out.println("El autor es " + song1.toString());
     
     /*song1.setAutor(autor);
     
     song1.setTitulo(autor);
    */
     /*
         CajaCarton cajaGrande = new CajaCarton(500, 250, 400, 200);
        CajaCarton cajaChica = new CajaCarton(15, 25, 30, 17);

        System.out.println("Caja chica " + cajaChica.toString());
        System.out.println("--------------------");
        System.out.println("Caja grande " + cajaGrande.toString());
     */
       
        
        
    }
    
}
