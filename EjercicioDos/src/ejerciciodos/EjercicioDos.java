/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;

/**
 *
 * @author mirod
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();
        c1.crearCircunferencia();
        System.out.printf("El area de la circunferencia es: %.2f \n", c1.area());
        System.out.printf("El perimetro de la circunferencia es: %.2f \n", c1.perimetro());
    }
    
}
