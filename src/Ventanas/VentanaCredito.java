
package Ventanas;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import Atxy2k.CustomTextField.RestrictedTextField;

public class VentanaCredito extends javax.swing.JFrame {
    /*Variables que reciben los valores de la ventana anterior*/
    String nomComple;
    int numCuenta;
    float saldo;
    public Timer tiempo;
    
    public VentanaCredito() {
        initComponents();
        /*Posicion de la ventana, oculta ciertos objetos de la ventana y restrige el valor del monto*/
        this.setLocation(500, 150);
        btnCredito.setBackground(Color.LIGHT_GRAY);
        lblMonto.setVisible(false);
        txtMonto.setVisible(false);
        btnPagarCredito.setVisible(false);
        RestrictedTextField restricted = new RestrictedTextField(txtMonto);
        restricted.setLimit(9999);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        btnCredito = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        btnPagarCredito = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuVolver = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Nº");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        lblSaldo.setText("000000");
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        btnCredito.setText("Pagar Credito");
        btnCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 303, 32));

        jLabel6.setText("Saldo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        lblCuenta.setText("000000");
        jPanel1.add(lblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel1.setText("Detalle de tu cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 208, 47));

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 303, -1));

        lblMonto.setText("Monto");
        jPanel1.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        btnPagarCredito.setText("CREDITO");
        btnPagarCredito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPagarCredito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagarCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarCreditoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagarCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 124, 48));

        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 347, 250));

        menuInicio.setText("Inicio");
        menuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInicioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuInicio);

        menuVolver.setText("Volver");
        menuVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVolverMouseClicked(evt);
            }
        });
        menuVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVolverActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuVolver);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Oculta muestra ciertos objetos de la ventana*/
    private void btnCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoActionPerformed
        btnCredito.setBackground(Color.CYAN);
        lblMonto.setVisible(true);
        txtMonto.setVisible(true);
        btnPagarCredito.setVisible(true);
        txtMonto.setText(null);
        txtMonto.requestFocus();
    }//GEN-LAST:event_btnCreditoActionPerformed

    private void menuVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVolverActionPerformed
        
    }//GEN-LAST:event_menuVolverActionPerformed

    /*Vuelve a la ventan anterior, pasando los datos*/
    private void menuVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVolverMouseClicked
        ParaTransferir_Credito_ServiciosBasicos detalle= new ParaTransferir_Credito_ServiciosBasicos();
        detalle.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVolverMouseClicked

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        
    }//GEN-LAST:event_txtMontoActionPerformed

    private void btnPagarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarCreditoActionPerformed
        /*Verifica si el monto esta vacio*/
        if(txtMonto.getText().isEmpty()){
            JOptionPane.showInternalMessageDialog(null, "Ingrese una cantidad valida en el monto");
        }else{
            /*Muestra la ventana de credito exitoso*/
            VentanaExitosaCredito extCredito= new VentanaExitosaCredito();
            extCredito.mostrarCuentaCompleta(nomComple,numCuenta, saldo,(Float.parseFloat(txtMonto.getText())));
            extCredito.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnPagarCreditoActionPerformed

    /*Vuelve a la ventana detalle*/
    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        ParaTransferir_Credito_ServiciosBasicos detalle = new ParaTransferir_Credito_ServiciosBasicos();
        detalle.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInicioMouseClicked

    /*Metodo que recibe y muestra los datos de la numCuenta*/
    public void mostrarCuentaCompleta(String usuario, int cuenta, float saldo){
    this.nomComple=usuario;
    this.numCuenta=cuenta;
    this.saldo=saldo;
    
    lblNombre.setText(String.valueOf(usuario));
    lblCuenta.setText(String.valueOf(cuenta));
    lblSaldo.setText((" $ ")+String.valueOf(saldo));  
   
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCredito;
    private javax.swing.JButton btnPagarCredito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuVolver;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
