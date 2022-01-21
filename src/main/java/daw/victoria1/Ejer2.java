/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.victoria1;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Ejer2 {

    /*
    Escribe un programa para leer la altura de un número determinado de personas 
    y calcular la altura media. 
    El número de personas se pide por teclado y debe ser entero un entero mayor que cero. 
    Posteriormente el programa irá pidiendo la altura, en cm, de cada una de las personas 
    y las guardar en una estructura de almacenamiento. Si la altura leída no es positiva,
    el programa la pasará a número positivo. 
    También es necesario saber cuántas personas tienen una altura superior a la 
    media e inferior a la media. 
     */
    public static void main(String[] args) {
        //VARIABLES
        int numPerson = 0;
        boolean repetir = true;
        int suma = 0;
        double media;
        int encimaMedia;
        int debajoMedia;
        int cm;

        //Inicio metodo scanner
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce número de personas");
            numPerson = sc.nextInt();
            //1 restriccion mayor que 0, positiva
            if (numPerson > 0) {
                System.out.println("Correcto");
                repetir = false;
            } else {
                System.out.println("Introduce un número positivo mayor que 0");
                repetir = true;

            }
        } while (repetir);

        //defino el array de altura. es double
        double[] altura = new double[numPerson];

        //for recorrer el array hasta numPerson
        for (int i = 0; i < altura.length; i++) {
            System.out.println("Introduce la altura en cm de la persona\n"
                    + i++);
            cm = sc.nextInt();
            //debo igualar la altura i a cm

            //2º restriccion cm en positivo
            if (cm <= 0) {
                System.out.println("Has introducido una cantidad negativa, se transforma a positiva.");
                altura[i] = -cm;

            } else {
                System.out.println("Número correcto");
                altura[i] = cm;
            }

            //sumo las alturas como en el ejer1
            suma += altura[i];
        }
        //hago la media suma/ altura
        media = suma / altura.length;

        //resultados
        System.out.println("La uma de todas las alturas es: " + suma + " cms");
        System.out.println("\n-------------------\n"
                + "La media resulta: " + media);

    }

}
