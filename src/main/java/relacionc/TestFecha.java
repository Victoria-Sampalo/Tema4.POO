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
public class TestFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha hoy = new Fecha(2022, 1, 15);
        
        System.out.println("Fecha 1 es "+ hoy);
        Fecha dia1 = new Fecha (2022,1,15);
        System.out.println("El mes tiene: " + hoy.diasMes() + " días");
        System.out.println(dia1);
        
    }
    
}
