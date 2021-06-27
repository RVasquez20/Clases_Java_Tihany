/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg5;

/**
 *
 * @author rodri
 */
public class Triangulo_Isosceles {
    private double base,lado;

    public Triangulo_Isosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    public double obtenerPerimetro(){
        double perimetro=2*lado+base;
        return perimetro;
    }
    public double obtenerArea(){
        double area=(base*Math.sqrt(Math.pow(lado, 2)-(Math.pow(base, 2)/4)))/2;
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo_Isosceles{" + "base=" + base + ", lado=" + lado + " Perimetro"+obtenerPerimetro()+" Area"+obtenerArea()+'}';
    }
    
}
