/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg11;

/**
 *
 * @author rodri
 */
public class Cliente extends Persona
{
    private String CodigoCliente;

    public Cliente() {
    }

    public String getCodigoCliente() {
        return CodigoCliente;
    }

    public void setCodigoCliente(String CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }

    @Override
    public String MostrarDatos() {
     return "Nombre:"+this.getNombre()+"\nApellido:"+this.getApellido()+"\nDireccion:"+this.getDireccion()+
             "\nTelefono:"+this.getTelefono()+"\nCodigo de Cliente:"+CodigoCliente
             +"\n--------------------------------------";
    }
    
}
