/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg9;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Rodrigo
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejemplo:Ingreso de datos a un arrayList y ordenarlo
        ArrayList<Integer> confirm=new ArrayList<>();
        int numero=0,opc=0;
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:"));
            confirm.add(numero);
            opc=JOptionPane.showConfirmDialog(null,"Desea ingrear Otro numero?","Seguir",JOptionPane.YES_NO_OPTION);
        }while(opc==JOptionPane.YES_OPTION);
        
    }
    
}
