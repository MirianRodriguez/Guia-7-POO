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
public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void crearCuenta(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el numero de cuenta: ");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el dni del cliente: ");
        dni = leer.nextLong();
        System.out.println("Inngrese el saldo actual de la cuenta: ");
        saldoActual = leer.nextDouble();
    }
    
    public void ingresar(double ingreso){
        if (ingreso > 0){
            saldoActual += ingreso;
        }else{
            System.out.println("El monto ingresado no es valido");
        }
    }
    
    public void retirar(double retiro){
        if (retiro > 0){
            if (retiro > saldoActual){
                System.out.println("No tiene suficiente dinero en la cuenta. Se debitara todo lo disponible.");
                saldoActual = 0;
            }else{
                saldoActual -= retiro;
            }
        }else{
            System.out.println("El monto ingresado no es valido");
        }
    }
    
    public void extraccionRapida(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double retiro, veintePorciento;
        veintePorciento = (20*saldoActual)/100;
        System.out.println("Ingrese el monto a retirar: ");
        retiro = leer.nextDouble();
        if (retiro > 0){     
            if (retiro <= veintePorciento){
                saldoActual -= retiro;
            }else{
                System.out.println("El monto ingresado excede el 20% de su saldo. ");
            }
        }else{
            System.out.println("El monto ingresado no es valido");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("El saldo actual es: $ " + saldoActual);
    }
    
    public void consultarDatos(){
        System.out.println("DATOS DE LA CUENTA");
        System.out.println("Numero de cuenta:   " + numeroCuenta);
        System.out.println("DNI del cliente:    " + dni);
        System.out.println("Saldo actual:       $ " + saldoActual);
    }
}
