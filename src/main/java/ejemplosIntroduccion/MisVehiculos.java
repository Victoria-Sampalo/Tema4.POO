/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosIntroduccion;

/**
 *
 * @author Victoria
 */
public class MisVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Este programa crea un objeto de la clase vehiculo y muestra sus atributos

        //instanciación del objeto vehiculo1
        Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0, true);

        //devo de invocar los metodos para mostrar los datos del vehiculo1
        System.out.println("Datos del vehículoo : " + vehiculo1.getMatricula() + ","
                + vehiculo1.getMarca());
        
        System.out.println(vehiculo1.toString());
    }

}
