/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

/**
 *
 * @author userpc
 */
public abstract class Permisos {
Boolean menup_mantenimiento=true;
Boolean menup_facturacion=true;
Boolean menup_compras=true;
Boolean menup_contabilidad=true;
Boolean menup_reportes=true;
Boolean menup_bodega=true;
Boolean menup_seguridad=true;
Boolean productos=true;
Boolean clientes=true;
Boolean varios=true;
Boolean ventas=true;
Boolean cotizacion=true;
Boolean devolucionventas=true;
Boolean compras=true;
Boolean pedidos=true;
Boolean devolucioncompras=true;
Boolean inventario=true;
Boolean arqueocaja=true;
public abstract void Activar(String tipo);
}
