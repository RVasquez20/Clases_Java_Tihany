/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Clase5 {

    /**
     * diseñar un programa para trabajar con triangulos de isosceles.Para ello defina los atributos
     * necesarios que se requieren, proporcione metodos de consulta , un metodo contructor e implemente metodos para calcular 
     * el perimetro y el area de un triangulo, ademas implementar un metodo que a partir de un arreglo de triangulos
     * devuelva el area del triangulo de mayor superficie.
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double base,lado;
        int nTriangulos;
        System.out.println("Ingrese la cantidad de triangulos que desea registrar");
        nTriangulos=entrada.nextInt();
        Triangulo_Isosceles[] triangulos=new Triangulo_Isosceles[nTriangulos];
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("Ingrese la base:");
            base=entrada.nextDouble();
            System.out.println("Ingrese el lado:");
            lado=entrada.nextDouble();            
            triangulos[i]=new Triangulo_Isosceles(base, lado);
            System.out.println("El Perimetro es :"+triangulos[i].obtenerPerimetro());
            System.out.println("El Area es :"+triangulos[i].obtenerArea());
            System.out.println("-------------------------------------------");
        }
        System.out.println("===================================================");
        System.out.println("El mayor area es "+mayorArea(triangulos));
    }
    public static double mayorArea(Triangulo_Isosceles triangulo[]){
        double area;
        area=triangulo[0].obtenerArea();
        for (int i = 1; i < triangulo.length; i++) {
            if (triangulo[i].obtenerArea()>area) {
                area=triangulo[i].obtenerArea();
            }
        }
        return area;
    }
    /*Construir un programa para trabajar con 2 numeros complejos, implemente el siguiente menu:
    1.Sumar dos numeros complejos
    2.Multiplicar 2 numeros complejos
    3.Comparar 2 numeros complejos(iguales o no)
    4.Multiplicar un numero complejo por un entero
*/
    
}
