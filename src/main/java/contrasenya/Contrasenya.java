/*
 *
 */
package contrasenya;

import java.lang.reflect.Array;
import java.util.Random;

public class Contrasenya {

    public static void main(String[] args) {
     //--------VARIABLES ----------
     int num1, num2, num3, num4;
     int numUsados;
     //OBJETO CLASE DE TIPO RANDOM.
     
     Random numAleatorio = new Random(); 
   // do{
   //bucle for para que me genere número del 0 al 9
   //  for(int i=0; i<5; i++){}
         //para obtener un número aleatorio del 0 al 9
         System.out.println(numAleatorio.nextInt(10));
         //creo un listado de números que ya haya sido utilizados y los meto en un array
        
      /*  // Declaración de una variable array de tipo char
        char[] arrayChar;
        arrayChar = s2.toCharArray();
        // El atributo length existe en todos los arrays y 
        // me indica su tamaño. Equivalente al método length()
        // de los String
        for (int i = 0; i < arrayChar.length; i++) {
            // Para acceder a cada posición del array uso
            // los corchetes
            System.out.println("Posición i = " + i
                    + " contenido = " + arrayChar[i]);
        }
     
     */
     
      //Declaración de nu array para que controle que no se repitan los números, tipo Int
      int[] arrayInt;
      arrayInt = numAleatorio;
      
    // }while ();
        
        
        
        
        
        
        
        
    }
    
}
