/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg3;

/**
 *
 * @author Rodrigo
 */
public class LibroCalificaciones {
   
    public void mostrarMensaje(String nombreDelCurso){
        int x;
        //System.out.println("Bienvenido al libro de calificaciones para "+nombreDelCurso);
        switch(nombreDelCurso){
            case "Java":{
                System.out.println("Bienvenido al libro de calificaciones para "+nombreDelCurso+" programacion 3");
                break;
            }
            case "c#":{
                System.out.println("Bienvenido al libro de calificaciones para "+nombreDelCurso+" prueba 2");
                break;
            }
            default:{
                System.out.println("Bienvenido al libro de calificaciones para "+nombreDelCurso);
                break;
            }
        }
    }
    
}
