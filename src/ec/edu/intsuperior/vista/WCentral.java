/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.controlador.Controlador;
import javax.swing.JFrame;

/**
 *
 * @author userpc
 */
public class WCentral extends javax.swing.JFrame {
private final Controlador controlador;
    /**
     * Creates new form WCentral
     * @param controlador
     */
    public WCentral(Controlador controlador) {
        initComponents();
        this.controlador=controlador;
    }
    public void addJFrame(javax.swing.JInternalFrame j){
    jDContenedor.add(j);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDContenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jDContenedor.setBackground(new java.awt.Color(0, 51, 204));
        jDContenedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDContenedor.setAutoscrolls(true);
        jDContenedor.setOpaque(false);

        javax.swing.GroupLayout jDContenedorLayout = new javax.swing.GroupLayout(jDContenedor);
        jDContenedor.setLayout(jDContenedorLayout);
        jDContenedorLayout.setHorizontalGroup(
            jDContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        jDContenedorLayout.setVerticalGroup(
            jDContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        getContentPane().add(jDContenedor);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/Recycle_Bin_Full_24276.png"))); // NOI18N
        jMenu1.setText("Mantenimiento");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/App-icons-icon.png"))); // NOI18N
        jMenuItem1.setText("Productos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/user_person_customer_man_1532.png"))); // NOI18N
        jMenuItem2.setText("Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/Groups-Meeting-Dark-icon (1).png"))); // NOI18N
        jMenuItem3.setText("Proveedores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/administrative_tools_15497.png"))); // NOI18N
        jMenuItem6.setText("Varios");
        jMenu1.add(jMenuItem6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/supervisor_people_man_you_2840.png"))); // NOI18N
        jMenu7.setText("Bodega");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/mail-inbox_36095.png"))); // NOI18N
        jMenuItem4.setText("Ingresos");
        jMenu7.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/mail-outbox_36093.png"))); // NOI18N
        jMenuItem5.setText("Egresos");
        jMenu7.add(jMenuItem5);

        jMenu1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/key_1564.png"))); // NOI18N
        jMenu8.setText("Seguridad");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/loginlockrefreshincircularbutton_80241.png"))); // NOI18N
        jMenuItem7.setText("Permisos");
        jMenu8.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/userkdmfemale_person_woman_5920.png"))); // NOI18N
        jMenuItem8.setText("Usuarios");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem8);

        jMenu1.add(jMenu8);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/bar_code_22177.png"))); // NOI18N
        jMenu2.setText("Facturacion");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/Electronic_billing_machine_Icon_64.png"))); // NOI18N
        jMenuItem9.setText("Ventas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/business_ordering_pencil_table_2333.png"))); // NOI18N
        jMenuItem10.setText("Cotizacion");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/mail-inbox_36095.png"))); // NOI18N
        jMenuItem11.setText("Devoluciones");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/Box_1_35524.png"))); // NOI18N
        jMenu3.setText("Compras");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/invoice_22150.png"))); // NOI18N
        jMenuItem12.setText("Compra");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/keducaready_keduca_957.png"))); // NOI18N
        jMenuItem13.setText("Pedido");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/mail-outbox_36093.png"))); // NOI18N
        jMenuItem14.setText("Devolucion");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/editnote_edi_9512.png"))); // NOI18N
        jMenu4.setText("Contabilidad");
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenuItem15.setText("Retenciones");
        jMenu4.add(jMenuItem15);

        jMenuItem16.setText("Notas de Credito");
        jMenu4.add(jMenuItem16);

        jMenuItem17.setText("Nota de Debito");
        jMenu4.add(jMenuItem17);

        jMenuItem18.setText("Asientos Contables");
        jMenu4.add(jMenuItem18);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/table_graph_6191.png"))); // NOI18N
        jMenu5.setText("Reportes");
        jMenu5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/file_cab_15475.png"))); // NOI18N
        jMenuItem19.setText("Inventario");
        jMenu5.add(jMenuItem19);

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/bar_chart_22178.png"))); // NOI18N
        jMenuItem20.setText("Contabilidad");
        jMenu5.add(jMenuItem20);

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/Banking_00019_A_icon-icons.com_59819.png"))); // NOI18N
        jMenuItem21.setText("Arqueo de Caja");
        jMenu5.add(jMenuItem21);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/help_920.png"))); // NOI18N
        jMenu6.setText("Ayuda");
        jMenu6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/User_Manual-80_icon-icons.com_57245.png"))); // NOI18N
        jMenuItem22.setText("Manual");
        jMenu6.add(jMenuItem22);

        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/intsuperior/recursos/Home.png"))); // NOI18N
        jMenuItem23.setText("Acerca de..");
        jMenu6.add(jMenuItem23);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        controlador.getFacturacion(this, "Compras");
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       controlador.getClienteProveedor(this,"Clientes");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        controlador.getUsuario(this);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        controlador.getFacturacion(this, "Ventas");
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
                controlador.getFacturacion(this, "Cotizacion");

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
                controlador.getFacturacion(this, "Devoluciones Ventas");

    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        controlador.getFacturacion(this, "Pedido Compras");
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
           controlador.getFacturacion(this, "Devoluciones Compras");
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        controlador.getClienteProveedor(this,"Proveedores");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        controlador.getProducto(this);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(WCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(WCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(WCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(WCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new WCentral().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDContenedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

    public void addJFrame(JFrame wc) {
       jDContenedor.add(wc);//To change body of generated methods, choose Tools | Templates.
    }
}
