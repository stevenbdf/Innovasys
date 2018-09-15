/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;


import clases.Conexion;
import clases.mtoClientes;
import clases.verificaciones;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import java.awt.Color;
/**
 *
 * @author steven
 */
public class PGestionarClientes extends javax.swing.JPanel {

    /**
     * Creates new form PGestionarClientes
     */
    verificaciones verificar = new verificaciones();
    /*
    *   @author Boris
    *   Llenado de tabla
    */
    
    /**
     * TEST de PUSH 
     *
     */
    DefaultTableModel tbl_client;
    mtoClientes cli = new mtoClientes();
    verificaciones objeto = new verificaciones();
    String correo;
    public static final Color greenD = new Color(217,179,16);

    public PGestionarClientes(String correoE) {
//        try {
//			
//                     UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
//		}
//		catch (Exception e) {
//		}
        initComponents();
        correo=correoE;
        Calendar c2 = new GregorianCalendar();
        fechaMin.setCalendar(c2);
        fechaMax.setCalendar(c2);
        Calendar hoy = Calendar.getInstance();
        int año = hoy.get(Calendar.YEAR);
        int año2 = hoy.get(Calendar.YEAR) - 10;
        hoy.add(Calendar.MONTH, 1);
        int mes = hoy.get(Calendar.MONTH);
        int dia = hoy.get(Calendar.DAY_OF_MONTH);
        String fechaP = año + "-" + mes + "-" + dia;
        String fechaP2 = año2 + "-" + mes + "-" + dia;
            
        fechaMin.setMaxSelectableDate(verificar.StringADate(fechaP));
        fechaMin.setMinSelectableDate(verificar.StringADate(fechaP2));
        fechaMax.setMaxSelectableDate(verificar.StringADate(fechaP));
        fechaMax.setMinSelectableDate(verificar.StringADate(fechaP2));
        
        ImageIcon foto0 = new ImageIcon (getClass().getResource("/images/help.png"));
       ImageIcon icono0 = new ImageIcon(foto0.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT));
       lblhelp.setIcon(icono0);
//        jDateChooser1.setMaxSelectableDate(StringADate("18-07-2018"));
//        jDateChooser1.setMinSelectableDate(StringADate("17-07-2018"));
        
        tbl_client = new DefaultTableModel(null,getColumnas());
        tbl_clientes.setModel(cli.setfilas(tbl_client));
        
        tbl_clientes.getTableHeader().setOpaque(false);
        JTableHeader header = tbl_clientes.getTableHeader();
        
        header.setBackground(greenD);
        header.setForeground(Color.WHITE);
        
