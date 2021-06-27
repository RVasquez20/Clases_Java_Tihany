/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg4;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     * EDD:
     * ArrayList 
     */
    //Datos Primitivos: byte,int,long,short,float,double,boolean,char
    //Datos No Primitivos: Integer,Double,Float,Character,String
    public static void main(String[] args) {
        ArrayList<Integer> miPrimerArrayList=new ArrayList<>();
        //Elementos//1->2->3->4
        //Indices  //0  1  2  3
        Scanner entrada=new Scanner(System.in);
        //Ingreso De datos
        miPrimerArrayList.add(1);
        miPrimerArrayList.add(2);
        miPrimerArrayList.add(3);
        miPrimerArrayList.add(4);
        
        //Mostrar Valores mas no sacarlos del arraylist
        
        //Opcion 1: Para recorrer y mostrar los elementos de un arraylist
        //Con un For i
        for (int i = 0; i < miPrimerArrayList.size(); i++) {
            System.out.println(miPrimerArrayList.get(i));
        }
        System.out.println("");
        //Opcion 2: Para recorrer y mostrar los elementos de un arraylist
        //Con un For Each
        for (Integer x : miPrimerArrayList) {
            System.out.println(x);
        }
        System.out.println("");
        //Opcion 3: Para recorrer y mostrar los elementos de un arraylist
        //Con un asList, [[1,2,3,4]]
        System.out.println(Arrays.asList(miPrimerArrayList));
        
        //Eliminar o Remover un Elemento Del ArrayList
            //opcion 1: removeAll=Remover todos los elementos de un ArrayList
            miPrimerArrayList.removeAll(miPrimerArrayList);
            System.out.println(Arrays.asList(miPrimerArrayList));
        
        //Reingreso de Datos    
        miPrimerArrayList.add(1);
        miPrimerArrayList.add(2);
        miPrimerArrayList.add(3);
        miPrimerArrayList.add(4);
        System.out.println("Reingreso :"+Arrays.asList(miPrimerArrayList));    
            //opcion 2: clear= Limpiar
            miPrimerArrayList.clear();
             System.out.println(Arrays.asList(miPrimerArrayList));
             
         //Reingreso de Datos    
        miPrimerArrayList.add(1);
        miPrimerArrayList.add(2);
        miPrimerArrayList.add(3);
        miPrimerArrayList.add(4);
        System.out.println("Reingreso :"+Arrays.asList(miPrimerArrayList)); 
        
        //Cantidad De Elementos que tiene el ArrayList
        System.out.println("Cantidad De elementos :"+miPrimerArrayList.size());
        
        //Arrays: para ordenamientos
        Integer[] Array={5,1,2,6,10,1222,12,122,12232,124,1225};
        
        //Ordenar De manera Ascendente
        //Arraylist con metodo asList[[1,2,3,4]],Array con metodo asList [1,2,3,4]
        //Sort ordena de menor a mayor
        Arrays.sort(Array);
        System.out.println(Arrays.asList(Array));
        
        //Ordenar De manera Descendente
        Arrays.sort(Array,Collections.reverseOrder());
        System.out.println(Arrays.asList(Array));
        
        //Contains = Contiene
        System.out.println("Digite un numero a buscar dentro del ArrayList");
        int numeroBusqueda=entrada.nextInt();
        if (miPrimerArrayList.contains(numeroBusqueda)) {
            System.out.println("Si se encuentra dentro del ArrayList");
        } else {
            System.out.println("NO se encuentra dentro del ArrayList");
        }
        
        //remove=remover un valor en base al indice
        System.out.println(Arrays.asList(miPrimerArrayList));
        miPrimerArrayList.remove(2);
         System.out.println(Arrays.asList(miPrimerArrayList));
         
         //Tarea: Hacer un CRUD con ArrayList
    }
    
}
