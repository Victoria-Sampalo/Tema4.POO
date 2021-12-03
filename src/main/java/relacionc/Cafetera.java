/*
 Desarrolla una clase Cafetera con atributos capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay dentro de la cafetera). Implementa, al menos, los siguientes métodos:

Constructor predeterminado, sin parámetros: establece la capacidad máxima en 1000 (c.c.) y la cantidad actual en cero (cafetera vacía).

Constructor, que recibe sólo la capacidad máxima de la cafetera; inicializa la cantidad actual de café igual a la capacidad máxima (cafetera llena).

Constructor, que recibe la capacidad máxima y la cantidad actual. 
Si la cantidad actual que se pasa es mayor que la capacidad máxima de la cafetera, 
se ajustará la cantidad actual a la capacidad máxima.

llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.

servirTaza(double cantidadAServir): simula la acción de servir una taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.

vaciarCafetera(): pone la cantidad de café actual en cero.

agregarCafe(double cantidadAgregar): añade a la cafetera la cantidad de café indicada, teniendo en cuenta que la cafetera no puede rebosar.


 */
package relacionc;
//PARTES DE UNA CLASE:
//1. definición de la clase, linea public class nombre de la clase, 
//es muy básica es posible que luego se aliñe

public class Cafetera {

    //DEFINO ATRIBUTOS CON LOS QUE VOY A TRABAJAR
    //2.los atributos, pueden llamarse campos o propiedades
    private double capacidadMaxima; //no se permiten capacidad >mayor que 1000
    private double cantidadActual;//no puede tener valor negativo 

    //3. TODOS LOS MÉTODOS. 
    //3.1 especial mención a constructores, get y set, y to string.(si lo necesito)
    //IMPORTANTE MIRAR, implicacion que tiene public y private en los miembros de una clase
    //CONSTRUCTOR PREDETERMINADO, O POR DEFECTO SIN PARÁMETROS
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
        //nos crea una cafetera de 1L vacía, sin café
    }
    //CONSTRUCTOR RECIBE (PARÁMETROS QUE PIDE), SOLO LA CAPACIDAD MAXIMA.
    //RESTRICCIÓN: si la capacidad máxima es negativa, la pasa a positiva. 
    //math.abs lo pone en positivo en el caso de que sea negativo 

    public Cafetera(double capacidadMaxima) {
        /*
        IMAGINEMOS QUE tenemos que tener en la cafetera un mín de 10cl, maximo 500cl
        if (this.capacidadMaxima >= 10cl) {this.capacidadMaxima)10}
        (this.capacidadMaxima <= 500)
         */

        this.capacidadMaxima = capacidadMaxima;

        if (capacidadMaxima < 10) {
            this.capacidadMaxima = 10;
        }
        /*   if (cantidadActual > 0){
            this.cantidadActual =0;
        }
         */
        //estoy diciendo que la cafetera está llena
        this.cantidadActual = this.capacidadMaxima;
    }

    /*
    *Constructor, que recibe la capacidad máxima y la cantidad actual. 
    *Si la cantidad actual que se pasa es mayor que la capacidad máxima de la cafetera, 
    *se ajustará la cantidad actual a la capacidad máxima.
     */
    public Cafetera(double capacidadMaxima, double cantidadActual) {
        //defino aquí los atributos, como los defino aqui puedo ponerle this.
        capacidadMaxima = capacidadMaxima;
        this.cantidadActual = Math.abs(cantidadActual);
        //igual que el anterior
        //no le pongo el this porque hago referencia al parámetro, luego se hicieron cambios
        if (this.capacidadMaxima < 10) {
            this.capacidadMaxima = 10;

        }
        //tengo que establecer la cantidad
        //sin this porque no se hace referencia al atributo, sino al parámetro de la cantidad actual (luego se hicieron cambios
        if (this.cantidadActual > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;

        }

        //  this.cantidadActual = cantidadActual;
    }

    /*
    hasta AQUI TENGO: 3 metodos constructores sobrecargados,porque se llaman igual pero tienen distintos parámetros
     */
    //MÉTODO LLENAR CAFETERA. Hace 
    //no le paso nada, tampoco devuelve por lo tanto es void. 
    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
        //no hay ninguna restriccion que tenga que tener en cuenta, porque cuando creo el objeto ya las tengo.
    } //vamos a llenar la c2

    //MÉTODO SERVIR TAZA.Le paso parámetro de cantidad servir,
    //restriccion si la cantidad no me llega, servimos lo que quede.
    //cantidad a servir si es negativa, pasar a positivo
    public void servirTaza(double cantidadServir) {
        //sin el this porque no es ningun atributo, es un parámetro.
        double cantidadPositiva = Math.abs(cantidadServir);

        //o ponerlo aqui. ANTES estaba en un if else, y el primer if era mirar el video el valor.
        this.cantidadActual -= cantidadPositiva;
        //tengo 100 y la taza llevo 400, -300 me quedo
        //si tengo meno cantidad en la cafetera que lo que voy a servir, sirvo lo que tengo.
        if (this.cantidadActual < 0) { //si la cantidad positiva es menor que la cantidad actual, lo igualo a 0. 
            this.cantidadActual = 0;

        }

    }

    //MÉTODO SIN PARÁMETROS PARA VARIAR EL CONTENIDO DE LA CAFETERA
    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    //MÉTODO DE AGREGAR CAFÉ
    //restricción, si llega a 1000, es 1000
    public void agregarCafe(double cantidadAgregar) {
        double cantidadPositiva = Math.abs(cantidadAgregar);
        this.cantidadActual += cantidadPositiva;
        //si llega a rebosar, se queda en mil

        if (cantidadActual > 1000) {
            this.cantidadActual = this.capacidadMaxima;

        }

    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    //override: significa que es un metodo heredado que estamos sobreescribiendo.
    //heredado de clase object
    @Override
    public String toString() {
        return "Cafetera{" + "\ncapacidadMaxima=" + capacidadMaxima + ",  \ncantidadActual=" + cantidadActual + '}';
    }

}
