
package ec.edu.epn.prograii.pkg2022a.aplicacionbancaria;

import static ec.edu.epn.prograii.pkg2022a.aplicacionbancaria.Login.usua1;


public class Home extends javax.swing.JFrame {
    Tiempo time= new Tiempo();
       
    public Home() {
        initComponents();
        
        
        this.setLocation(500, 150);
        
        /* Se asignan los un saldo aleatorio a las cuentas*/
        txtSaldoCorriente.setText((" $ ")+String.valueOf(usua1.getSaldoCorriente()));
        txtSaldoAhorro.setText((" $ ")+String.valueOf(usua1.getSaldoAhorro()));
        txtSaldoCredito.setText((" $ ")+String.valueOf(usua1.getSaldoCredito()));
        
        /*Se asignas numeros aleatorios a los numeros de cuenta*/
        txtnCuentaCorriente.setText(String.valueOf(usua1.getnCuentaCorriente()));
        txtnCuentaAhorro.setText(String.valueOf(usua1.getnCuentaAhorro()));
        txtnCuentaCredito.setText(String.valueOf(usua1.getnCuentaCredito()));
        
        /* Se asignas nombres aleatorios */
        lblFecha.setText(usua1.getNombreUsuario()+" "+usua1.getApellidoUsuario());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        fondoPantalla1 = new javax.swing.JPanel();
        fondoPantalla2 = new javax.swing.JPanel();
        labelCuentaCorriente = new javax.swing.JLabel();
        txtnCuentaCorriente = new javax.swing.JTextField();
        txtSaldoCorriente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        labelCuentaAhorro = new javax.swing.JLabel();
        txtnCuentaAhorro = new javax.swing.JTextField();
        txtSaldoAhorro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCredito = new javax.swing.JLabel();
        txtSaldoCredito = new javax.swing.JTextField();
        txtnCuentaCredito = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        lblfechaText = new javax.swing.JTextField();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoPantalla1.setBackground(new java.awt.Color(255, 255, 153));
        fondoPantalla1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoPantalla2.setBackground(new java.awt.Color(255, 153, 153));
        fondoPantalla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fondoPantalla2MouseClicked(evt);
            }
        });
        fondoPantalla2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCuentaCorriente.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        labelCuentaCorriente.setText("Cuenta Corriente");
        fondoPantalla2.add(labelCuentaCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txtnCuentaCorriente.setEditable(false);
        txtnCuentaCorriente.setBackground(new java.awt.Color(255, 153, 153));
        txtnCuentaCorriente.setFont(new java.awt.Font("Segoe UI", 2, 19)); // NOI18N
        txtnCuentaCorriente.setBorder(null);
        txtnCuentaCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnCuentaCorrienteActionPerformed(evt);
            }
        });
        fondoPantalla2.add(txtnCuentaCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 32));

        txtSaldoCorriente.setEditable(false);
        txtSaldoCorriente.setBackground(new java.awt.Color(255, 204, 204));
        txtSaldoCorriente.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        txtSaldoCorriente.setBorder(null);
        txtSaldoCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoCorrienteActionPerformed(evt);
            }
        });
        fondoPantalla2.add(txtSaldoCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 139, 34));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha derecha.png"))); // NOI18N
        fondoPantalla2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        fondoPantalla1.add(fondoPantalla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 440, 90));

        lblFecha.setEditable(false);
        lblFecha.setBackground(new java.awt.Color(255, 255, 153));
        lblFecha.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblFecha.setText("00/00/0000");
        lblFecha.setBorder(null);
        lblFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblFechaActionPerformed(evt);
            }
        });
        fondoPantalla1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCuentaAhorro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        labelCuentaAhorro.setText("Cuenta Ahorro");
        jPanel1.add(labelCuentaAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtnCuentaAhorro.setEditable(false);
        txtnCuentaAhorro.setBackground(new java.awt.Color(153, 153, 255));
        txtnCuentaAhorro.setFont(new java.awt.Font("Segoe UI", 2, 19)); // NOI18N
        txtnCuentaAhorro.setBorder(null);
        jPanel1.add(txtnCuentaAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 160, 32));

        txtSaldoAhorro.setEditable(false);
        txtSaldoAhorro.setBackground(new java.awt.Color(204, 204, 255));
        txtSaldoAhorro.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        txtSaldoAhorro.setBorder(null);
        txtSaldoAhorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoAhorroActionPerformed(evt);
            }
        });
        jPanel1.add(txtSaldoAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 140, 34));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha derecha.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        fondoPantalla1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 440, 90));

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCredito.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        labelCredito.setText("Cuenta Crédito");
        jPanel2.add(labelCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtSaldoCredito.setEditable(false);
        txtSaldoCredito.setBackground(new java.awt.Color(204, 255, 204));
        txtSaldoCredito.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        txtSaldoCredito.setBorder(null);
        jPanel2.add(txtSaldoCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 141, 40));

        txtnCuentaCredito.setEditable(false);
        txtnCuentaCredito.setBackground(new java.awt.Color(102, 255, 204));
        txtnCuentaCredito.setFont(new java.awt.Font("Segoe UI", 2, 19)); // NOI18N
        txtnCuentaCredito.setBorder(null);
        jPanel2.add(txtnCuentaCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha derecha.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        fondoPantalla1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 440, 100));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        jLabel1.setText("Cerrar Sesión");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        fondoPantalla1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 150, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgdelUsuario.png"))); // NOI18N
        fondoPantalla1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txtNombreUsuario.setEditable(false);
        txtNombreUsuario.setBackground(new java.awt.Color(255, 255, 153));
        txtNombreUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        txtNombreUsuario.setText("JUAN CARLOS");
        txtNombreUsuario.setBorder(null);
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        fondoPantalla1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        lblfechaText.setEditable(false);
        lblfechaText.setBackground(new java.awt.Color(255, 255, 153));
        lblfechaText.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblfechaText.setText("Ultima Sesion:");
        lblfechaText.setBorder(null);
        lblfechaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblfechaTextActionPerformed(evt);
            }
        });
        fondoPantalla1.add(lblfechaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        getContentPane().add(fondoPantalla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void lblFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFechaActionPerformed

    private void txtnCuentaCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnCuentaCorrienteActionPerformed
        
    }//GEN-LAST:event_txtnCuentaCorrienteActionPerformed

    private void txtSaldoCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoCorrienteActionPerformed
        
    }//GEN-LAST:event_txtSaldoCorrienteActionPerformed

    private void fondoPantalla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoPantalla2MouseClicked
        VentanaDetalle detalle= new VentanaDetalle();
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fondoPantalla2MouseClicked

    private void txtSaldoAhorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoAhorroActionPerformed
        
    }//GEN-LAST:event_txtSaldoAhorroActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        Login login=new Login();
        login.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_jPanel3MouseClicked

    public  void mostrarTiempo(){
    lblFecha.setText(time.fechaCompleta);
    }
    
    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void lblfechaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblfechaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblfechaTextActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Home().setVisible(true);
                
                
            }
           
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondoPantalla1;
    private javax.swing.JPanel fondoPantalla2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelCredito;
    private javax.swing.JLabel labelCuentaAhorro;
    private javax.swing.JLabel labelCuentaCorriente;
    public static javax.swing.JTextField lblFecha;
    public static javax.swing.JTextField lblfechaText;
    public static javax.swing.JTextField txtNombreUsuario;
    public static javax.swing.JTextField txtSaldoAhorro;
    public static javax.swing.JTextField txtSaldoCorriente;
    public static javax.swing.JTextField txtSaldoCredito;
    public static javax.swing.JTextField txtnCuentaAhorro;
    public static javax.swing.JTextField txtnCuentaCorriente;
    public static javax.swing.JTextField txtnCuentaCredito;
    // End of variables declaration//GEN-END:variables

}
