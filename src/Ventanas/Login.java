
package Ventanas;


import Clases.*;/*importa el paquete y la clase Datos */
import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    static String usuario;
    
    /*se crea una instancia publica y statica*/
    static Datos usua1=new Datos();
    ManejosArchivos u1=new ManejosArchivos();
    
    public Login() {
        initComponents();
        this.setLocation(500, 150);
        /*Se acceden a los metodos de la clase Datos usando una instancia*/      
        labelUsuario.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelContraseña = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtcontra = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        labelNoTenerCuenta = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        fondoPantalla = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelContraseña.setBackground(new java.awt.Color(204, 255, 255));
        labelContraseña.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        labelContraseña.setText("CONTRASEÑA");
        getContentPane().add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 204, 108, 43));

        labelUsuario.setBackground(new java.awt.Color(204, 255, 255));
        labelUsuario.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        labelUsuario.setText("USUARIO");
        getContentPane().add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 81, 108, 46));

        txtUsuario.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingresar su usuario");
        txtUsuario.setToolTipText("");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 134, 248, 30));

        txtcontra.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        txtcontra.setForeground(new java.awt.Color(204, 204, 204));
        txtcontra.setText("********");
        txtcontra.setBorder(null);
        txtcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraMousePressed(evt);
            }
        });
        txtcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraActionPerformed(evt);
            }
        });
        getContentPane().add(txtcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 254, 245, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 204, 303, 10));

        labelNoTenerCuenta.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        labelNoTenerCuenta.setForeground(new java.awt.Color(102, 102, 255));
        labelNoTenerCuenta.setText("¿No tienes una cuenta?");
        labelNoTenerCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(labelNoTenerCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 346, 145, -1));

        btnIngresar.setBackground(new java.awt.Color(102, 255, 102));
        btnIngresar.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setBorder(null);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 302, 87, 26));

        fondoPantalla.setBackground(new java.awt.Color(255, 204, 255));
        fondoPantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgBanco.png"))); // NOI18N
        fondoPantalla.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        getContentPane().add(fondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 390));

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 150, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        // accion al ser clic en txtUsuario
        if(txtUsuario.getText().equals("Ingresar su usuario")){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black); 
        }
        if(String.valueOf(txtcontra.getPassword()).isEmpty() ){
            txtcontra.setText("********");
            txtcontra.setForeground(Color.gray); 
        }        
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraMousePressed
       // accion al ser clic en txtContraseña
        if(String.valueOf(txtcontra.getPassword()).equals("********") ){
            txtcontra.setText("");
            txtcontra.setForeground(Color.black);            
       }        
       if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingresar su usuario");
            txtUsuario.setForeground(Color.gray);           
       }        
    }//GEN-LAST:event_txtcontraMousePressed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        /*Se comprueba la contraseña y usuario ,ademas genera un numero aleatorio que validara si la cuenta existe*/
        String verificar;        
        verificar=u1.verificarIngreso(txtUsuario.getText(),txtcontra.getText());        
        if(verificar=="Verdadero"){ 
            this.usuario=txtUsuario.getText();
            usua1.aleatorioServicios();
            Home home=new Home();            
            home.setVisible(true);
            this.setVisible(false);           
        }
        if(verificar=="ContraseñaMala"){
            JOptionPane.showInternalMessageDialog(null, "Contraseña incorrecta\" ¡¡Vuelve a intentarlo!!\"");        
        }
        if(verificar=="Falso"){
            JOptionPane.showInternalMessageDialog(null, "No existe ese Usuario\" ¡¡Vuelve a intentarlo!!\"");        
        } 
       
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        RegistrarNuevoUsuario ventana=new RegistrarNuevoUsuario();
        ventana.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jPanel1MouseClicked

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel fondoPantalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelNoTenerCuenta;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtcontra;
    // End of variables declaration//GEN-END:variables
}
