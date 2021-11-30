/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionc;

import java.util.Scanner;

/**
 *
 * @author victoria
 */
public class TestCancion {

    public static void main(String[] args) {

        String cancion = "";
        String autor = "";

        Cancion song1 = new Cancion("tengo la programación negra", "juanes");

        //PRUEBO SET Y GET
        System.out.println("La canción es " + song1.getTitulo()
                + " y su autor " + song1.getAutor());
        //ME FALTA EL SET Y LO PRUEBO
        //PRUEBO EL MÉTODO STRING
        System.out.println("La canción es " + song1.toString());
        
     
     
    }

}
