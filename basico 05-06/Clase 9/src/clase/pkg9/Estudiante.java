/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg9;
import java.util.*;
/**
 *
 * @author rodri
 */
public class Estudiante extends Persona {
public int codigoEstudiante;
public ArrayList<Double> notas;
public double promedio;
    public Estudiante(int codigoEstudiante, ArrayList<Double> notas, String nombre, String apellido, String direccion, int edad) {
        super(nombre, apellido, direccion, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notas = notas;
        double suma=0;
        for (Double nota : notas) {
            suma+=nota;
        }
        this.promedio = suma/notas.size();
    }


    @Override
    public void MostrarDatos() {
        
        System.out.println("Nombre:"+this.getNombre());
        System.out.println("Apellido:"+this.getApellido());
        System.out.println("Direccion:"+this.getDireccion());
        System.out.println("Codigo De Estudiante:"+codigoEstudiante);
         System.out.println("-------------------------------------------");
        for (int i=0;i<notas.size();i++) {
            System.out.println("La nota "+(i+1)+" Es:"+notas.get(i));
        }
         System.out.println("-------------------------------------------");
        System.out.println("El promedio es :"+promedio);
         System.out.println("==========================================");
    }
    
}
