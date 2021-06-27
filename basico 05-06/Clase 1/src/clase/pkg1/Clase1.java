/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg1;

/**
 *explicacion del proposito del programa
 * @author Rodrigo
 * @date 12/05/2021
 * @hora 11:44am
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    
    
    //funcion principal
    
//documentacion de funcion o variables que esten en el programa
    
/**
 * funcion principal recibe
 * @param args como argumentos para la funcion
 */    
    
    /*Sentencias de Escape
    \n=nueva linea
    \t=Tabulador horizontal
    \r=Retorno de carro.Coloca el cursor de la pantalla al inicio de la linea actual y sustituye todo el texto
    \\=borra una diagonal inversa. se usa para imprimir un caracter de barra digonal inversa '\' 
    \"=Doble comilla. se usa para imprimir un caracter de doble comilla.Por ejemplo,
    system.out.println("\"entre comillas\"");
    */
    
    public static void main(String[] args) {
        int numero=1;
        // TODO code application logic here
        System.out.println(numero+"\nHola\nmundo ");
        System.out.println("\tHola mundo ");
        System.out.println("Hola mundo\raloh");
        System.out.println("Hola \\mundo ");
        System.out.println("\"Hola mundo\" ");
    }
    
    /*
    Proxima clase:Formatos de texto en java(printf)
    -entrada y salida de datos
    -Tipos de datos
    -operadores matematicos
    */
    
    /*
    comentarario
    multilinea
    */
    
    
    /**
     * En esta funcion se recibe un parametro de tipo int llamado 
     * @param numero que se va a mostrar en pantalla
     */
    
    
    /**
     * En esta funcion se recibe un parametro de tipo int llamado 
     * @param numero que se va a mostrar en pantalla
     * @return retorna el parametro numero
     */
 public static int mensaje(int numero){
     System.out.println("El numero pasado como parametro es "+numero);
     return numero;
 }   
 
 
     public static void mensaje2(){
         int numero=21;
         System.out.println("el numero es "+numero);
            if(numero==21){
                System.out.println("Es 21");
            }//fin de if
            else{
                System.out.println("No es 21");
            }//fin de else
     }//fin de mensaje 2
}//fin clase1
