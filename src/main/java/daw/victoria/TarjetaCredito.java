/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.victoria;

import org.apache.commons.lang3.RandomStringUtils;
import java.time.LocalDate;
import java.time.YearMonth;

/**
 *
 * @author victoria
 */
public class TarjetaCredito {

    //ATRIBUTOS CON LOS QUE TRABAJAREMOS
    private String entidad; //entidad bancaria perteneciente
    private String nombreTitular; //nombre del titular
    private char numBin; //16 digitos
    //private LocalDate caducidad;
    private YearMonth caducidad;
    /*
    clase year month static yearmonth.now() o static yearmonth of
     */

    private int limiteCred; //entre 500 y 3_000
    private boolean estado; //true activa, false anulada
    private int cvv; //4digitos

    //CONSTRUCTOR POR DEFECTO SIN PARÁMETROS
    public TarjetaCredito() {
        this.entidad = "BBVA";
        this.nombreTitular = "Nombre";
        this.numBin = ' ';
        this.caducidad = caducidad;

        //excepcion 1 entre 500 y 3mil
        if (this.limiteCred < 500 || this.limiteCred > 3000) {
            this.limiteCred = 500;
        } else {
            this.limiteCred = limiteCred;
        }

        this.estado = false;
        this.cvv = 1234;

    }

    //MÉTODO PARAMETRIZADO
    //Añadiremos las excepciones oportunas
    public TarjetaCredito(String entidad, String nombreTitular, char numBin, YearMonth cacudidad, int limiteCred, double estado, int cvv) {
        this.entidad = entidad;
        this.nombreTitular = nombreTitular;
        
        this.numBin = numBin;
        this.caducidad = caducidad;
        //excepcion 1 entre 500 y 3mil
        if (this.limiteCred < 500 || this.limiteCred > 3000) {
            this.limiteCred = 500;
        } else {
            this.limiteCred = limiteCred;
        }

        this.estado = false;
        this.cvv = cvv;
    }

    //MÉTODO PRIVADO COMPROBAR TARJETA
    private static boolean comprobarTarjeta(char numBin) {
        boolean tarjetaCorrecta = true; //16 digitos numericos.
        int numCaracter;
        String texto = null;
        do {
            for (numCaracter = 0; numCaracter < texto.length(); numCaracter++) {

                if (Character.isLetter(texto.charAt(numCaracter))) {
                    numCaracter++;
                }
            }

        } while (numCaracter == 16);

        return tarjetaCorrecta;
    }

    //MÉTODOS GETTERS Y SETTERS. Solo se crea set para estado, pin y limite.
    public String getEntidad() {
        return entidad;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public char getNumBin() {
        return numBin;
    }

    public YearMonth getCaducidad() {
        return caducidad;
    }

    public int getLimiteCred() {
        return limiteCred;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getCvv() {
        return cvv;
    }

    public void setLimiteCred(int limiteCred) {
        //excepcion 1 entre 500 y 3mil
        if (this.limiteCred < 500 || this.limiteCred > 3000) {
            this.limiteCred = 500;
        } else {
            this.limiteCred = limiteCred;
        }

        this.limiteCred = limiteCred;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
//MÉTODO TO STRING

    @Override
    public String toString() {
        return "Información Tarjeta Credito:\n"
                + "Nombre titular: " + nombreTitular + " Banco Emisor: " + entidad
                + "\ncaducidad: " + caducidad + " Crédito: " + limiteCred
                + "\nNúmero de tarjeta: " + numBin;

    }

//MÉTODO ACTIVAR, PAGAR, ANULAR
    
}
