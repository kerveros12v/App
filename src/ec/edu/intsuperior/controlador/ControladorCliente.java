/*
 * Copyright (C) 2019 dellpc.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Clientes;
import ec.edu.intsuperior.modelo.DatosParametrosGeneral;
import ec.edu.intsuperior.vista.JPCliente;
import ec.edu.intsuperior.vista.WCentral;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dellpc
 */
public class ControladorCliente extends Controlador implements DatosParametrosGeneral {

    private Clientes clientes = new Clientes();
    private ConexionMysql con;
    private final JPCliente wc = new JPCliente(this);

    /**
     * Metodo para la abertura de Vista Clientes o Proveedores
     *
     * @param central
     * @param titulo
     */
    public void getClienteProveedor(WCentral central, String titulo) {
        wc.jtxttipo.setText("CLIENTES");
        super.abrirInternalJFrame(titulo, central, wc, false, true, false, 626, 350);
    }

    /**
     * @return the clientes
     */
    public Clientes getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    @Override
    public String nuevo(String query) {
        cm.conectarMySQL();
        String g = cm.LecturaQuery(query).toString();
        cm.Cerrar();
        return g;
    }

    @Override
    public void buscar(String query) {
        try {

            cm.conectarMySQL();
            ResultSet g = cm.LecturaQuery(query);
            while (g.next()) {
                clientes.setApellidos(g.getString(2));
                clientes.setCedula(g.getString(5));
                clientes.setNotas(g.getString(6));
                clientes.setDireccion(g.getString(3));
                clientes.setNombres(g.getString(1));
                clientes.setCorreo(g.getString(7));
                clientes.setTelefono(g.getString(4));
            }
            cm.Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String Imprimir() {
        return clientes.toString();
    }

    /**
     * @return the con
     */
    public ConexionMysql getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(ConexionMysql con) {
        this.con = con;
    }

    @Override
    public String editar(String query) {
        cm.conectarMySQL();
        String g = cm.LecturaQuery(query).toString();
        cm.Cerrar();
        return g;
    }

    @Override
    public String eliminar(String query) {
        cm.conectarMySQL();
        String g = cm.LecturaQuery(query).toString();
        cm.Cerrar();
        return g;
    }

    public void jbtnNuevo(java.awt.event.ActionEvent evt, JTextField nombre, JTextField apellido, JTextField direccion, JTextField telefono, JTextField cedula, JTextField correo, JTextArea notas, JProgressBar notificacion) {
        nombre.setText("");
        apellido.setText("");
        direccion.setText("");
        correo.setText("");
        telefono.setText("");
        notas.setText("");
        cedula.setText("");
        clientes.setNombres(nombre.getText());
        clientes.setApellidos(apellido.getText());
        clientes.setDireccion(direccion.getText());
        clientes.setCorreo(correo.getText());
        clientes.setTelefono(telefono.getText());
        clientes.setNotas(notas.getText());
        clientes.setCedula(cedula.getText());
        notificacion.setString("Campos Libres para un Nuevo Registro");
    }

    public void jbtnGuardar(java.awt.event.ActionEvent evt, JTextField nombre, JTextField apellido, JTextField direccion, JTextField telefono, JTextField cedula, JTextField correo, JTextArea notas, JProgressBar notificacion) {
        clientes.setNombres(nombre.getText());
        clientes.setApellidos(apellido.getText());
        clientes.setDireccion(direccion.getText());
        clientes.setCorreo(correo.getText());
        clientes.setTelefono(telefono.getText());
        clientes.setNotas(notas.getText());
        clientes.setCedula(cedula.getText());
        notificacion.setString(eliminar("call sfwb_1.nuevoCliente('"
                + clientes.getApellidos() + "','"
                + clientes.getCedula() + "','"
                + clientes.getDireccion() + "','"
                + clientes.getNombres() + "','"
                + clientes.getTelefono() + "','"
                + clientes.getNotas() + "','"
                + clientes.getCorreo() + "');"));
    }

    public void jbtnActualizar(java.awt.event.ActionEvent evt, JTextField nombre, JTextField apellido, JTextField direccion, JTextField telefono, JTextField cedula, JTextField correo, JTextArea notas, JProgressBar notificacion) {
        notificacion.setString(editar("call sfwb_1.ActualizarCliente('"
                + apellido.getText() + "','"
                + cedula.getText() + "','"
                + correo.getText() + "','"
                + direccion.getText() + "','"
                + nombre.getText() + "','"
                + telefono.getText() + "','"
                + notas.getText() + "','"
                + clientes.getNombres() + "','"
                + clientes.getApellidos() + "','"
                + clientes.getCedula() + "');"));
    }

    public void jbtnEliminar(java.awt.event.ActionEvent evt, JTextField nombre, JTextField apellido, JTextField direccion, JTextField telefono, JTextField cedula, JTextField correo, JTextArea notas, JProgressBar notificacion) {
        clientes.setNombres(nombre.getText());
        clientes.setApellidos(apellido.getText());
        clientes.setDireccion(direccion.getText());
        clientes.setCorreo(correo.getText());
        clientes.setTelefono(telefono.getText());
        clientes.setNotas(notas.getText());
        clientes.setCedula(cedula.getText());
        notificacion.setString(eliminar("call sfwb_1.eliminarCliente('" + clientes.getNombres() + "','" + clientes.getApellidos() + "','" + clientes.getCedula() + "');"));

    }

    public void jbtnBuscar(java.awt.event.ActionEvent evt, JTextField nombre, JTextField apellido, JTextField direccion, JTextField telefono, JTextField cedula, JTextField correo, JTextArea notas, JProgressBar notificacion) {
        clientes.setNombres(nombre.getText());
        clientes.setApellidos(apellido.getText());
        clientes.setDireccion(direccion.getText());
        clientes.setCorreo(correo.getText());
        clientes.setTelefono(telefono.getText());
        clientes.setNotas(notas.getText());
        clientes.setCedula(cedula.getText());
        buscar("SELECT `clientes`.`clienombres`,`clientes`.`clieapellidos`,`clientes`.`cliedireccion`,`clientes`.`clietelefono`,`clientes`.`cliecedula`,`clientes`.`clieNotas`,`clientes`.`clieCorreo`FROM `sfwb_1`.`clientes` where `clientes`.`cliecedula`='" + clientes.getCedula() + "';");
        nombre.setText(clientes.getNombres());
        apellido.setText(clientes.getApellidos());
        cedula.setText(clientes.getCedula());
        direccion.setText(clientes.getDireccion());
        telefono.setText(clientes.getTelefono());
        correo.setText(clientes.getCorreo());
        notas.setText(clientes.getNotas());
        notificacion.setString("Buscando " + clientes.getCedula());

    }

}
