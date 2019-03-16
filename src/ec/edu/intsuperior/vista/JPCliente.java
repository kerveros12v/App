/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.ControladorCliente;

/**
 *
 * @author userpc
 */
public class JPCliente extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;

    private final ControladorCliente controlador;

    /**
     * Creates new form JPClienteProveedor
     * @param controlador
     */
    public JPCliente(ControladorCliente controlador) {
        initComponents();
        this.controlador=controlador;
    }
public void settipotexto(String tipo){
    jtxttipo.setText(tipo);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxttipo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtApellido = new javax.swing.JTextField();
        jtxtDireccion = new javax.swing.JTextField();
        jtxtTelefono = new javax.swing.JTextField();
        jtxtCedula = new javax.swing.JTextField();
        jpbEstado = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jtxtCorreo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jbtnNuevo = new javax.swing.JButton();
        jbtnGuardar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnBuscar = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(326, 30));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("Tipo:     ");
        jPanel1.add(jLabel1);

        jtxttipo.setEditable(false);
        jtxttipo.setBorder(null);
        jtxttipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttipoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxttipo);

        add(jPanel1);

        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        jPanel2Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel2.setLayout(jPanel2Layout);

        jLabel2.setText("Nombres       ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Apellidos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Direccion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Telefono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Cedula");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jLabel6, gridBagConstraints);

        jtxtNombre.setPreferredSize(new java.awt.Dimension(200, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel2.add(jtxtNombre, gridBagConstraints);

        jtxtApellido.setPreferredSize(new java.awt.Dimension(200, 28));
        jtxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtApellidoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        jPanel2.add(jtxtApellido, gridBagConstraints);

        jtxtDireccion.setPreferredSize(new java.awt.Dimension(200, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        jPanel2.add(jtxtDireccion, gridBagConstraints);

        jtxtTelefono.setPreferredSize(new java.awt.Dimension(200, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        jPanel2.add(jtxtTelefono, gridBagConstraints);

        jtxtCedula.setPreferredSize(new java.awt.Dimension(200, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        jPanel2.add(jtxtCedula, gridBagConstraints);

        jpbEstado.setBorderPainted(false);
        jpbEstado.setString("");
        jpbEstado.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jpbEstado, gridBagConstraints);

        jLabel7.setText("Correo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(jLabel7, gridBagConstraints);

        jtxtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCorreoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jtxtCorreo, gridBagConstraints);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jScrollPane1, gridBagConstraints);

        jLabel8.setText("Notas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        jPanel2.add(jLabel8, gridBagConstraints);

        add(jPanel2);

        jToolBar1.setFloatable(false);

        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/new_add_insert_file_13948.png"))); // NOI18N
        jbtnNuevo.setToolTipText("NUEVO");
        jbtnNuevo.setFocusable(false);
        jbtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnNuevo);

        jbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/save_icon-icons.com_53618.png"))); // NOI18N
        jbtnGuardar.setToolTipText("GUARDAR");
        jbtnGuardar.setFocusable(false);
        jbtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnGuardar);

        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/organizer_calendar_clock_pencil_10047.png"))); // NOI18N
        jbtnEditar.setToolTipText("EDITAR");
        jbtnEditar.setFocusable(false);
        jbtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnEditar);

        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/delete-file_40456.png"))); // NOI18N
        jbtnEliminar.setToolTipText("ELIMINAR");
        jbtnEliminar.setFocusable(false);
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnEliminar);

        jbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/find_search_card_user_16713.png"))); // NOI18N
        jbtnBuscar.setToolTipText("BUSCAR");
        jbtnBuscar.setFocusable(false);
        jbtnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnBuscar);

        add(jToolBar1);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxttipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxttipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttipoActionPerformed

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        // TODO add your handling code here:
     controlador.jbtnNuevo(evt, jtxtNombre, jtxtApellido, jtxtDireccion, jtxtTelefono, jtxtCedula, jtxtCorreo, jTextArea1, jpbEstado);
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jtxtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCorreoActionPerformed

    private void jtxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtApellidoActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        controlador.jbtnGuardar(evt, jtxtNombre, jtxtApellido, jtxtDireccion, jtxtTelefono, jtxtCedula, jtxtCorreo, jTextArea1, jpbEstado);
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        // TODO add your handling code here:
        controlador.jbtnActualizar(evt, jtxtNombre, jtxtApellido, jtxtDireccion, jtxtTelefono, jtxtCedula, jtxtCorreo, jTextArea1, jpbEstado);
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        // TODO add your handling code here:
        controlador.jbtnEliminar(evt, jtxtNombre, jtxtApellido, jtxtDireccion, jtxtTelefono, jtxtCedula, jtxtCorreo, jTextArea1, jpbEstado);
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        // TODO add your handling code here:
        controlador.jbtnBuscar(evt, jtxtNombre, jtxtApellido, jtxtDireccion, jtxtTelefono, jtxtCedula, jtxtCorreo, jTextArea1, jpbEstado);
    }//GEN-LAST:event_jbtnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnNuevo;
    public javax.swing.JProgressBar jpbEstado;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtCedula;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtDireccion;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtTelefono;
    public javax.swing.JTextField jtxttipo;
    // End of variables declaration//GEN-END:variables
}