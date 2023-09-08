/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import DAO.interface_empleado_dao;
import Modelo.Empleado;
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
public class Empleado_controlador extends Conexion implements interface_empleado_dao {

    @Override
    public boolean crear(Empleado emp) {
        getConexion();

        String sql = "insert into empleado (IdEmpleado,NombreEmpleado, DniEmpleado, DireccionEmpleado , TelefonoEmpleado,Especializacion,Edad ,TiempoContrato) values ('"
                + emp.getIdEmpleado() + " ','" + emp.getNombreEmpleado() + "','" + emp.getDniEmpleado() + "','" + emp.getDireccionEmpleado() + "','" + emp.getTelefonoEmpleado() + "','"
                + emp.getEspecializacion() + "','" + emp.getEdad() + "','" + emp.getTiempoContrato() + "')";
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
                Logger.getLogger(Empleado_controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public boolean actualizar(Empleado emp) {
        getConexion();
        String sql = "update empleado set NombreEmpleado ='" + emp.getNombreEmpleado() + "', DniEmpleado='" + emp.getDniEmpleado()
                + "', DireccionEmpleado='" + emp.getDireccionEmpleado() + "', TelefonoEmpleado='" + emp.getTelefonoEmpleado() + "', Especializacion='" + emp.getEspecializacion() + "', Edad='" + emp.getEdad() + "', TiempoContrato='" + emp.getTiempoContrato()
                + "' where IdEmpleado ='" + emp.getIdEmpleado() + "'";
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
                Logger.getLogger(Empleado_controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean borrar(String IdEmpleado) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");
        getConexion();
        String sql = "delete from empleado where IdEmpleado='" + IdEmpleado + "'";
        try {
            if (confirmacion == JOptionPane.OK_OPTION) {
                Statement st = con.createStatement();
                st.execute(sql);

            }

            return true;
        } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "ERROR: NO SE PUDO ELIMINAR AL EMPEADO");
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Empleado_controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Empleado> obtener() {
        getConexion();
        List<Empleado> empleado = new ArrayList<>();
        String sql = "SELECT * FROM empleado";
        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                Empleado emp = new Empleado(rs.getString("IdEmpleado"), rs.getString("NombreEmpleado"), rs.getString("DniEmpleado"), rs.getString("DireccionEmpleado"), rs.getString("TelefonoEmpleado"), rs.getString("Especializacion"), rs.getInt("Edad"), rs.getString("TiempoContrato"));
                empleado.add(emp);
            }
        } catch (Exception e) {
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Empleado_controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return empleado;
    }

    public Empleado buscar(String usuario) {

        for (Empleado ad : obtener()) {
            if (ad.getIdEmpleado().equals(usuario)) {
                return ad;
            }
        }
        return null;
    }

}
