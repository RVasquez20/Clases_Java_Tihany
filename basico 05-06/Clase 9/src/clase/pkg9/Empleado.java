/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg9;

/**
 *
 * @author rodri
 */
public class Empleado extends Persona
{
    public  int codigoEmpleado;
    public String puesto;

    public Empleado(int codigoEmpleado, String puesto, String nombre, String apellido, String direccion, int edad) {
        super(nombre, apellido, direccion, edad);
        this.codigoEmpleado = codigoEmpleado;
        this.puesto = puesto;
    }

    @Override
    public void MostrarDatos() {
      System.out.println("Nombre:"+this.getNombre());
        System.out.println("Apellido:"+this.getApellido());
        System.out.println("Direccion:"+this.getDireccion());
        System.out.println("Codigo De Empleado:"+codigoEmpleado);
        System.out.println("Puesto:"+puesto);
        System.out.println("==========================================");
    }

   
    
}
