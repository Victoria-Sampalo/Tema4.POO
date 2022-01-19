/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contrasenya;

import java.util.Scanner;

/**
 *
 * @author victoria
 */
public class prueba1examenp42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        int cuentaCifras = 0, cuentaLetras = 0;                                                                   
  
        System.out.println("Introduce texto ");
        texto = sc.nextLine();
  
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                cuentaCifras++;
            } else if (Character.isLetter(texto.charAt(i))) {
                cuentaLetras++;
            }
        }
  
        System.out.println("El texto contiene " + cuentaCifras + " dígitos");                                     
        System.out.println("El texto contiene " + cuentaLetras + " letras");
    }
    }
    

