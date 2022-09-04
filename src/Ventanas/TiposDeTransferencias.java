
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

public class TiposDeTransferencias extends javax.swing.JFrame {
    /*Variables que recibiran los datos de la numCuenta de otras  ventanas*/
    String nomComple;
    int tipoTransfe;
    int numCuenta;
    float saldo;
    public Timer tiempo;
    
    public TiposDeTransferencias() {
        initComponents();
        /*Ubica la ventana en una posicion especifica*/
        this.setLocation(500, 150);
        
        /*Agrega un radio button al group botton*/
        gbtnDestino.add(rbtnDestino);
        
        /*Pinta los botones de un cierto color*/
        btnTransferenciaN.setBackground(Color.LIGHT_GRAY);
        btnTransferenciaI.setBackground(Color.LIGHT_GRAY);
        btnMismoUsuario.setBackground(Color.LIGHT_GRAY);
        
        /*Oculta objetos de la ventana al ingresar a esta*/
        lblMonto.setVisible(false);
        lblDestino.setVisible(false);
        txtMonto.setVisible(false);
        rbtnDestino.setVisible(false);
        btnTransferir.setVisible(false);
        lblTipo.setVisible(false);
        
        /*Restringe el valor del monto*/
        RestrictedTextField restricted = new RestrictedTextField(txtMonto);
        restricted.setLimit(9999);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtnDestino = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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
        btnMismoUsuario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuVolver = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Nº");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        lblSaldo.setText("000000");
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 80, -1));

        btnTransferenciaN.setText("Transferencia Nacional");
        btnTransferenciaN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferenciaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaNActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransferenciaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 303, 32));

        jLabel6.setText("Saldo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        lblCuenta.setText("000000");
        jPanel1.add(lblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 80, -1));

        btnTransferenciaI.setText("Transferencia Internacional");
        btnTransferenciaI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferenciaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaIActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransferenciaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 303, 31));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel1.setText("Detalle de tu cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 208, 47));

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 303, -1));

        lblMonto.setText("Monto");
        jPanel1.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        lblDestino.setText("Cuenta destino");
        jPanel1.add(lblDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        rbtnDestino.setText("Crear nuevo beneficiario");
        rbtnDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtnDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDestinoActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        btnTransferir.setText("TRANSFERIR");
        btnTransferir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTransferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 124, 48));

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblTipo.setText("TIPO DE TRANSFERENCIA");
        jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        btnMismoUsuario.setText("Transferencia entre tus mismas cuentas");
        btnMismoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMismoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMismoUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnMismoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 300, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 420));

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
        /*Pinta los botones de otro color y muestrar ciertos objetos de la ventana*/
        this.tipoTransfe=0;        
        btnTransferenciaN.setBackground(Color.CYAN);
        btnTransferenciaI.setBackground(Color.LIGHT_GRAY);
        lblMonto.setVisible(true);
        lblDestino.setVisible(true);
        lblTipo.setVisible(true);
        txtMonto.setVisible(true);
        rbtnDestino.setVisible(true);
        btnTransferir.setVisible(true);
        lblTipo.setText("TRANSFERENCIA NACIONAL");
        /*Deselecciona el group button*/
        gbtnDestino.clearSelection();
        /*Borra el valor de monto y ubica para escribir en el*/
        txtMonto.setText(null);
        txtMonto.requestFocus();
    }//GEN-LAST:event_btnTransferenciaNActionPerformed

    private void menuVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVolverActionPerformed
        
    }//GEN-LAST:event_menuVolverActionPerformed

    private void menuVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVolverMouseClicked
        /*Vuelve a la ventana anterior*/
        ParaTransferir_Credito_ServiciosBasicos detalle= new ParaTransferir_Credito_ServiciosBasicos();
        detalle.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVolverMouseClicked

    private void btnTransferenciaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaIActionPerformed
        /*Pinta los botones de otro color y muestrar ciertos objetos de la ventana*/
        this.tipoTransfe=1;
        btnTransferenciaI.setBackground(Color.CYAN);
        btnTransferenciaN.setBackground(Color.LIGHT_GRAY);
        lblMonto.setVisible(true);
        lblDestino.setVisible(true);
        lblTipo.setVisible(true);
        txtMonto.setVisible(true);
        rbtnDestino.setVisible(true);
        btnTransferir.setVisible(true);
        lblTipo.setText("TRANSFERENCIA INTERNACIONAL");
        /*Deselecciona el group button*/
        gbtnDestino.clearSelection();
        /*Borra el valor de monto y ubica para escribir en el*/
        txtMonto.setText(null);
        txtMonto.requestFocus();
    }//GEN-LAST:event_btnTransferenciaIActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        /*Ponemos restricciones al momento de hacer una tituloTransfe y abrir la nueva ventana*/
        /*Verifica si la cantidad del monto es menor a la del saldo*/
        if ((Float.parseFloat(txtMonto.getText()))>saldo ) {
            javax.swing.JOptionPane.showMessageDialog(null, "No tiene los fondos suficientes para la transferencia");
        }else{
            /*Comprueba si el radio button nuevo destinatario esta seleccionado*/    
            if(!(rbtnDestino.isSelected())){
                JOptionPane.showInternalMessageDialog(null, "Seleccione la opcion en nuevo destinatario");
                /*Comprueba si el monto esta vacio*/
                if(txtMonto.getText().isEmpty()){
                    JOptionPane.showInternalMessageDialog(null, "Ingrese una cantidad valida en el monto");
                }
            }else if(txtMonto.getText().isEmpty()){
                JOptionPane.showInternalMessageDialog(null, "Ingrese una cantidad valida en el monto");
                if(!(rbtnDestino.isSelected())){
                    JOptionPane.showInternalMessageDialog(null, "Seleccione la opcion en nuevo destinatario");
                }
            }else{
                /*Ingresamos a la ventna de datos de la tituloTransfe  comprobando que tipoTransfe de tituloTransfe estamos haciendo*/
                /*verifica si es una tituloTransfe nacional*/
                if (tipoTransfe==0) {                
                    /*Accede a la ventana de datos y pasa los datos de la numCuenta y monto y tipoTransfe de tituloTransfe que estamos haciendo*/
                    String tituloTransfe="Transferencia Nacional - Cuenta Destino";                
                    DetallesDeTransferencia pantalla= new DetallesDeTransferencia();
                    pantalla.mostrarCuentaCompleta(nomComple,tituloTransfe ,tipoTransfe,numCuenta, saldo,(Float.parseFloat(txtMonto.getText())));
                    pantalla.setVisible(true);
                    this.dispose();                
                }else if (tipoTransfe==1){
                    /*Accede a la ventana de datos y pasa los datos de la numCuenta y monto y tipoTransfe de tituloTransfe que estamos haciendo*/              
                    String tituloTransfe="Transferencia Internacional - Cuenta Destino";
                    DetallesDeTransferencia pantalla= new DetallesDeTransferencia();
                    pantalla.mostrarCuentaCompleta(nomComple,tituloTransfe ,tipoTransfe,numCuenta, saldo,(Float.parseFloat(txtMonto.getText())));
                    pantalla.setVisible(true);
                    this.dispose();
                }
            }
        }
        
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        /*Vuelve al detalle de numCuenta*/
        ParaTransferir_Credito_ServiciosBasicos detalle = new ParaTransferir_Credito_ServiciosBasicos();
        detalle.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInicioMouseClicked

    private void btnMismoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMismoUsuarioActionPerformed
        /*Accede a tituloTransfe entre cuentas del mismo nomComple*/
        TransferenciaMismoUsuario pantalla=new TransferenciaMismoUsuario();
        pantalla.setVisible(true);
        this.dispose();            
    }//GEN-LAST:event_btnMismoUsuarioActionPerformed

    private void rbtnDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnDestinoActionPerformed

    /*Metodo que recibe los datos de la numCuenta y los muestra en pantalla*/
    public void mostrarCuentaCompleta(String usuario, int cuenta, float saldo){
    this.nomComple=usuario;
    this.numCuenta=cuenta;
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
    private javax.swing.JPanel jPanel1;
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
