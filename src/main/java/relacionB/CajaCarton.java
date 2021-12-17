/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionB;

/**
 *
 * @author Victoria
 */
public class CajaCarton {
    private int largo;
    private int ancho;
    private int alto;
    private int peso;
    
    /*
        REL B. 9 Implementa el método setPeso(int gramos) de la clase 'CajaCarton' 
        para que en caso de que el peso sea negativo o mayor que 1000gr, 
        se muestre un mensaje advirtiendo al usuario de que el peso pasado 
        como argumento no es válido y se establecerá a cero.
        */

    public CajaCarton(int largo, int ancho, int alto, int peso) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        
        
         
        if (this.peso < 0 && this.peso >1_000){
        System.out.println("El peso pasado no es válido, contenido  entre 0 y 1_000gr");   
        this.peso= 0;
        }
       
    }
    
     
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
         
        if (this.peso < 0 && this.peso >1_000){
            System.out.println("El peso pasado no es válido, contenido  entre 0 y 1_000gr");   
        this.peso= 0;
        }
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void abrir() {
    }

    public void cerrar() {
    }

    @Override
    public String toString() {
        return "= " + "largo=" + largo + " mm , ancho=" + ancho + " mm , alto=" + alto + " mm , peso=" + peso + " gr";
    }

}
