/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relCejercicio11;

/**
 *
 * @author victoria
 */
public class Motor {
    private double cilindrada;//1.4, 1.6, 2.0
    private boolean encendido; //true encendido, false apagado.

    public Motor(double cilindrada, boolean encendido) {
        this.cilindrada = cilindrada;
        this.encendido = encendido;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
//MÉTODOS ARRANCAR Y APAGAR,
    //puedo usar el boolean

   public boolean isEncendido() {
        return encendido;
    }

    public void arrancar() {
        this.encendido = true;
    }
    
    public void parar() {
        this.encendido = false;
    }


    @Override
    public String toString() {
        return "Motor{" + "cilindrada=" + cilindrada + ", encendido=" + encendido + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
