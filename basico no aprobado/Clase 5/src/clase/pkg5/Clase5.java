/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     * TDA->EDD
     *QUEUE->Colas
     */
    public static void main(String[] args) {
      Queue<Integer> cola1=new LinkedList<>();
        //Queue<Integer> cola2=new PriorityQueue<>();
      //Agregar datos
      
      cola1.add(1);
      cola1.add(5);
      cola1.add(3);
      cola1.add(2);
      cola1.add(6);
      cola1.add(10);
      cola1.add(1222);
      //1,5,3,2,6,10,1222
      //Mostrar Datos pero no sacar los datos
      
      System.out.println(cola1);
      
      //Quitar o sacar un elemento de la cola
      
      int numeroRemovido=cola1.remove();
        System.out.println("La cola es: "+cola1+" Y se elimino el elemento :"+numeroRemovido);
        cola1.remove();
       //3,2,6,10,1222
      //El elemento que esta de primero en la cola(No lo elimina)
      
//      int primero=cola1.peek();
//        System.out.println("El primer elemento de la cola es "+primero);
        System.out.println("El primer elemento de la cola es "+cola1.peek());
       //3,2,6,10,1222
        System.out.println(cola1);
        
        //El tamaño de la cola-> la cantidad de elementos en la cola
        
        System.out.println("La cola es :"+cola1+"\nEl tamaño es:"+cola1.size());
        
        //Sacar un elemento mostrarlo pero sin almacenarlo en una variable
        
        System.out.println("Se elimino de la cola el elemento:"+cola1.poll()+"\nLa cola es:"+cola1);
        //2,6,10,1222
        
        //Otro metodo para agregar elementos
        cola1.offer(44);
        System.out.println(cola1);
        
        //Otro metodo para ver el inicio de la cola
        System.out.println(cola1.element());
        
        //Saber si la cola contiene un numero
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el dato a buscar :D :");
        int busqueda=entrada.nextInt();
        if (cola1.contains(busqueda)) {
            System.out.println("Si se encuentra en la cola");
        } else {
            System.out.println("No se encuentra en la cola");
        }
        
        //Vaciar la cola
        //opcion 1: Elminar todo con un metodo
        cola1.removeAll(cola1);
        System.out.println(cola1);
         cola1.add(1);
      cola1.add(5);
      cola1.add(3);
      cola1.add(2);
      cola1.add(6);
      cola1.add(10);
      cola1.add(1222);
      
      //opcion 2:while
      while(!cola1.isEmpty()){
                System.out.println(cola1);
          cola1.remove();
          
      }
          cola1.add(1);
      cola1.add(5);
      cola1.add(3);
      cola1.add(2);
      cola1.add(6);
      cola1.add(10);
      cola1.add(1222);
       while(cola1.poll()!=null){
                System.out.println(cola1.peek());
          
      }
      System.out.println(cola1.peek());
    }
    /*
    Hacer un menu con todos los metodos de la cola utilizando Strings
    */
}
