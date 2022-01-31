/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la base del rectangulo: ");
        base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = leer.nextInt();
    }
    
    public void calcularSuperficie(){
        System.out.println("La superficie del rectangulo es: " + base*altura);
    }
    
    public void calcularPerimetro(){
        System.out.println("El perimetro del rectangulo es: " + (base+altura)*2);
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
