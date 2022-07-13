/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.epn.prograii.pkg2022a.aplicacionbancaria;

import Atxy2k.CustomTextField.RestrictedTextField;
import static ec.edu.epn.prograii.pkg2022a.aplicacionbancaria.VentanaDetalle.lblCuenta;
import static ec.edu.epn.prograii.pkg2022a.aplicacionbancaria.Login.usua1;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
public class VentanaCobroLuz extends javax.swing.JFrame {
    float valorluz;
    String usuario;
    int cuenta;
    float saldo;
    public Timer tiempo;
    /**
     * Creates new form VentanaCobroLuz
     */
    public VentanaCobroLuz() {
        initComponents();
        this.setLocation(450, 0);
        lblpago.setVisible(false);
        lblpagar.setVisible(false);
        Cancel.setVisible(false);
        Pag.setVisible(false);
        lblmontoluz.setVisible(false);
        Txtpago.setVisible(false);
        RestrictedTextField restricted = new RestrictedTextField(Txtcontrato);
        restricted.setLimit(15);
        restricted.setOnlyNums(true);
    }
    public void setValor(float valorluz){
    this.valorluz = valorluz;
    lblmontoluz.setText(String.valueOf(valorluz));
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txtcontrato = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtDescrip = new javax.swing.JTextField();
        Cont = new javax.swing.JButton();
        lblpagar = new javax.swing.JLabel();
        lblpago = new javax.swing.JLabel();
        lblmontoluz = new javax.swing.JLabel();
        Txtpago = new javax.swing.JTextField();
        Cancel = new javax.swing.JButton();
        Pag = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setText("Cobro - Electrecidad-Luz");

        jLabel2.setText("Completa el formulario para pagar el servicio");

        jLabel3.setText("*Cuenta Contrato:");

        Txtcontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcontratoActionPerformed(evt);
            }
        });

        jLabel4.setText("*Descripción:");

        TxtDescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescripActionPerformed(evt);
            }
        });

        Cont.setText("Continuar");
        Cont.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContActionPerformed(evt);
            }
        });

        lblpagar.setText("El valor a pagar es de:");

        lblpago.setText("Pago:");

        lblmontoluz.setText("0");

        Txtpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtpagoActionPerformed(evt);
            }
        });

        Cancel.setText("Cancelar");
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Pag.setText("Pagar");
        Pag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagActionPerformed(evt);
            }
        });

        jLabel17.setText("Nº");

        lblSaldo.setText("000000");

        lblNombre.setText("Nombre");

        jLabel18.setText("Saldo");

        lblCuenta.setText("000000");

        menuInicio.setText("Inicio");
        menuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInicioMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuInicio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(155, 155, 155)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblSaldo))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNombre)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblCuenta))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtDescrip, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txtcontrato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(Cancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Pag)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpagar)
                                    .addComponent(lblpago))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txtpago)
                                    .addComponent(lblmontoluz, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(Cont)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(lblCuenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lblSaldo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txtcontrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cont)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpagar)
                    .addComponent(lblmontoluz))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpago)
                    .addComponent(Txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(Pag))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtDescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescripActionPerformed

    private void TxtcontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcontratoActionPerformed
        
    }//GEN-LAST:event_TxtcontratoActionPerformed

    private void ContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContActionPerformed
        if (usua1.getValorluz()==0) {
            JOptionPane.showInternalMessageDialog(null, "El servicio de electricidad ya esta pagado, GRACIAS");
            VentanaServiciosBasicos regresar = new VentanaServiciosBasicos();
            regresar.mostrarCuentaCompleta(usuario, cuenta, saldo);
            regresar.setVisible(true);
            this.dispose();
        }else{
           if(Txtcontrato.getText().isEmpty()){
            JOptionPane.showInternalMessageDialog(null, "Ingrese el número de cuenta contrato");
            }if(TxtDescrip.getText().isEmpty()){
            JOptionPane.showInternalMessageDialog(null, "Ingrese una descripción");
         }else{  
            lblpago.setVisible(true);
            lblpagar.setVisible(true);
            Cancel.setVisible(true);
            Pag.setVisible(true);
            lblmontoluz.setVisible(true);
            Txtpago.setVisible(true);
            }
        }
    }//GEN-LAST:event_ContActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        VentanaServiciosBasicos regres= new VentanaServiciosBasicos();
         regres.mostrarCuentaCompleta(usuario, cuenta, saldo);
       regres.setVisible(true);
       this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_CancelActionPerformed

    private void PagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagActionPerformed
        if(Txtpago.getText().isEmpty()){
            JOptionPane.showInternalMessageDialog(null, "Por favor, pague la completitud del valor");
        }else{   
        double doubleValue = Double.parseDouble(lblmontoluz.getText());
        double doublepago = Double.parseDouble(Txtpago.getText());
        if(doublepago!=doubleValue){
             JOptionPane.showInternalMessageDialog(null, "Por favor, pague la completitud del valor");
        } else{   VentanaExitosaLuz pagar = new VentanaExitosaLuz();
        pagar.setValorpago(Float.parseFloat(Txtpago.getText()));
        pagar.setContrato(Txtcontrato.getText());
        pagar.setDescripcion(TxtDescrip.getText());
        pagar.setVisible(true);
        this.dispose();
        }}
    }//GEN-LAST:event_PagActionPerformed




    private void TxtpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtpagoActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_TxtpagoActionPerformed

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        VentanaDetalle detalle = new VentanaDetalle();
        detalle.mostrarCuentaCompleta(usuario, cuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInicioMouseClicked
 public void mostrarCuentaCompleta(String usuario, int cuenta, float saldo){
    this.usuario=usuario;
    this.cuenta=cuenta;
    this.saldo=saldo;
    
    lblNombre.setText(String.valueOf(usuario));
    lblCuenta.setText(String.valueOf(cuenta));
    lblSaldo.setText((" $ ")+String.valueOf(saldo));  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Cont;
    private javax.swing.JButton Pag;
    private javax.swing.JTextField TxtDescrip;
    private javax.swing.JTextField Txtcontrato;
    private javax.swing.JTextField Txtpago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblmontoluz;
    private javax.swing.JLabel lblpagar;
    private javax.swing.JLabel lblpago;
    private javax.swing.JMenu menuInicio;
    // End of variables declaration//GEN-END:variables
}
