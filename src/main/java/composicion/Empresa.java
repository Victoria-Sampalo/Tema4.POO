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

  private Direccion direccion;

    public Empresa(String cif, Direccion direccion) {
        this.cif=cif;
        this.direccion = direccion;
    }
  
  
    //constructor por defecto, vacío. atributos apuntando a null
    public Empresa() {
        
    }

    
  
  public Direccion getDireccion() {
    return direccion;
  }

  public void setDireccion(Direccion direccion) {
    this.direccion = direccion;
  }

  public String getCif() {
    return cif;
  }

  public void setCif(String cif) {
    this.cif = cif;
  }

    @Override
    public String toString() {
        return "Empresa{" + "cif=" + cif + ", direccion=" + direccion + '}';
    }
  
}
