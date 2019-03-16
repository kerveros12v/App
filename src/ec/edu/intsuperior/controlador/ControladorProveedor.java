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

import ec.edu.intsuperior.modelo.DatosParametrosGeneral;
import ec.edu.intsuperior.modelo.Proveedores;
import ec.edu.intsuperior.vista.JPProveedor;
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
public class ControladorProveedor extends Controlador implements DatosParametrosGeneral {

    private final Proveedores proveedores = new Proveedores();
    private final JPProveedor wc = new JPProveedor(this);

    /**
     * Metodo para la abertura de Vista Proveedores
     *
     * @param central
     *
     */
    public void getClienteProveedor(WCentral central) {
        super.abrirInternalJFrame("PROVEEDORES", central, wc, false, true, false, 551, 400);

    }

    public void jbtnNuevo(java.awt.event.ActionEvent evt, JTextField nombre, JTextField apellido, JTextField direccion, JTextField telefono, JTextField cedula, JTextField correo, JTextArea notas, JProgressBar notificacion) {
        nombre.setText("");
        apellido.setText("");
        direccion.setText("");
        correo.setText("");
        telefono.setText("");
        notas.setText("");
        cedula.setText("");
        proveedores.setProv_nombres(nombre.getText());
        proveedores.setProv_apellidos(apellido.getText());
        proveedores.setProv_direccion(direccion.getText());
        proveedores.setProv_correo(correo.getText());
        proveedores.setProv_telefono(telefono.getText());
        proveedores.setProv_notas(notas.getText());
        proveedores.setProv_cedula(cedula.getText());
        notificacion.setString("Campos Libres para un Nuevo Registro");
    }

    public void jbtnGuardar(java.awt.event.ActionEvent evt, JTextField nombre, JTextField apellido, JTextField direccion, JTextField telefono, JTextField cedula, JTextField correo, JTextArea notas, JProgressBar notificacion) {
        proveedores.setProv_nombres(nombre.getText());
        proveedores.setProv_apellidos(apellido.getText());
        proveedores.setProv_direccion(direccion.getText());
        proveedores.setProv_correo(correo.getText());
        proveedores.setProv_telefono(telefono.getText());
        proveedores.setProv_notas(notas.getText());
        proveedores.setProv_cedula(cedula.getText());
        notificacion.setString(eliminar("call sfwb_1.nuevoProvedores('" + proveedores.getProv_apellidos() + "','" + proveedores.getProv_cedula() + "','" + proveedores.getProv_correo() + "','" + proveedores.getProv_direccion() + "','" + proveedores.getProv_nombres() + "','" + proveedores.getProv_telefono() + "','" + proveedores.getProv_notas() + "');"));
    }

    public void jbtnActualizar(java.awt.event.ActionEvent evt, JTextField nombre, JTextField apellido, JTextField direccion, JTextField telefono, JTextField cedula, JTextField correo, JTextArea notas, JProgressBar notificacion) {
        notificacion.setString(editar("call sfwb_1.ActualizarProveedor('" + apellido.getText()+ "','" +cedula.getText()+ "','" +correo.getText()+ "','" +direccion.getText()+ "','" + nombre.getText()+ "','" + telefono.getText()+ "','" + notas.getText()+ "','" + proveedores.getProv_nombres()+ "','" + proveedores.getProv_apellidos()+ "','" + proveedores.getProv_cedula()+ "');"));
    }

    public void jbtnEliminar(java.awt.event.ActionEvent evt, JTextField nombre, JTextField apellido, JTextField direccion, JTextField telefono, JTextField cedula, JTextField correo, JTextArea notas, JProgressBar notificacion) {
        proveedores.setProv_nombres(nombre.getText());
        proveedores.setProv_apellidos(apellido.getText());
        proveedores.setProv_direccion(direccion.getText());
        proveedores.setProv_correo(correo.getText());
        proveedores.setProv_telefono(telefono.getText());
        proveedores.setProv_notas(notas.getText());
         proveedores.setProv_cedula(cedula.getText());
        notificacion.setString(eliminar("call sfwb_1.eliminarProveedores('" + proveedores.getProv_nombres() + "','" + proveedores.getProv_apellidos() + "','" + proveedores.getProv_cedula() + "');"));

    }

    public void jbtnBuscar(java.awt.event.ActionEvent evt, JTextField nombre, JTextField apellido, JTextField direccion, JTextField telefono, JTextField cedula, JTextField correo, JTextArea notas, JProgressBar notificacion) {
        proveedores.setProv_nombres(nombre.getText());
        proveedores.setProv_apellidos(apellido.getText());
        proveedores.setProv_direccion(direccion.getText());
        proveedores.setProv_correo(correo.getText());
        proveedores.setProv_telefono(telefono.getText());
        proveedores.setProv_notas(notas.getText());
        proveedores.setProv_cedula(cedula.getText());
        buscar("SELECT prov_nombres,prov_apellidos,prov_direccion,prov_telefono,prov_cedula,prov_correo,prov_notas FROM sfwb_1.proveedores where prov_cedula='" + proveedores.getProv_cedula() + "';");
        nombre.setText(proveedores.getProv_nombres());
        apellido.setText(proveedores.getProv_apellidos());
        cedula.setText(proveedores.getProv_cedula());
        direccion.setText(proveedores.getProv_direccion());
        telefono.setText(proveedores.getProv_telefono());
        correo.setText(proveedores.getProv_correo());
        notas.setText(proveedores.getProv_notas());
        notificacion.setString("Buscando " + proveedores.getProv_cedula());

    }

    @Override
    public String nuevo(String query) {

        cm.conectarMySQL();
        String g = cm.LecturaQuery(query).toString();
        cm.Cerrar();
        return g;
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

    @Override
    public void buscar(String query) {
        try {
            cm.conectarMySQL();
            ResultSet g = cm.LecturaQuery(query);
            while (g.next()) {
                proveedores.setProv_apellidos(g.getString(2));
                proveedores.setProv_cedula(g.getString(5));
                proveedores.setProv_correo(g.getString(6));
                proveedores.setProv_direccion(g.getString(3));
                proveedores.setProv_nombres(g.getString(1));
                proveedores.setProv_notas(g.getString(7));
                proveedores.setProv_telefono(g.getString(4));
            }
            cm.Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String Imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
