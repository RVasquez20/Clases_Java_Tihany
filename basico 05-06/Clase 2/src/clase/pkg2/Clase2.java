/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg2;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        /*
        Operador en Java        Operador        Expresion Algebraica        Expresion en Java
        -------------------------------------------------------------------------------------
            Suma                   +                    x+7                      f+7
            Resta                  -                    x-y                      x-y
            Multiplicacion         *                    xy                       x*y 
            Division               /                    x/y                      x/y
            Residuo(mod)           %                    x mod y                  x%y
        --------------------------------------------------------------------------------------
        Parentesis para Agrupar Expresiones :
        Reglas de precedencia de operadores:
        1)Las operaciones de multiplicacion , division, Residuo se aplican primero
        2)Las operaciones de suma y resta se aplican a continuacion
        
        Operadores          Operaciones         Orden de Evaluacion(Precedencia)
        ------------------------------------------------------------------------
        *                   Multiplicacion      Se evaluan primero.Si hay varios
        /                   Division            Operadores de este tipo se evaluan
        %                   Residuo             De izquierda a Derecha
        ........................................................................
        +                   Suma                Se evaluan despues, si hay varios
        -                   Resta               operadores de este tipo se evaluan de iz a der
        .......................................................................
        =                   Asignacion          Se evalua de ultimo.
        ------------------------------------------------------------------------
        Ejemplo: ((a+b)*c)
        Se evalua primero la operacion que esta contenida por mas parentesis
        
        Toma de desiciones:Operadores de igualdad y Relaciones:
        Operadores de Igualdad:
        
        Operador                Significado
        ------------------------------------
          ==                    Igual a
          !=                    Diferente a
        ------------------------------------
        
        Operadores Relacionales:
        
        Operador                Significado
        ------------------------------------------
          >                     mayor que
          <                     menor que
          >=                    mayor o igual que
          <=                    menor o igual
        ------------------------------------------
        */
        //if,if else, if anidados
        //Programa que pida y compare 2 numeros de manera para saber si , 1 son iguales,2 son distintos 3 numero 1 es menor que numero 2
//        int numeroUno=0,numeroDos=0;
//        System.out.println("Ingrese el numero 1");
//        numeroUno=entrada.nextInt();
//        System.out.println("Ingrese el numero 2");
//        numeroDos=entrada.nextInt();
//        
//        if(numeroUno==numeroDos){
//            System.out.println("Son Iguales");
//        }
//        
//        if(numeroUno!=numeroDos){
//            System.out.println("Los numeros son distintos");
//        }
//        
//        if(numeroUno<numeroDos){
//            System.out.println("El numero "+numeroDos+" es mayor a "+numeroUno);
//        }
//

//if else

//Saber si un numero es multiplo de 5
//int numero=0;
//        System.out.println("Ingrese un numero");
//        numero=entrada.nextInt();
//        if(numero%5==0){
//            System.out.println("Es multiplo");
//        }else{
//            System.out.println("No es multiplo");
//        }


//if anidados
//programa que determine si un numero es multiplo de 1 y si es multiplo de 3
//int numero=0;
//        System.out.println("Ingrese el numero");
//        numero=entrada.nextInt();
//        if(numero%1==0){
//            if(numero%3==0){
//                System.out.println("Es multiplo de 1 y de 3");
//            }else{
//                System.out.println("Es multiplo de 1 pero no de 3"); 
//            }
//        }else{
//          if(numero%3==0){
//                System.out.println("Es multiplo de 3 y no de 1");
//            }else{
//                System.out.println("no es multiplo ni de 1 ni de 3"); 
//            }  
//        }
        
    }
    
}
