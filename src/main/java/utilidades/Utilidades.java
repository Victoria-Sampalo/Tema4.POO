/*
 *EJERCICIO CLASE, MARTES 23.11.
UTILIZANDO LOS MÉTODOS, GENERA UN NÚMERO ALEATORIO SOLICITANDO LOS PARÁMETROS 
POR TECLADO.
 */
package utilidades;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Utilidades {

    //MÉTODO ALEATORIO
    public int rangoAleatorio(int numMinimo, int numMaximo) {
        int aleatorio = 0;

        Random numAleatorio = new Random();

        aleatorio = numAleatorio.nextInt(numMaximo - numMinimo + 1) + numMinimo;

        return aleatorio;
    }

    //MÉTODO SCANNER
    //Metodo privado el cual lee los datos por scanner 
    //y controla excepciones(que no se introduzca números en los nextInt())
    public int leerDatos() {
        //pista, boleana que controle el try catch InputMismatchException ime
        Scanner sc = new Scanner(System.in);

        int numero=0;
        boolean pedirDato = true;

        do {

            try {//si pasa esto
                //System.out.println("Introduce un número");
                numero = sc.nextInt();
                //(si está bien que no me pida el dato), pero si se equivoca.
                pedirDato = false;
            } catch (InputMismatchException ime) {
                System.out.println("Se ha introducido un carácter erróneo, inténtalo de nuevo");
                //limpio buffer
                sc.nextInt();
            }
            

        } while (pedirDato);

        return numero;
    }

}