        String[] valoresC = getColumnas();
        TableColumnModel columnModel = tbl_clientes.getColumnModel();
        System.out.println("tamaño: "+valoresC.length);
        for (int i = 0; i <valoresC.length; i++) {
            columnModel.getColumn(i).setPreferredWidth(valoresC[i].length()*9);
            System.out.println("entra");
        }
    }

    
    public String[] getColumnas()
    {
        String columna[] = {"CODIGO","NOMBRE","APELLIDO","CORPORATIVO","DUI","NIT","CORREO","PREGUNTA1","PREGUNTA2","TELEFONO","RESPUESTA1","RESPUESTA2", "FECHA REGISTRO", "CONTRASEÑA"};
        return columna;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        r_nombre = new javax.swing.JRadioButton();
        r_codigo = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        fechaMax = new com.toedter.calendar.JDateChooser();
        fechaMin = new com.toedter.calendar.JDateChooser();
        lblhelp = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 57, 42));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 196, 124), 3));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 196, 124));
        jLabel10.setText("Consultar Clientes");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_clientes.setGridColor(new java.awt.Color(0, 153, 51));
        tbl_clientes.setSelectionBackground(new java.awt.Color(0, 204, 51));
        jScrollPane1.setViewportView(tbl_clientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 610, 230));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Buscar:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jTextField8.setBackground(new java.awt.Color(204, 204, 204));
        jTextField8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 100, 30));

        r_nombre.setBackground(new java.awt.Color(102, 102, 102));
        r_nombre.setForeground(new java.awt.Color(255, 255, 255));
        r_nombre.setText("Nombre");
        r_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_nombreActionPerformed(evt);
            }
        });
        add(r_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, 30));

        r_codigo.setBackground(new java.awt.Color(102, 102, 102));
        r_codigo.setForeground(new java.awt.Color(255, 255, 255));
        r_codigo.setText("Codigo");
        r_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_codigoActionPerformed(evt);
            }
        });
        add(r_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha Max:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha Min:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 30));

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images expo/search.png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jButton2.setContentAreaFilled(false);
        jButton2.setPreferredSize(new java.awt.Dimension(63, 30));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 90, 40));

        jButton5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images expo/report.png"))); // NOI18N
        jButton5.setText("Generar reporte");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jButton5.setContentAreaFilled(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 150, 40));

        fechaMax.setDateFormatString("yyyy-MM-dd");
        add(fechaMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 130, 30));

        fechaMin.setDateFormatString("yyyy-MM-dd");
        add(fechaMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 30));

        lblhelp.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblhelpAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lblhelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhelpMouseClicked(evt);
            }
        });
        add(lblhelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 25, 25));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
         jButton2.setContentAreaFilled(true);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
         jButton2.setContentAreaFilled(false);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
         jButton5.setContentAreaFilled(true);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
         jButton5.setContentAreaFilled(false);
    }//GEN-LAST:event_jButton5MouseExited
    int variable = 2;
    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        for (int i = 0; i < tbl_clientes.getRowCount(); i++) {
        tbl_client.removeRow(i);
        i-=1;
       }
        tbl_clientes.setModel(cli.buscar(tbl_client,jTextField8.getText(),variable,""));
    }//GEN-LAST:event_jTextField8KeyReleased

    private void r_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_codigoActionPerformed
        r_nombre.setSelected(false);
        variable = 2;
        tipo2=2;
    }//GEN-LAST:event_r_codigoActionPerformed

    private void r_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_nombreActionPerformed
        r_codigo.setSelected(false);
        variable = 1;
        tipo2=1;
    }//GEN-LAST:event_r_nombreActionPerformed
    int tipo2=0;
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            Conexion con = new Conexion();

            String archivo = getClass().getResource("/reportes/ReporteClientes.jrxml").getPath();
            archivo = URLDecoder.decode(archivo, "UTF-8");
            JasperReport report = JasperCompileManager.compileReport(archivo);
            Map parametros = new HashMap();
            String fch1 = objeto.getFecha(fechaMin);
            String fch2 = objeto.getFecha(fechaMax);
            parametros.put("tipo", tipo2);
            System.out.println("tipo: " + tipo2);
            if (tipo2 == 3) {
                parametros.put("valores", fch1);
                parametros.put("valores2", fch2);
            } else {
                parametros.put("valores", jTextField8.getText());
            }

            try {
                String sql = "SELECT numRegistro, nombreEmpresa, domicilioLegal, fechaConstitucion, logo, telefono, correoElectronico, propietario "
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
            
            parametros.put("autor", correo); 
            JasperPrint print = JasperFillManager.fillReport(report, parametros, con.conectar());
 
            JasperViewer visor = new JasperViewer(print, false);
            visor.setTitle("Reporte de Clientes");
            visor.setVisible(true);
 
            
        } catch (JRException e) {
            System.out.println("AQUI1");
            System.out.println(e.getMessage());
            
        } 
        catch (UnsupportedEncodingException ex) {
            System.out.println("AQUI2");
            Logger.getLogger(PInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            for (int i = 0; i < tbl_clientes.getRowCount(); i++) {
                tbl_client.removeRow(i);
                i -= 1;
            }
            String fch1=objeto.getFecha(fechaMin);
            String fch2=objeto.getFecha(fechaMax);
            
            tbl_clientes.setModel(cli.buscar(tbl_client, fch1 , 3, fch2));
            tipo2=3;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
//        jDateChooser2.setDate(objeto.StringADate("2018-01-01"));
    }//GEN-LAST:event_jButton5MouseClicked

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        
        if (verificar.vletrasynumeros(vchar) == true
                && (jTextField8.getText().length() <11 )) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField8KeyTyped

    private void lblhelpAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblhelpAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblhelpAncestorAdded

    private void lblhelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhelpMouseClicked
        // TODO add your handling code here:
        //y cuando llames el formulario ayuda en vez del 0 le vas a poner el form que le corresponda 1 2 o 3 y asi sucesivamente, si vos elegis el orden
        /**
        * ahorita, llena los textos de ayuda de todos los forms, luego vemos lo de las imagenes , me avisas cuando temrines de escribir las instrucciones
        */
        help form = new help(11);
        form.show();
    }//GEN-LAST:event_lblhelpMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fechaMax;
    private com.toedter.calendar.JDateChooser fechaMin;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblhelp;
    private javax.swing.JRadioButton r_codigo;
    private javax.swing.JRadioButton r_nombre;
    private javax.swing.JTable tbl_clientes;
    // End of variables declaration//GEN-END:variables
}
