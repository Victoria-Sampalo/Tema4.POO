/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

/**
 *
 * @author Victoria
 */
public class Empresa {
    private String cif;

  private Direccion dirección;

    public Empresa(String cif, Direccion dirección) {
        this.cif=cif;
        this.dirección = dirección;
    }
  /*
    public Persona(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }
    */
  
    //constructor vacio
    public Empresa() {
        this.cif=cif;
        this.dirección = dirección;
    }

    
  
  public Direccion getDirección() {
    return dirección;
  }

  public void setDirección(Direccion dirección) {
    this.dirección = dirección;
  }

  public String getCif() {
    return cif;
  }

  public void setCif(String cif) {
    this.cif = cif;
  }
  
}
