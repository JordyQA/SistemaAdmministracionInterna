/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Stock;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jordy
 */
public class StockMaterial_controlador {

    ///pasamos datos
    Conexion con = new Conexion();
    Connection conexion = con.getConexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(Stock stock) {

        try {

            ps = conexion.prepareStatement("INSERT INTO almacen(IdMaterial,TipoMaterial,StockMaterial,PrecioUnidad,categoria,fechaRegistro)VALUES(?,?,?,?,?,?)");
            ps.setString(1, stock.getCodigo());
            ps.setString(2, stock.getDescripcion());
            ps.setInt(3, stock.getCantidad());
            ps.setFloat(4, stock.getPrecio());
            ps.setString(5, stock.getCategoria());
            ps.setDate(6, stock.getFechaRegistro());

            int resultado = ps.executeUpdate();

            if (resultado > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, " + e);
            return false;
        } finally {//siempre siempre se ejecutara y lo usamos para cerrar la conexion
            try {

                //conexion.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, " + e);
            }
        }
    }

    public boolean eliminar(Stock s) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");
        try {
            if (confirmacion == JOptionPane.OK_OPTION) {

                String elimanarSQL = "DELETE FROM almacen WHERE IdMaterial=?";
                ps = conexion.prepareStatement(elimanarSQL);
                ps.setString(1, s.getCodigo());
            }
            int res = ps.executeUpdate();

            if (res > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: NO SE PUEDE ELIMINAR EL MATERIAL." );
            return false;
        } finally {
            try {

                //  conexion.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, " + e);
            }
        }

    }

    public boolean actualizar(Stock stock) {
        try {
            ps = conexion.prepareStatement("UPDATE almacen SET TipoMaterial=?,StockMaterial=?,PrecioUnidad=?,categoria=?,fechaRegistro=? where IdMaterial=?");

            ps.setString(1, stock.getDescripcion());
            ps.setInt(2, stock.getCantidad());
            ps.setFloat(3, stock.getPrecio());
            ps.setString(4, stock.getCategoria());
            ps.setDate(5, stock.getFechaRegistro());
            ps.setString(6, stock.getCodigo());

            int resultado = ps.executeUpdate();

            if (resultado > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, " + e);
            return false;
        } finally {//siempre siempre se ejecutara y lo usamos para cerrar la conexion
            try {

                // conexion.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, " + e);
            }
        }

    }

    public void cerrarconsultaSql() {
        try {

            conexion.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, " + e);
        }
    }

}
