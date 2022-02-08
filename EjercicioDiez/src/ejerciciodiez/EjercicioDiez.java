/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiez;

import java.util.Arrays;

/**
 *
 * @author mirod
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        System.out.println("LLENADO DEL ARREGLO A");
        llenarArregloAleatorio(arregloA);
        System.out.println("ARREGLO A: ");
        mostrarArreglo(arregloA);
        Arrays.sort(arregloA);
        System.out.println("ARREGLO A ORDENADO");
        mostrarArreglo(arregloA);
        llenarArregloB(arregloA, arregloB);
        System.out.println("ARREGLO B");
        mostrarArreglo(arregloB);
    }
    
    public static void llenarArregloAleatorio(double[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random()*10;
        }
    }
    
    public static void mostrarArreglo(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.2f - ", array[i] );
        }
        System.out.println("");
    }
    
    public static void llenarArregloB(double[] arregloA, double[] arregloB){
        for (int i = 0; i < arregloB.length; i++) {
            if (i<10){
                arregloB[i] = arregloA[i];
            }else{
                arregloB[i] = 0.5;
            }
        }
    }
    
}
