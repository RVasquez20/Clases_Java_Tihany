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
public class Estudiante extends Persona{
    private int codigoEstudiante;
    private double NotaFinal;

    public Estudiante(int codigoEstudiante, double NotaFinal, String Nombre, String DNI, int Edad) {
        super(Nombre, DNI, Edad);
        this.codigoEstudiante = codigoEstudiante;
        this.NotaFinal = NotaFinal;
    }

   

  
    

    @Override
    public String toString() {
        return "Estudiante{Nombre="+getNombre() +" Edad="+this.getEdad()+" DNI="+this.getDNI()+ " codigoEstudiante=" + codigoEstudiante + ", NotaFinal=" + NotaFinal + '}';
    }
   
    
    
}
