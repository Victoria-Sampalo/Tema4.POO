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

    private Direccion dirección;
    //Contructor parametrizado
    public Persona(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }

    public Direccion getDirección() {
        return dirección;
    }

    public void setDirección(Direccion dirección) {
        this.dirección = dirección;
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

}
