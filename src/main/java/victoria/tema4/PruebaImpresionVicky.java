/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victoria.tema4;

/**
 *
 * @author Victoria
 */
public class PruebaImpresionVicky { //CLASE CREADA PARA QUE VICKY CHEQUEE EL MODO IMPRESION 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creo objeto administrador con el constructor y de maquina 

        Administrador admin1 = new Administrador();
        Maquina maquina = new Maquina();
        //llamo al método creado en administrador para el objeto admin1
        admin1.cambiarBandeja(maquina);

    }

}
