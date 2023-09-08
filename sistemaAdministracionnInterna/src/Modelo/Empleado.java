/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author g3
 */
public class Empleado {

    private String IdEmpleado;
    private String NombreEmpleado;
    private String DniEmpleado;
    private String DireccionEmpleado;
    private String TelefonoEmpleado;
    private String Especializacion;
    private int Edad;
    private String TiempoContrato;

    public Empleado(String IdEmpleado, String NombreEmpleado, String DniEmpleado, String DireccionEmpleado, String TelefonoEmpleado, String Especializacion, int Edad, String TiempoContrato) {
        this.IdEmpleado = IdEmpleado;
        this.NombreEmpleado = NombreEmpleado;
        this.DniEmpleado = DniEmpleado;
        this.DireccionEmpleado = DireccionEmpleado;
        this.TelefonoEmpleado = TelefonoEmpleado;
        this.Especializacion = Especializacion;
        this.Edad = Edad;
        this.TiempoContrato = TiempoContrato;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(String IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setINombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public String getDniEmpleado() {
        return DniEmpleado;
    }

    public void setDniEmpleado(String DniEmpleado) {
        this.DniEmpleado = DniEmpleado;
    }

    public String getDireccionEmpleado() {
        return DireccionEmpleado;
    }

    public void setDireccionEmpleado(String DireccionEmpleado) {
        this.DireccionEmpleado = DireccionEmpleado;
    }

    public String getTelefonoEmpleado() {
        return TelefonoEmpleado;
    }

    public void setTelefonoEmpleado(String TelefonoEmpleado) {
        this.TelefonoEmpleado = TelefonoEmpleado;
    }

    public String getEspecializacion() {
        return Especializacion;
    }

    public void setEspecializacion(String Especializacion) {
        this.Especializacion = Especializacion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTiempoContrato() {
        return TiempoContrato;
    }

    public void setTiempoContrato(String TiempoContrato) {
        this.TiempoContrato = TiempoContrato;
    }
}
