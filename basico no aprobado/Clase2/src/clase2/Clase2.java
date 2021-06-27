/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Clase2 {
static int numero1,numero2;
static Scanner entrada=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Operadores y condicionales if switch
        int Edad=0,Resultado=0;
         
        String nombre="";
        
        /*System.out.println("Digite un Edad");
        Edad=entrada.nextInt();
        //Limpieza de buffer
        entrada.nextLine();
        //
        System.out.println("Digite un Nombre");
        nombre=entrada.nextLine();*/
        /*System.out.println("Digite un numero");
        numero2=entrada.nextInt();
        Resultado=Edad+numero2;
        System.out.println("Suma:"+Resultado);
        Resultado=Edad-numero2;
        System.out.println("Resta:"+Resultado);
        Resultado=Edad*numero2;
        System.out.println("Multiplicacion:"+Resultado);
        Resultado=Edad/numero2;
        System.out.println("Division:"+Resultado);
        Resultado=++Edad;
        System.out.println("Aumento de +1 en numero 1:"+Resultado);
        Resultado=--Edad;
        System.out.println("Disminuciones de -1 en numero 1:"+Resultado);

        if(Edad>18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }

        if (Edad>18&& !nombre.equals("lony")) {
                     System.out.println("Es mayor de edad y me cae bien");
        }else{
            if(Edad>18&& nombre.equals("lony")){
                System.out.println("Es Mayor de edad y me cae mal");
            }else if(Edad<18&& !nombre.equals("lony")){
                System.out.println("Es menor de edad y me cae bien");
            }else{
                System.out.println("Es menor de edad y me cae mal");
            }
        }
        System.out.println("Digite el numero 1");
        numero1=entrada.nextInt();
        System.out.println("Digite el numero 2");
        numero2=entrada.nextInt();
        if(numero1<0&&numero2<0){
            System.out.println("Digito ambos numeros negativos");
        }else if(numero1>0||numero2>0){
            System.out.println("Digito un numero postivo");
            Resultado=numero1+numero2;
            System.out.println("La suma es "+Resultado);
        }*/
        int opc=0;
        System.out.println("----Menu Principal----");
        System.out.println("   1)Sumar");
        System.out.println("   2)Restar");
        System.out.print("Digite la opcion que desea elegir:");
        opc=entrada.nextInt();entrada.nextLine();
        switch(opc){
            case 1:{
                Ingreso();
                Resultado=numero1+numero2;
                System.out.println("Suma "+Resultado);
               break; 
            }
            case 2:{
                Ingreso();
                Resultado=numero1-numero2;
                System.out.println("Resta "+Resultado);
               break; 
            }
            default:{
                System.out.println("Opcion invalida, proximamente disponible");
               break; 
            }
        }
        
        
    }
    public static void Ingreso(){
        System.out.println("Digite el numero 1");
        numero1=entrada.nextInt();
        System.out.println("Digite el numero 2");
        numero2=entrada.nextInt();
    }
    
}
