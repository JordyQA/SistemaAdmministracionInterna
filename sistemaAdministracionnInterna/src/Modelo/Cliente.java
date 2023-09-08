/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Mary Lucia Delgado Vilchez
 */
public class Cliente {

    String IdCliente;
    String NombreCliente;
    String DniCliente;
    String DireccionCliente;
    String TelefonoCliente;
    String CorreoCliente;

    public Cliente(String IdCliente, String NombreCliente, String DniCliente, String DireccionCliente, String TelefonoCliente, String CorreoCliente) {
        this.IdCliente = IdCliente;
        this.NombreCliente = NombreCliente;
        this.DniCliente = DniCliente;
        this.DireccionCliente = DireccionCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.CorreoCliente = CorreoCliente;
    }

    public Cliente() {

    }

    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getDniCliente() {
        return DniCliente;
    }

    public void setDniCliente(String DniCliente) {
        this.DniCliente = DniCliente;
    }

    public String getDireccionCliente() {
        return DireccionCliente;
    }

    public void setDireccionCliente(String DireccionCliente) {
        this.DireccionCliente = DireccionCliente;
    }

    public String getTelefonoCliente() {
        return TelefonoCliente;
    }

    public void setTelefonoCliente(String TelefonoCliente) {
        this.TelefonoCliente = TelefonoCliente;
    }

    public String getCorreoCliente() {
        return CorreoCliente;
    }

    public void setCorreoCliente(String CorreoCliente) {
        this.CorreoCliente = CorreoCliente;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    

}
