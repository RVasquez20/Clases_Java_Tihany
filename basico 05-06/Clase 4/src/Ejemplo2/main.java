/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo2;

import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
/**
 * Construir un programa que calcule el area y el perimetro de un cuadrilatero dada la 
 * longitud de sus lados
 * los valores de la longitud deberan introducirse por linea de ordenes.
 * si es un cuadrado solo se proporcionara la longitud de uno de sus lados al constructor.
 * @author rodri
 */
public class main {
    public static void main(String[] args) {
        Cuadrilateros c1;
        
        double lado1,lado2;
        lado1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 1:"));
        lado2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado 2:"));
        if(lado1==lado2){
            c1=new Cuadrilateros(lado1);
        }else{
            c1=new Cuadrilateros(lado1,lado2);
        }
        JOptionPane.showMessageDialog(null,"El perimetro es :"+c1.getPerimetro());
        JOptionPane.showMessageDialog(null,"El Area es :"+c1.getArea());
        
        /*
        Construir un programa que dada una serie de vehiculos caracterizados por su marca,
        modelo y precio , imprima las propiedades del vehiculo mas barato.
        Para ello, se deberan leer por teclado las caracteristicas de cada vehiculo, y 
        crear una clase que represente a cada uno de ellos
        
        */
    }
}
