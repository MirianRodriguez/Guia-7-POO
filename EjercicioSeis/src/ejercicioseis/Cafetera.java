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
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void crearCafetera(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la capacidad maxima de la cafetera en ml: ");
        capacidadMaxima = leer.nextInt();
        System.out.println("Ingrese la cantidad actual que tiene cargada la cafetera en ml: ");
        cantidadActual = leer.nextInt();
    }
    
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
    }
    
    public void servirTaza(int servido){
        if (servido>cantidadActual){
            System.out.printf("No se puede llenar la taza. Se cargaran %d ml.\n", cantidadActual);
            cantidadActual = 0;
        }else{
            cantidadActual -= servido;
            System.out.println("Taza llena.");
        }
    }
    
    public void vaciarCafetera(){
        cantidadActual = 0;
    }
    
    public void agregarCafe(int agregado){
        if ((agregado + cantidadActual) > capacidadMaxima){
            cantidadActual = capacidadMaxima;
            System.out.println("No se puede agregar tanto cafe. Se completo la cafetera.");
        }else{
            cantidadActual += agregado;
        }
    }
    
    public void verDatosCafetera(){
        System.out.println("DATOS DE LA CAFETERA");
        System.out.println("Capacidad maxima (ml):   " + capacidadMaxima);
        System.out.println("Cantidad actual (ml):    " + cantidadActual);
    }
}
