/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author user
 */
public class Productos  {
    private int idProducto;
  private String codigo;
  private String modelo;
  private String caracteristicas;
  private double stock;
  private double precioCompra;
  private double precioVenta;
  private String estado;
  private int dCategorias;

    public Productos() {
    }

    public Productos(int idProducto, String codigo, String modelo, String caracteristicas, double stock, double precioCompra, double precioVenta, String estado, int dCategorias) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.modelo = modelo;
        this.caracteristicas = caracteristicas;
        this.stock = stock;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estado = estado;
        this.dCategorias = dCategorias;
    }

   
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    /**
     * @return the stock
     */
    public double getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(double stock) {
        this.stock = stock;
    }

    /**
     * @return the precioCompra
     */
    public double getPrecioCompra() {
        return precioCompra;
    }

    /**
     * @param precioCompra the precioCompra to set
     */
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * @return the precioVenta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the dCategorias
     */
    public int getdCategorias() {
        return dCategorias;
    }

    /**
     * @param dCategorias the dCategorias to set
     */
    public void setdCategorias(int dCategorias) {
        this.dCategorias = dCategorias;
    }

       /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }
}
