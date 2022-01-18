/*
 * 
 */
package daw.victoria1;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author victoria
 */

/*

UTILIDAD MODIFICADORES DE ACCESO PUBLIC Y PRIVATE EN LOS ELEMENTOS DE UNA CLASE
Los modificadores con acceso public permitiran ser modificados y vistos desde 
no sólo la misma clase, sino también otras clases, otros paquetes, más subclases. 
Sin embargo, con el acceso private sólo se puede desde la misma clase, siendo imposible
su uso en otras clases, otros paquetes y otras subclases. 

En función de nuestro programa deberemos evaluar qué nos conviene más.

Por ejemplo en este caso, para definir los atributos con los que voy a trabajar 
es conveniente darles tipo private. Esto a su vez es un principio básico del 
concepto de encapsulamiento, pues no permitirá que los atributos sean modificados 
directamente.

resumen: 
public -> se puede ver este atributo o método desde todo el proyecto, incluyendo otros paquetes
private-> únicamente se puede ver el atributo o método desde la clase en la que se ha creado
 */
public class LibroElectronico {
    //DEFINO LOS ATRIBUTOS CON LOS QUE VOY A TRABAJAR. Estarán encapsulados y serán privados

    private String identificador;
    private String nombreLibro;
    private int paginasTotales;
    private int paginaActual;
    private double tamanio;

    //CONSTRUCTOR POR DEFECTO SIN PARÁMETROS
    public LibroElectronico() {
        this.identificador = RandomStringUtils.randomNumeric(3).toUpperCase();
        this.nombreLibro = "Don Quijote de la Mancha";
        this.paginasTotales = 1435;
        this.tamanio = 5;
        this.paginaActual = 1;
    }

    
    //MÉTODO PARAMETRIZADO
    //Añadiremos las excepciones oportunas
    public LibroElectronico(String nombreLibro,int paginaActual, double tamanio) {
        this.identificador = RandomStringUtils.randomNumeric(3).toUpperCase();
        this.nombreLibro = nombreLibro;
        

        //excepción 1. Si libro más de 9999 paginas, es 0. o excepcion 2. Si libro más de 10MB es a 0. 
        //pagina negativa o mayor que 999
        if (this.paginasTotales <0 || this.paginasTotales > 9999) {
          this.paginasTotales = 0;
        } else {this.paginasTotales = paginasTotales;}
        //tamanio  negativo o mayor que 10
        if (this.tamanio < 0 || this.tamanio >10){
         this.tamanio= 0; 
        } else {this.tamanio = tamanio;}
        
        this.paginaActual=1;

        
        

    }
    //MÉTODOS GETTER Y SETTERS DE LOS ATRIBUTOS QUE SE PRECISEN
    //No se creará métodos setters para atributo identificador y paginaActual. 
    //En los métodos setter tengo que añadir la restricción del atributo si la tuviera

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public void setPaginaActual(int paginaActual) {
       if (this.paginaActual <0 || this.paginaActual > 9999) {
          this.paginaActual = 0;
        } else {this.paginaActual = paginaActual;}
        
    }

    public void setTamanio(double tamanio) {
      if (this.tamanio < 0 || this.paginasTotales >10){
         this.tamanio= 0; 
        } else {this.tamanio = tamanio;}
        
    }

    
    public String getIdentificador() {
        return identificador;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public int getPaginasTotales() {
      
        return paginasTotales;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public double getTamanio() {
        return tamanio;
    }

    //MÉTODO ToSTRING
    @Override
    public String toString() {
        return "Ficha técnica del libro electrónico:\n"
                + "-Su id es: " + identificador
                + "\n-Su nombre es: " + nombreLibro
                + "\n-Tiene en total: " + paginasTotales + " páginas"
                + "\n-Ahora va por la página número: " + paginaActual
                + "\n-El tamaño es: " + tamanio + " MB";
    }

    
    //MÉTODO pasarPagina()
    public void pasarPagina() {
        //restricción: la última página es 9999
       if (this.paginaActual < this.paginasTotales){
        this.paginaActual += 1;
       }
    }

    //MÉTODO retrocederPagina()
    public void retrocederPagina() {
        //restricción: no puede retroceder a una página antes de la 1
       
        if (this.paginaActual > 1) {
            this.paginaActual -= 1;
        }

    }

    
    //MÉTODO saltar(int numero)
    public void saltar(int numero) {
        //si el num es positivo 
      /*  if (numero > 0) {
            this.paginaActual += numero;
            if (this.paginaActual > 9999) {
                throw new IllegalArgumentException("Como máximo un libro puede tener 9999 páginas.");
            } else {
                this.paginaActual -= numero;
                if (this.paginaActual < 1) {
                    throw new IllegalArgumentException("No hay más páginas antes de la 1.");
                }
            }
        }
*/
       //Si el número metido por parámetros es negativo se mete en el if
        if (numero < 0) {
            //hace la resta y mira si se puede mover para atrás o no
            int resultado = this.paginaActual - Math.abs(numero);
            //Si es menor que cero(no sería correcto el num de paǵinas)
            if (resultado < 0) {
                //Se mueve al inicio
                this.setPaginaActual(1);
            } else {
                //Si no, se mueve correctamente
                this.setPaginaActual(resultado);
            }
        } else {
            if (this.paginaActual + numero > this.paginasTotales) {
                this.setPaginaActual(paginasTotales);
            } else {
                this.setPaginaActual(paginaActual + numero);
            }
        }
    }

    

}
