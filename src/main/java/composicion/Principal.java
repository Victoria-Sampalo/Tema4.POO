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
        p1.setDireccion(d2);
        System.out.println(p1.getDireccion().getNumero());
        p1.getDireccion().setCalle("Calle tortolitos");
        System.out.println(p1.toString());
        
        
        //EMPRESA
        Empresa empresa1 = new Empresa ("1A", d1);
        
        Empresa empresa2 = new Empresa (); 
        System.out.println(empresa1);
        System.out.println(empresa2);
        
        empresa2.setDireccion(d2);
        empresa2.setCif("a25");
        System.out.println(empresa2);
        
        empresa2.getDireccion().setNumero(12);
        System.out.println(p1.getDireccion());
        
        
        //segunda forma
        Direccion d3 = new Direccion ("Calle Alboran", 8);
        empresa1.setDireccion(d3);
        System.out.println(empresa1);
        d3.setNumero(12);
        System.out.println(empresa1);
        //no hay objeto que apunta a la nueva dirección creada. Forma 1
        empresa1.setDireccion(new Direccion("Calle Flores", 13));
        System.out.println(empresa1);
        empresa1.getDireccion().setNumero(14);
        System.out.println(empresa1);
        
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
