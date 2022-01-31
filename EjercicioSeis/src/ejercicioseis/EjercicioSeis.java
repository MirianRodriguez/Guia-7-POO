/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseis;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cafetera cafetera = new Cafetera();
        cafetera.crearCafetera();
        cafetera.verDatosCafetera();
        
        System.out.println("LLENAR CAFETERA");
        cafetera.llenarCafetera();
        cafetera.verDatosCafetera();
        
        System.out.println("SERVIR TAZA DE CAFE");
        System.out.println("Ingrese la capacidad de la taza en ml: ");
        int servir = leer.nextInt();
        cafetera.servirTaza(servir);
        cafetera.verDatosCafetera();
        
        System.out.println("VACIAR CAFETERA");
        cafetera.vaciarCafetera();
        cafetera.verDatosCafetera();
        
        System.out.println("AGREGAR CAFE");
        System.out.println("Ingrese la cantidad de cafe que cargara (ml): ");
        int agregar = leer.nextInt();
        cafetera.agregarCafe(agregar);
        cafetera.verDatosCafetera();
    }
    
}
