/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Modelo.Empleado;
import java.util.List;

/**
 *
 * @author g3
 */
public interface interface_empleado_dao {

    public boolean crear(Empleado e);

    public boolean actualizar(Empleado e);

    public boolean borrar(String IdEmpleado);

    public List<Empleado> obtener();
}
