/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();
        cuenta.consultarSaldo();

        System.out.println("INGRESO");
        System.out.println("Ingrese monto a depositar: ");
        double ingreso = leer.nextDouble();
        cuenta.ingresar(ingreso);
        cuenta.consultarSaldo();
        
        System.out.println("EXTRACCION");
        System.out.println("Ingrese el monto a retirar: ");
        double retiro = leer.nextDouble();
        cuenta.retirar(retiro);
        cuenta.consultarSaldo();
        
        System.out.println("EXTRACCION RAPIDA");
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        
        cuenta.consultarDatos();

    }

}
