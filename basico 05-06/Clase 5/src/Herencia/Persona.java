/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author rodri
 */
public class Persona {
   private String Nombre,DNI;
   private int Edad;

    public Persona(String Nombre, String DNI, int Edad) {
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return Edad;
    }
   
}
