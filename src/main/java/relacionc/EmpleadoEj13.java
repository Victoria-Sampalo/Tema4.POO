/*
 *REPETIR EL 12 + AÑADIR:

 */
package relacionc;

import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class EmpleadoEj13 {

    //DEFINO LOS ATRIBUTOS CON LOS QUE  VOY A TRABAJAR
    String nombre, apellido, nif;
    Double sueldoBase, precioHoraExtra, horasExtraMes, numIrpf;
    int numHijos;
    boolean casado;

    //MÉTODO CONSTRUCTOR DE CLASE EMPLEADO
    public EmpleadoEj13(String nombre, String apellido, String nif, Double sueldoBase, Double precioHoraExtra, Double horasExtraMes, Double numIrpf, int numHijos, boolean casado) {
        //duda, le doy valor o no...
        this.nombre = "Victoria";
        this.apellido = "Sampalo";
        this.nif = "45674-N";
        this.sueldoBase = 1300.0;
        this.precioHoraExtra = 10.0;
        this.horasExtraMes = 10.0;
        this.numIrpf = 10.0;
        this.numHijos = 3;
        this.casado = false;
    }

    //creo los métodos get y set
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

    public Double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(Double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Double getPrecioHoraExtra() {
        return precioHoraExtra;
    }

    public void setPrecioHoraExtra(Double precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }

    public Double getHorasExtraMes() {
        return horasExtraMes;
    }

    public void setHorasExtraMes(Double HorasExtraMes) {
        this.horasExtraMes = HorasExtraMes;
    }

    public Double getNumIrpf() {
        return numIrpf;
    }

    public void setNumIrpf(Double numIrpf) {
        this.numIrpf = numIrpf;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    //MÉTODO CALCULO HORAS EXTRAS
    public double calculoHorasMes() {
        double cantidadHorasExtra = precioHoraExtra * horasExtraMes;

        return cantidadHorasExtra;

    }

    //MÉTODO SUELDO BRUTO
    public double calculoSueldoBruto() {
        double cantidadSueldoBruto = sueldoBase + calculoHorasMes();

        return cantidadSueldoBruto;
    }

    //MÉTODO CALCULO RETENCIONES, POR DEFECTO
    public double calculoIrpf() {
        double numIrpf = this.numIrpf;
        //resta 1 punto por cada hijo
        if (this.numHijos != 0) {
            numIrpf -= this.numHijos;
        }
        //resta 2 puntos si está casado. casado= true
        if (this.casado) {
            numIrpf -= 2;
        }
        //no puede ser irpf negativo, si sale negativo poner a cero
        if (this.numIrpf < 0) {
            numIrpf = 0;
        }

        double cantidadIrpf = (numIrpf * calculoSueldoBruto()) / 100;
        /*
        los tiros van a ir por:
        if (casado){
        numIrpf -=2; 
         calculoIrpf = saldoBruto * (numIrpf /100}

        else if (!casado){calculoIrpf = saldoBruto * (numIrpf /100}
        
        else (numHijos!=0){ for (int i; i<=numHijos; i++)}
         */
        return cantidadIrpf;

    }

    //MÉTODO SUELDO NETO
    public double calculoSueldoNeto() {
        double cantidadSueldoNeto = calculoSueldoBruto() - calculoIrpf();
        return cantidadSueldoNeto;
    }

    //MÉTODO escribirBasicInfo():  (EJERCICIO 12) por scanner
    public void escribirBasicInfo() {
        EmpleadoEj13 empleado1 = new EmpleadoEj13("Victoria", "Sampalo", "124-h", 1000.0, 50.0, 1.0, 20.0, 0, true);
    }

    //MÉTODO escribirAllInfo()
    public void escribirAllInfo() {
        String cantidadIrpf = null;
        //NO SE PUEDE TENER SCANNER EN EL CONSTRUCTOR
        //llamo al método de clase empleado
        System.out.println("Nombre: " + this.nombre +
                "\nApellidos: " + this.apellido +
                "\nNIF: " + this.nif +
                "\nSueldo base: " + this.sueldoBase +
                "\nComplemento horas extras: " + calculoIrpf() + 
                "\nSueldo bruto: " + calculoSueldoBruto() +
                "\nRetención de IRPF: " +  cantidadIrpf +
                "\nSueldo neto: " + calculoSueldoNeto()
         );
    }

    //MÉTODO TO STRING()
    @Override
    public String toString() {
        return "EmpleadoEj13{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + ", sueldoBase=" + sueldoBase + ", precioHoraExtra=" + precioHoraExtra + ", HorasExtraMes=" + horasExtraMes + ", numIrpf=" + numIrpf + ", numHijos=" + numHijos + ", casado=" + casado + '}';
    }

}
