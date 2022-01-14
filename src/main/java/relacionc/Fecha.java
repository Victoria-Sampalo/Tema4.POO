/*
 * EJERCICIO 15
Crea una clase Fecha con atributos para el día, el mes y el año. Incluye, al menos, los siguientes métodos:

 */
package relacionc;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Victoria
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;
    
    

    //Constructor predeterminado con el 1-1-2022, como fecha por defecto.
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2022;
    }

    /*Constructor parametrizado con día, mes y año. Se debe comprobar que los parámetros 
    introducidos proporcionan una fecha válida. En caso contrario, se lanzará una excepción de tipo IllegalArgument.
     */

    public Fecha(int dia, int mes, int anio) {
        try{
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        }catch(IllegalArgumentException iae){
            System.out.println("Fecha no válida");
        };
    }
    
    /*
    comprobarFecha(int dia, int mes, int anio): comprobará si los parámetros son 
    válidos para crear una nueva fecha.  Ejemplos: 31-2-2010 no es una fecha correcta. 
    Este método se debe usar en el constructor parametrizado.
    */
    
    private boolean comprobarFecha(int dia, int mes, int anio) {
    boolean fechaCorrecta= true;
    try{
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        }catch(IllegalArgumentException iae){
            System.out.println("Fecha no válida");
            fechaCorrecta= false;
        };
        return fechaCorrecta;
    }
    
    /*
    Métodos get y set. Los métodos set deben tener en cuenta las restricciones lógicas 
    y además que la nueva fecha sea válida. En caso contrario, el método set no hace nada.
    */

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(comprobarFecha(dia, mes, anio)){
        this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(comprobarFecha(dia, mes, anio)){
        this.mes = mes;
        }
        
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if(comprobarFecha(dia, mes, anio)){
        this.anio = anio;
        }
        
    }
    
    
    /*
    bisiesto(): indicará si el año almacenado en el atributo es bisiesto o no.
    */
    public boolean bisiesto(){
    boolean bisiesto =true;
    if (anio.isLeapYear()){
    } else {
        System.out.println("Es bisiesto");
        }
     return bisiesto;
    }
    
    /*
    
    public boolean bisiesto() {
        boolean isbisiesto = false;
        fechaCompuesta = LocalDate.of(anio, mes, dia);

        if (fechaCompuesta.isLeapYear()) {
            isbisiesto = true;
        }
        return isbisiesto;
    }
    
    
    */
    
}
