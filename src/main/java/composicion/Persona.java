/*
 *EJERCICIO DE LINK: https://www.arquitecturajava.com/java-composicion-y-la-reutilizacion-del-codigo/
 */
package composicion;

/**
 *
 * @author Victoria
 */
public class Persona {

    //defino las variables para trabajar con ellas, nombre, edad, direccion
    private String nombre;
    private int edad;

    private Direccion direccion;
    //Contructor parametrizado
    public Persona(String nombre, int edad, Direccion direccion) {
        // tiene que ver con el concepto de herencia super();
        this.nombre = nombre;
        this.edad = edad;
        this.direccion =direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion dirección) {
        this.direccion = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dirección=" + direccion + '}';
    }
    

}
