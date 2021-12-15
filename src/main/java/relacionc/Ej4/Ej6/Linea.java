/*
 * 6. Define una clase Linea con dos atributos de la clase PuntoGeométrico: 
puntoA y puntoB. Estos puntos representarán el inicio y el fin de la línea en un plano. 
La clase dispondrá de los siguientes métodos:

 */
package relacionc.Ej4.Ej6;

/**
 *
 * @author Victoria
 */
public class Linea {

    //defino atributos******
    private int puntoA; //inicio
    private int puntoB; //fin
    

    //CONSTRUCTORES******* 
    //constructor por defecto sin parámetros
    //Constructor predeterminado que crea una línea con sus dos puntos como (0,0) y (1,1).
    public Linea() {
        this.puntoA.setX(0);
        this.puntoA.setY(0);
        this.puntoB.setX(1);
        this.puntoB.setY(1);
    }

    //constructor Linea(Punto A, Punto B) - Constructor parametrizado
    //Constructor que recibe como parámetros dos objetos de la clase PuntoGeométrico, que son utilizados para inicializar los atributos.
    public Linea(int puntoA, int puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    //constructores get y set

    public int getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(int puntoA) {
        this.puntoA = puntoA;
    }

    public int getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(int puntoB) {
        this.puntoB = puntoB;
    }
    
    //toString

    @Override
    public String toString() {
        return "Linea{" + "puntoA=" + puntoA + ", puntoB=" + puntoB + '}';
    }
    
    /*
    mueveDerecha(double x)
Desplaza la línea a la derecha a la distancia que se indique.

mueveIzquierda(double x)
Desplaza la línea a la izquierda a la distancia que se indique.

mueveArriba(double y)
Desplaza la línea hacia arriba a la distancia que se indique.

mueveAbajo(double y)
Desplaza la línea hacia abajo a la distancia que se indique.

    */
    /*
    mueveDerecha(double x) Desplaza la línea a la derecha a la distancia que se indique.
    */
    
    public void mueveDerecha (double x) {
     this.puntoA += puntoA; 
     this.puntoB += puntoB;
    }
    
    /*
    mueveIzquierda(double x)Desplaza la línea a la izquierda a la distancia que se indique.
    */
    public void mueveIzquierda(double x) {
     this.puntoA -= puntoA; 
     this.puntoB -= puntoB;
    }
    /*
    mueveArriba(double y) Desplaza la línea hacia arriba a la distancia que se indique.
    */
    public void mueveArriba (double y){
        this.puntoA.setY((int) (puntoA.getY() + y));
        this.puntoB.setY((int) (puntoB.getY() + y));
    
    }
    
   
}
