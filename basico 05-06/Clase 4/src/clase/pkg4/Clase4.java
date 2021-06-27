/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1=new Persona("Juan","5465464",32);
        Persona p2=new Persona("Tihany",22);
        
        System.out.println(p1.MostrarDatos());
        System.out.println(p2.MostrarDatos(20));
        
        
    }
    
}
