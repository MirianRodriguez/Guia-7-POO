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
public class Libro {
    
    private String isbn;
    private String titulo;
    private String autor;
    private int nroPaginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int nroPraginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPraginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }
    
/** Permite setear el atributo titulo
     * @param titulo
 **/
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPraginas() {
        return nroPaginas;
    }

    public void setNroPraginas(int nroPraginas) {
        this.nroPaginas = nroPraginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", nroPraginas=" + nroPaginas + '}';
    }
    
  
    public void llenarLibro() {
        String isbnI; 
        String tituloI;
        String autorI; 
        int paginas;
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese el ISBN del libro: ");
        
        isbnI = leer.next();
        
        System.out.println("Ingrese el titulo del libro: ");
        
        tituloI = leer.next();
        
        System.out.println("Ingrese el autor del libro: ");
        
        autorI = leer.next();
        
        System.out.println("Ingrese cantidad de paginas del libro: ");
        
        paginas = leer.nextInt();
        
        this.isbn = isbnI;
        this.titulo = tituloI;
        this.autor = autorI;
        this.nroPaginas = paginas;
    }
    
    public void mostrarLibro(){
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Cantidad de paginas: " + nroPaginas);
    }
    
    
    
}
