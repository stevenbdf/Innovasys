/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.verificaciones;
import clases.recuperarContraseña;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author steven
 */
public class RecuperarContraseña extends javax.swing.JFrame {

    /**
     * Creates new form RecuperarContraseña
     */
    verificaciones verificar = new verificaciones();
    public RecuperarContraseña() {
//        try {
//                     UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
//		}
//		catch (Exception e) {
//		}
        initComponents();
        lblRespuesta.setVisible(false);
        setIconImage(new ImageIcon(getClass().getResource("/images/logo2.png")).getImage());
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
        jLabel2 = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        jTFDatos = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        lblRespuesta = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(30, 57, 42));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 196, 124), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(340, 340));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 196, 124));
        jLabel2.setText("Recuperar constraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblTexto.setBackground(new java.awt.Color(255, 255, 255));
        lblTexto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(204, 204, 204));
        lblTexto.setText("Ingresa tu correo:");
        jPanel1.add(lblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jTFDatos.setBackground(new java.awt.Color(204, 204, 204));
        jTFDatos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTFDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFDatosKeyTyped(evt);
            }
        });
        jPanel1.add(jTFDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 180, 30));

        btnContinuar.setBackground(new java.awt.Color(255, 255, 255));
        btnContinuar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(204, 204, 204));
        btnContinuar.setText("Ingresar");
        btnContinuar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnContinuar.setContentAreaFilled(false);
        btnContinuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnContinuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnContinuarMouseExited(evt);
            }
        });
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 90, 30));

        lblRespuesta.setBackground(new java.awt.Color(255, 255, 255));
        lblRespuesta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblRespuesta.setForeground(new java.awt.Color(204, 204, 204));
        lblRespuesta.setText("SU CONTRASEÑA HA SIDO ENVIADA AL CORREO ");
        jPanel1.add(lblRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minimizar.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.hide();
        Login1 login = new Login1();
        login.show();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnContinuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseEntered
        // TODO add your handling code here:
         btnContinuar.setContentAreaFilled(true);
    }//GEN-LAST:event_btnContinuarMouseEntered

    private void btnContinuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarMouseExited
        // TODO add your handling code here:
         btnContinuar.setContentAreaFilled(false);
    }//GEN-LAST:event_btnContinuarMouseExited

    private void jTFDatosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDatosKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
       
        if (verificar.vcorreoevent(vchar) == true
                && (jTFDatos.getText().length() < 40)) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTFDatosKeyTyped
    Integer pasos=0;
    String[] preguntas = new String[2];
    String[] respuestas = new String[2];
    String key = "92AE31A79FEEB2A3"; //llave
    String iv = "0123456789ABCDEF"; // vector de inicialización 
    String correo="";
    String contraseña="";
    String text="";
    public  String generateRandomText() {
        SecureRandom random = new SecureRandom();
        text = new BigInteger(25, random).toString(32);
        System.out.println("Texto: "+text);
        return text;
    
    }
    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        recuperarContraseña obj = new recuperarContraseña();
        if (jTFDatos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,"Error campos vacios");
        }else{
            if (pasos == 0) {
                obj.setCorreo(jTFDatos.getText());
                correo=jTFDatos.getText();
                System.out.println("correo: "+correo);
                if (obj.obtenerRespuestas()) {
                   respuestas[0]=obj.getRespuesta1();
                   respuestas[1]=obj.getRespuesta2();
                    
                }else{
                    JOptionPane.showMessageDialog(this,"Error no existe correo");
                }
                if (obj.obtenerPreguntas()) {
                   pasos++;
                   preguntas[0]=obj.getPregunta1();
                   preguntas[1]=obj.getPregunta2();
                   
                   lblTexto.setText(preguntas[0]);
                }
                if (obj.obtenerContraseña()) {
                        verificaciones objeto = new verificaciones();
                        
                        try {
                              contraseña = objeto.decrypt(key,iv,obj.getContraseña());
                              System.out.println("Contraseña: "+contraseña);
                        } catch (Exception ex) {
                            Logger.getLogger(RecuperarContraseña.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                for (int i = 0; i < 2; i++) {
                        
                    }
                    
                }
            }
            else if(pasos==1){
                if (jTFDatos.getText().equals(respuestas[0])) {
                    JOptionPane.showMessageDialog(this,"Respuesta correcta responde la siguiente pregunta");
                    lblTexto.setText(preguntas[1]);
                    pasos++;
                }else{
                    JOptionPane.showMessageDialog(this,"Respuesta incorrecta");
                }
            }else if(pasos==2){
                if (jTFDatos.getText().equals(respuestas[1])) {
                    JOptionPane.showMessageDialog(this,"Respuesta correcta, se ha enviado un codigo a tu correo");
                    
                        
                        String destinatario = correo; //A quien le quieres escribir.
                        String asunto = "Correo Importante 'Recuperacion de Contraseña' ";
                        String cuerpo = "Para continuar con el proceso de recuperacion de contraseña, "
                                + " \n ingresa el siguiente codigo en el sistema: "+generateRandomText();
                        
                        //evaluamos si se envio el correo
                        if (enviarConGMail(destinatario, asunto, cuerpo)) {
                            JOptionPane.showMessageDialog(this,"Enviado");
                            jTFDatos.setText(null);
                            lblTexto.setText("Ingresa el codigo que se ha enviado a tu correo");
                            pasos++;
                        } else {
                            JOptionPane.showMessageDialog(this,"No enviado");
                        }
                    }else{
                        System.out.println("Error ");
                    }
                        
                    
                    
                }else if (pasos==3){
                    if (text.equals(jTFDatos.getText())) {
                    JOptionPane.showMessageDialog(this,"Tu contraseña es: "+contraseña);
                    }else{
                    JOptionPane.showMessageDialog(this,"Incorrecto, verifica el codigo");
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"Respuesta incorrecta");
                }
            
        }
    }//GEN-LAST:event_btnContinuarActionPerformed
    
    private static boolean enviarConGMail( String destinatario, String asunto, String cuerpo) {
        // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente también.
        /**
         * Todo esto ya funciona , no tocar
         */
        
        boolean retorno=false;
        String remitente = "sbdflores";

        Properties props = System.getProperties();

        props.put (

        "mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
        props.put (

        "mail.smtp.user", remitente);
        props.put (

        "mail.smtp.clave", "FCBarcelona123");    //La clave de la cuenta
        props.put (

        "mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
        props.put (

        "mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
        props.put (
        "mail.smtp.port", "587"); //El puerto SMTP seguro de Google

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);


            try {
               
            Address test = new InternetAddress(destinatario);
                
            message.setFrom(new InternetAddress(remitente));
            message.addRecipient(Message.RecipientType.TO, test);   //Se podrían añadir varios de la misma manera
            message.setSubject(asunto);
            message.setText(cuerpo);
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", remitente, "FCBarcelona123");
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            retorno=true;
        }
        catch (MessagingException me) {
            me.printStackTrace();   //Si se produce un error
        }
            return retorno;
    }
    
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
            java.util.logging.Logger.getLogger(RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperarContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFDatos;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables
}
