/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionc;

/**
 *
 * @author victoria
 */
public class TestComplejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo variable contador aunque se que es en la clase 
        int numContador = 0;
        numContador++;

        //creamos los objetos complejos
        Complejo num1 = new Complejo(1, 5);
        Complejo num2 = new Complejo(3, 2);
        Complejo num3 = new Complejo(10, 2);
        Complejo num4 = new Complejo(1, 10);

        //imprimo ambos números
        System.out.println(numContador + num1.toString());
        System.out.println(numContador + num2.toString());
        System.out.println(numContador + num3.toString());
        System.out.println(numContador + num4.toString());
        System.out.println("\n------------------------------");
        //suma
        System.out.println("\nLa suma del complejo 1 y complejo 2:\n" + Complejo.sumar(num1, num2));

        //resta
        System.out.println("\nLa resta del complejo 3 y complejo 4:\n" + Complejo.restar(num3, num4));

        //multiplicar
        System.out.println("\nLa multiplicación del complejo 1 y 3:\n" + Complejo.multiplicar(num1, num3));

        //dividir
        System.out.println("\nLa división del complejo 2 y 4: \n" + Complejo.dividir(num2, num4));

        //probando el contador de instancias
        System.out.println("Número de instancias: "+ Complejo.getContadorDeInstancias());
        Complejo.getContadorDeInstancias();
        
        
        //Crea un objeto nuevo a partir de la suma de otros dos complejos.
        Complejo z3 = Complejo.sumar(num1, num2);
        
    }
    
    
    
}
