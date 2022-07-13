/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.epn.prograii.pkg2022a.aplicacionbancaria;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import Atxy2k.CustomTextField.RestrictedTextField;
import static ec.edu.epn.prograii.pkg2022a.aplicacionbancaria.Login.usua1;

/**
 *
 * @author DilanPlus
 */
public class VentanaTranferencia extends javax.swing.JFrame {
    String usuario;
    int cuenta;
    float saldo;
    public Timer tiempo;
    
    public VentanaTranferencia() {
        initComponents();
        
        this.setLocation(500, 150);
        gbtnDestino.add(rbtnDestino);
        
        btnTransferenciaN.setBackground(Color.LIGHT_GRAY);
        btnTransferenciaI.setBackground(Color.LIGHT_GRAY);
        btnMismoUsuario.setBackground(Color.LIGHT_GRAY);
        
        lblMonto.setVisible(false);
        lblDestino.setVisible(false);
        txtMonto.setVisible(false);
        rbtnDestino.setVisible(false);
        btnTransferir.setVisible(false);
        lblTipo.setVisible(false);
        
        RestrictedTextField restricted = new RestrictedTextField(txtMonto);
        restricted.setLimit(99999);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtnDestino = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        btnTransferenciaN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        btnTransferenciaI = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        rbtnDestino = new javax.swing.JRadioButton();
        btnTransferir = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMismoUsuario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuVolver = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Nº");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 36, -1, -1));

        lblSaldo.setText("000000");
        getContentPane().add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 59, 90, -1));

        btnTransferenciaN.setText("Transferencia Nacional");
        btnTransferenciaN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferenciaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaNActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransferenciaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 303, 32));

        jLabel6.setText("Saldo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 59, -1, -1));

        lblCuenta.setText("000000");
        getContentPane().add(lblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 36, 90, -1));

        btnTransferenciaI.setText("Transferencia Internacional");
        btnTransferenciaI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferenciaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaIActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransferenciaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 303, 31));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel1.setText("Detalle de tu cuenta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 208, 47));

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        getContentPane().add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 303, -1));

        lblMonto.setText("Monto");
        getContentPane().add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblDestino.setText("Cuenta destino");
        getContentPane().add(lblDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        rbtnDestino.setText("Crear nuevo beneficiario");
        rbtnDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        btnTransferir.setText("TRANSFERIR");
        btnTransferir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTransferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 124, 48));

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblTipo.setText("TIPO DE TRANSFERENCIA");
        getContentPane().add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 13, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        btnMismoUsuario.setText("Transferencia entre tus mismas cuentas");
        btnMismoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMismoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMismoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnMismoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 300, 30));

        menuInicio.setText("Inicio");
        menuInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInicioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuInicio);

        menuVolver.setText("Volver");
        menuVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

    private void btnTransferenciaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaNActionPerformed
        btnTransferenciaN.setBackground(Color.CYAN);
        btnTransferenciaI.setBackground(Color.LIGHT_GRAY);
        lblMonto.setVisible(true);
        lblDestino.setVisible(true);
        lblTipo.setVisible(true);
        txtMonto.setVisible(true);
        rbtnDestino.setVisible(true);
        btnTransferir.setVisible(true);
        lblTipo.setText("TRANSFERENCIA NACIONAL");
        gbtnDestino.clearSelection();
        txtMonto.setText(null);
        txtMonto.requestFocus();
    }//GEN-LAST:event_btnTransferenciaNActionPerformed

    private void menuVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVolverActionPerformed
        
    }//GEN-LAST:event_menuVolverActionPerformed

    private void menuVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVolverMouseClicked
        VentanaDetalle detalle= new VentanaDetalle();
        detalle.mostrarCuentaCompleta(usuario, cuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVolverMouseClicked

    private void btnTransferenciaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaIActionPerformed
        btnTransferenciaI.setBackground(Color.CYAN);
        btnTransferenciaN.setBackground(Color.LIGHT_GRAY);
        lblMonto.setVisible(true);
        lblDestino.setVisible(true);
        lblTipo.setVisible(true);
        txtMonto.setVisible(true);
        rbtnDestino.setVisible(true);
        btnTransferir.setVisible(true);
        lblTipo.setText("TRANSFERENCIA INTERNACIONAL");
        gbtnDestino.clearSelection();
        txtMonto.setText(null);
        txtMonto.requestFocus();
    }//GEN-LAST:event_btnTransferenciaIActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        if ((Float.parseFloat(txtMonto.getText()))>usua1.getSaldoCorriente() ) {
            javax.swing.JOptionPane.showMessageDialog(null, "No tiene los fondos suficientes para la transferencia");
        }else{
        if(!(rbtnDestino.isSelected())){
            JOptionPane.showInternalMessageDialog(null, "Seleccione la opcion en nuevo destinatario");
            if(txtMonto.getText().isEmpty()){
                JOptionPane.showInternalMessageDialog(null, "Ingrese una cantidad valida en el monto");
            }
        }else if(txtMonto.getText().isEmpty()){
            JOptionPane.showInternalMessageDialog(null, "Ingrese una cantidad valida en el monto");
            if(!(rbtnDestino.isSelected())){
                JOptionPane.showInternalMessageDialog(null, "Seleccione la opcion en nuevo destinatario");
            }
        }else{
            String type=lblTipo.getText();
            if (type.equals("TRANSFERENCIA NACIONAL")) {
                int tipo=0;
                String transferencia="Transferencia Nacional - Cuenta Destino";
                VentanaDatosTransferencia ventanadatosTransferencia= new VentanaDatosTransferencia();
                ventanadatosTransferencia.mostrarCuentaCompleta(usuario,transferencia ,tipo,cuenta, saldo,(Float.parseFloat(txtMonto.getText())));
                ventanadatosTransferencia.setVisible(true);
                this.dispose();
                
            }else if (type.equals("TRANSFERENCIA INTERNACIONAL")) {
                int tipo=1;
                String transferencia="Transferencia Internacional - Cuenta Destino";
                VentanaDatosTransferencia ventanadatosTransferencia= new VentanaDatosTransferencia();
                ventanadatosTransferencia.mostrarCuentaCompleta(usuario,transferencia ,tipo,cuenta, saldo,(Float.parseFloat(txtMonto.getText())));
                ventanadatosTransferencia.setVisible(true);
                this.dispose();
            }
        }
            // abrir = new VentanaDetalle();
            //abrir.setVisible(true);
            //this.dispose();
        }
        
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        VentanaDetalle detalle = new VentanaDetalle();
        detalle.mostrarCuentaCompleta(usuario, cuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInicioMouseClicked

    private void btnMismoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMismoUsuarioActionPerformed
        VentanaTransfereMismoUsuario ventanaTransfereMismoUsuario=new VentanaTransfereMismoUsuario();
        ventanaTransfereMismoUsuario.setVisible(true);
        this.setVisible(false);             
    }//GEN-LAST:event_btnMismoUsuarioActionPerformed

    private void rbtnDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnDestinoActionPerformed

    public void mostrarCuentaCompleta(String usuario, int cuenta, float saldo){
    this.usuario=usuario;
    this.cuenta=cuenta;
    this.saldo=saldo;
    
    lblNombre.setText(String.valueOf(usuario));
    lblCuenta.setText(String.valueOf(cuenta));
    lblSaldo.setText((" $ ")+String.valueOf(saldo));  
   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMismoUsuario;
    private javax.swing.JButton btnTransferenciaI;
    private javax.swing.JButton btnTransferenciaN;
    private javax.swing.JButton btnTransferir;
    private javax.swing.ButtonGroup gbtnDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuVolver;
    private javax.swing.JRadioButton rbtnDestino;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
