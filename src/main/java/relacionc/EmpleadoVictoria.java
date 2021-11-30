/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionc;

import java.util.Scanner;

/**
 *
 * @author victoria
 */
public class EmpleadoVictoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREO LAS VARIABLES 
        String nombre;
        String apellido;
        String nif;
        Double precioHoraExtra;
        Double numHoraExtra;
        Double numIrpf;
        boolean casado;
        int numHijos;
        
        //Instancio el nuevoobjeto creado, empleado1
        
        Empleado empleado1 = new Empleado("Victoria", "Sampalo", "124-h", 50.0, 1.0, 20.0, true, 0);
        //preci.horas extras - num horas- %irpf - casada - numhijos

        //MÉTODO SCANNER
        Scanner sc = new Scanner(System.in);

        //PIDO POR TECLADO E INICIALIZO EL MÉTODO DE CADA VARIABLE 
        System.out.println("Introduzca su nombre");
        nombre = sc.nextLine();
        empleado1.setNombre(nombre);

        System.out.println("Introduzca el apellido");
        apellido = sc.nextLine();
        empleado1.setApellido(apellido);

        System.out.println("Introduzca el NIF");
        nif = sc.nextLine();
        empleado1.setNif(nif);

        System.out.println("Precio por hora extra");
        precioHoraExtra = sc.nextDouble();
        empleado1.setPrecioHoraExtra(precioHoraExtra);

        System.out.println("Número de horas extras");
        numHoraExtra = sc.nextDouble();
        empleado1.setNumHoraExtra(numHoraExtra);

        System.out.println("Porcentaje de IRPF");
        numIrpf = sc.nextDouble();
        empleado1.setNumIrpf(numIrpf);
        
        //control de la booleana casado,
        //Limpio el buffer, porque paso de letra a numero
        sc.nextLine();
        //inicializo a 0.
        String isCasado = "";

        do {
            System.out.println("¿Estás casado?. Introduce 'c' (casado o 's' de soltero");

            isCasado = sc.nextLine();
            if (isCasado.equalsIgnoreCase("c")) {
                casado = true;
                empleado1.setCasado(casado);
            } else if (isCasado.equalsIgnoreCase("s")) {
                casado = false;
                empleado1.setCasado(casado);
            } else {
                System.out.println("Introduzca un valor válido, 'S' de soltero o 'C' de casado");
            }
            //si es distinto de  c o s
        } while (!(isCasado.equalsIgnoreCase("c") || isCasado.equalsIgnoreCase("s")));

        System.out.println("Número de hijos");
        numHijos = sc.nextInt();
        empleado1.setNumHijos(numHijos);

        //  //PRUEBO EL MÉTODO STRING
        System.out.println("Los atributos del empleado 1 son:\n" + empleado1.toString());

        //  System.out.println("La canción es " + song1.toString());
        /*  
        Double precioHoraExtra;
        Double numHoraExtra;
        Double numIrpf;
        boolean casado;
        int numHijos;
         */
        //PRUEBO METODO GET Y SET
        System.out.println("Nombre del empleado {" + empleado1.getNombre()
                + " } y su apellido es { " + empleado1.getApellido() + " }");


       
    }

}
