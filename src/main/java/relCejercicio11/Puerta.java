/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relCejercicio11;

/**
 *
 * @author victoria
 */
public class Puerta {

    private boolean estado;
    private Ventana ventana;

    public Puerta(boolean estado, Ventana ventana) {
        this.estado = estado;
        this.ventana = ventana;
    }

    public boolean isEstado() {
        return estado;
    }

    public void abrir() {
        this.estado = true;
    }

    public void cerrar() {
        this.estado = false;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }
//que pasa si el objeto ventana no tiene implementado el tostring?, que saca la direccion de memoria del objeto ventana.

    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", ventana=" + ventana + '}';
    }

}
