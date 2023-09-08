/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author g3
 */
public class Producto {

    private String IdProducto;
    private String IdMaterial;
    private String NombreProducto;
    private int StockProductoTerminado;
    private double PrecioUnitario;

    public Producto(String IdProducto, String IdMaterial, String NombreProducto, int StockProducto, double PrecioUnitario) {
        this.IdProducto = IdProducto;
        this.IdMaterial = IdMaterial;
        this.NombreProducto = NombreProducto;
        this.StockProductoTerminado = StockProducto;
        this.PrecioUnitario = PrecioUnitario;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getIdMaterial() {
        return IdMaterial;
    }

    public void setIdMaterial(String IdMaterial) {
        this.IdMaterial = IdMaterial;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public int getStockProductoTerminado() {
        return StockProductoTerminado;
    }

    public void setStockProductoTerminado(int StockProductoTerminado) {
        this.StockProductoTerminado = StockProductoTerminado;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

}
