/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg7;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc=0;
           char opc2 = 0;
           Scanner entrada=new Scanner(System.in);
        Stack<Integer> pila=new Stack<>();
        Queue<Integer> cola=new LinkedList<>();
        do{
         
        
        System.out.println("Menu Principal");
        System.out.println("1)Crud de Pilas");
        System.out.println("2)Crud de Colas");
        System.out.println("");
        System.out.println("Ingrese el numero del menu que desea:");
        opc=entrada.nextInt();
        entrada.nextLine();
        switch(opc){
            case 1:{
                char opcP=0;
                int numero=0,indice=0,nuevoNumero=0,NumeroABuscar=0,numeroAEliminar=0,numeroAActualizar=0;
                Stack<Integer> pilaAux=new Stack<>();
                do{
                int opcPilas=0;
                System.out.println("Menu Pilas");
                System.out.println("Ingreso");
                System.out.println("Mostrar"); 
                System.out.println("Buscar");
                System.out.println("Actualizar");
                System.out.println("Eliminar");
                    System.out.println("");
                    System.out.println("Ingrese la opcion que desea:");
                    opcPilas=entrada.nextInt();entrada.nextLine();
                switch(opcPilas){
                    case 1:{
                        System.out.println("Ingrese el numero que va a añadir a la pila:");
                        numero=entrada.nextInt();entrada.nextLine();
                        pila.push(numero);
                        break;
                    }
                    case 2:{
                        System.out.println("Elementos:"+Arrays.asList(pila));
                       
                        break;
                    }
                    case 3:{
                        System.out.println("Ingrese el numero que desea Buscar:");
                        NumeroABuscar=entrada.nextInt();entrada.nextLine();
                        if (pila.contains(NumeroABuscar)) {
                            System.out.println("Si esta en la pila");
                        } else {
                            System.out.println("No esta en la pila");
                        }
                        
                        break;
                    }
                    case 4:{
                        
                        System.out.println("Ingrese el elemento a Actualizar:");
                        numeroAActualizar=entrada.nextInt();entrada.nextLine();
                        if (pila.contains(numeroAActualizar)) {
                            System.out.println("Ingrese el nuevo numero:");
                            nuevoNumero=entrada.nextInt(); entrada.nextLine();
                            indice=pila.indexOf(numeroAActualizar);
                            pila.add(indice, nuevoNumero);
                            int numeroP=0;
                            while(!pila.empty()){
                            numeroP=pila.pop();
                            if(numeroP!=numeroAActualizar){
                                pilaAux.add(numeroP);
                            }
                        }
                        while(!pilaAux.empty()){
                            numeroP=pilaAux.pop();
                                pila.add(numeroP);
                            
                        }
                            System.out.println("Actualizado !! :D");
                            System.out.println(Arrays.asList(pila));
                        } else {
                            System.out.println("Este numero no se puede Actualizar\nDebido a que no exite en la pila");
                        }
                        break;
                    }
                    case 5:{
                        int numeroP=0;
                        System.out.println("Ingrese el numero a eliminar de la pila:");
                        numeroAEliminar=entrada.nextInt();entrada.nextLine(); 
                        if (pila.contains(numeroAEliminar)) {
                        while(!pila.empty()){
                            numeroP=pila.pop();
                            if(numeroP!=numeroAEliminar){
                                pilaAux.add(numeroP);
                            }
                        }
                        while(!pilaAux.empty()){
                            numeroP=pilaAux.pop();
                                pila.add(numeroP);
                            
                        }
                            System.out.println("Elemento Eliminado");
                            System.out.println(Arrays.asList(pila));
                        } else {
                            System.out.println("Este numero no esta en la pila");
                        }
                        break;
                    }
                    default:{
                        System.out.println("Opcion Incorrecta");
                        break;
                    }
                }
                    System.out.println("Desea Seguir en este menu?");
                    opcP=entrada.nextLine().charAt(0);
                }while(opcP=='S');
                break;
            }
            case 2:{
                int opcColas=0;
                System.out.println("Menu Colas");
                System.out.println("Ingreso");
                System.out.println("Mostrar"); 
                System.out.println("Buscar");
                System.out.println("Actualizar");
                System.out.println("Eliminar");
                
                break;
            }
            default:{
                System.out.println("Opcion Invalida");
                break;
            }
           
        }
            System.out.println("Desea Coninuar");
            opc2=entrada.nextLine().charAt(0);
        }while(opc2=='S');
    }
    
}
