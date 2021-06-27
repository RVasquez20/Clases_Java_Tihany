/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg4;

/**
 *Sobrecarga de contructores
 * @author rodri
 */
public class Persona {
    private String Nombre,Telefono;
    private int Edad;
    //Este constructor vacio solamente se utiliza cuando tenemos 
    //los getters and setters
    public Persona(){}
    
    public Persona(String Nombre,String Telefono, int Edad){
    this.Nombre=Nombre;
    this.Edad=Edad;
    this.Telefono=Telefono;
    }
///Para generar constructores alt + ins
    public Persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }
    //Buscalos!! en Amazon Kindle
//the Clean Code -> Robert c Martin(Todos los demas de el)
    //The cracking coding interview
    //La biblia de HTML y CSS y JS
    //Clean Architecture
    //patrones de disenio de software
  
    public String MostrarDatos() {
        return "Persona{" + "Nombre=" + Nombre + ", Telefono=" + Telefono + ", Edad=" + Edad + '}';
    }
    
     public String MostrarDatos(int km) {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + " Corrio:"+km+" km}";
    }
    
}
