/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo2;

/**
 *
 * @author rodri
 */
public class Cuadrilateros {
    private double lado1,lado2;

    public Cuadrilateros(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
//this.lado1 sera igual a lado2 que a su vez sera igual al valor que se recibio por parametro
    //es decir una doble igualacion
    public Cuadrilateros(double lado1) {
        this.lado1 = this.lado2=lado1;
    }
    
    public double getArea(){
        double Area=(lado1*lado2);
        return Area;
    }
    
    public double getPerimetro(){
        double perimetro=2*(lado1+lado2);
        return perimetro;
    }
    
    
}
