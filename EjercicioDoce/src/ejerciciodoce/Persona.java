/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodoce;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author mirod
 */
public class Persona {
    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void crearPersona(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int dia, mes, anio;
        String nombreI;
        System.out.println("Ingrese el nombre: ");
        this.nombre = leer.nextLine();
        System.out.println("Ingrese el dia de nac: ");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes de nac: ");
        mes = leer.nextInt();
        System.out.println("Ingrese el anio de nac: ");
        anio = leer.nextInt();
        this.fechaNacimiento = new Date(anio, mes, dia);
                
    }
    
    public void calcularEdad(){
        Date hoy = new Date();
        long nacEnMili = this.fechaNacimiento.getTime();
        long hoyEnMili = hoy.getTime();
        long difEnMili = hoyEnMili - nacEnMili;
        //long anioEnMiliseg = 31536000000L;
        System.out.println("la persona tiene: " + difEnMili / 3.154E+10);
    }
    
    
    
    
}
