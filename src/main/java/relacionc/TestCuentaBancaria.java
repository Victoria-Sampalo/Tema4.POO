/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionc;

/**
 *
 * @author Victoria
 */
public class TestCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CuentaBancaria c1 = new CuentaBancaria();
        //c1.getInteresAnual();
       // System.out.println("El interés anual del c1 es: " + c1.getInteresAnual());
        //pruebo el set de interes a cambiarlo a valores por debajo de 0.1 y por encima de 3
       // c1.setInteresAnual(2.9);
       // System.out.println("Modifico el valor del interés a -1: \n" + c1);
       
       CuentaBancaria c2=new CuentaBancaria("6490H", "Victoria Sampalo", 2_000, 2);
        System.out.println("Saldo actual es: " + c2.getSaldoActual());
        
        //ingreso dinero
        c2.ingresarDinero(500);
        System.out.println("Ingresamos dinero------\nEl saldo actual es: " + c2.getSaldoActual());
        
        //retirar dinero
        c2.retirarEfectivo(2_000);
        System.out.println("Retiramos dinero------\nEl saldo actual es: " + c2.getSaldoActual());
        //c2.retirarEfectivo(2_000);
        //System.out.println("Retiramos dinero------\nEl saldo actual es: " + c2.getSaldoActual());
        
        
        System.out.println("En C2 el número de cuenta bancaria es: "+ c2.getNumCuenta());
         System.out.println(c2.toString());  
    }

}
