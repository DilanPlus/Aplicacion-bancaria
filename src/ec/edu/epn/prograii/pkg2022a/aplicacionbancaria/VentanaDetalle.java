/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.epn.prograii.pkg2022a.aplicacionbancaria;

import Clases.Tiempo;
import static ec.edu.epn.prograii.pkg2022a.aplicacionbancaria.Login.usua1;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;


public class VentanaDetalle extends javax.swing.JFrame {
    /*Variables que recibiran los datos de la cuenta de otras  ventanas*/
    String usuario;
    int cuenta;
    float saldo;
    /*Instancia para mostrar el tiempo de la ultima sesion*/
    Tiempo time= new Tiempo();
 
    
    public VentanaDetalle() {
        initComponents();
        mostrarTiempo();
        /*Ubica la ventana en una posicion especifica*/
        this.setLocation(500, 150);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCuenta = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        btnTransferir = new javax.swing.JButton();
        btnCredito = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnServicios = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuVolver = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCuenta.setText("000000");
        jPanel1.add(lblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel6.setText("SALDO DISPONIBLE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblSaldo.setText("000,00");
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 36));

        btnTransferir.setText("TRANSFERIR");
        btnTransferir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTransferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 124, 48));

        btnCredito.setText("CREDITO");
        btnCredito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCredito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 124, 48));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel1.setText("Detalle de tu cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgdelUsuario.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 63, -1));

        jLabel2.setText("Hola");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        btnServicios.setText("SERVICIOS BASICOS");
        btnServicios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnServicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosActionPerformed(evt);
            }
        });
        jPanel1.add(btnServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 124, 48));

        lblNombre.setText("Dilan");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel4.setText("Ultima sesion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblFecha.setText("00/00/0000");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel5.setText("Nº");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jMenuBar1.setName(""); // NOI18N

        menuInicio.setText("Inicio");
        menuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInicioMouseClicked(evt);
            }
        });
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoActionPerformed
        /*Se accede a la ventana de credito y se pasan los datos de la cuenta*/
        VentanaCredito credito = new VentanaCredito();
        credito.mostrarCuentaCompleta(usuario, cuenta, saldo);
        credito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCreditoActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        /*Se accede a la ventana de transferencia y se pasan los datos de la cuenta*/
        VentanaTranferencia transferencia = new VentanaTranferencia();
        transferencia.mostrarCuentaCompleta(usuario, cuenta, saldo);
        transferencia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuInicioActionPerformed

    private void menuVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVolverActionPerformed
        
    }//GEN-LAST:event_menuVolverActionPerformed

    private void menuVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVolverMouseClicked
        /*Regresa a la ventana home*/
        Home home= new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVolverMouseClicked

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        /*Regresa a la ventana home*/
        Home home= new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInicioMouseClicked

    private void btnServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosActionPerformed
        /*Se accede a la ventana de servicios basicos y se pasan los datos de la cuenta*/
        VentanaServiciosBasicos servicios = new VentanaServiciosBasicos();
        servicios.mostrarCuentaCompleta(usuario, cuenta, saldo);
        servicios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnServiciosActionPerformed

    /*Muestra el tiempo de la ultima sesion*/
    public  void mostrarTiempo(){
    lblFecha.setText(time.fechaCompleta);
    }
    
    /*Metodo que recibe los datos de la cuenta de otras ventanas y los muestra en pantalla*/
    public void mostrarCuentaCompleta(String usuario, int cuenta, float saldo){
    this.usuario=usuario;
    this.cuenta=cuenta;
    this.saldo=saldo;
    
    lblNombre.setText(String.valueOf(usuario));
    lblCuenta.setText(String.valueOf(cuenta));
    lblSaldo.setText((" $ ")+String.valueOf(saldo));  
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCredito;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuVolver;
    // End of variables declaration//GEN-END:variables
}
