/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionc;

/**
 *
 * @author victoria
 */
public class TestNif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //creo objeto
        Nif nif1 = new Nif("79055940");
        Nif nif2= new Nif ("45066777");
        
        System.out.println(nif1.toString());

        Complejo.getContadorDeInstancias();
        
        
        System.out.println("Números de DNIs creados: " + Complejo.getContadorDeInstancias());

    }

}
