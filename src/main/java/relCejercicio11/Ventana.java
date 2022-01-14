/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relCejercicio11;

/**
 *
 * @author victoria
 */
public class Ventana {
   private boolean tintada; //true esta tintada
   private boolean estado;

    public Ventana(boolean tintada, boolean estado) {
        this.tintada = tintada;
        this.estado = estado;
    }

    public boolean isTintada() {
        return tintada;
    }

    public void setTintada(boolean tintada) {
        this.tintada = tintada;
    }

    public boolean isEstado() {
        return estado;
     
    }

    public void subir() {
        this.estado = estado;
    }
    
    public void bajar() {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ventana{" + "tintada=" + tintada + ", estado=" + estado + '}';
    }

    
   
   
}
