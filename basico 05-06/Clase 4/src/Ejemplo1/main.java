/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo1;

import javax.swing.JOptionPane;

/**
 *
 * @author rodri
 */
public class main {
    //psvm+tab
    public static void main(String[] args) {
        String Nombre="";
        int Edad=0;
        Persona p1=new Persona();
        /*Nombre=JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona");
        Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de "+p1.getNombre()));
        p1.setNombre(Nombre);
        p1.setEdad(Edad);*/
        p1.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona"));
        p1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de "+p1.getNombre())));
        
        
        JOptionPane.showMessageDialog(null,"Nombre:"+p1.getNombre()+"\nEdad:"+p1.getEdad());
    }
}
