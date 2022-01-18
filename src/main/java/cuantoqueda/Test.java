/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuantoqueda;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

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
    
        LocalDate finalCurso = LocalDate.of(2022,Month.JUNE, 21);
        long diasHastaFinal = ChronoUnit.DAYS.between(hoy, finalCurso);
        System.out.println("Días para terminar " + diasHastaFinal);
        
        long semanasHastaFinal = ChronoUnit.WEEKS.between(hoy, finalCurso);
        System.out.println("Semanas hasta el final " + semanasHastaFinal);
        
}
}
