/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vending;


import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class Administrador {

    //constructor por defecto sin parámetros
    public Administrador() {
    }

    //método cambiar bandeja 
    public void cambiarBandeja(Maquina maquina) {
        //variables
        int numero = 0;
        int numCodigo=0;
        //mostrar SOLO CODIGO todas las bandejas, prueba en scanner
        System.out.println(maquina.getBandeja1().getCodigo());
        System.out.println(maquina.getBandeja2().getCodigo());
        System.out.println(maquina.getBandeja3().getCodigo());
        System.out.println(maquina.getBandeja4().getCodigo());
        System.out.println(maquina.getBandeja5().getCodigo());
        System.out.println(maquina.getBandeja6().getCodigo());

        System.out.println("CÓDIGOS DE BANDEJAS: " + "\n---------------\n"
                + "BANDEJA 1: " + maquina.getBandeja1().getCodigo() + "\nBANDEJA 2: " + maquina.getBandeja2().getCodigo()
                + "\nBANDEJA 3: " + maquina.getBandeja3().getCodigo() + "\nBANDEJA 4: " + maquina.getBandeja4().getCodigo()
                + "\nBANDEJA 5: " + maquina.getBandeja5().getCodigo() + "\nBANDEJA 6: " + maquina.getBandeja6().getCodigo());
        //mostrar por JOption
        JOptionPane.showMessageDialog(null, "CÓDIGOS DE BANDEJAS" + "\n---------------\n"
                + "BANDEJA 1: " + maquina.getBandeja1().getCodigo() + "\nBANDEJA 2: " + maquina.getBandeja2().getCodigo()
                + "\nBANDEJA 3: " + maquina.getBandeja3().getCodigo() + "\nBANDEJA 4: " + maquina.getBandeja4().getCodigo()
                + "\nBANDEJA 5: " + maquina.getBandeja5().getCodigo() + "\nBANDEJA 6: " + maquina.getBandeja6().getCodigo());

        do { //bucle que controla elección de una opcion dle 1 al 6, 
            //preguntar num bandeja a cambiar y hacer conversion a tipo int
            try {

                //preguntar num bandeja a cambiar y hacer conversion a tipo int
                String numeroString = JOptionPane.showInputDialog(null, "Ingresa el número de la bandeja que desea cambiar");
                numero = Integer.parseInt(numeroString);

                switch (numero) {
                    case 1:
                        String codigo = JOptionPane.showInputDialog(null, "Inserta el nuevo código para la bandeja 1");
                        //conversión del valor
                        numCodigo = Integer.parseInt(codigo);
                        maquina.getBandeja1().setCodigo(numCodigo);
                        JOptionPane.showMessageDialog(null, "El código de la bandeja 1 pasa a ser "
                                + maquina.getBandeja1().getCodigo());
                        //comprobación del cambio
                        System.out.println("Código bandeja 1:  "
                                + maquina.getBandeja1().getCodigo());
                        break;
                    case 2:
                        codigo = JOptionPane.showInputDialog(null, "Inserta el nuevo código para la bandeja 2");
                        //conversión del valor
                        numCodigo = Integer.parseInt(codigo);
                        maquina.getBandeja2().setCodigo(numCodigo);
                        JOptionPane.showMessageDialog(null, "El código de la bandeja 2 pasa a ser "
                                + maquina.getBandeja2().getCodigo());
                        //comprobación
                        System.out.println("Código bandeja 2:  " + maquina.getBandeja2().getCodigo());
                        break;

                    case 3:
                        codigo = JOptionPane.showInputDialog(null, "Inserta el nuevo código para la bandeja 3");
                        numCodigo = Integer.parseInt(codigo);
                        maquina.getBandeja3().setCodigo(numCodigo);
                        JOptionPane.showMessageDialog(null, "El código de la bandeja 3 pasa a ser "
                                + maquina.getBandeja3().getCodigo());
                        //comprobación
                        System.out.println("Código bandeja 3:  " + maquina.getBandeja3().getCodigo());
                        break;

                    case 4:
                        codigo = JOptionPane.showInputDialog(null, "Inserta el nuevo código para la bandeja 4");
                        numCodigo = Integer.parseInt(codigo);
                        maquina.getBandeja4().setCodigo(numCodigo);
                        JOptionPane.showMessageDialog(null, "El código de la bandeja 4 pasa a ser "
                                + maquina.getBandeja4().getCodigo());
                        //comprobación
                        System.out.println("Código bandeja 4:  " + maquina.getBandeja4().getCodigo());
                        break;
                    case 5:
                        codigo = JOptionPane.showInputDialog(null, "Inserta el nuevo código para la bandeja 5");
                        numCodigo = Integer.parseInt(codigo);
                        maquina.getBandeja5().setCodigo(numCodigo);
                        JOptionPane.showMessageDialog(null, "El código de la bandeja 5 pasa a ser "
                                + maquina.getBandeja5().getCodigo());
                        //comprobación
                        System.out.println("Código bandeja 5:  " + maquina.getBandeja5().getCodigo());
                        break;

                    case 6:
                        codigo = JOptionPane.showInputDialog(null, "Inserta el nuevo código para la bandeja 6");
                        numCodigo = Integer.parseInt(codigo);
                        maquina.getBandeja6().setCodigo(numCodigo);
                        JOptionPane.showMessageDialog(null, "El código de la bandeja 6 para a ser "
                                + maquina.getBandeja6().getCodigo());
                        //comprobación
                        System.out.println("Código bandeja 6:  " + maquina.getBandeja6().getCodigo());

                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Número de bandeja no válido, elige una bandeja de 1 al 6");
                        break;

                } //end switch
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Carácter no válido.\n"
                        + "Debes insertar un número de bandeja del 1 al 6");
                System.out.println("Carácter no válido. Debes insertar un número de bandeja del 1 al 6");

            }
            
            //restricción a imprimir si algún codigo es igual a uno que ya esté creado.
            if (numCodigo == maquina.getBandeja1().getCodigo() 
                || numCodigo == maquina.getBandeja2().getCodigo()
                || numCodigo == maquina.getBandeja3().getCodigo()
                || numCodigo == maquina.getBandeja4().getCodigo()
                || numCodigo == maquina.getBandeja5().getCodigo()
                || numCodigo == maquina.getBandeja6().getCodigo()){
            
                System.out.println("Has creado un código que ya existe. Vuelve a intentarlo");
            }
        } while (numero < 1 || numero > 6 
                || numCodigo == maquina.getBandeja1().getCodigo() 
                || numCodigo == maquina.getBandeja2().getCodigo()
                || numCodigo == maquina.getBandeja3().getCodigo()
                || numCodigo == maquina.getBandeja4().getCodigo()
                || numCodigo == maquina.getBandeja5().getCodigo()
                || numCodigo == maquina.getBandeja6().getCodigo());
        //condición erronea, objetivo: repetir si está entre menor que 1 o número mayor que 6. 
        //y el bug: si se cambia por un código de bandeja que ya exista. 
        /*
        soluciones que veo, victoria:  
        ir en cada switch comparando con esa condición si hay alguno en ese momento que coincida, que vuelva a repetir el pedir el dato
        o poner una booleana que el bucle se salga, ahora mismo es infinito y no se sale si en prueba main intentamos imprimir. 
        */
          
    }
}
