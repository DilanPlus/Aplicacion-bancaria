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

/**
 *
 * @author DilanPlus
 */
public class VentanaTranferencia extends javax.swing.JFrame {
    public Timer tiempo;
    
    public VentanaTranferencia() {
        initComponents();
        mostrarCuenta();
        this.setLocation(500, 150);
        gbtnDestino.add(rbtnDestino);
        btnTransferenciaN.setBackground(Color.LIGHT_GRAY);
        btnTransferenciaI.setBackground(Color.LIGHT_GRAY);
        lblMonto.setVisible(false);
        lblDestino.setVisible(false);
        txtMonto.setVisible(false);
        rbtnDestino.setVisible(false);
        btnTransferir.setVisible(false);
        lblTipo.setVisible(false);
      
        
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
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuVolver = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Nº");

        lblSaldo.setText("000000");

        btnTransferenciaN.setText("Transferencia Nacional");
        btnTransferenciaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaNActionPerformed(evt);
            }
        });

        jLabel6.setText("Saldo");

        lblCuenta.setText("000000");

        btnTransferenciaI.setText("Transferencia Internacional");
        btnTransferenciaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaIActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel1.setText("Detalle de tu cuenta");

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });

        lblMonto.setText("Monto");

        lblDestino.setText("Cuenta destino");

        rbtnDestino.setText("Crear nuevo beneficiario");

        btnTransferir.setText("TRANSFERIR");
        btnTransferir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblTipo.setText("TIPO DE TRANSFERENCIA");

        menuInicio.setText("Inicio");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCuenta))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblSaldo))))
                            .addComponent(btnTransferenciaN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTransferenciaI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMonto)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDestino)
                                    .addComponent(rbtnDestino)
                                    .addComponent(lblMonto))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblTipo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblCuenta))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblSaldo)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTransferenciaN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTransferenciaI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

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
        VentanaDetalle abrir= new VentanaDetalle();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuVolverActionPerformed

    private void menuVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVolverMouseClicked
        VentanaDetalle abrir= new VentanaDetalle();
        abrir.setVisible(true);
        this.setVisible(false);
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
            VentanaDetalle abrir = new VentanaDetalle();
            abrir.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnTransferirActionPerformed

    public void mostrarCuenta(){
    lblCuenta.setText(String.valueOf(EcEduEpnPrograII2022AAplicacionBancaria.nCuenta));
    lblSaldo.setText(String.valueOf(Math.round(EcEduEpnPrograII2022AAplicacionBancaria.nSaldo*100d)/100d));  
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
            java.util.logging.Logger.getLogger(VentanaTranferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTranferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTranferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTranferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTranferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransferenciaI;
    private javax.swing.JButton btnTransferenciaN;
    private javax.swing.JButton btnTransferir;
    private javax.swing.ButtonGroup gbtnDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuVolver;
    private javax.swing.JRadioButton rbtnDestino;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
