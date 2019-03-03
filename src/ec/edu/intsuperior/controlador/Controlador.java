/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.JPConexionMysql;
import ec.edu.intsuperior.vista.JPConfiguracion;
import ec.edu.intsuperior.vista.WAcercade;
import ec.edu.intsuperior.vista.WCentral;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author userpc
 */
public class Controlador {

    public final ConexionMysql cm = new ConexionMysql();
  
    /**
     * Metodo para la abertura de Vista de el formulario principal para todos
     * los usuarios
     *
     * @param seccion
     */
    public void getSistema(ArrayList<String> seccion) {
        WCentral wcentral = new WCentral(this);
        VistaEnableGenera(wcentral, false);
        //VistaGenera(wcentral, false);
        for (int i = 0; i < seccion.size(); i++) {
            vistasEnable(wcentral, seccion.get(i).split("-"));
            //vistasVisible(wcentral, seccion.get(i).split("-"));
        }
        abrirJFrame(wcentral, true, true);

    }

    /**
     * Metodo para la abertura de Autentificacion de los Usuarios para su
     * ingreso posterior
     */
    public void showLogin() {
       ControladorUsuarios cu=new ControladorUsuarios();
       cu.getLogin();

    }

    /**
     * Metodo para la abertura de la informacion basica de la aplicacion y los
     * desarrolladores
     */
    public void getAcercade() {
        WAcercade acercade = new WAcercade(this);
        abrirJFrame(acercade, false, false);

    }

   

    /**
     * Metodo para la abertura de Vista de la configuracion previa a su uso
     */
    public void getConfiguracion() {
        JPConfiguracion wc = new JPConfiguracion(this);
        abrirJPanelJFrameExterno(wc, "Configuracion", false, false, 526, 250);
    }

    /**
     * Metodo para la abertura de la configuracion de la Conexion Mysql
     */
    public void getConexionMysql() {
        JPConexionMysql wc = new JPConexionMysql(this);
        abrirJPanelJFrameExterno(wc, "Conexion Base de Datos Mysql", false, false, 405, 200);

    }

