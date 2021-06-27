/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg6;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     * Stack->Pila(LIFO)
     * Algoritmos(PSEINT)
     * 
     */
    public static void main(String[] args) {
     Stack<Integer> pila=new Stack<>();
     
    //Ingreso de datos
        for (int i = 0; i < 10; i++) {
            pila.push(i);
        }
        /*
      9->  9 
      8->  8  8
      7->  7  7
      6->  6  6
      5->  5  5
      4->  4  4
      3->  3  3
      2->  2  2
      1->  1  1
      0->  0  0
        */
        
        //Metodo para Ver los datos de la pila sin sacarlos
        
        System.out.println(Arrays.asList(pila));
        
        //Sacar elementos de la pila(Metodo pop saca elementos de la cima hacia el inicio de la pila)
        
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.asList(pila));
            System.out.println(pila.pop());
        }
        
        System.out.println("-------------");
        //Reingreso de datos
        for (int i = 0; i < 10; i++) {
            pila.push(i);
        }
        
        //get=mostrar elementos de la pila mas no sacarlo
        for (int i = 0; i < 10; i++) {
            System.out.println(pila.get(i));
        }
        System.out.println(Arrays.asList(pila));
        
        //Buscar en una pila
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el numero que esta buscando en la pila");
        int datoD=entrada.nextInt();
        if (pila.contains(datoD)) {
            System.out.println("Se encontro el valor en la pila "+pila.indexOf(datoD));        
        } else {
            System.out.println("No se encontro");
        }
        
        //Modificar un elemento
        System.out.println("Ingrese el numero que esta buscando en la pila para modificar");
        int datoDa=entrada.nextInt();
        if (pila.contains(datoD)) {
            int indice=pila.indexOf(datoDa);
            System.out.println("Se encontro el valor en la pila "+indice);     
             System.out.println("Ingrese el dato nuevo");
        int datoN=entrada.nextInt();
        pila.set(indice, datoN);
        } else {
            System.out.println("No se encontro");
        }
       System.out.println(Arrays.asList(pila));
       
       //Clonar una pila a otra
       
       Stack<Integer>pila2=new Stack<>();
        for (int i = 0; i < 10; i++) {
            pila2.add(i, pila.get(i));
        }
        
            System.out.println(Arrays.asList(pila2));
    }
    
}
