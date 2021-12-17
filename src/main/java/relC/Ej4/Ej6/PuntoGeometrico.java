/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relC.Ej4.Ej6;

/**
 *
 * @author Victoria
 */
public class PuntoGeometrico {
    //defino atributos
    private double x;
    private double y;
    
    //constructor sin parámetros vacio

    public PuntoGeometrico() {
     
    }
    
    //constructor parametrizado

    public PuntoGeometrico(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //get y set

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    
    
    @Override
    public String toString() {
        return "PuntoGeometrico{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
    
}
