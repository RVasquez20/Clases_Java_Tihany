/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg6;

/**
 *
 * @author rodri
 */
public class VehiculoTurismo extends Vehiculo {
    private int numeroDePuertas;

    public VehiculoTurismo(int numeroDePuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    @Override
    public String toString() {
        return "VehiculoTurismo{ matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo +  "numeroDePuertas=" + numeroDePuertas + '}';
    }

    
    
}
