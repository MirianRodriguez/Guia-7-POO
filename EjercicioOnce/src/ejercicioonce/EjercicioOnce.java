/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioonce;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class EjercicioOnce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int dia, mes, anio;
        System.out.println("Ingrese un dia: ");
        dia = leer.nextInt();
        System.out.println("Ingrese un mes (1 a 12): ");
        mes = leer.nextInt();
        System.out.println("Ingrese un anio: ");
        anio = leer.nextInt();
     
        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();
        
        long fechaMilisegundos = fecha.getTime();
        long fechaActualMilisegundos = fechaActual.getTime();
        
        long diferenciaMilisegundos =  fechaMilisegundos - fechaActualMilisegundos;
        
        long anioEnMiliseg = 31536000000L;
        
        long anios = diferenciaMilisegundos / anioEnMiliseg;
        
        System.out.println(diferenciaMilisegundos);
        System.out.println("anios" + anios);
        
    }
    
}
