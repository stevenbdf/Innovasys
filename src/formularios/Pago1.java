/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.Conexion;
import clases.mtoCajaRegistradora;
import clases.verificaciones;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author steven
 */
public class Pago1 extends javax.swing.JFrame {

    /**
     * Creates new form Pago1
     */
    verificaciones  verificar = new verificaciones();
    int codEmpleado=0, codCliente=0;
    String correoCliente;
    double PTotal=0.0;
    Object[][] tabla;
    String correo;
    Integer largo;
    public Pago1(String cliente, int empleado, double total, Object[][] recibo,String nombre,int length) {
//        try {
//			
//                     UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
//		}
//		catch (Exception e) {
//		}
        initComponents();
        largo=length;
        correo=nombre;
        codEmpleado=empleado;
        correoCliente=cliente;
        PTotal=total;
        tabla=recibo;
        
            try {
            Conexion cn = new Conexion();
            String consulta2 = "SELECT cliente.idCliente FROM cliente WHERE cliente.correoElectronico= '" +correoCliente+"'";
            PreparedStatement cons = cn.conectar().prepareStatement(consulta2);
            ResultSet vers = cons.executeQuery();
            if (vers.next()) {
                codCliente = vers.getInt(1);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        jTFTotal.setText(String.valueOf(total));
        
         setLocationRelativeTo(null);
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
        lblTexto = new javax.swing.JLabel();
        jTFCambio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFIngreso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        btnFinalizar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(30, 57, 42));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 196, 124)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTexto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto.setText("Cambio($):");
        jPanel1.add(lblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTFCambio.setBackground(new java.awt.Color(204, 204, 204));
        jTFCambio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTFCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCambioActionPerformed(evt);
            }
        });
        jTFCambio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCambioKeyTyped(evt);
            }
        });
        jPanel1.add(jTFCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 68, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 196, 124));
        jLabel1.setText("Agregar Pago");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 29, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total ($):");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jTFTotal.setBackground(new java.awt.Color(204, 204, 204));
        jTFTotal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTFTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTotalActionPerformed(evt);
            }
        });
        jTFTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTotalKeyTyped(evt);
            }
        });
        jPanel1.add(jTFTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 68, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingreso ($):");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jTFIngreso.setBackground(new java.awt.Color(204, 204, 204));
        jTFIngreso.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTFIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFIngresoKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFIngresoKeyReleased(evt);
            }
        });
        jPanel1.add(jTFIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 68, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        btnFinalizar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images expo/dollar.png"))); // NOI18N
        btnFinalizar.setText("Finalizar Venta");
        btnFinalizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnFinalizar.setContentAreaFilled(false);
        btnFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFinalizarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFinalizarMouseEntered(evt);
            }
        });
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 30));

        btnFinalizar1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnFinalizar1.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images expo/paypal.png"))); // NOI18N
        btnFinalizar1.setText("Pagar con Paypal");
        btnFinalizar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnFinalizar1.setContentAreaFilled(false);
        btnFinalizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFinalizar1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFinalizar1MouseEntered(evt);
            }
        });
        btnFinalizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCambioActionPerformed

    private void jTFTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTotalActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.hide();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnFinalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarMouseEntered
        // TODO add your handling code here:
         btnFinalizar.setContentAreaFilled(true);
    }//GEN-LAST:event_btnFinalizarMouseEntered

    private void btnFinalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarMouseExited
        // TODO add your handling code here:
         btnFinalizar.setContentAreaFilled(false);
    }//GEN-LAST:event_btnFinalizarMouseExited

    private void jTFTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTotalKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
       
        if (verificar.vprecio(vchar) == true
                && (jTFTotal.getText().length() < 5)) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTFTotalKeyTyped

    private void jTFIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIngresoKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
       
        if (verificar.vprecio(vchar) == true
                && (jTFIngreso.getText().length() < 5)) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTFIngresoKeyTyped

    private void jTFCambioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCambioKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
       
        if (verificar.vprecio(vchar) == true
                && (jTFCambio.getText().length() < 5)) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTFCambioKeyTyped

    private void jTFIngresoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFIngresoKeyReleased
        // TODO add your handling code here:
        DecimalFormat df = new DecimalFormat("#.00");
        double total = Double.valueOf(jTFTotal.getText());
        double ingreso =Double.valueOf(jTFIngreso.getText());
        if (ingreso>total) {
            double cambio= ingreso-total;
            lblTexto.setText("Cambio($):");
           jTFCambio.setText(String.valueOf(df.format(cambio))); 
        }else if (ingreso<total) {
            double cambio2= total-ingreso;
            lblTexto.setText("Falta($):");
           jTFCambio.setText(String.valueOf(df.format(cambio2))); 
        }else if (ingreso==total) {
            jTFCambio.setText(String.valueOf(df.format(0))); 
        }
        
        
    }//GEN-LAST:event_jTFIngresoKeyReleased
    void crearReporte(){
        try {
            Conexion con = new Conexion();

            String archivo= getClass().getResource("/reportes/Factura.jrxml").getPath();
            archivo = URLDecoder.decode(archivo,"UTF-8");
            JasperReport report = JasperCompileManager.compileReport(archivo);
            Map parametros = new HashMap();
                      
            try {
                String sql ="SELECT TOP 1 noFactura FROM factura ORDER BY noFactura DESC";
                PreparedStatement cmd = con.conectar().prepareStatement(sql);
                ResultSet ver = cmd.executeQuery();
                if (ver.next()) {
                   parametros.put("valores",ver.getInt(1)); 
                }
            } catch (Exception e) {
                System.out.println("No hay facturas");
            }
           
            try {
                String sql ="SELECT numRegistro, nombreEmpresa, domicilioLegal, fechaConstitucion, logo, telefono, correoElectronico, propietario "
                        + "FROM datosEmpresa";
                PreparedStatement cmd = con.conectar().prepareStatement(sql);
                ResultSet ver = cmd.executeQuery();
                if (ver.next()) {
                   parametros.put("#registro",ver.getInt(1));
                   parametros.put("nombreEmpresa",ver.getString(2));
                   parametros.put("domicilio",ver.getString(3));
                   parametros.put("fechaConstitucion",ver.getString(4));
                   parametros.put("imagen",ver.getString(5));
                   parametros.put("telefono",ver.getString(6));
                   parametros.put("correo",ver.getString(7));
                   parametros.put("propietario",ver.getString(8));
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
            parametros.put("autor",correo);
            parametros.put("cliente",correoCliente);
            JasperPrint print = JasperFillManager.fillReport(report, parametros, con.conectar());
 
            JasperViewer visor = new JasperViewer(print, false);
            visor.setTitle("Factura");
            visor.setVisible(true);
 
            
        } catch (JRException e) {
            System.out.println("AQUI1");
            System.out.println(e.getMessage());
            
        } 
        catch (UnsupportedEncodingException ex) {
            System.out.println("AQUI2");
            Logger.getLogger(PInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void finalizarFactura(String tipoVenta,String comprobante){
        mtoCajaRegistradora obj = new mtoCajaRegistradora();
        obj.setCodigoEmpleado(codEmpleado);
        obj.setCodigoCliente(codCliente);
        obj.setMontoTotal(Double.valueOf(jTFTotal.getText()));
        if (obj.guardarFactura(tabla,largo,tipoVenta,comprobante)) {
            JOptionPane.showMessageDialog(this,"Factura realizada correctamente");
            crearReporte();
        }
    }
    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        double total = Double.valueOf(jTFTotal.getText());
        double pago = Double.valueOf(jTFIngreso.getText());
        if(pago>=total ){
            finalizarFactura("Efectivo","");
        }else{
           JOptionPane.showMessageDialog(this,"Ingresa un pago mayor o igual al total de la venta"); 
        }
        
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Valor 0: "+tabla[0][i]);
            System.out.println("Valor 1: "+tabla[1][i]);
        }
        System.out.println("Empleado: "+codEmpleado);
        System.out.println("Cliente: "+codCliente);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnFinalizar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalizar1MouseExited

    private void btnFinalizar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalizar1MouseEntered

    private void btnFinalizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizar1ActionPerformed
        
        //String variable = request.getParameter("variable");
        
       try {
           Conexion cn = new Conexion();
            String sql ="SELECT MAX(noFactura) FROM factura";
            PreparedStatement cmd = cn.conectar().prepareStatement(sql);
            ResultSet ver = cmd.executeQuery();
            if(ver.next()){
                Runtime aplicacion = Runtime.getRuntime();
                try {
                    aplicacion.exec("C:/Windows/System32/cmd.exe /K start https://innovasys.000webhostapp.com/index.php?id_compra="+(ver.getInt(1)+1)+"^&producto='Pedido%20con%20número%20de:%20"+(ver.getInt(1)+1)+"'^&precio="+Double.valueOf(jTFTotal.getText()));
                    String comprobante = JOptionPane.showInputDialog("Ingresa el codigo de confirmacion de paypal: ");
                    if(comprobante!=null && comprobante.matches("PAY.*") && comprobante.length()==28){
                        try{
                            String sql2 = "SELECT * FROM factura WHERE comprobantePaypal='"+comprobante+"'";
                            PreparedStatement cmd2 = cn.conectar().prepareStatement(sql2);
                            ResultSet ver2 = cmd2.executeQuery();
                            if(ver2.next()){
                                JOptionPane.showMessageDialog(this,"Error, ya existe una venta relacionada a este codigo paypal");
                            }else{
                                finalizarFactura("Paypal",comprobante);
                            }
                        }catch(Exception ex){
                            System.out.println("comprobando: "+ex);
                        }               
                    }else{
                        JOptionPane.showMessageDialog(this,"Error al verificar el codigo paypal");
                    }
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
            
        } catch (Exception e) {
            System.out.println("mtoCajaRegistradora: "+e);
        }
    }//GEN-LAST:event_btnFinalizar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pago1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pago1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pago1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pago1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Object[][] valor = new Object[2][2];
                new Pago1("",1,1.0,valor,"",1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnFinalizar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFCambio;
    private javax.swing.JTextField jTFIngreso;
    private javax.swing.JTextField jTFTotal;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables
}
