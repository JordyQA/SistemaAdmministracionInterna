/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Mary Lucia Delgado Vilchez
 */
import java.util.List;
import Modelo.Cliente;
import Modelo.Cliente;

public interface interface_cliente_dao {

    public List listar();

    public int add(Object[] o);

    public boolean modificar(Cliente c);

    public void eliminar(String IdCliente);

}
