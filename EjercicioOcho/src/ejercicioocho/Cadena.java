/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioocho;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Cadena {
    
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }
    
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }
    
    public void llenarCadena(){
        
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese una frase: ");
        frase = entrada.nextLine();
        longitud = frase.length();
        
    }

    public void mostrarVocales(){

        String caracter;
        int contador = 0;

        for (int i = 0; i < longitud; i++) {

            caracter = frase.substring(i, i + 1);

            if (caracter.equalsIgnoreCase("A") || caracter.equalsIgnoreCase("E") || caracter.equalsIgnoreCase("I") || caracter.equalsIgnoreCase("O") || caracter.equalsIgnoreCase("U")) {
                contador++;
            }
        }
        System.out.println("Cantidad de vocales encontradas en la frase: " + contador);
    }

    public void invertirFrase() {

        int contInvertido = frase.length();
        String fraseInvertida = "";

        for (int i = frase.length() - 1; i >= 0; i--) {

            fraseInvertida  = fraseInvertida.concat(frase.substring(i, i + 1));

        }

        System.out.println("Frase ingresada: " + frase);
        System.out.println("Frase invertida: " + fraseInvertida);
    }

    public void vecesRepetido(String letra) {

        String caracter;
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {

            caracter = frase.substring(i, i + 1);

            if (caracter.equalsIgnoreCase(letra)) {

                contador++;

            }

        }
        System.out.println("Cantidad de veces que se repite el caracter buscado: " + contador);

    }
    
    public void compararLongitud(String frase){
        
        if (this.frase.length() == frase.length()) {
            
            System.out.println("Las frases tienen la misma longitud.");
            
        }else{
            System.out.println("Las frases no tienen la misma longitud");
        }
        
    }
    
    public void unirFrases(String frase){
    
        this.frase = this.frase.concat(frase);
        
        System.out.println("Frase resultante: " + this.frase);
        
    }
    
    public void reemplazar(String letra){
    
        frase = frase.replace('a', letra.charAt(0));
        
        System.out.println("Frase resultante: " + frase);
        
    }
    
    public boolean contiene(String letra){
        
        return frase.contains(letra);
          
    }
    
}
