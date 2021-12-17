/*
 * 6. Define una clase Linea con dos atributos de la clase PuntoGeométrico: 
puntoA y puntoB. Estos puntos representarán el inicio y el fin de la línea en un plano. 
La clase dispondrá de los siguientes métodos:
 */
package relC.Ej4.Ej6;

/**
 *
 * @author Victoria
 */
public class Linea {
    //declaro los metodos

    private PuntoGeometrico puntoA;
    private PuntoGeometrico puntoB;

//     constructor sin parametros llamando al objeto punto geometrico para definir las dos coordenadas.
//     tendrá un puntoA y otro puntoB
    public Linea() {
        puntoA = new PuntoGeometrico(2, 2);
        puntoB = new PuntoGeometrico(6, 6);
        this.puntoA.setX(0);
        this.puntoA.setY(0);
        this.puntoB.setX(1);
        this.puntoB.setY(1);

    }
    

    //constructor parametrizado
    public Linea(PuntoGeometrico puntoA, PuntoGeometrico puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    //get y set
    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }

    //METODOS ESPECIALES**
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
    public void mueveDerecha(double x) {
//        double suma = this.puntoA.getX() + x;
//        this.puntoA.setX(suma);
        this.puntoA.setX((int)(puntoA.getX()+ x));
        this.puntoB.setX((int)(puntoA.getX()+ x));

    }

    public void mueveIzquierda(double x) {
        this.puntoA.setX((int)(puntoA.getX()- x));
        this.puntoB.setX((int)(puntoA.getX()- x));

    }

    public void mueveArriba(double y) {
        this.puntoA.setY((int) (puntoA.getY() + y));
        this.puntoB.setY((int) (puntoB.getY() + y));

    }

    public void mueveAbajo(double y) {
        this.puntoA.setY((int) (puntoA.getY() - y));
        this.puntoB.setY((int) (puntoB.getY() - y));

    }
    public String mostrarLinea(){
    return "[" + puntoA + "," + puntoB + "]";
    }

    //to string
    @Override
    public String toString() {
        return "Linea{" + "puntoA=" + puntoA + ", puntoB=" + puntoB + '}';
    }

}
