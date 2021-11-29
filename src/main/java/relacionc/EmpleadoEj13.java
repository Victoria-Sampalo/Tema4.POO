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
    public double calculoHorasMes(double precioHoraExtra, double horasExtraMes) {
        double cantidadHorasExtra = precioHoraExtra * horasExtraMes;

        return cantidadHorasExtra;

    }

    //MÉTODO SUELDO BRUTO
    public double calculoSueldoBruto(double sueldoBase, double cantidadHorasExtras) {
        double cantidadSueldoBruto = sueldoBase + cantidadHorasExtras;

        return cantidadSueldoBruto;
    }

    //MÉTODO CALCULO RETENCIONES
    public double calculoIrpf(double numIrpf) {
        EmpleadoEj13 emp = new EmpleadoEj13("Victoria", "Sampalo", "124-h", 1000.0, 50.0, 1.0, 20.0, 0, true);
        double cantidadIrpf = emp.setNumIrpf;
        
        
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
    //MÉTODO escribirBasicInfo():  (EJERCICIO 12) por scanner
    //MÉTODO escribirAllInfo()
    public void escribirAllInfo() {
        Scanner sc = new Scanner(System.in);
        //llamo al método de clase empleado
        EmpleadoEj13 empleado1 = new EmpleadoEj13("Victoria", "Sampalo", "124-h", 1000.0, 50.0, 1.0, 20.0, 0, true);

        //pido datos por teclado
        //NOMBRE
        System.out.println("Introduzca su nombre");
        nombre = sc.nextLine();
        empleado1.setNombre(nombre);
        //APELLIDO
        System.out.println("Introduzca el apellido");
        apellido = sc.nextLine();
        empleado1.setApellido(apellido);
        //NIF
        System.out.println("Introduzca el NIF");
        nif = sc.nextLine();
        empleado1.setNif(nif);
        //SUELDO BASE
        System.out.println("Introduzca sueldo base");
        sueldoBase = sc.nextDouble();
        empleado1.setSueldoBase(sueldoBase);
        //PRECIO X HORA EXTRA
        System.out.println("Precio por hora extra");
        precioHoraExtra = sc.nextDouble();
        empleado1.setPrecioHoraExtra(precioHoraExtra);
        //HORAS EXTRAS AL MES
        System.out.println("Número de horas extras");
        horasExtraMes = sc.nextDouble();
        empleado1.setHorasExtraMes(horasExtraMes);

        //tipoIRPF
        System.out.println("Introduzca el Porcentaje de IRPF");
        numIrpf = sc.nextDouble();
        empleado1.setNumIrpf(numIrpf);

    }

    //MÉTODO TO STRING()
    @Override
    public String toString() {
        return "EmpleadoEj13{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + ", sueldoBase=" + sueldoBase + ", precioHoraExtra=" + precioHoraExtra + ", HorasExtraMes=" + horasExtraMes + ", numIrpf=" + numIrpf + ", numHijos=" + numHijos + ", casado=" + casado + '}';
    }

}
