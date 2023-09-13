package Modelo;

/**
 *
 * @author DANIEL
 */
public class Ventas {

    private String idventa;
    private String idempleado;
    private String dniCliente;
    private String idproducto;
    private String fechapedido;
    private String fechaentrega;
    private String tipoentrega;
    private int cantidad;
    private String tipopago;
    private double total;

    public Ventas() {

    }

    public Ventas(String idventa, String idempleado, String dniCliente, String idproducto, String fechapedido, String fechaentrega, String tipoentrega, int cantidad, String tipopago, double total) {
        this.idventa = idventa;
        this.idempleado = idempleado;
        this.dniCliente = dniCliente;
        this.idproducto = idproducto;
        this.fechapedido = fechapedido;
        this.fechaentrega = fechaentrega;
        this.tipoentrega = tipoentrega;
        this.cantidad = cantidad;
        this.tipopago = tipopago;
        this.total = total;
    }

    public String getIdventa() {
        return idventa;
    }

    public void setIdventa(String idventa) {
        this.idventa = idventa;
    }

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getFechapedido() {
        return fechapedido;
    }

    public void setFechapedido(String fechapedido) {
        this.fechapedido = fechapedido;
    }

    public String getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public String getTipoentrega() {
        return tipoentrega;
    }

    public void setTipoentrega(String tipoentrega) {
        this.tipoentrega = tipoentrega;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipopago() {
        return tipopago;
    }

    public void setTipopago(String tipopago) {
        this.tipopago = tipopago;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
