/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg6;

/**
 *
 * @author rodri
 */
public class Clase6 {
/*Polimorfismo:
    *Es una relacion de tipo herencia, un objeto de la superclase(Clase padre)
    puede almacenar un objeto de cualquiera de sus subclases(Clases hijas)
    Ej:
    Persona(Clase Padre)->Estudiante(Clase Hija)
    Persona obj1=new Estudiante();
    
    *Esto significa que la clase padre o superclase es compatible 
    con los tipos que derivan de ella. PERO NO AL REVES
    Ej:
    Persona(Clase Padre)->Estudiante(Clase Hija)
    Persona obj1=new Estudiante();<-- Correcto
    Estudiante obj1=new Persona();<-- Incorrecto
    
    
    
    Persona obj1=new Persona();
    
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Vehiculo misVehiculos[]=new Vehiculo[4];
       misVehiculos[0]=new Vehiculo("P0393G","Ferrari","A89");
       misVehiculos[1]=new VehiculoTurismo(4,"P112G","Audi","P14");
       misVehiculos[2]=new VehiculoDeportivo(500,"P156G","Toyota","Kj13");
       misVehiculos[3]=new VehiculoFulgoneta(2000,"P896G","Toyota","J14");
        for (Vehiculo misVehiculo : misVehiculos) {
            System.out.println(misVehiculo.toString());
        }
    }
    
}
