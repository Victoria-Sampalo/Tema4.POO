/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Random;

/**
 *
 * @author Victoria
 */
public class Aleatorio {

    /*
     Crea un proyecto nuevo llamado Utilidades, con un paquete llamado daw.utilidades. 
    Dentro de este paquete crea una clase llamada Aleatorios, con los siguientes métodos estáticos:
       Un método llamado enteroAleatorio(), que devuelva un entero aleatorio entre Integer.MAX_VALUE e Integer.MIN_VALUE.
    Un método llamado enteroRango(int min, int max) que devuelva un número entero aleatorio entre min y max, ambos incluidos. Min y max deben ser enteros positivos.
    Un método llamado letraMinuscula(), que devuelva una letra minúscula entre ‘a’ y y ‘z’.
    Un método llamado letraMayúscula(), que devuelva una letra mayúscula entre ‘A’ y y ‘Z’.

    */
    //MÉTODO ALEATORIO
    public static int enteroRango(int numMinimo, int numMaximo) {
        if (numMinimo > numMaximo) {
            throw new IllegalArgumentException("Número del rango definido como minimo " + numMinimo + " es mayor que el máximo " + numMaximo);
        }
        return (int) ((long) numMinimo + Math.random() * ((long) numMaximo - numMinimo + 1));
    }

    //    public static int enteroAleatorio(int numMinimo, int numMaximo){
    //    
    //    
    //    enteroAleatorio(Integer.MIN_VALUE, Integer.MAX_VALUE); 
    //     return enteroAleatorio;       
    //    }
    
    
    //Un método llamado letraMinuscula(), que devuelva una letra minúscula entre ‘a’ y y ‘z’.
    
    
    
    
    
    //Un método llamado letraMayúscula(), que devuelva una letra mayúscula entre ‘A’ y y ‘Z’.
}
