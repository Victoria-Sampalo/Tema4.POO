/*
 *EJERCICIO 1.
Crea una clase Complejo que permita trabajar con números complejos (parte real 
y parte imaginaria). Se define cada número complejo z como un par ordenado de 
números reales: z = (a, b). A su vez el primer elemento a se define como parte 
real de z, se denota a=Re(z); el segundo elemento b se define como parte imaginaria 
de z, se denota b=Im(z). Incluye los siguientes métodos: 
constructores (por defecto y parametrizado) y métodos get, set y toString. 
 */
package relacionc;

import java.util.logging.Logger;

/**
 
 */
public class Complejo {
    //defino atributos con los que voy a trabajar

    //parte real
    private double a;
    //parte imaginaria
    private double b;

    //contador instancias
    private static int contadorDeInstancias;

    //
    //int numero = 1;

    //constructor por defecto sin parámetros 
    public Complejo() {
    }
    //constructor parametrizado

    public Complejo(double a, double b) {
        this.a = a;
        this.b = b;
        contadorDeInstancias++;
        
    }

    public static int getContadorDeInstancias() {
        return contadorDeInstancias;
    }

    public static void setContadorDeInstancias(int contadorDeInstancias) {
        Complejo.contadorDeInstancias = contadorDeInstancias;
    }

    //métodos get y set
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    //to string
    @Override
    public String toString() {
        //nota: se ha intentado hacer el contador pero no es de esta forma. Se vuelve a la inicial pero se deja en notas lo intentado.
        //return "Número Complejo"+ numero  +"{" + a + "," + b +'}' + "\n" + contadorDeInstancias ;
        return "Número Complejo" + "{" + a + "," + b + '}';
    }

    //MÉTODOS EJERCICIO 2 
    //método SUMAR dos complejos.
    public static Complejo sumar(Complejo num1, Complejo num2) {
        //creo objeto complejo que obtengo trás la suma de ambos
        Complejo resultado = new Complejo();

        //sumo por separado parte real(a) y parte imaginaria (b)
        double resultadoA = num1.getA() + num2.getA();
        double resultadoB = num1.getB() + num2.getB();

        //defino un resultado compuesto por la suma de ambas partes A y B
        resultado.setA(resultadoA);
        resultado.setB(resultadoB);

        return resultado;
    }

    //método RESTAR dos complejos.
    public static Complejo restar(Complejo num1, Complejo num2) {
        //creo objeto complejo que obtengo trás la suma de ambos
        Complejo resultado = new Complejo();

        //resto por separado parte real(a) y parte imaginaria (b)
        double resultadoA = num1.a- num2.a;
        double resultadoB = num1.b - num2.b;

        //defino un resultado compuesto por la resta de ambas partes A y B
        resultado.setA(resultadoA);
        resultado.setB(resultadoB);

        return resultado;
    }

    //método MULTIPLICAR dos complejos.
    public static Complejo multiplicar(Complejo num1, Complejo num2) {
        //creo objeto complejo que obtengo trás la multiplicacion de ambos
        Complejo resultado = new Complejo();

        //multiplico por separado parte real(a) y parte imaginaria (b)
        double resultadoA = num1.getA() * num2.getA();
        double resultadoB = num1.getB() * num2.getB();

        //defino un resultado compuesto por la multiplicación de ambas partes A y B
        resultado.setA(resultadoA);
        resultado.setB(resultadoB);

        return resultado;
    }

    //método DIVIDIR dos complejos.
    public static Complejo dividir(Complejo num1, Complejo num2) {
        //creo objeto complejo que obtengo trás la division de ambos
        Complejo resultado = new Complejo();

        //divido por separado parte real(a) y parte imaginaria (b)
        double resultadoA = num1.getA() / num2.getA();
        double resultadoB = num1.getB() / num2.getB();

        //defino un resultado compuesto por la divido de ambas partes A y B
        resultado.setA(resultadoA);
        resultado.setB(resultadoB);

        return resultado;
    }
    
    public static boolean igualdad(Complejo num1, Complejo num2){
     double resultadoReal= num1.getA() - num2.getA();
     double resultadoImaginario= num1.getB() - num2.getB();
     
     return resultadoReal == 0 && resultadoImaginario ==0;
    }
    
<<<<<<< Updated upstream
    //constructor copia
    public Complejo(Complejo copia) {
        
        this.a= copia.a;
        this.b =copia.b;
        //habría que poner contador++??,  si porque vamos a crear nuevas instancias a través de aqui
        contadorDeInstancias++;
        
    }
=======
    //método de suma de complejos
    
>>>>>>> Stashed changes
    
    
}
