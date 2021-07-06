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
public class VehiculoFulgoneta extends Vehiculo{
    private int carga;

    public VehiculoFulgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        return "VehiculoFulgoneta{matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "carga=" + carga + '}';
    }
    
    
}
