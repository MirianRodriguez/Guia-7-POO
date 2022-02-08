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
public class Matematica {
    
    private double numReal1;
    private double numReal2;

    public Matematica() {
    }

    public Matematica(double numReal1, double numReal2) {
        this.numReal1 = numReal1;
        this.numReal2 = numReal2;
    }

    public double getNumReal1() {
        return numReal1;
    }

    public void setNumReal1(double numReal1) {
        this.numReal1 = numReal1;
    }

    public double getNumReal2() {
        return numReal2;
    }

    public void setNumReal2(double numReal2) {
        this.numReal2 = numReal2;
    }
    
    public double devolverMayor(){
    
        if (numReal1 > numReal2) {
            return numReal1;
        }
        return numReal2;
    }
    
    public double calcularPotencia(){
    
        double numMayor;
        double numMenor;
        double potencia;
        
        if (numReal1>numReal2) {
            numMayor = Math.round(numReal1);
            numMenor = Math.round(numReal2);
            
        }else{
            numMayor = Math.round(numReal2);
            numMenor = Math.round(numReal1);
        }
        //System.out.println("Valor 1: " + numMayor);
        //System.out.println("Valor 2: " + numMenor);
        potencia = Math.pow(numMayor, numMenor);  
        
        return potencia;
    
    }
    
    public double calcularRaiz(){
        
        double numMenor;
        double raizCuadrada;
        
        if (numReal1<numReal2) {
            numMenor = Math.abs(numReal1);        
        }else{
            numMenor = Math.abs(numReal2);
        }  
        //System.out.println("Valor: " + numMenor);
        raizCuadrada = Math.sqrt(numMenor);  
        
        return raizCuadrada;
        
    }    
}