    /**
     * Cuadro de dialogo para la seleccion de directorios
     *
     * @param c
     * @return
     */
    public String JSelector(JPanel c) {
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int respuesta = fc.showOpenDialog(c);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            File archivoElegido = fc.getSelectedFile();
            return archivoElegido.getPath();
        }
        return "";
    }

    void abrirInternalJFrame(String title, WCentral central, JPanel inter, Boolean cambiarTamanio, Boolean maximizar, Boolean salida, int ancho, int alto) {
        JInternalFrame wc = new JInternalFrame(title, cambiarTamanio, maximizar, salida, true);
        wc.setSize(ancho, alto);
        wc.add(inter);
        central.addJFrame(wc);
        wc.setVisible(true);
    }

    public void abrirJFrame(JFrame wc, Boolean maximizar, Boolean salida) {
        if (maximizar) {
            wc.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
        if (salida) {
            wc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        wc.setLocationRelativeTo(null);
        wc.setVisible(true);
    }

    void abrirJPanelJFrameExterno(JPanel c, String title, Boolean maximizar, Boolean salida, int ancho, int alto) {
        JFrame wc = new JFrame(title);
        if (maximizar) {
            wc.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
        if (salida) {
            wc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        wc.add(c);
        wc.setLocationRelativeTo(null);
        wc.setSize(ancho, alto);
        wc.setVisible(true);
    }

   
    

    

    public void VistaGenera(WCentral wc, Boolean a) {
        //Seccion de mantenimiento
        wc.jmMantenimiento.setVisible(a);
        wc.jmProductos.setVisible(a);
        wc.jmClientes.setVisible(a);
        wc.jmProveedores.setVisible(a);
        wc.jmSeguridad.setVisible(a);
        wc.jmVarios.setVisible(a);
        wc.jmBodega.setVisible(a);
        wc.jmBodegaIngresos.setVisible(a);
        wc.jmBodegaEgresos.setVisible(a);
        wc.jmPermisos.setVisible(a);
        wc.jmUsuarios.setVisible(a);
        //Seccion Facturacion
        wc.jmFacturacion.setVisible(a);
        wc.jmVentas.setVisible(a);
        wc.jmCotizacion.setVisible(a);
        wc.jmDevolucionVentas.setVisible(a);
        //Seccion Compras
        wc.jmCompras.setVisible(a);
        wc.jmCompra.setVisible(a);
        wc.jmPedido.setVisible(a);
        wc.jmDevolucionCompras.setVisible(a);
        //Seccion Contabilidad
        wc.jmContabilidad.setVisible(a);
        wc.jmRetenciones.setVisible(a);
        wc.jmNotaCredito.setVisible(a);
        wc.jmNotaDebito.setVisible(a);
        wc.jmAsientosContables.setVisible(a);
        //Seccion Reportes
        wc.jmReporteContabilidad.setVisible(a);
        wc.jmReportes.setVisible(a);
        wc.jmInventario.setVisible(a);
        wc.jmArqueoCaja.setVisible(a);
        //Seccion Ayuda
        wc.jmAyuda.setVisible(a);
        wc.jmAcercade.setVisible(a);
        wc.jmManual.setVisible(a);
        wc.jmManualTecnico.setVisible(a);
    }

    public void VistaEnableGenera(WCentral wc, Boolean a) {
        //Seccion de mantenimiento
        wc.jmMantenimiento.setEnabled(a);
        wc.jmProductos.setEnabled(a);
        wc.jmClientes.setEnabled(a);
        wc.jmProveedores.setEnabled(a);
        wc.jmSeguridad.setEnabled(a);
        wc.jmVarios.setEnabled(a);
        wc.jmBodega.setEnabled(a);
        wc.jmBodegaIngresos.setEnabled(a);
        wc.jmBodegaEgresos.setEnabled(a);
        wc.jmPermisos.setEnabled(a);
        wc.jmUsuarios.setEnabled(a);
        //Seccion Facturacion
        wc.jmFacturacion.setEnabled(a);
        wc.jmVentas.setEnabled(a);
        wc.jmCotizacion.setEnabled(a);
        wc.jmDevolucionVentas.setEnabled(a);
        //Seccion Compras
        wc.jmCompras.setEnabled(a);
        wc.jmCompra.setEnabled(a);
        wc.jmPedido.setEnabled(a);
        wc.jmDevolucionCompras.setEnabled(a);
        //Seccion Contabilidad
        wc.jmContabilidad.setEnabled(a);
        wc.jmRetenciones.setEnabled(a);
        wc.jmNotaCredito.setEnabled(a);
        wc.jmNotaDebito.setEnabled(a);
        wc.jmAsientosContables.setEnabled(a);
        //Seccion Reportes
        wc.jmReporteContabilidad.setEnabled(a);
        wc.jmReportes.setEnabled(a);
        wc.jmInventario.setEnabled(a);
        wc.jmArqueoCaja.setEnabled(a);
        //Seccion Ayuda
        wc.jmAyuda.setEnabled(a);
        wc.jmAcercade.setEnabled(a);
        wc.jmManual.setEnabled(a);
        wc.jmManualTecnico.setEnabled(a);
    }

    public void vistasVisible(WCentral wc, String[] secciones) {
        ArrayList<String> sec = new ArrayList<>();

        sec.addAll(Arrays.asList(secciones));
        for (int a = 0; a < sec.size(); a++) {
            switch (sec.get(a)) {
                case "Mantenimiento": {
                    wc.jmMantenimiento.setVisible(true);
                }
                break;
                case "Producto": {
                    wc.jmProductos.setVisible(true);
                }
                break;
                case "Proveedores": {
                    wc.jmProveedores.setVisible(true);
                }
                break;
                case "Clientes": {
                    wc.jmClientes.setVisible(true);
                }
                break;
                case "Varios": {
                    wc.jmVarios.setVisible(true);
                }
                break;
                case "Bodega": {
                    wc.jmBodega.setVisible(true);
                }
                break;
                case "BIngresos": {
                    wc.jmBodegaIngresos.setVisible(true);
                }
                break;
                case "BEgresos": {
                    wc.jmBodegaEgresos.setVisible(true);
                }
                break;
                case "Seguridad": {
                    wc.jmSeguridad.setVisible(true);
                }
                break;
                case "Permisos": {
                    wc.jmPermisos.setVisible(true);
                }
                break;
                case "Usuarios": {
                    wc.jmUsuarios.setVisible(true);
                }
                break;
                case "Ventas": {
                    wc.jmFacturacion.setVisible(true);
                }
                break;
                case "Venta": {
                    wc.jmVentas.setVisible(true);
                }
                break;
                case "Cotizacion": {
                    wc.jmCotizacion.setVisible(true);
                }
                break;
                case "VDevoluciones": {
                    wc.jmDevolucionVentas.setVisible(true);
                }
                break;
                case "Compras": {
                    wc.jmCompras.setVisible(true);
                }
                break;
                case "Compra": {
                    wc.jmCompra.setVisible(true);
                }
                break;
                case "Pedidos": {
                    wc.jmPedido.setVisible(true);
                }
                break;
                case "CDevoluciones": {
                    wc.jmDevolucionCompras.setVisible(true);
                }
                break;
                case "Contablilidad": {
                    wc.jmContabilidad.setVisible(true);
                }
                break;
                case "Retenciones": {
                    wc.jmRetenciones.setVisible(true);
                }
                break;
                case "Notas de Credito": {
                    wc.jmNotaCredito.setVisible(true);
                }
                break;
                case "Notas de Debito": {
                    wc.jmNotaDebito.setVisible(true);
                }
                break;
                case "Asientos Contables": {
                    wc.jmAsientosContables.setVisible(true);
                }
                break;
                case "Reportes": {
                    wc.jmReportes.setVisible(true);
                }
                break;
                case "Inventario": {
                    wc.jmInventario.setVisible(true);
                }
                break;
                case "RContablilidad": {
                    wc.jmReporteContabilidad.setVisible(true);
                }
                break;
                case "Arqueo de Caja": {
                    wc.jmArqueoCaja.setVisible(true);
                }
                break;
                case "Ayuda": {
                    wc.jmAyuda.setVisible(true);
                }
                break;
                case "Manual de Usuario": {
                    wc.jmManual.setVisible(true);
                }
                break;
                case "Manual Tecnico": {
                    wc.jmManualTecnico.setVisible(true);
                }
                break;
                case "Acerca de": {
                    wc.jmAcercade.setVisible(true);
                }
                break;

            }
        }
    }

    public void vistasEnable(WCentral wc, String[] secciones) {
        ArrayList<String> sec = new ArrayList<>();

        sec.addAll(Arrays.asList(secciones));
        for (int a = 0; a < sec.size(); a++) {
            switch (sec.get(a)) {
                case "Mantenimiento": {
                    wc.jmMantenimiento.setEnabled(true);
                }
                break;
                case "Producto": {
                    wc.jmProductos.setEnabled(true);
                }
                break;
                case "Proveedores": {
                    wc.jmProveedores.setEnabled(true);
                }
                break;
                case "Clientes": {
                    wc.jmClientes.setEnabled(true);
                }
                break;
                case "Varios": {
                    wc.jmVarios.setEnabled(true);
                }
                break;
                case "Bodega": {
                    wc.jmBodega.setEnabled(true);
                }
                break;
                case "BIngresos": {
                    wc.jmBodegaIngresos.setEnabled(true);
                }
                break;
                case "BEgresos": {
                    wc.jmBodegaEgresos.setEnabled(true);
                }
                break;
                case "Seguridad": {
                    wc.jmSeguridad.setEnabled(true);
                }
                break;
                case "Permisos": {
                    wc.jmPermisos.setEnabled(true);
                }
                break;
                case "Usuarios": {
                    wc.jmUsuarios.setEnabled(true);
                }
                break;
                case "Ventas": {
                    wc.jmFacturacion.setEnabled(true);
                }
                break;
                case "Venta": {
                    wc.jmVentas.setEnabled(true);
                }
                break;
                case "Cotizacion": {
                    wc.jmCotizacion.setEnabled(true);
                }
                break;
                case "VDevoluciones": {
                    wc.jmDevolucionVentas.setEnabled(true);
                }
                break;
                case "Compras": {
                    wc.jmCompras.setEnabled(true);
                }
                break;
                case "Compra": {
                    wc.jmCompra.setEnabled(true);
                }
                break;
                case "Pedidos": {
                    wc.jmPedido.setEnabled(true);
                }
                break;
                case "CDevoluciones": {
                    wc.jmDevolucionCompras.setEnabled(true);
                }
                break;
                case "Contablilidad": {
                    wc.jmContabilidad.setEnabled(true);
                }
                break;
                case "Retenciones": {
                    wc.jmRetenciones.setEnabled(true);
                }
                break;
                case "Notas de Credito": {
                    wc.jmNotaCredito.setEnabled(true);
                }
                break;
                case "Notas de Debito": {
                    wc.jmNotaDebito.setEnabled(true);
                }
                break;
                case "Asientos Contables": {
                    wc.jmAsientosContables.setEnabled(true);
                }
                break;
                case "Reportes": {
                    wc.jmReportes.setEnabled(true);
                }
                break;
                case "Inventario": {
                    wc.jmInventario.setEnabled(true);
                }
                break;
                case "RContablilidad": {
                    wc.jmReporteContabilidad.setEnabled(true);
                }
                break;
                case "Arqueo de Caja": {
                    wc.jmArqueoCaja.setEnabled(true);
                }
                break;
                case "Ayuda": {
                    wc.jmAyuda.setEnabled(true);
                }
                break;
                case "Manual de Usuario": {
                    wc.jmManual.setEnabled(true);
                }
                break;
                case "Manual Tecnico": {
                    wc.jmManualTecnico.setEnabled(true);
                }
                break;
                case "Acerca de": {
                    wc.jmAcercade.setEnabled(true);
                }
                break;

            }
        }
    }
}
