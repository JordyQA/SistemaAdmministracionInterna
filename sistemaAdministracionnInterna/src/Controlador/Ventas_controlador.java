package Controlador;

import Conexion.Conexion;
import Modelo.Ventas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import DAO.interface_ventas_dao;
import javax.swing.JOptionPane;

public class Ventas_controlador extends Conexion implements interface_ventas_dao {

    @Override
    public boolean crear(Ventas vt) {
        getConexion();

        String sql = "INSERT INTO venta(IdVenta, IdEmpleado, dniCliente, IdProducto, FechaPedido, FechaEntrega, TipoDeEntrega, Cantidad, TipoPago, Total) VALUES ('" + vt.getIdventa()
                + "','" + vt.getIdempleado() + "','" + vt.getDniCliente() + "','" + vt.getIdproducto()
                + "','" + vt.getFechapedido() + "','" + vt.getFechaentrega() + "','" + vt.getTipoentrega()
                + "','" + vt.getCantidad() + "','" + vt.getTipopago() + "','" + vt.getTotal()
                + "')";
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
                Logger.getLogger(Ventas_controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public boolean actualizar(Ventas vt) {
        getConexion();

        String sql = "UPDATE venta SET IdEmpleado='" + vt.getIdempleado()
                + "', dniCliente='" + vt.getDniCliente() + "', IdProducto='" + vt.getIdproducto() + "', FechaPedido='"
                + vt.getFechapedido() + "', FechaEntrega='" + vt.getFechaentrega() + "', TipoDeEntrega='" + vt.getTipoentrega()
                + "', Cantidad='" + vt.getCantidad() + "', TipoPago='" + vt.getTipopago() + "', Total='" + vt.getTotal()
                + "' where IdVenta ='" + vt.getIdventa() + "'";

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
                Logger.getLogger(Ventas_controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean borrar(String idventa) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");
        getConexion();
        String sql = "DELETE FROM venta WHERE IdVenta='" + idventa + "'";
        try {
            if (confirmacion == JOptionPane.OK_OPTION) {
                Statement st = con.createStatement();
                st.execute(sql);
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo eliminar la venta");
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ventas_controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Ventas> obtener() {
        getConexion();
        List<Ventas> venta = new ArrayList<>();
        String sql = "SELECT * FROM `venta`";
        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                Ventas vta = new Ventas(rs.getString("IdVenta"), rs.getString("IdEmpleado"), rs.getString("dniCliente"),
                        rs.getString("IdProducto"), rs.getString("FechaPedido"), rs.getString("FechaEntrega"),
                        rs.getString("TipodeEntrega"), rs.getInt("Cantidad"), rs.getString("TipoPago"), rs.getDouble("Total"));
                venta.add(vta);
            }
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ventas_controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return venta;
    }

    public Ventas buscar(String usuario) {

        for (Ventas ad : obtener()) {
            if (ad.getIdventa().equals(usuario)) {
                return ad;
            }
        }
        return null;
    }

}
