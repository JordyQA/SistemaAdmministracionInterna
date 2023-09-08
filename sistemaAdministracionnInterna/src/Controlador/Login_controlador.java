/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Conexion.Conexion;
import Modelo.Usuario;
import Vista.Frm_Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jordy
 */
public class Login_controlador {

    Usuario u = new Usuario();
    Frm_Login l;

    Conexion con = new Conexion();
    Connection conexion = con.getConexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean loginUser(Usuario u) {
        boolean respuesta = false;
        try {
            ps = conexion.prepareStatement("select correo,password from usuarios where correo=? and password=?");
            ps.setString(1, u.getUsuario());
            ps.setString(2, u.getPassword());
            rs = ps.executeQuery();
            while (rs.next()) {
                respuesta = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e);
        }
        return respuesta;
    }

    public void Salir() {
        System.exit(0);
    }

}
