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
        String isbn, titulo, autor;
        int paginas;
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese el ISBN del libro: ");
        
        isbn = leer.next();
        
        System.out.println("Ingrese el titulo del libro: ");
        
        titulo = leer.next();
        
        System.out.println("Ingrese el autor del libro: ");
        
        autor = leer.next();
        
        System.out.println("Ingrese cantidad de paginas del libro: ");
        
        paginas = leer.nextInt();
        
        libro.llenarLibro(isbn, titulo, autor, paginas);
        
        libro.mostrarLibro();
        
    }
    
    
}
