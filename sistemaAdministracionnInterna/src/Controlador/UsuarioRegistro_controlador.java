/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jordy
 */
public class UsuarioRegistro_controlador {

    Conexion con = new Conexion();
    Connection conexion = con.getConexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(Usuario u) {

        try {

            ps = conexion.prepareStatement("INSERT INTO usuarios(codigo,nombre,apellidos,correo,telefono,password)VALUES(?,?,?,?,?,?)");
            ps.setString(1, u.getCodigo());
            ps.setString(2, u.getNombre());
            ps.setString(3, u.getApellidos());
            ps.setString(4, u.getUsuario());
            ps.setString(5, u.getTelefono());
            ps.setString(6, u.getPassword());

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

    public boolean eliminar(Usuario u) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");
        try {
            if (confirmacion == JOptionPane.OK_OPTION) {

                String elimanarSQL = "DELETE FROM usuarios WHERE codigo=?";
                ps = conexion.prepareStatement(elimanarSQL);
                ps.setString(1, u.getCodigo());
            }
            int res = ps.executeUpdate();

            if (res > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, " + e);
            return false;
        } finally {
            try {

                //  conexion.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, " + e);
            }
        }

    }

    public boolean actualizar(Usuario u) {
        try {
            ps = conexion.prepareStatement("UPDATE usuarios SET nombre=?,apellidos=?,correo=?,telefono=?,password=? where codigo=?");

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellidos());
            ps.setString(3, u.getUsuario());
            ps.setString(4, u.getTelefono());
            ps.setString(5, u.getPassword());
            ps.setString(6, u.getCodigo());

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
