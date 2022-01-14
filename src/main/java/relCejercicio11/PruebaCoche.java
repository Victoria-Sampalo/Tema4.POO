/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relCejercicio11;

/**
 *
 * @author victoria
 */
public class PruebaCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor m = new Motor(2.0, false);
        Ventana v1= new Ventana(true, true);
        //Ventana v2= new Ventana(true, true);
        //alias, el mismo espacio de memoria para v3 y v2. 
        //Ventana v3= v2;
        
        //así me aseguro que v1 no lo estoy poniendo en otra puerta.
        //posibilidad A 
        Puerta pPiloto = new Puerta(false, v1);
        
        //posibilidad B
        //se crea una ventana específica para la puerta copiloto
        Puerta pCopiloto = new Puerta(false,new Ventana(true, true));
        
        Rueda rdi = new Rueda(50, true);
        Rueda rdd = new Rueda(50, true);
        Rueda rti = new Rueda(50, true);
        Rueda rtd = new Rueda(50, true);
        
        
        Coche auto1= new Coche(m, pPiloto, pCopiloto, rdi, rdd, rti, rtd);
        System.out.println(auto1);
        
        Coche auto2= new Coche(new Motor(2.0, false), 
                new Puerta(false,new Ventana(true, true)), 
                new Puerta(false,new Ventana(true, true)), 
                new Rueda(50, true), 
                new Rueda(50, true), 
                new Rueda(50, true), 
                new Rueda(50, true));
        
        rtd.desinflar();
        //rueda desinflada
        System.out.println(auto1);
        
        System.out.println("auto 2"+ auto2);
        System.out.println("\n-----------------\n"
                + "Ventana piloto auto2 sin tintar");
        
        
        //auto2.getpPiloto().getVentana().setTintada(false);
        auto2.getPuertaPiloto().getVentana().setTintada(true);
        System.out.println(auto2.getPuertaPiloto().getVentana().isTintada());
        
        System.out.println("\n-----------------\n"
                + "Diámetro de la rueda delantera izquierda de coche 2");
        
        //
       auto2.getRuedaDelanteraIzquierda();
        System.out.println(auto2.getRuedaDelanteraIzquierda());
        
        System.out.println("\n-----------------\n"
                + "Arrancar el motor de auto2");
         auto2.getMotor().arrancar();
         System.out.println(auto2.getMotor());
        
        
    }
    
}
