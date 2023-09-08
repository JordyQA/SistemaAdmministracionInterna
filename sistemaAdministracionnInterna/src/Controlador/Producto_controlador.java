/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import DAO.interface_producto_dao;
import Modelo.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Producto_controlador extends Conexion implements interface_producto_dao {

    @Override
    public boolean crear(Producto pr) {
        getConexion();

        String sql = "INSERT INTO producto(IdProducto, IdMaterial, NombreProducto, StockProductoTerminado, PrecioProducto)VALUES('" + pr.getIdProducto()
                + "','" + pr.getIdMaterial() + "','" + pr.getNombreProducto() + "','"
                + pr.getStockProductoTerminado() + "','" + pr.getPrecioUnitario() + "')";
        try {

            Statement st = con.createStatement();
            st.execute(sql);

            return true;
        } catch (Exception e) {

            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Producto_controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public boolean actualizar(Producto pr) {
        getConexion();
        String sql = "update producto set IdMaterial='" + pr.getIdMaterial() + "', NombreProducto='" + pr.getNombreProducto()
                + "', StockProductoTerminado='" + pr.getStockProductoTerminado() + "', PrecioProducto='" + pr.getPrecioUnitario()
                + "' where IdProducto ='" + pr.getIdProducto() + "'";
        try {

            Statement st = con.createStatement();
            st.execute(sql);

            return true;
        } catch (Exception e) {

            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Producto_controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean borrar(String IdProducto) {
        getConexion();

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");
        String sql = "delete from producto where IdProducto='" + IdProducto + "'";
        try {

            if (confirmacion == JOptionPane.OK_OPTION) {

                Statement st = con.createStatement();
                st.execute(sql);

            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: NO SE PUDO ELIMINAR EL PROUCTO" );
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Producto_controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Producto> obtener() {
        getConexion();
        List<Producto> producto = new ArrayList<>();
        String sql = "SELECT * FROM producto";
        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                Producto pro = new Producto(rs.getString("IdProducto"), rs.getString("IdMaterial"), rs.getString("NombreProducto"), rs.getInt("StockProductoTerminado"), rs.getDouble("PrecioProducto"));
                producto.add(pro);
            }
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Producto_controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return producto;
    }

    public Producto buscar(String usuario) {

        for (Producto ad : obtener()) {
            if (ad.getIdProducto().equals(usuario)) {
                return ad;
            }
        }
        return null;
    }

}
