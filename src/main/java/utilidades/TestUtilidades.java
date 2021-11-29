/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class TestUtilidades {

    public static void main(String[] args) {
        //VARIABLES 

        int numAleatorio;
        //método scanner, 
        Scanner sc = new Scanner(System.in);

        //creo el objeto de clase utilidades
        Utilidades test1 = new Utilidades();

        //LEO LOS DATOS LLAMÁNDO AL MÉTODO CREADO EN UTILIDADES leerDatos
        System.out.println("Introduce el número mínimo del rango");
        int minimo = test1.leerDatos();

        System.out.println("Introduce el número máximo del rango");
        int maximo = test1.leerDatos();

        //if else que controle que el minimo y el maximo están bien
        //llamo al método de clase rangoAleatorio
        if (minimo < maximo) {

            numAleatorio = test1.rangoAleatorio(minimo, maximo);
            System.out.println("El número generado es:  " + numAleatorio);

        } else {
            numAleatorio = test1.rangoAleatorio(maximo, minimo);
            System.out.println("El número generado es:  " + numAleatorio);
        }

    }

}
