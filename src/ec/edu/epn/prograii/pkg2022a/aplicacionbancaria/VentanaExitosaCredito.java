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
public class VentanaExitosaCredito extends javax.swing.JFrame {
    String usuario;
    int cuenta;
    float saldo;
    float monto;
    public Timer tiempo;
    
    public VentanaExitosaCredito() {
        initComponents();
        
        this.setLocation(500, 150);
        
        
        /*tiempo = new Timer(1, null);
        tiempo.start();
        tiempo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Metodo para obtener informacion de una variable publica y estatica
                //En este caso le cambie el origen de la variable nCuenta
                lblCuenta.setText(String.valueOf(EcEduEpnPrograII2022AAplicacionBancaria.nCuenta));
        
                //Metodo para obtener inforacion de el label publico y estatica
                //jLabel1.setText(VentanaDetalle.lblCuenta.getText());
        
                //Tambien lo podemos usar para enviar informacion
                //VentanaDetalle.lblCuenta.setText(this.lblCuenta.getText());
            }
        });*/
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
        txtMonto = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        btnAceptarCredito = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuVolver = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        lblMonto.setText("MONTO DEL CREDITO");

        btnAceptarCredito.setText("ACEPTAR");
        btnAceptarCredito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptarCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCreditoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("¡¡¡CREDITO EXITOSO!!!");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btnAceptarCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtMonto)
                    .addComponent(lblMonto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblMonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptarCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVolverActionPerformed
        
    }//GEN-LAST:event_menuVolverActionPerformed

    private void menuVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVolverMouseClicked
        VentanaDetalle detalle= new VentanaDetalle();
        detalle.mostrarCuentaCompleta(usuario, cuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVolverMouseClicked

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void btnAceptarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCreditoActionPerformed
        actualizarSaldoCuenta();
        VentanaDetalle detalle = new VentanaDetalle();
        detalle.mostrarCuentaCompleta(usuario, cuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAceptarCreditoActionPerformed

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        VentanaDetalle detalle = new VentanaDetalle();
        detalle.mostrarCuentaCompleta(usuario, cuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInicioMouseClicked

    public void mostrarCuentaCompleta(String usuario, int cuenta, float saldo, float monto){
    this.usuario=usuario;
    this.cuenta=cuenta;
    this.saldo=saldo;
    this.monto=monto;
    
    txtMonto.setEditable(false);
    txtMonto.setText(String.valueOf(monto));
    }
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
            java.util.logging.Logger.getLogger(VentanaExitosaCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaExitosaCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaExitosaCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaExitosaCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaExitosaCredito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarCredito;
    private javax.swing.ButtonGroup gbtnDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuVolver;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}