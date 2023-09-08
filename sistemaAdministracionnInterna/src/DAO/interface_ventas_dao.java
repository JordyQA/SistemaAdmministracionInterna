package DAO;

import Modelo.Ventas;
import java.util.List;

public interface interface_ventas_dao {

    public boolean crear(Ventas v);

    public boolean actualizar(Ventas v);

    public boolean borrar(String idventa);

    public List<Ventas> obtener();
}
