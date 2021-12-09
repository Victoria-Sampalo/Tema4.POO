/*
 * COMPOSICIÓN Y MAIN
Es momento de construir un programa main que se encargue de construir un objeto 
Empresa y otro objeto Persona cada uno de ellos asociado a una dirección diferente,
 */
package composicion;

/**
 *
 * @author Victoria
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //creo objeto de clase dirección
        Direccion d1= new Direccion("calle A", 4);
        Direccion d2= new Direccion ("calle B", 7);
        
        //creo objeto de clase persona
        Persona p1 = new Persona ("pepe", 24, d2);
        System.out.println(p1.toString());
        p1.setDireccion(d1);
        System.out.println(p1.getDireccion().getNumero());
        p1.getDireccion().setCalle("Calle tortolitos");
        System.out.println(p1.toString());
     /*  //imprimo con setdireccion
       p1.setDireccion(d1);
       
       //creo objeto de clase empresa y lo modifico con el set. 
       Empresa empresa1=new Empresa();
       
       empresa1.setCif("1A");
      //) empresa1.setDireccion(d2);
      */  
       //imprimo ambos persona y empresa con d1 y d2
       
        //System.out.println(p1.getDireccion().getCalle());
        //System.out.println(empresa1.getDireccion().getCalle());
        //System.out.println("Datos p1"+ p1);
        //System.out.println(p1.getDireccion()+p1.getEdad());
        
    }
    
}
