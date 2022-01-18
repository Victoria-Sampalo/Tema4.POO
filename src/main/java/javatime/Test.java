/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author Victoria
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fecha actual
        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy es " + hoy);
    
       /* MOSTRAR INFORMACIÓN */
        
       // Este objeto guarda fecha y hora
        LocalDateTime ya = LocalDateTime.now();
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaString2 = ya.format(formato2);
        System.out.println("Fecha sin formato " + ya);
        System.out.println("Fecha con formato " + fechaString2);
        
        
        
        
        
        
        
        
        
        
}
}
