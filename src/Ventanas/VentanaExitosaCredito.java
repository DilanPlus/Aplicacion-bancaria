/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

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
import static Ventanas.Login.usua1;

/**
 *
 * @author DilanPlus
 */
public class VentanaExitosaCredito extends javax.swing.JFrame {
    String usuario;
    int cuenta;
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
        menuInicio = new javax.swing.JMenu();

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

        menuInicio.setText("Inicio");
        menuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInicioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuInicio);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        
    }//GEN-LAST:event_txtMontoActionPerformed

    
    private void btnAceptarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCreditoActionPerformed
        /*Genera un numero aleatior para validar el credito*/
        int y=(int)(Math.random()*6);
        if (y==0) {
            JOptionPane.showInternalMessageDialog(null, "Lo sentimos no se concreto el credito\" ¡¡Vuelve a intentarlo!!\"");
        }else{
            /*Vuelve a la ventana detalle actualizando los valores base*/
        //actualizarSaldoCuenta();
        ParaTransferir_Credito_ServiciosBasicos detalle = new ParaTransferir_Credito_ServiciosBasicos();
        detalle.mostrarCuentaCompleta(usuario, cuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btnAceptarCreditoActionPerformed

    /*Vuelve a la ventana detalle*/
    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        ParaTransferir_Credito_ServiciosBasicos detalle = new ParaTransferir_Credito_ServiciosBasicos();
        detalle.mostrarCuentaCompleta(usuario, cuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInicioMouseClicked

    /*Metodo que recibe los datos de la cuenta usuario*/
    public void mostrarCuentaCompleta(String usuario, int cuenta, float saldo, float monto){
    this.usuario=usuario;
    this.cuenta=cuenta;
    this.saldo=saldo;
    this.monto=monto;
    
    txtMonto.setEditable(false);
    txtMonto.setText(String.valueOf(monto));
    }
    /*Verifica a que tipo de cuenta del usuario se va a actualizar los valores base
    public void actualizarSaldoCuenta(){
        if (Home.tipoCuenta==0) {
                this.saldo=(saldo-(monto));
                usua1.setSaldoCorriente(this.saldo);
        }else if(Home.tipoCuenta==1){
                this.saldo=(saldo-(monto));
                usua1.setSaldoAhorro(this.saldo);
        }else if(Home.tipoCuenta==2){
                this.saldo=(saldo-(monto));
                usua1.setSaldoCredito(this.saldo);
        }
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarCredito;
    private javax.swing.ButtonGroup gbtnDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
