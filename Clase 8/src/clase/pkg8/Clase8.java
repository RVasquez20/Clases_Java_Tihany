/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg8;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Rodrigo
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Dialogos: JOptionPane
        //Ejemplos de JOptionPane.showMessageDialog//Mostrar un mensaje en pantalla
        //Mensaje en pantalla por defecto
        JOptionPane.showMessageDialog(null, "Ejemplo Default");
        //Mensaje en pantalla plano(no tiene icono)
        JOptionPane.showMessageDialog(null, "Mensaje Plano","Mensaje Plano",JOptionPane.PLAIN_MESSAGE);
        //Mensaje en pantalla de pregunta
        JOptionPane.showMessageDialog(null, "Pregunta 1","Mensaje de Pregunta",JOptionPane.QUESTION_MESSAGE);
        //Mensaje Informativo
        JOptionPane.showMessageDialog(null, "Este es un mensaje informativo","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
        //Mensaje de error
        JOptionPane.showMessageDialog(null, "Mensaje de error !!!","Error",JOptionPane.ERROR_MESSAGE);
        //Mensajes de Advertencia
        JOptionPane.showMessageDialog(null, "Mensaje de advertencia prueba","Advertencia",JOptionPane.WARNING_MESSAGE);
        //Ejemplos de JOptionPane.showInputDialog//Mostrar un mensaje en pantalla
        //Con el espacio para que el usuario ingrese datos
        double numero1=0,numero2=0,suma=0;
        String nombre="";
        //Default
        nombre=JOptionPane.showInputDialog("Ingrese su nombre");
        numero1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer numero a sumar","Primer Numero",JOptionPane.QUESTION_MESSAGE));
        numero2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero a sumar","Segundo numero",JOptionPane.INFORMATION_MESSAGE));
        suma=numero1+numero2;
        JOptionPane.showMessageDialog(null, "Su nombre es "+nombre+"\nLa suma es:"+suma);
        
    }
    
}
