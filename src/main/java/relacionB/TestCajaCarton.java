/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionB;

/**
 *
 * @author Victoria
 */
public class TestCajaCarton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CajaCarton cajaGrande = new CajaCarton(500, 250, 400, 200);
        CajaCarton cajaChica = new CajaCarton(15, 25, 30, 17);

        System.out.println("Caja chica " + cajaChica.toString());
        System.out.println("--------------------");
        System.out.println("Caja grande " + cajaGrande.toString());
        
        /*
        REL B. 9 Implementa el método setPeso(int gramos) de la clase 'CajaCarton' 
        para que en caso de que el peso sea negativo o mayor que 1000gr, 
        se muestre un mensaje advirtiendo al usuario de que el peso pasado 
        como argumento no es válido y se establecerá a cero.
        */
        CajaCarton caja1 = new CajaCarton (500, 250, 400, 200); 
        caja1.setPeso(-4);
        System.out.println(caja1.getPeso());
        //bug se me cambia el peso a 0 pero no me imprime NO SE PORQUE
        
        /*
        REL B. 10. Cambia el peso del objeto cajaChica usando el método setPeso(), 
        estableciendo un valor de peso de 1200gr. Muestra por pantalla
        */
        cajaChica.setPeso(1200);
        System.out.println(cajaChica.getPeso());
        
        /*
        REL B.11 Modifica el valor de peso de cajaChica a 1200gr, 
        esta vez directamente a través del atributo, sin usar el método. 
        Muestra por pantalla el valor del peso de cajaChica.
        */
        //NO SE HACERLO
        
    }

}
