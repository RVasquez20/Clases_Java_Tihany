/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg7;

/**
 *
 * @author rodri
 */
public class Rectangulo extends Poligono{
    private double lado1,lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo{"+super.toString()+" lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
 
    @Override
    public double area() {
        return lado1*lado2;
    }

 
    
}
