/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo1;

/**
 *
 * @author rodri
 */
public class Persona {
    private String Nombre;
    //private final int Edad;
private int Edad;
    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }
//setter= miniconstructor para dar valor a un atributo
    //getter=miniconstructor para ver el valor de un atributo
    
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    
}
