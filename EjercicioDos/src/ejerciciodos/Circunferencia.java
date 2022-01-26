/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
    }
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Inserte el radio del circulo");
        this.radio = leer.nextDouble();
    }
    
    public double area(){
        double area;
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }
    
    public double perimetro(){
        double perimetro;
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
    
}
