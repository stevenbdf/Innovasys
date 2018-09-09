/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Animacion.Fade;
import clases.Conexion;
import clases.verificaciones;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import clases.mtoUsuarios;
import clases.verificaciones;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.UIManager;


/**
 *
 * @author steven
 */
public class Login1 extends javax.swing.JFrame {


    /**
     * Creates new form Login1
     */
    public static final Color green2 = new Color(30,57,42);
    public static final Color blanco = new Color(255,255,255);
    public Login1() {
                
        initComponents();
        verificarPedidos();
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", green2);
        UI.put("OptionPane.messageForeground", blanco);
        UI.put("Panel.background", green2);
        
        
        setIconImage(new ImageIcon(getClass().getResource("/images/logo2.png")).getImage( ));
        setLocationRelativeTo(null);
        //Cambiar logo por el label que querras
       ImageIcon foto = new ImageIcon (getClass().getResource("/images/logo2.png"));
       ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(Logo.getWidth(),Logo.getHeight(),Image.SCALE_DEFAULT));
       Logo.setIcon(icono);
       ImageIcon foto0 = new ImageIcon (getClass().getResource("/images/help.png"));
       ImageIcon icono0 = new ImageIcon(foto0.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT));
       lblhelp.setIcon(icono0);
       
       jButton1.addKeyListener(new PresionarTecla());
       
       Fade.JFrameFadeIn(0f, 1f, 0.1f,100,this );
    }
    private void verificarPedidos(){
        Conexion con = new Conexion();
        verificaciones veri = new verificaciones();
        try {
            String sql = " declare @fecha date "
                    + " set @fecha =(select GETDATE()) "
                    + " select idPedido,fecha_vencimiento,@fecha from pedido ";
            PreparedStatement cmd = con.conectar().prepareStatement(sql);
            ResultSet ver = cmd.executeQuery();
            while(ver.next()){
                java.util.Date fechaO = veri.sumarFechasDias(ver.getDate(2),2);
                java.util.Date fechaA = veri.sumarFechasDias(ver.getDate(3),2); 
                if(fechaA.after(fechaO)){
                    try {
                        String sql2 = "UPDATE pedido SET idEstadoP = 5 WHERE idPedido="+ver.getInt(1);
                        PreparedStatement cmd2 = con.conectar().prepareStatement(sql2);
                        if(!cmd2.execute()){
                            
                        }
                    } catch (Exception e) {
                        System.out.println("Revisar al modificar estado pedido");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Revisar validacion de pedido");
        }
    }
    public class PresionarTecla extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent ke) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                jButton1ActionPerformed(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFCorreo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTFContraseña = new javax.swing.JPasswordField();
        Logo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblhelp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(30, 57, 42));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 196, 124), 3));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(340, 340));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 196, 124));
        jLabel1.setText("Innovasys");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 36));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar sesion");
        jLabel3.setToolTipText("");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, 36));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 36));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-Mail:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, 36));

        jTFCorreo.setBackground(new java.awt.Color(30, 57, 42));
        jTFCorreo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTFCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jTFCorreo.setBorder(null);
        jTFCorreo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTFCorreoMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTFCorreoMouseMoved(evt);
            }
        });
        jTFCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFCorreoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTFCorreoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTFCorreoMouseExited(evt);
            }
        });
        jTFCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCorreoActionPerformed(evt);
            }
        });
        jTFCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(jTFCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 150, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEnviar.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEnviar2.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEnviar2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btnEnviar2.png"))); // NOI18N
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 90, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrate como Cliente");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jTFContraseña.setBackground(new java.awt.Color(30, 57, 42));
        jTFContraseña.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTFContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jTFContraseña.setBorder(null);
        jTFContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFContraseñaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTFContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTFContraseñaMouseExited(evt);
            }
        });
        jTFContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFContraseñaActionPerformed(evt);
            }
        });
        jTFContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFContraseñaKeyTyped(evt);
            }
        });
        jPanel1.add(jTFContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, 30));
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 80, 80));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimizar.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        contraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passwordOFF.png"))); // NOI18N
        jPanel1.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 32, 32));

        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario1OFF.png"))); // NOI18N
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 32, 32));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("¿Olvidaste tu contraseña?");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

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
        jPanel1.add(lblhelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 25, 25));

        jSeparator1.setBackground(new java.awt.Color(102, 255, 51));
        jSeparator1.setForeground(new java.awt.Color(102, 255, 102));
        jSeparator1.setOpaque(true);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 150, 1));

        jSeparator2.setBackground(new java.awt.Color(102, 255, 51));
        jSeparator2.setForeground(new java.awt.Color(102, 255, 102));
        jSeparator2.setOpaque(true);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 221, 150, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFCorreoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFCorreoMouseMoved
        // TODO add your handling code here:
        
        ImageIcon foto = new ImageIcon (getClass().getResource("/images/usuario1ON.png"));
        ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(usuario.getWidth(),usuario.getHeight(),Image.SCALE_DEFAULT));
        usuario.setIcon(icono);
    }//GEN-LAST:event_jTFCorreoMouseMoved

    private void jTFCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFCorreoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTFCorreoMouseClicked

    private void jTFCorreoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFCorreoMouseEntered
        // TODO add your handling code here:
        
        ImageIcon foto = new ImageIcon (getClass().getResource("/images/usuario1ON.png"));
        ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(usuario.getWidth(),usuario.getHeight(),Image.SCALE_DEFAULT));
        usuario.setIcon(icono);
    }//GEN-LAST:event_jTFCorreoMouseEntered

    private void jTFCorreoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFCorreoMouseExited
        // TODO add your handling code here:
        
        ImageIcon foto = new ImageIcon (getClass().getResource("/images/usuario1OFF.png"));
        ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(usuario.getWidth(),usuario.getHeight(),Image.SCALE_DEFAULT));
        usuario.setIcon(icono);
    }//GEN-LAST:event_jTFCorreoMouseExited

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        // TODO add your handling code here:
        jButton1.setContentAreaFilled(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setContentAreaFilled(false);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        verificaciones obj = new verificaciones();
        if (obj.vcorreo(jTFCorreo.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Ingrese un formato de correo valido");
        } else {

            mtoUsuarios objeto = new mtoUsuarios();
            objeto.setCorreo(jTFCorreo.getText());
            if (jTFCorreo.getText().isEmpty() || jTFContraseña.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Error Campos Vacios");
            } else {
                if (objeto.consultarContraseña()) {
                    if (objeto.getContraseña().equals(jTFContraseña.getText())) {
                        
                        objeto.setCorreo(jTFCorreo.getText());
                        objeto.bitacora();
                        
                        JOptionPane.showMessageDialog(this, "Bienvenido");
                        VentanaPrincipal2 ventana = new VentanaPrincipal2(jTFCorreo.getText());
                        ventana.show();
                        Fade.JFrameFadeIn(01f, 0f, 0.1f, 50, this);
                        this.hide();
                    } else {
                        JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario inexistente");
                }
            }
        }
//        char vchar =evt.getKeyChar();
//            verificaciones obj = new verificaciones();
//            if (  obj.vletrase(vchar)== true
//                &&(jTextArea1.getText().length()<100)){
//       
//    }else{
//            evt.consume();
//            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        RegistroClientes clientes = new RegistroClientes();
        clientes.show();
        this.hide();

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setState(VentanaPrincipal2.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        RecuperarContraseña form = new RecuperarContraseña();
        form.show();
        this.hide();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jTFCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCorreoActionPerformed
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Calendar hoy = Calendar.getInstance();
        int año = hoy.get(Calendar.YEAR);
        hoy.add(Calendar.MONTH,1);
        int mes = hoy.get(Calendar.MONTH)+1;
        int dia = hoy.get(Calendar.DAY_OF_MONTH);

        System.out.println("Normal MIO: "+ año+"-"+mes+"-"+dia);
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void lblhelpAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblhelpAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblhelpAncestorAdded

    private void lblhelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhelpMouseClicked
        // TODO add your handling code here:
        //y cuando llames el formulario ayuda en vez del 0 le vas a poner el form que le corresponda 1 2 o 3 y asi sucesivamente, si vos elegis el orden
        /**
        * ahorita, llena los textos de ayuda de todos los forms, luego vemos lo de las imagenes , me avisas cuando temrines de escribir las instrucciones
        */
        help form = new help(0);
        form.show();
    }//GEN-LAST:event_lblhelpMouseClicked

    private void jTFCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCorreoKeyTyped
        // TODO add your handling code here:
        //Se asegura de capturar la tecla enter y descartar todas las demas
        char cTeclaPresionada = evt.getKeyChar();

//Da click al boton elegido
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            jButton1.doClick();
        }
    }//GEN-LAST:event_jTFCorreoKeyTyped
    int xx, xy;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        setOpacity((float)0.8);
        xx=evt.getX();
        xy=evt.getY();
        
    }//GEN-LAST:event_jPanel1MousePressed
    
    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        // TODO add your handling code here:
        setOpacity((float)1.0);
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jTFCorreoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFCorreoMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCorreoMouseDragged

    private void jTFContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFContraseñaKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        verificaciones obj = new verificaciones();
        if (obj.vletrasynumeros(vchar) == true
            && (jTFContraseña.getText().length() < 80)) {

        } else {
            evt.consume();
        }

        //Se asegura de capturar la tecla enter y descartar todas las demas
        char cTeclaPresionada = evt.getKeyChar();

        //Da click al boton elegido
        if (cTeclaPresionada == KeyEvent.VK_ENTER) {
            jButton1.doClick();
        }
    }//GEN-LAST:event_jTFContraseñaKeyTyped

    private void jTFContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFContraseñaActionPerformed

    private void jTFContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFContraseñaMouseExited
        // TODO add your handling code here:

        ImageIcon foto = new ImageIcon (getClass().getResource("/images/passwordOFF.png"));
        ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(contraseña.getWidth(),contraseña.getHeight(),Image.SCALE_DEFAULT));
        contraseña.setIcon(icono);
    }//GEN-LAST:event_jTFContraseñaMouseExited

    private void jTFContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFContraseñaMouseEntered
        // TODO add your handling code here:

        ImageIcon foto = new ImageIcon (getClass().getResource("/images/passwordON.png"));
        ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(contraseña.getWidth(),contraseña.getHeight(),Image.SCALE_DEFAULT));
        contraseña.setIcon(icono);
    }//GEN-LAST:event_jTFContraseñaMouseEntered

    private void jTFContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFContraseñaMouseClicked
        // TODO add your handling code here:

        ImageIcon foto = new ImageIcon (getClass().getResource("/images/passwordON.png"));
        ImageIcon icono = new ImageIcon(foto.getImage().getScaledInstance(contraseña.getWidth(),contraseña.getHeight(),Image.SCALE_DEFAULT));
        contraseña.setIcon(icono);
    }//GEN-LAST:event_jTFContraseñaMouseClicked
   
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel contraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jTFContraseña;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JLabel lblhelp;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
