/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Modelo.Producto;
import java.util.List;

/**
 *
 * @author g3
 */
public interface interface_producto_dao {

    public boolean crear(Producto p);

    public boolean actualizar(Producto p);

    public boolean borrar(String IdProducto);

    public List<Producto> obtener();
}
