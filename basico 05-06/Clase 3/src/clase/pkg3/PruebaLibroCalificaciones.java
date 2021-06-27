/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg3;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
/*
Modificadores de acceso:
public:cualquier clase puede usar sus atributos y metodos
private: solamente objetos de esa clase pueden usar sus atributos y metodos
protected:solamente los objetos de esa clase y sus clases hijas pueden usar sus metodos y atributos
*/

public class PruebaLibroCalificaciones {
    public static void main(String[] args) {
        //instancia de un objeto tipo LibroCalificaciones
        LibroCalificaciones miLibro=new LibroCalificaciones();
        Scanner entrada=new Scanner(System.in);
        System.out.println("Escriba el nombre del curso:");
        String nombreCurso=entrada.nextLine();
        System.out.println("");
        miLibro.mostrarMensaje(nombreCurso);
    }
}
