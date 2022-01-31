/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosiete;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearPersona() {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.print("Ingrese nombre: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese edad: ");
        edad = entrada.nextInt();

        do {
            System.out.print("Ingrese sexo (H,M,O): ");
            sexo = entrada.next().charAt(0);
            if (sexo != 'H' && sexo != 'M' && sexo != 'O') {
                System.out.println("Error, vuelva a intentarlo.");
            }
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');

        System.out.print("Ingrese peso: ");
        peso = entrada.nextDouble();

        System.out.print("Ingrese altura:");
        altura = entrada.nextDouble();

    }

    /**
     * Devuelve -1 si la persona presenta bajo peso 0 la persona presenta peso
     * ideal 1 la persona presenta sobrepeso
     */
    public int calcularIMC() {

        //kg/(altura^2)) 
        double imc = peso / (Math.pow(altura, 2));

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {

        if (edad < 18) {
            return false;
        }
        return true;
    }
    
}
