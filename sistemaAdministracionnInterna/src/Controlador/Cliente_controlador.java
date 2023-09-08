/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.interface_cliente_dao;
import Conexion.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mary Lucia Delgado Vilchez
 */
public class Cliente_controlador implements interface_cliente_dao {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List listar() {

        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from cliente";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIdCliente(rs.getString(1));
                c.setNombreCliente(rs.getString(2));
                c.setDniCliente(rs.getString(3));
                c.setDireccionCliente(rs.getString(4));
                c.setTelefonoCliente(rs.getString(5));
                c.setCorreoCliente(rs.getString(6));
                lista.add(c);
            }

        } catch (Exception e) {

        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into cliente (IdCliente, NombreCliente, DniCliente, DireccionCliente, TelefonoCliente, CorreoCliente) values (?,?,?,?,?,?)";

        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);

            r = ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;
    }

    public boolean modificar(Cliente c) {

        String sql = "update cliente set IdCliente='" + c.getIdCliente() + "', NombreCliente='" + c.getNombreCliente()
                + "', DniCliente='" + c.getDniCliente() + "', DireccionCliente='" + c.getDireccionCliente() + "', TelefonoCliente='" + c.getTelefonoCliente() + "', CorreoCliente='" + c.getCorreoCliente() + "' where IdCliente ='" + c.getIdCliente() + "'";
        try {

            Statement st = con.createStatement();
            st.execute(sql);

            return true;
        } catch (Exception e) {

            return false;
        }
    }

    @Override
    public void eliminar(String IdCliente) {
        String sql = "delete from cliente where IdCliente=?";
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea elimnar este registro");

        try {
            if (confirmacion == JOptionPane.OK_OPTION) {
                con = cn.getConexion();
                ps = con.prepareStatement(sql);

                ps.setString(1, IdCliente);

                ps.executeUpdate();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: CLIENTE NO PUEDE SER ELIMINADO\n"
                    + "REVISAR QUE NO ESTE VINCULADO CON OTRO DATO");
        }
    }

}
