/*
 * EJERCICIO 9
 *
 *
 *
 *
 *
 *
 */
package relacionc;

/**
 *
 * @author victoria
 */
public class Nif {
    //DEFINO ATRIBUTOS CON LOS QUE VOY A TRABAJAR
    private String numeroDni;
    private char letraDni;
    private static int contadorDeInstancias;

    public Nif(String numeroDni) {
        this.numeroDni = numeroDni;
        this.letraDni= CrearLetraDni();
        contadorDeInstancias++;
        
    }
    
    private char CrearLetraDni () {
        
        char letra = ' ';
        //revisar longitud del string
        int dnilongitud = numeroDni.length();
        
        //restricción si el largo es 8 continua.
        if (dnilongitud==8){
         int numeroInt = Integer.parseInt(numeroDni);
         //la letra es la división de
         int letraDni = numeroInt % 23;
         
        switch (letraDni){
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'w';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6: 
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break; 
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            
            case 10:
                letra = 'X';
                break;
            
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break; 
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            
            case 16:
                letra = 'Q';
                break;
            
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
               
            case 19:
                letra = 'L';
                break;
            
            case 20:
                letra = 'C';
                break;
            
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
            default:
                System.out.println();
                break;
            
            
        
        }
        }
        else {
         this.numeroDni = "0";
        }
        
        
       return letra;
    
    }

    public String getNumeroDni() {
        return numeroDni;
    }

    public char getLetraDni() {
        return letraDni;
    }
    
    
    
    

    @Override
    public String toString() {
        return "Nif{" + numeroDni + "-" + letraDni + '}';
    }
    
    //método contador
    public static void contador(int numContador) {
       numContador++;
       
    
    }
    
    public static void main(String[] args) {
        //creo el objeto
        Nif nif1 = new Nif("79055940");
        System.out.println(nif1.toString());
    }
    
    
    
    
           

    
    
    
}
