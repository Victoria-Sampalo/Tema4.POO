/*
 * 4. Crea la clase PuntoGeometrico que permita gestionar coordenadas (x,y) 
en un plano de dos dimensiones. Esas coordenadas serán números reales. 
Incluye los siguientes métodos: constructores (por defecto y parametrizado) 
y métodos get y set. En una clase de prueba, con el método main(), 
crea un par de objetos y prueba los métodos get y set.
 */
package relacionc.Ej4.Ej6;

/**
 *
 * @author victoria
 */
public class PuntoGeometrico {

    //DEFINO ATRIBUTOS
    private int x;
    private int y;

    //creo constructor sin parámetros vacio
    public PuntoGeometrico() {
        this.x = 0;
        this.y = 0;
    }

    //constructor parametrizado
    public PuntoGeometrico(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "PuntoGeometrico{" + "x=" + x + ",y=" + y + '}';
    }

}
