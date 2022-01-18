/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.victoria1;

import javax.swing.JOptionPane;

/**
 *
 * @author victoria
 */
public class TestLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean solicitarDatos = true;
        //Prueba
//        //Objeto prueba
//        LibroElectronico prueba1 = new LibroElectronico();
//        //Pasamos pagina
//        prueba1.pasarPagina();
//        System.out.println("Pasar pagina : " + prueba1.getPaginaActual());
//        prueba1.retrocederPagina();
//        System.out.println("retroceder pagina : " + prueba1.getPaginaActual());
//        prueba1.saltar(2000);
//        System.out.println("Saltar adelante pagina : " + prueba1.getPaginaActual());
//        prueba1.saltar(-200000);
//        System.out.println("Saltar detrás pagina : " + prueba1.getPaginaActual());

        //Crea dos libros con el constructor por defecto. Muestra por consola los 
        //datos de estos libros usando el método toString. 
        //--------LIBRO 1 CON CONSTRUCTOR POR DEFECTO-----------------    
        LibroElectronico libro1 = new LibroElectronico();
        System.out.println("Libro 1 contructor por defecto-------------------\n"
                + libro1.toString());
        //--------LIBRO 2 CON CONSTRUCTOR POR DEFECTO-----------------
        LibroElectronico libro2 = new LibroElectronico();

        System.out.println("Libro 2 contructor por defecto-------------------\n"
                + libro2.toString());

        //Crea dos libros con el constructor parametrizado
        //Usando JOption y toString, muestra los datos estos objetos.
        //------------------LIBRO 1 CON CONSTRUCTOR PARAMETRIZADO---------------------------
        String tituloLibro1 = JOptionPane.showInputDialog("Introduzca el nombre del libro 3");

        //variables que voy a usar
        int numPagina = 1, tamanio1 = 0;
        do {
            try {
                String stringPaginasLibro = JOptionPane.showInputDialog("Introduce número de páginas del libro 3");
                numPagina = Integer.parseInt(stringPaginasLibro);
                String stringTamanioLibro = JOptionPane.showInputDialog("Introduce tamaño del libro 3");
                tamanio1 = Integer.parseInt(stringTamanioLibro);
                solicitarDatos = false;
            } catch (NumberFormatException nme) {
                //codigo para el error
                System.out.println("Se ha introducido texto en lugar de número,\nvuelve a introducir los datos");

            }

        } while (solicitarDatos);

        //con los valores que le he pasado formo el libro 3
        LibroElectronico libro3 = new LibroElectronico(tituloLibro1, numPagina, tamanio1);
        System.out.println("Libro 3 parametrizado------------------\n"
                + libro3.toString());

        //Prueba a crear un nuevo libro con 12000 páginas y 12 MB. 
        //Muestra los datos de este objeto usando la consola y toString.
        LibroElectronico libro4 = new LibroElectronico("Muerte Anunciada", 12000, 12);
        System.out.println("Libro 4 parametrizado --------------\n"
                + libro4.toString());

        //Establece 13000 páginas en el primer libro creado. 
        //Muestra los datos de este objeto usando la consola y toString.
        libro1.setPaginaActual(13000);
        System.out.println("Libro 1 cambiando el núm de páginas:  " + libro1.getPaginaActual());

        //Establece como tamaño 15MB en el segundo libro creado. 
        //Muestra los datos de este objeto usando la consola y toString.
        libro2.setTamanio(15);
        System.out.println("Libro 2 cambiando el espacio ocupado------------------\n"
                + libro2.toString());

        System.out.println("");
        libro3.pasarPagina();
        System.out.println("Pasamos de página en el libro 3: "
                + libro3.getPaginaActual());
        System.out.println("Así quedaría en toString: \n" + libro3.toString());

        libro4.saltar(450000);
        System.out.println("");
        System.out.println("Saltamos de página en el libro 4: "
                + libro4.getPaginaActual());
        System.out.println("Así quedaría en toString: \n" + libro4.toString());

        libro4.retrocederPagina();
        System.out.println("");
        System.out.println("Retrocedemos una página en el libro 4: "
                + libro4.getPaginaActual());
        System.out.println("Así quedaría en toString: \n" + libro4.toString());

        libro4.saltar(-5000000);
        System.out.println("");
        System.out.println("Volvemos al principio del libro 4: "
                + libro4.getPaginaActual());
        System.out.println("Así quedaría en toString: \n" + libro4.toString());
    }

}


