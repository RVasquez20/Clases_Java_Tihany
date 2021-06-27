/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModificadoresDeAcceso;

import Personas.Persona2;



/**
 *
 * @author rodri
 */
public class Main {
    public static void main(String[] args) {
        Persona2 p1=new Persona2();
        Persona2 p2=new Persona2();
        p1.setAtributo1(15);
        p2.setAtributo1(50);
        System.out.println("El valor del atributo 1 es:"+p1.getAtributo1());
        System.out.println("El valor del atributo 1 es:"+p2.getAtributo1());
        p2.setAtributo1(15);
        System.out.println("El valor del atributo 1 es:"+p2.getAtributo1());
    }
}
