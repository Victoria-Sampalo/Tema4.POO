/*
 * EJERCICIO 15
Crea una clase Fecha con atributos para el día, el mes y el año. Incluye, al menos, los siguientes métodos:

 */
package relacionc;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
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
    //local date es de clase porque lo llamo anteponiendo el nombre de la clase, y no del objeto.
    //private LocalDate fecha;
    /* CREACIÓN DE FECHAS Y OBTENCIÓN DE CAMPOS*/
    LocalDate hoy = LocalDate.now();

    //Constructor predeterminado con el 1-1-2022, como fecha por defecto.
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2022;
    }

    /*Constructor parametrizado con día, mes y año. Se debe comprobar que los parámetros 
    introducidos proporcionan una fecha válida. En caso contrario, se lanzará una excepción de tipo IllegalArgument.
     */
    public Fecha(int anio, int mes, int dia) {
        if (comprobarFecha(anio, mes, dia)) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
            throw new IllegalArgumentException("La fecha no es correcta");

        }
        //local date es de clase porque lo llamo anteponiendo el nombre de la clase, y no del objeto.
        //aqui no hay que ponerlo. LocalDate fecha = LocalDate.of(anio, mes, dia);
    }

    /*
    comprobarFecha(int dia, int mes, int anio): comprobará si los parámetros son 
    válidos para crear una nueva fecha.  Ejemplos: 31-2-2010 no es una fecha correcta. 
    Este método se debe usar en el constructor parametrizado.
     */
    private boolean comprobarFecha(int anio, int mes, int dia) {
        boolean fechaCorrecta = true;
        try {
            LocalDate fecha = LocalDate.of(anio, mes, dia);
        } catch (IllegalArgumentException iae) {
            System.out.println("Fecha no válida");
            fechaCorrecta = false;
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
        if (comprobarFecha(anio, mes, dia)) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (comprobarFecha(anio, mes, dia)) {
            this.mes = mes;
        }

    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (comprobarFecha(anio, mes, mes)) {
            this.anio = anio;
        }

    }

    /*
    bisiesto(): indicará si el año almacenado en el atributo es bisiesto o no.
     */
    public boolean isBisiesto() {
        boolean isBisiesto = false;
        LocalDate fecha = LocalDate.of(anio, mes, dia);

        if (fecha.isLeapYear()) {
            System.out.println("Este año es bisiesto");
        } else {
            System.out.println("Este año NO es bisiesto");
        }
        return isBisiesto;

    }

    /*
    diasMes(): devolverá el número de días que tiene el mes de la fecha establecida.
    
     */
    public int diasMes() {
        int numDiasMes = 0;
        LocalDate fecha = LocalDate.of(anio, mes, dia);

        System.out.println("La fecha tiene  " + fecha.lengthOfMonth() + " días.");

        return fecha.lengthOfMonth();
    }

    /*
    mostrarFechaCorta(): mostrará la fecha en formato corto (02-09-2003).
     */
    //him le pone public string 
    public void mostrarFechaCorta() {
        LocalDate fecha = LocalDate.of(anio, mes, dia);

        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        //realizo conversión de fecha 
        formatoCorto.format(fecha);
        System.out.println("Fecha con formato Corto" + formatoCorto);
        
        
    }

    /*
    mostrarFechaLarga(): mostrará la fecha en formato largo, empezando por el día de la semana (martes 2 de septiembre de 2003).
        FALTA TERMINAR*/
    public void mostrarFechaLarga() {

        LocalDate fecha = LocalDate.of(anio, mes, dia);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEE d 'de' MMMM 'del' yyyy");
        System.out.println("La fecha en formato largo es " + formato);

    }

    //diaSemana(): devolverá el día de la semana de la fecha (7 para domingo, 6 para sábado, etc). El 1-1-1900 fue domingo.
    //se puede usar getvalue aparece el dia de la semana con un numero
    public int  diaSemana() {
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        //System.out.println("Es el día de la semana número " + diaSemana);
        
        return fecha.getDayOfWeek().getValue();
    }
    

    /*
    diasEntreFechas(Fecha inicial, Fecha final): devolverá el número de días entre ambas fechas. Este método es de clase.

     */
    //me pone que no es posible convertir en fecha en temporal.
    public static long diasEntreFechas(Fecha inicio, Fecha fin){
    
    LocalDate fecha1= LocalDate.of(inicio.getAnio(),inicio.getMes() ,inicio.getDia() );
    LocalDate fecha2= LocalDate.of(fin.getAnio(),fin.getMes() ,fin.getDia() );
    
    long periodoDias = ChronoUnit.DAYS.between(fecha1, fecha2);
    
    
    return periodoDias;
    }
    //siguiente(): pasará al día siguiente.
    public void sumarDia() {
        LocalDate FechaSiguiente = LocalDate.of(anio, mes, dia);
        //Fecha = Fecha.plusDays(1);
        //this.dia= 
        LocalDate resultado = FechaSiguiente.plusDays(1);
        this.dia = resultado.getDayOfMonth();
        this.mes = resultado.getMonthValue();
        this.anio = resultado.getYear();
        
    }

    //anterior(): pasará al día anterior.
    public void restarDia() {
       
        LocalDate FechaSiguiente = LocalDate.of(anio, mes, dia);
         
        LocalDate resultado = FechaSiguiente.minusDays(1);
        this.dia = resultado.getDayOfMonth();
        this.mes = resultado.getMonthValue();
        this.anio = resultado.getYear();
    }

    //copia(): devolverá un objeto Fecha clonando la fecha almacenada en el objeto.
//    public Fecha copiar() {
//        Fecha fechaCopia = new Fecha(anio, mes, dia);
//        return fechaCopia;
//
//    }
    //en STATIC NUNCA THIS
    public static Fecha copia(Fecha aux){
    Fecha nueva = new Fecha(aux.getDia(), aux.getMes(), aux.getAnio());
    
    return nueva;
    }

    //igualQue(Fecha): indica si la fecha es la misma que la proporcionada.
    //Lo ideal es que sea boolean, lo tengo en el siguiente método
    public void igual(Fecha fecha) {

        LocalDate fechaInicial = LocalDate.of(anio, mes, dia);
        LocalDate fechaCompara = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        boolean resultado = fechaCompara.equals(fechaInicial);

        if (resultado == true) {
            System.out.println("Fechas son iguales");
        } else {
            System.out.println("Fechas no son iguales");

        }
    }
    //segundo método visto en clase
    public boolean igualBoolean (Fecha fecha){
    LocalDate fechaInicial = LocalDate.of(anio, mes, dia);
        LocalDate fechaCompara = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        //boolean resultado = fechaCompara.equals(fechaInicial);

        return fechaCompara.equals(fechaInicial);
    }
    

    //menorQue(Fecha): indica si la fecha es anterior a la proporcionada.
    public void menorQue(Fecha fecha) {

        LocalDate fechaInicial = LocalDate.of(anio, mes, dia);
        LocalDate fechaCompara = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        boolean resultado = fechaCompara.isBefore(fechaInicial);

        if (resultado == true) {
            System.out.println("La fecha es anterior a la otra");
        } else {
            System.out.println("La fecha es posterior a la otra");

        }
    }
    
    public boolean anteriorQue(Fecha fecha) {

        LocalDate fechaInicial = LocalDate.of(anio, mes, dia);
        LocalDate fechaCompara = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        //boolean resultado = fechaCompara.isBefore(fechaInicial);

        return fechaCompara.isBefore(fechaInicial);
    }
    
    //mayorQue(Fecha): indica si la fecha es posterior a la proporcionada.
    public boolean posteriorQue(Fecha fecha) {

        LocalDate fechaInicial = LocalDate.of(anio, mes, dia);
        LocalDate fechaCompara = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        //boolean resultado = fechaCompara.isAfter(fechaInicial);
        return fechaCompara.isAfter(fechaInicial);
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", hoy=" + hoy + '}';
    }
    
}

