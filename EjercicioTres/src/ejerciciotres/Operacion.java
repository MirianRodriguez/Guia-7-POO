/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Operacion {

    private double numero1, numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el primer valor: ");
        numero1 = leer.nextDouble();
        System.out.println("Ingrese el 2do valor: ");
        numero2 = leer.nextDouble();
    }

    public double sumar() {
        double suma;
        suma = numero1 + numero2;
        return suma;
    }

    public double restar() {
        double resta;
        resta = numero1 - numero2;
        return resta;
    }

    public double multiplicar() {
        double multiplicacion;
        if (numero1 != 0 && numero2 != 0){           
            multiplicacion = numero1 * numero2;
        }else{
            multiplicacion = 0;
            System.out.println("No se puede multiplicar por 0");
        }
        return multiplicacion;
    }

    public double dividir() {
        double division;
        if (numero2 != 0) {
            division = numero1 / numero2;
        }else{
            division = 0;
            System.out.println("No se puede dividir por 0");
        }
        return division;
    }
}
