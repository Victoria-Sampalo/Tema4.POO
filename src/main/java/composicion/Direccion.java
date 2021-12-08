/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

/**
 *
 * @author Victoria
 */
public class Direccion {

    private String calle;
    private int numero;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    //Contructor parametrizado.
    public Direccion(String calle, int numero) {
        super();
        this.calle = calle;
        this.numero = numero;
    }
}
