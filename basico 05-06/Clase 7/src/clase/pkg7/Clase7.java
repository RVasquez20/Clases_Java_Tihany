/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg7;
import java.util.*;
/**
 *
 * @author rodri
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    /*
    Hacer un programa para calcular el area de poligonos(Triangulo y Rectangulo) 
    el programa debe de ser capaz de almacenar en un arreglo N triangulos y rectangulos
    y al final mostrar el area y los datos de cada uno.Para ello se tendra lo siguiente:
    -una superclase llamada poligono (Abstracto)
    -una sub clase llamada rectangulo
    -una sub clase llamada triangulo
     
     */
    static ArrayList<Poligono> poligonos=new ArrayList<>();
    static Scanner entrada=new Scanner(System.in);
    /*
    static sirve para que tanto el scanner y el arraylist puedan ser utulizados
    dentro de otros metodos que se estaran implementando en el main ya que el main 
    es static
    
    */
    public static void main(String[] args) {
        llenarDatos();
        mostrarResultados();
    }
    
    public static void llenarDatos(){
        int opc=0;
        char respuesta;
        do{
          do{
                System.out.println("Digite la opcion de poligono que desea:");
                System.out.println("1.Rectangulo");
                System.out.println("2.Triangulo");
                System.out.print("Opcion:");
                opc=entrada.nextInt();
          }while(opc<1||opc>2);
            switch(opc){
                case 1:{
                    LlenarRectangulo();
                    break;
                }
                 case 2:{
                     LlenarTriangulo();
                    
                    break;
                }
                default:{
                    System.out.println("Opcion no disponible");
                    break;
                }
            }
            System.out.println("Desea ingresar otro poligono S||N");
            respuesta=entrada.next().charAt(0);
            System.out.println("");
        }while(respuesta=='S'||respuesta=='s');
        
    }

    private static void LlenarTriangulo() {
        double lado1,lado2,lado3;
        System.out.println("Ingrese el lado 1 del triangulo");
        lado1=entrada.nextDouble();
        System.out.println("Ingrese el lado 2 del triangulo");
        lado2=entrada.nextDouble();
        System.out.println("Ingrese el lado 3 del triangulo");
        lado3=entrada.nextDouble();
        poligonos.add(new Triangulo(lado1,lado2,lado3));
    }
    

    private static void LlenarRectangulo() {
        double lado1,lado2;
        System.out.println("Ingrese el lado 1 del Rectangulo");
        lado1=entrada.nextDouble();
        System.out.println("Ingrese el lado 2 del Rectangulo");
        lado2=entrada.nextDouble();
        poligonos.add(new Rectangulo(lado1,lado2));
    }
    
    public static void mostrarResultados(){
        for (Poligono poligono : poligonos) {
            System.out.println(poligono.toString());
            System.out.println("Area="+poligono.area());
            System.out.println("*-----------------------*");
        }
    }
    
}
