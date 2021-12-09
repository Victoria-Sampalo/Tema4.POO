/*EJERCICIO 7
 * Crea una clase CuentaBancaria con atributos para el número de cuenta (String), 
el NIF del cliente (String), nombre del cliente, el saldo actual y el 
interés anual que se aplica a la cuenta (entre 0.1% y 3%). Define en la clase los siguientes métodos:

Constructor por defecto, con los valores que tú consideres oportunos. 
El número de cuenta debe tener 20 dígitos y se debe generar usando la clase 
RandomStringUtils de la librería Apache Commons. Para ello, copia la siguiente línea:

import org.apache.commons.lang3.RandomStringUtils;

Pulsa sobre la bombilla que el entorno proporciona junto a la línea de código y selecciona la opción de buscar la dependencia en el repositorio de Maven. En la ventana emergente, selecciona el matching artifact que aparece y pulsa en el botón add. Comprueba que se añade la dependencia en el archivo pom.xml:
<dependencies>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.8.1</version>
            <type>jar</type>
        </dependency>
 </dependencies>

Otra opción es copiar y pegar el código anterior en tu archivo pom.xml directamente, justo antes de la etiqueta <properties>.
En cualquier caso, en la sección Dependencies del proyecto debe aparecer la librería commons-lang incluida. Maven se encarga de descargarla e incluirla automáticamente en nuestro proyecto. Esto permite que podamos usar todas las clases de esa librería en nuestras propias clases, haciendo los imports correspondientes.
Una vez tenemos incluida la librería, e importada la clase org.apache.commons.lang3.RandomStringUtils se puede usar el método estático randomNumeric(int) para generar String aleatorios (sólo de caracteres numéricos) del tamaño especificado en el parámetro. 

Prueba la siguiente línea de código en cualquier programa:

System.out.println(RandomStringUtils.randomNumeric(15).toUpperCase());

Existen otros métodos bastente útiles de esta clase. Consulta la documentación en https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/RandomStringUtils.html
 
Constructor parametrizado con NIF, nombre, saldo e interés. 
Genera el número de cuenta de igual forma que en el constructor por defecto. 
En este ejercicio, a la hora de generar números de cuenta en ambos constructores, 
no se tendrá en cuenta que se puedan generar números de cuenta repetidos, 
algo que evidentemente en la vida real no debería suceder.

Métodos get y set. Para el número de cuenta no hay método set, suponemos que un 
número de cuenta no se puede cambiar una vez la cuenta está creada.

ingresarIntereses(): aumenta el saldo de la cuenta, 
aplicando el interés anual [saldo = saldo + (interés * saldo)].

ingresarDinero(double cantidad): permite ingresar una cantidad en la cuenta.

retirarEfectivo(double cantidad): permite sacar una cantidad de la cuenta (si hay saldo). Si no hay saldo suficiente no se realiza la operación.

toString()

Añade una clase de prueba, con el método main(), para probar la clase CuentaBancaria.


 */
package relacionc;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author victoria
 */
public class cuentaBancaria {

    /*
    Constructor por defecto, con los valores que tú consideres oportunos. 
    El número de cuenta debe tener 20 dígitos y se debe generar usando la clase 
    RandomStringUtils de la librería Apache Commons. 
     */
    //DEFINO LOS ATRIBUTOS CON LOS QUE VOY A TRABAJAR
    //atributos encapsulados
    private String nif;
    private String nombreCliente;
    private String numCuenta;
    private double saldoActual;
    private double interesAnual; //(entre 0.1% y 3%)

    //CONSTRUCTOR POR DEFECTO SIN PARÁMETROS
    public cuentaBancaria() {
        this.nif = "690559-H";
        this.nombreCliente = "Victoria Sampa";

        this.saldoActual = 100_000;
        this.interesAnual = 2;
        this.numCuenta = RandomStringUtils.randomNumeric(20).toUpperCase();

    }

    /*
    Constructor parametrizado con NIF, nombre, saldo e interés. 
    Genera el número de cuenta de igual forma que en el constructor por defecto. 
    En este ejercicio, a la hora de generar números de cuenta en ambos constructores, 
    no se tendrá en cuenta que se puedan generar números de cuenta repetidos, 
    algo que evidentemente en la vida real no debería suceder.
     */
    //MÉTODO CONSTRUCTOR PARAMETRIZADO. 
    public cuentaBancaria(String nif, String nombreCliente, double saldoActual, double interesAnual) {
        this.numCuenta = RandomStringUtils.randomNumeric(20).toUpperCase();
        this.nif = nif;
        this.nombreCliente = nombreCliente;
        this.saldoActual = saldoActual;
        //restricción de interés del 0.1-3%
        if (interesAnual < 0.1 || interesAnual > 3) {
            throw new IllegalArgumentException("Tiene que introducir un dato entre 0.1 y 3");
        }
        this.interesAnual = interesAnual;

    }

    /*
    Métodos get y set. Para el número de cuenta no hay método set, suponemos que un 
    número de cuenta no se puede cambiar una vez la cuenta está creada.
     */
    //MÉTODO GET Y SET DE CADA ATRIBUTO. SALVO NUMCUENTA SIN SET
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        //restricción interés 

        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        //lanzar error si interes 
        if (interesAnual < 0.1 || interesAnual > 3) {
            throw new IllegalArgumentException("Tiene que introducir un dato entre 0.1 y 3");
        }
        this.interesAnual = interesAnual;
    }

    /*
    ingresarIntereses(): aumenta el saldo de la cuenta, 
    aplicando el interés anual [saldo = saldo + (interés * saldo)].
     */
    public void ingresarInteres() {
        this.saldoActual += (interesAnual * saldoActual);
    }

    /*
    ingresarDinero(double cantidad): permite ingresar una cantidad en la cuenta.
     */
    public void ingresarDinero(double cantidad) {
        //restricción la cantidad debe ser siempre positiva.
        double cantidadIngresada = Math.abs(cantidad);
        saldoActual = cantidadIngresada + saldoActual;

    }

    /*
    retirarEfectivo(double cantidad): permite sacar una cantidad de la cuenta 
    (si hay saldo). Si no hay saldo suficiente no se realiza la operación.
     */
    public void retirarEfectivo(double cantidad) {
        //restricción si cantidadretirada > cantidadActual lanzar error.

        if (saldoActual - cantidad < 0) {
            throw new IllegalArgumentException("No tines saldo suficiente para retirar esta cantidad.");
        }
        Math.abs(saldoActual = saldoActual - cantidad);

    }

    //MÉTODO TO STRING.
    @Override
    public String toString() {
        return "Los datos actuales de mi cuenta son \n{" + "nif=" + nif + ", nombreCliente=" + nombreCliente + ", numCuenta=" + numCuenta + ", saldoActual=" + saldoActual + ", interesAnual=" + interesAnual + '}';
    }

}
