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
/*
Si la clase tiene minimo 1  metodo abstracto
la clase debe ser abtracta

si la clase es abstracta no se pueden hacer objetos de la misma
*/
public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "numeroLados=" + numeroLados ;
    }
    
    //Declaracion del metodo de area como abtracto
    public abstract double area();
}
