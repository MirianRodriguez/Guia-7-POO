/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouno;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro();
          
        libro.llenarLibro();
        
        libro.mostrarLibro();
        
    }
    
    
}
