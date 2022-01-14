/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relCejercicio11;

/**
 *
 * @author victoria
 */
public class Rueda {
    private int diametro; //cm
    private boolean estado;

    public Rueda(int diametro, boolean estado) {
        this.diametro = diametro;
        this.estado = estado;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void inflar() {
        this.estado = true;
    }
    public void desinflar() {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Rueda{" + "diametro=" + diametro + ", estado=" + estado + '}';
    }
    
    
    
}
