
package Ventanas;


import static Ventanas.Login.usuario;
import Clases.ManejosArchivos;
import static Ventanas.Home.tipoCuenta;
import javax.swing.Timer;

public class VentanaExitosaCredito extends javax.swing.JFrame {
    String nomComple;
    int numCuenta;
    float saldo;
    float monto;
    public Timer tiempo;
    
    public VentanaExitosaCredito() {
        initComponents();
        
        this.setLocation(500, 150);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtnDestino = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtMonto = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        btnAceptarCredito = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 377, -1));

        lblMonto.setText("MONTO DEL CREDITO");
        jPanel1.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btnAceptarCredito.setText("ACEPTAR");
        btnAceptarCredito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptarCredito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptarCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCreditoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptarCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 124, 48));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("¡¡¡CREDITO EXITOSO!!!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 41));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 389, 220));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        
    }//GEN-LAST:event_txtMontoActionPerformed

    
    private void btnAceptarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCreditoActionPerformed
        /*Vuelve a la ventana detalle actualizando los valores base*/
        actualizarSaldoCuenta();
        ParaTransferir_Credito_ServiciosBasicos detalle = new ParaTransferir_Credito_ServiciosBasicos();
        detalle.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnAceptarCreditoActionPerformed

    /*Metodo que recibe los datos de la numCuenta nomComple*/
    public void mostrarCuentaCompleta(String usuario, int cuenta, float saldo, float monto){
    this.nomComple=usuario;
    this.numCuenta=cuenta;
    this.saldo=saldo;
    this.monto=monto;
    
    txtMonto.setEditable(false);
    txtMonto.setText(String.valueOf(monto));
    }
    
    public void actualizarSaldoCuenta(){
     ManejosArchivos u1=new  ManejosArchivos();
     this.saldo=this.saldo-monto;
     u1.pagar(usuario, tipoCuenta, saldo);
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarCredito;
    private javax.swing.ButtonGroup gbtnDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
