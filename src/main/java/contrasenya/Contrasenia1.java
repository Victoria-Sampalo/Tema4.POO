/*
 * 
 */
package contrasenya;

import java.util.Random;


public class Contrasenia1 {

    
    public static void main(String[] args) {
        
     int num1, num2, num3, num4;
     int numUsados;
     //OBJETO CLASE DE TIPO RANDOM.
     
     Random numAleatorio = new Random();     
     
     do{
      //Guardo cada num aleatorio con el método randon aleatorio
      System.out.println(numAleatorio.nextInt(10));
      
      num1 = numAleatorio.nextInt(10);
      num2 = numAleatorio.nextInt(10);
      num3 = numAleatorio.nextInt(10);
      num4 = numAleatorio.nextInt(10);
      
     }while (!(num1!=num2)&& (num3 !=num4));
        
      
        
        
    }
    
}
