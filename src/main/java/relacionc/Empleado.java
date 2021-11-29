/*
 * EJERCICIO 12 RELACIÓN -c
 */
package relacionc;

/**
 *
 * @author victoria
 */
public class Empleado {

    String nombre;
    String apellido;
    String nif;
    Double precioHoraExtra;
    Double numHoraExtra;
    Double numIrpf;
    boolean casado;
    int numHijos;

    //MÉTODO CONSTRUCTOR DE CLASE EMPLEADO
    public Empleado(String nombre, String apellido, String nif, Double precioHoraExtra, Double numHoraExtra, Double numIrpf, boolean casado, int numHijos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.precioHoraExtra = precioHoraExtra;
        this.numHoraExtra = numHoraExtra;
        this.numIrpf = numIrpf;
        this.casado = casado;
        this.numHijos = numHijos;
    }

    //
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Double getPrecioHoraExtra() {
        return precioHoraExtra;
    }

    public void setPrecioHoraExtra(Double precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }

    public Double getNumHoraExtra() {
        return numHoraExtra;
    }

    public void setNumHoraExtra(Double numHoraExtra) {
        this.numHoraExtra = numHoraExtra;
    }

    public Double getNumIrpf() {
        return numIrpf;
    }

    public void setNumIrpf(Double numIrpf) {
        this.numIrpf = numIrpf;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    //CREO STRING
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido
                + ", nif=" + nif + ", precioHoraExtra=" + precioHoraExtra
                + ", numHoraExtra=" + numHoraExtra + ", numIrpf=" + numIrpf
                + ", casado=" + casado + ", numHijos=" + numHijos + '}';
    }

}
