/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jordy
 */
public class Conexion {

    public static final String url = "jdbc:mysql://localhost:3306/peruvianinox?autoReconnet=true&userSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "";
    public Connection con = null;

    public Connection getConexion() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, contraseña);

        } catch (Exception e) {

            System.out.println("Error: " + e);

        }

        return con;

    }

}
