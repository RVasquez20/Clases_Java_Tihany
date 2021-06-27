/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
        int numeroEntero=0;
        System.out.println("Ingrese el numero a comprobar:");
        numeroEntero=entrada.nextInt();
        if(numeroEntero%5==0){
            System.out.println(numeroEntero+" Es multiplo de 5");
        }else {
            System.out.println(numeroEntero+" No es multiplo de 5");
        }
       
      
    }
    
}
