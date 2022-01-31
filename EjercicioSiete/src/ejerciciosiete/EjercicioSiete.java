/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosiete;

/**
 *
 * @author mirod
 */
public class EjercicioSiete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        int imc;
        boolean esMayor;
        
        int pesoIdeal, pesoBajo, pesoAlto, mayores, menores, cantidadPersonas;
        
        pesoIdeal = pesoBajo = pesoAlto = mayores = menores = 0;
        
        Persona personas[] = {persona1, persona2, persona3, persona4};
        
        cantidadPersonas = personas.length;

        for (int i = 0; i < personas.length; i++) {

            System.out.printf("Persona %d \n", i + 1);
            personas[i].crearPersona();

            imc = personas[i].calcularIMC();

            if (imc == -1) {
                System.out.println("La persona presenta bajo peso.");
                pesoBajo++;

            } else if (imc == 0) {
                System.out.println("La persona presenta peso ideal.");
                pesoIdeal++;

            } else {
                System.out.println("La persona presenta sobrepeso");
                pesoAlto++;
            }

            esMayor = personas[i].esMayorDeEdad();

            if (esMayor) {
                System.out.println("La persona es mayor de edad.");
                mayores++;
            } else {
                System.out.println("La persona es menor de edad.");
                menores++;
            }
            
            
            System.out.println("");
        }
        
        System.out.printf("El %d Porciento de las personas tiene bajo peso. \n", (pesoBajo*100)/cantidadPersonas);
        System.out.printf("El %d Porciento de las personas tiene peso ideal. \n", (pesoIdeal*100)/cantidadPersonas);
        System.out.printf("El %d Porciento de las personas tiene sobrepeso. \n", (pesoAlto*100)/cantidadPersonas);
        System.out.printf("El %d Porciento de las personas son mayores de edad. \n", (mayores*100)/cantidadPersonas);
        System.out.printf("El %d Porciento de las personas son menores de edad. \n", (menores*100)/cantidadPersonas);

    }
    
}
