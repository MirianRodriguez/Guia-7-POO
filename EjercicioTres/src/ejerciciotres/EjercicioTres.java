/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;

/**
 *
 * @author mirod
 */
public class EjercicioTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println("La suma de los valores ingresados es: " + operacion.sumar());
        System.out.println("La resta de los valores ingresados es: " + operacion.restar());
        if (operacion.multiplicar()!=0){
            System.out.println("El producto de los valores ingresados es: " + operacion.multiplicar());
        }
        if (operacion.dividir()!=0){
            System.out.println("El cociente de los valores ingresados es: " + operacion.dividir());
        }
    }
    
}
