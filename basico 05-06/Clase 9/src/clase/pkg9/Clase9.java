/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Clase9 {
static Scanner datos=new Scanner(System.in);
static ArrayList<Persona>Personas=new ArrayList<>();
static String nombre,apellido,direccion;
static int edad;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       menuPrincipal();
    }

    private static void menuPrincipal() {
       int opc=0;
        System.out.println("Menu Principal");
        System.out.println("1)Empleado");
        System.out.println("2)Estudiante");
        System.out.println("3)Mostrar Datos Ingresados");
        System.out.println("4)Salir");
        System.out.println("Ingrese La opcion que desea ingresar:");
        opc=datos.nextInt();datos.nextLine();
        switch(opc){
            case 1:{
                ingresoEmpleados();
                menuPrincipal();
                break;
            }
            case 2:{
                ingresoEstudiante();
                menuPrincipal();
                break;
            }
             case 3:{
                 mostrarDatos();
                 menuPrincipal();
                break;
            }
            case 4:{
                System.out.println("Gracias por utilizaar el sistema :D");
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Opcion invalida");
                menuPrincipal();
                break;
            }
        }
    }

    private static void ingresoEmpleados() {
      int codigoempleado=0;
      String puesto="";
      datos.nextLine();
        System.out.println("Ingrese el nombre");
        nombre=datos.nextLine();
        System.out.println("Ingrese el apellido");
        apellido=datos.nextLine();
        System.out.println("Ingrese la Direccion");
        direccion=datos.nextLine();
        System.out.println("Ingrese la edad");
        edad=datos.nextInt();
        datos.nextLine();
        System.out.println("Ingrese el codigo de Empleado");
        codigoempleado=datos.nextInt();datos.nextLine();
        System.out.println("Ingrese el puesto");
        puesto=datos.nextLine();datos.nextLine();
        Personas.add(new Empleado(codigoempleado,puesto,nombre,apellido,direccion,edad));
    }

    private static void ingresoEstudiante() {
         int codigoestudiante=0;
         int contador=0;
         ArrayList<Double>notas=new ArrayList<>();
         double nota;
         String opc = "";
         datos.nextLine();
        System.out.println("Ingrese el nombre");
        nombre=datos.nextLine();
        System.out.println("Ingrese el apellido");
        apellido=datos.nextLine();
        System.out.println("Ingrese la Direccion");
        direccion=datos.nextLine();
        System.out.println("Ingrese la edad");
        edad=datos.nextInt();
        datos.nextLine();
        System.out.println("Ingrese el codigo de Estudiante");
        codigoestudiante=datos.nextInt();datos.nextLine();
        do{
            contador++;
            System.out.println("Ingrese la nota "+contador);
            notas.add(nota=datos.nextDouble());datos.nextLine();
            System.out.println("Desea ingresar otra nota S||N?");
            opc=datos.nextLine();datos.nextLine();
        }while(opc.toLowerCase().equals("s"));
        Personas.add(new Estudiante(codigoestudiante,notas,nombre,apellido,direccion,edad));
    }

    private static void mostrarDatos() {
        for (Persona item : Personas) {
            item.MostrarDatos();
        }
    }

    
    
}
