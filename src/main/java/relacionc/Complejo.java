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

/**
 
 */
public class Complejo {
    //defino atributos con los que voy a trabajar
    private double x, y; 
    
    //constructor por defecto sin parámetros 
    public Complejo() {
    }
    //constructor parametrizado

    public Complejo(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //métodos get y set

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    //método to string

    @Override
    public String toString() {
        return "Complejo{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    //método de suma de complejos
    public static suma (){
    }
    //no entiendo hasta aquí me falta el resto de métodos y el contador de instancias
}
