/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relCejercicio11;

/**
 *
 * @author victoria
 */
public class Coche {
    private Motor motor;
    
    private Puerta puertaPiloto;
    private Puerta puertaCopiloto;
    
    private Rueda ruedaDelanteraIzquierda;
    private Rueda ruedaDelanteraDerecha;
    private Rueda ruedaTraseraIzquierda;
    private Rueda ruedaTraseraDerecha;

    public Coche(Motor motor, Puerta puertaPiloto, Puerta puertaCopiloto, Rueda ruedaDelanteraIzquierda, Rueda ruedaDelanteraDerecha, Rueda ruedaTraseraIzquierda, Rueda ruedaTraseraDerecha) {
        this.motor = motor;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
        this.ruedaDelanteraIzquierda = ruedaDelanteraIzquierda;
        this.ruedaDelanteraDerecha = ruedaDelanteraDerecha;
        this.ruedaTraseraIzquierda = ruedaTraseraIzquierda;
        this.ruedaTraseraDerecha = ruedaTraseraDerecha;
    }

    public Coche() {
    }

    @Override
    public String toString() {
        return "Coche{" + "motor=" + motor + ", puertaPiloto=" + puertaPiloto + ", puertaCopiloto=" + puertaCopiloto + ", ruedaDelanteraIzquierda=" + ruedaDelanteraIzquierda + ", ruedaDelanteraDerecha=" + ruedaDelanteraDerecha + ", ruedaTraseraIzquierda=" + ruedaTraseraIzquierda + ", ruedaTraseraDerecha=" + ruedaTraseraDerecha + '}';
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta getPuertaPiloto() {
        return puertaPiloto;
    }

    public void setPuertaPiloto(Puerta puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public Puerta getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public void setPuertaCopiloto(Puerta puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }

    public Rueda getRuedaDelanteraIzquierda() {
        return ruedaDelanteraIzquierda;
    }

    public void setRuedaDelanteraIzquierda(Rueda ruedaDelanteraIzquierda) {
        this.ruedaDelanteraIzquierda = ruedaDelanteraIzquierda;
    }

    public Rueda getRuedaDelanteraDerecha() {
        return ruedaDelanteraDerecha;
    }

    public void setRuedaDelanteraDerecha(Rueda ruedaDelanteraDerecha) {
        this.ruedaDelanteraDerecha = ruedaDelanteraDerecha;
    }

    public Rueda getRuedaTraseraIzquierda() {
        return ruedaTraseraIzquierda;
    }

    public void setRuedaTraseraIzquierda(Rueda ruedaTraseraIzquierda) {
        this.ruedaTraseraIzquierda = ruedaTraseraIzquierda;
    }

    public Rueda getRuedaTraseraDerecha() {
        return ruedaTraseraDerecha;
    }

    public void setRuedaTraseraDerecha(Rueda ruedaTraseraDerecha) {
        this.ruedaTraseraDerecha = ruedaTraseraDerecha;
    }
    
    
    
}
