/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author Estudiante
 */
public class help extends javax.swing.JFrame {

    /**
     * Creates new form help boton incorrecto era el otro
     */
    
    int formulario;
    String [] textos = new String [25];
    
    public help(int form) {
        //aqui vas a poner el texto de cada formulario 
        textos [0] = "<html>en esta ventana se ingresa al sistema si inicias como invitado podras contruir pc's y sacar presupuestos pero no benchmak<html>";
        textos [1] = "<html>En esta ventana puedes solicitar ayuda a un administrador mediante un correo electronico<html>";
        textos [2] = "<html>en la caja registradora podras detallar los productos a vender o buscar un presupuesto realizado con anticipacion desde la app<html>";
        textos [3] = "<html>en esta ventana podras comunicarte con algun cliente para darle soporte tecnico mediante chat<html>";
        textos [4] = "<html>en este apartado puedes construir una pc con los componentes que tu elijas<html>";
        textos [5] = "<html>en este apartado puedes construir una pc con los componentes que tu elijas<html>";
        textos [6] = "<html>en este apartado puedes construir una pc con los componentes que tu elijas<html>";
        textos [7] = "<html>en este apartado puedes construir una pc con los componentes que tu elijas<html>";
        textos [8] = "<html>en esta ventana podras modificar los datos de la empresa<html>";
        textos [9] = "<html>en esta ventana podras gestionar datos de el empleado y datos de documentos<html>";
        textos [10] = "<html>en este apartado podras gestionar las bitacoras de un cliente o un empleado para asi generar un reporte<html>";
        textos [11] = "<html>aqui podras consultar los clientes de la empresa<html>";
        textos [12] = "<html>aqui podras gestionar el inventario y los reportes creados<html>";
        textos [13] = "<html>en esta ventana podras crear un presupuesto a partir de una pc que se haya construido anteriormente<html>";
        textos [14] = "<html>en esta ventana podras gestionar los productos y elegir a que categoria pertenecera<html>";
        textos [15] = "<html>aqui podras gestionar los proveedores que distribuyen a la empresa<html>";
        textos [16] = "<html>En este apartado se puede gestionar<p> los tipos de usuario y administrar los privilegios de cada uno<html>";
        textos [17] = "<html>aqui se puede gestionar las ventas de un determinado periodo de tiempo<html>";
        textos [18] = "<html>en esta ventana se muestra el total a pagar el pago realizado por el cliente y el cambio que se entregara al cliente<html>";
        textos [19] = "<html>en este apartado debes ingresar el correo al caul se mandara la contraseña<html>";
        textos [20] = "<html>en esta ventana se puede agregar un nuevo cliente<html>";
        textos [21] = "<html>en esta ventana muestra los pedidos por ensamblar y es posible aplazarlos por si hay algun inconveniente<html>";
        textos [22] = "<html> Lamentamos las molestias <p> por favor <p> intente mas tarde <html>";
        textos [23] = "<html> Lamentamos las molestias <p> por favor <p> intente mas tarde <html>";
        textos [24] = "<html> Lamentamos las molestias <p> por favor <p> intente mas tarde <html>";
        initComponents();
        
        setLocationRelativeTo(null);
        formulario=form;
        
        for (int i = 0; i < 25; i++) {
            if (formulario==i) {
                lblTexto.setText(textos[i]);
                break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        lblTexto = new javax.swing.JLabel();
        jButtonok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(30, 57, 42));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 196, 124), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 196, 124));
        jLabel1.setText("Ayuda");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 10, -1, 36));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblTexto.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jButtonok.setBackground(new java.awt.Color(51, 51, 51));
        jButtonok.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonok.setForeground(new java.awt.Color(204, 204, 204));
        jButtonok.setText("OK");
        jButtonok.setContentAreaFilled(false);
        jButtonok.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButtonokMouseMoved(evt);
            }
        });
        jButtonok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonokMouseExited(evt);
            }
        });
        jButtonok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonokActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonok, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 245, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
                this.hide();
    }//GEN-LAST:event_formWindowClosed

    private void jButtonokMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonokMouseMoved
        // TODO add your handling code here:
        jButtonok.setContentAreaFilled(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButtonokMouseMoved

    private void jButtonokMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonokMouseExited
        // TODO add your handling code here:
        jButtonok.setContentAreaFilled(false);
    }//GEN-LAST:event_jButtonokMouseExited

    private void jButtonokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonokActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButtonokActionPerformed

    private void jPanel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel2AncestorAdded
        // TODO add your handling code here:
        //this.lblTexto.setText("<html>al iniciar como invitado podras contruir pcs<p> y sacar presupuestos pero no benchmak<html>");
    }//GEN-LAST:event_jPanel2AncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //porque llenaste aqui el arreglo? siempre lo he llenado ahi, aps no mejor llenalo afuera
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new help(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables
}
