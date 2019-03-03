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

import ec.edu.intsuperior.modelo.Permisos;
import ec.edu.intsuperior.modelo.Usuarios;
import ec.edu.intsuperior.vista.JPCambioClaveAdmin;
import ec.edu.intsuperior.vista.JPPermisos;
import ec.edu.intsuperior.vista.JPUsuario;
import ec.edu.intsuperior.vista.Login;
import ec.edu.intsuperior.vista.WCentral;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author dellpc
 */
public class ControladorUsuarios extends Controlador {

    private Usuarios usarios = new Usuarios();
    private Permisos permisos = new Permisos();

    public void getLogin() {
        Login login = new Login(this);
        super.abrirJFrame(login, false, false);
    }

    /**
     * Metodo para la avertura de usuarios en vista de Administrador
     *
     * @param central
     */
    public void getUsuario(WCentral central) {
        JPUsuario wc = new JPUsuario(this);
        abrirInternalJFrame("Usuarios", central, wc, false, true, false, 415, 200);
    }

    public void getCambioClaveAdmin() {
        JPCambioClaveAdmin wc = new JPCambioClaveAdmin(this);
        abrirJPanelJFrameExterno(wc, "Cambio de clave", false, false, 416, 351);
    }

    public void validarEstado(String dato, JRadioButton activado, JRadioButton inactivo) {
        Boolean estado = false;
        for (int a = 0; a < permisos.getListapermisos().size(); a++) {
            if (permisos.getListapermisos().get(a).equals(dato)) {
                break;
            }
            if (estado) {
                activado.isSelected();
            } else {
                inactivo.isSelected();
            }
        }
    }

    public void jtPermisosValueChanged(JPPermisos l1, JTree j, JRadioButton activo, JRadioButton inactivo, JTextField datoSeleccionado, javax.swing.event.TreeSelectionEvent evt) {
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) j.getLastSelectedPathComponent();
        datoSeleccionado.setText(selectedNode.getUserObject().toString());
        validarEstado(selectedNode.getUserObject().toString(), activo, inactivo);
        //l1.repaint();
    }

    public ArrayList<String> listaPermisos(ConexionMysql cm, String usuario) {
        return cm.permisosActivos(usuario).estadoGeneral();
    }

    public void jbtnIngresarActionPerformed(Login l, java.awt.event.ActionEvent evt, JTextField usuario, JPasswordField clave) {
        // TODO add your handling code here:
        if (true == validarUsuario(usuario.getText(), String.copyValueOf(clave.getPassword()))) {
            l.setVisible(false);
            l.dispose();
            super.getSistema(listaPermisos(super.cm, usuario.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "El Usuario o contraseña es incorrecto");
        }
    }

    public Boolean validarUsuario(String user, String clave) {
        super.cm.conectarMySQL();
        Boolean b = false;
        ResultSet rs = super.cm.LecturaQuery("select sfwb_1.validarUsuario('" + user + "', '" + clave + "');");
        try {
            if (rs.next()) {

                if (rs.getInt(1) == 1) {
                    b = true;
                }
            }
            super.cm.Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    /**
     * Metodo para la abertura de Vista donde se puede configurar los permisos
     * de Usuarios
     *
     * @param central
     * @param titulo
     */
    public void showPermisos(WCentral central, String titulo) {
        JPPermisos wc = new JPPermisos(this);
        abrirInternalJFrame(titulo, central, wc, false, true, true, 360, 400);
    }

    @SuppressWarnings("unchecked")
    public void cargalistaTipos(JComboBox jcb) {
        for (String sal : ListaTipos()) {
            jcb.addItem(sal);
        }
    }

    public ArrayList<String> ListaTipos() {
        ArrayList<String> salida = new ArrayList<>();
        super.cm.conectarMySQL();
        ResultSet rs = cm.LecturaQuery("select permisos.permTipo from permisos;");
        try {
            while (rs.next()) {
                salida.add(rs.getString(1));
            }
            cm.Cerrar();
        } catch (SQLException ex) {
        }
        return salida;

    }

    /**
     * @return the uusarios
     */
    public Usuarios getUsarios() {
        return usarios;
    }

    /**
     * @param uusarios the uusarios to set
     */
    public void setUsarios(Usuarios uusarios) {
        this.usarios = uusarios;
    }

    /**
     * @return the permisos
     */
    public Permisos getPermisos() {
        return permisos;
    }

    /**
     * @param permisos the permisos to set
     */
    public void setPermisos(Permisos permisos) {
        this.permisos = permisos;
    }

}
