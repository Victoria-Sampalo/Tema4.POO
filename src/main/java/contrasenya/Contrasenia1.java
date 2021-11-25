/*
 * EJERCICIO. Crear contraseñas aleatorias que  cumpla lo siguiente: 
- 4 numeros (0-9) distintos
-la suma de dígitos 1º y 4º debe ser IMPAR  
-la multiplicación de los digitos 2º y 3º debe ser PAR 
-Letra aleatoria entre (F y X)

TÉCNICA CRIS MODULARIZACIÓN
 */
package contrasenya;

import java.util.Random;

public class Contrasenia1 {

    //MÉTODO PRIVADO PARA GENERAR NÚMEROS ALEATORIOS DE UN RANGO
    private static int numAleatorio(int numMinimo, int numMaximo) {
        //parámetros de entrada, min y maximo
        //parámetro que devuelvo
        //int aleatorio;
        //declaro método random.
        Random mirandom = new Random();
        int aleatorio = mirandom.nextInt(numMaximo - numMinimo + 1) + numMinimo;
        return aleatorio;
    }

    private static char letraAleatoriaFyX() {
        //en char X=88, y=70
        //declaro metodo de clase random
        Random letraRandom = new Random();
        char letraAleatorio = (char) (letraRandom.nextInt(88 - 70 + 1) + 70);
        return letraAleatorio;

    }

    //genero metodo del digito 2
    private static int generarNum2(int num1, int num2) {

        //bucle do para que me compare los números credos con el metodo random
        do {
            //llamo al método random numAleatorio con los parámetros a introducir por orden.
            num2 = numAleatorio(0, 9);
            System.out.println("Contraseña de los 2 primeros digitos\n"
                    + num1 + " " + num2);
        } while (num1 == num2);
        return num2;
    }
    
    //generar el digito 3
    private static int generarNum3 (int num1, int num2, int num3){
        //bucle do para que  se repita la generación del random
      do {
       //llamo al método random
       num3= numAleatorio(0,9);
       System.out.println("Contraseña de los 3 primeros digitos\n"
                    + num1 + " " + num2 + " " + num3);
       
      } while ((num3==num1)||(num3== num2));
      return num3;
    }
    
    //generar el digito 4
    
    private static int generarNum4 (int num1, int num2, int num3, int num4){
    
      do{
         num4 = numAleatorio(0,9);
          System.out.println("Contraseña de los 4 primeros digitos\n"
                    + num1 + " " + num2 + " " + num3 + " "  + num4);
      
      }while ((num4==num3)|| (num4==num2) || (num4==num1));
      
      return num4;
    
    
    }

    public static void main(String[] args) {
        //VARIABLES A USAR 
        int num1, num2 = 0, num3 = 0, num4 = 0;
        char letra;
        
        //GENERO LOS DÍGITOS LLAMANDO A LOS RESPECTIVOS MÉTODOS CON 
        //SUS RESPECTIVOS PARÁMETROS DE ENTRADA
        
        num1= numAleatorio(0,9);
        System.out.println("-------------------");
        num2= generarNum2(num1, num2);
        System.out.println("-------------------");
        num3 =generarNum3(num1, num2, num3);
        System.out.println("-------------------");
        num4=generarNum4(num1, num2, num3, num4);
        System.out.println("-------------------");
        
        //llamo al método generarletra
        
        letra=letraAleatoriaFyX();
        
        System.out.println("La letra es: " + letra + "\n-------------------");
        
        //COMPROBAMOS LAS CONDICIONES 
        
          if ((num1 + num4) % 2 != 0) {
            if ((num2 * num3) % 2 == 0) {
            } else {
                do {
                    num2 = generarNum2(num1, num2);
                    System.out.println("-------------------");
                    num3 = generarNum3(num1, num2, num3);
                } while ((num2 * num3) % 2 == 0);
            }
        } else {
            do {
                num1 = numAleatorio(0, 9);
                num4 = generarNum4(num1, num2, num3, num4);
            } while ((num1 + num4) % 2 != 0);
        }

        System.out.println("La contraseña final es: " + num1 + "" + num2 + "" + num3 + "" + num4 + "" + letra);
        
        
    }

}
