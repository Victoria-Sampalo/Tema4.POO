/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relacionc;

/**
 *
 * @author victoria
 */
public class Cancion {
    //defino las variables en

    public String titulo, autor;

    //construcción por defecto. CADENA VACIA
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }
    
    //CONSTRUCTOR PARAMETRIZADO
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
  
    

    //GET para CONSULTAS
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    //SET para HACER CAMBIOS DE VALORES
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /*
    
     */
    //implemento el String
    @Override
    public String toString() {
        return "La canción elegida es+ "titulo=" y con autor ", autor=" + autor + '}';
    }
}
