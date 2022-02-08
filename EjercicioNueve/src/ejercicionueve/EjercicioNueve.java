/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionueve;

/**
 *
 * @author mirod
 */
public class EjercicioNueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        double valor1 = Math.random()*10;
        double valor2 = Math.random()*10;
        
        matematica.setNumReal1(valor1);
        matematica.setNumReal2(valor2);
        
        System.out.printf("Valor 1: %.2f \n", matematica.getNumReal1());
        System.out.printf("Valor 2: %.2f \n", matematica.getNumReal2());
        
        System.out.printf("El valor mayor es: %.2f \n", matematica.devolverMayor());
        
        System.out.printf("La potencia entre los valores es: %.2f \n", matematica.calcularPotencia());
        
        System.out.printf("La raiz cuadrada del menor valor es: %.2f \n", matematica.calcularRaiz());
    }
    
}
