
package Ventanas;

import Atxy2k.CustomTextField.RestrictedTextField;
import javax.swing.*;

public class DetallesDeTransferencia extends javax.swing.JFrame {
    /*Variables que reciben los datos de la numCuenta y su tipoTransfe*/
    String nombreCompleto;
    String tituloTransfe;
    int tipoTransfe;
    int numCuenta;
    float saldoDisponible;
    float monto;
  
  
    
    public DetallesDeTransferencia() {
        initComponents();
        this.setLocation(450, 0);
        btnTransferir.setEnabled(false);
        txtMonto.setEditable(false);
        /*Pone restrincciones en los valores y tipos que podes ingresar*/
        RestrictedTextField restricted = new RestrictedTextField(txtCuenta);
        restricted.setLimit(15);
        restricted.setOnlyNums(true);
        RestrictedTextField Identi = new RestrictedTextField(txtIdentificacion);
        Identi.setLimit(10);
        RestrictedTextField telf = new RestrictedTextField(txtTelefono);
        telf.setLimit(10);
        telf.setOnlyNums(true);
        RestrictedTextField sobre = new RestrictedTextField(txtSobrenombre);
        sobre.setOnlyText(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        txtCuenta = new javax.swing.JTextField();
        btnTransferir = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        cmbBanco = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        lblBanco2 = new javax.swing.JLabel();
        txtDatoNombre = new javax.swing.JTextField();
        txtBanco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSobrenombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        lblTransferencia = new javax.swing.JLabel();
        lblBanco1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuVolver = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setForeground(new java.awt.Color(255, 51, 0));
        jLabel14.setText("MONTO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        jLabel15.setForeground(new java.awt.Color(102, 102, 0));
        jLabel15.setText("Monto a transferir*:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        jLabel3.setForeground(new java.awt.Color(102, 102, 0));
        jLabel3.setText("N°. Cuenta*:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMontoKeyReleased(evt);
            }
        });
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 115, -1));

        txtCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentaActionPerformed(evt);
            }
        });
        txtCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCuentaKeyReleased(evt);
            }
        });
        jPanel1.add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 163, -1));

        btnTransferir.setBackground(new java.awt.Color(51, 153, 0));
        btnTransferir.setText("TRANSFERIR");
        btnTransferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 610, 105, 31));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo", "Cuenta de Ahorros", "Cuenta Corriente" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 156, -1));

        cmbBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una entidad", "Banco Pichincha", "Banco General Ruminahui", "Produbanco", "Banco de Loja", "Banco Guayaquil", "Banco Amazonas", "Banco Bolivariano", "Banco Internacional", "Banco del Austro", "Coop de Ahorro y Credito Occidental", "Banco del Pacifico" }));
        cmbBanco.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBancoItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 266, -1));

        jLabel4.setForeground(new java.awt.Color(102, 102, 0));
        jLabel4.setText("Tipo de Cuenta*:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel16.setText("Detalle de tu cuenta");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 326, 47));

        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("DATOS PERSONALES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel17.setText("Nº");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel6.setForeground(new java.awt.Color(102, 102, 0));
        jLabel6.setText("Tipo de Identificación*:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        lblSaldo.setText("000000");
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo", "Pasaporte", "Cedula de Identidad" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 156, -1));

        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel7.setForeground(new java.awt.Color(102, 102, 0));
        jLabel7.setText("N°. de Identificación*:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel18.setText("Saldo");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyReleased(evt);
            }
        });
        jPanel1.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 130, -1));

        jLabel8.setForeground(new java.awt.Color(102, 102, 0));
        jLabel8.setText("Nombres y Apellidos*: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        lblCuenta.setText("000000");
        jPanel1.add(lblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        lblBanco2.setForeground(new java.awt.Color(102, 102, 0));
        lblBanco2.setText("Cooperativa//Banco*:");
        jPanel1.add(lblBanco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txtDatoNombre.setToolTipText("");
        txtDatoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoNombreActionPerformed(evt);
            }
        });
        txtDatoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDatoNombreKeyReleased(evt);
            }
        });
        jPanel1.add(txtDatoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 310, -1));

        txtBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBancoKeyReleased(evt);
            }
        });
        jPanel1.add(txtBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 266, -1));

        jLabel9.setForeground(new java.awt.Color(102, 102, 0));
        jLabel9.setText("Sobrenombre:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jLabel10.setForeground(new java.awt.Color(102, 102, 0));
        jLabel10.setText("(opcional)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 22));

        txtSobrenombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSobrenombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSobrenombreKeyReleased(evt);
            }
        });
        jPanel1.add(txtSobrenombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 310, -1));

        jLabel11.setForeground(new java.awt.Color(255, 51, 0));
        jLabel11.setText("CONTACTO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jLabel12.setForeground(new java.awt.Color(102, 102, 0));
        jLabel12.setText("Correo Electrónico:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 285, -1));

        jLabel13.setForeground(new java.awt.Color(102, 102, 0));
        jLabel13.setText("Número de Telefóno*:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 128, -1));

        btnCancelar.setBackground(new java.awt.Color(102, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 103, 31));

        lblTransferencia.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        lblTransferencia.setForeground(new java.awt.Color(204, 102, 0));
        lblTransferencia.setText("Transferencia Entre Bancos - Cuenta Destino");
        jPanel1.add(lblTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 387, -1));

        lblBanco1.setForeground(new java.awt.Color(102, 102, 0));
        lblBanco1.setText("Cooperativa//Banco*:");
        jPanel1.add(lblBanco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuentaActionPerformed

    }//GEN-LAST:event_txtCuentaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void txtDatoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoNombreActionPerformed
        
    }//GEN-LAST:event_txtDatoNombreActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        /*Vuelve a la ventana detalle*/
        ParaTransferir_Credito_ServiciosBasicos detalle = new ParaTransferir_Credito_ServiciosBasicos();
        detalle.mostrarCuentaCompleta(nombreCompleto, numCuenta, saldoDisponible);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        
    }//GEN-LAST:event_txtMontoActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        /*Se genera un numero aleatorio que validara si la numCuenta existe*/
        int y=(int)(Math.random()*6);
        
        if(y==0){
            JOptionPane.showInternalMessageDialog(null, "Se ha producido un error, vuelva a intentar");
        }else{            
            //Transferencia nacional
            if(tipoTransfe==0){
                ExitosaTransferencia pantalla = new ExitosaTransferencia();
                //Metodos que envian los datos ingresados de la numCuenta destinatario
                pantalla.setNombR(txtDatoNombre.getText());
                pantalla.setNcuenta(txtCuenta.getText());
                pantalla.setCorreo(txtCorreo.getText());
                pantalla.setMonto(this.monto);
                int x=(int)(1000 * Math.random())+1;
                String Ncompr=String.valueOf(x);
                pantalla.setNcomp(Ncompr);
                pantalla.setBanco(cmbBanco.getSelectedItem().toString());
                pantalla.setTipCuent(jComboBox1.getSelectedItem().toString());
                //Envia datos de la numCuenta del nombreCompleto
                pantalla.mostrarCuentaCompleta(nombreCompleto, tituloTransfe, tipoTransfe, numCuenta, saldoDisponible);
                pantalla.setVisible(true);
                this.dispose(); 
                
            //Transferencia internacion
            }else if(tipoTransfe==1){
                ExitosaTransferencia pantalla = new ExitosaTransferencia();
                pantalla.setNombR(txtDatoNombre.getText());
                pantalla.setNcuenta(txtCuenta.getText());
                pantalla.setCorreo(txtCorreo.getText());
                pantalla.setMonto(this.monto);
                int x=(int)(1000 * Math.random())+1;
                String Ncompr=String.valueOf(x);
                pantalla.setNcomp(Ncompr);
                pantalla.setBanco(txtBanco.getText());
                pantalla.setTipCuent(jComboBox1.getSelectedItem().toString());
                //Envia datos de la numCuenta del nombreCompleto
                pantalla.mostrarCuentaCompleta(nombreCompleto, tituloTransfe, tipoTransfe, numCuenta, saldoDisponible);
                pantalla.setVisible(true);
                this.dispose();    
            }
        }
        
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void menuVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVolverMouseClicked
        /*Vuelve a la ventana anterior*/
        TiposDeTransferencias transf= new TiposDeTransferencias();
        transf.mostrarCuentaCompleta(nombreCompleto, numCuenta, saldoDisponible);
        transf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVolverMouseClicked

    private void menuVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVolverActionPerformed
        
    }//GEN-LAST:event_menuVolverActionPerformed

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        /*Vuelve a detalle*/
        ParaTransferir_Credito_ServiciosBasicos detalle = new ParaTransferir_Credito_ServiciosBasicos();
        detalle.mostrarCuentaCompleta(nombreCompleto, numCuenta, saldoDisponible);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInicioMouseClicked

    /*Metodos key released y ItemStateChanged para comprobar si se uso los componente de la ventana*/
    private void txtBancoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBancoKeyReleased
        habilitarTrans();
    }//GEN-LAST:event_txtBancoKeyReleased

    private void txtCuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaKeyReleased
        habilitarTrans();
    }//GEN-LAST:event_txtCuentaKeyReleased

    private void txtIdentificacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyReleased
        habilitarTrans();
    }//GEN-LAST:event_txtIdentificacionKeyReleased

    private void txtDatoNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDatoNombreKeyReleased
        habilitarTrans();
    }//GEN-LAST:event_txtDatoNombreKeyReleased

    private void txtSobrenombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSobrenombreKeyReleased
        
    }//GEN-LAST:event_txtSobrenombreKeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        habilitarTrans();
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtSobrenombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSobrenombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenombreKeyPressed

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        habilitarTrans();
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtMontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyReleased
        habilitarTrans();
    }//GEN-LAST:event_txtMontoKeyReleased

    private void cmbBancoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBancoItemStateChanged
        habilitarTrans();
    }//GEN-LAST:event_cmbBancoItemStateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        habilitarTrans();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        habilitarTrans();

    }//GEN-LAST:event_jComboBox2ItemStateChanged
/*Metodo que recibe los datos de la numCuenta y valor ncesario*/
    public void mostrarCuentaCompleta(String nomComple, String tituloTransfe, int tipoTransfe, int numCuenta, float saldoDisponible, float monto){
            this.nombreCompleto=nomComple;
            this.tituloTransfe=tituloTransfe;
            this.tipoTransfe=tipoTransfe;
            this.numCuenta=numCuenta;
            this.saldoDisponible=saldoDisponible;
            this.monto=monto;

            lblNombre.setText(String.valueOf(nomComple));
            lblTransferencia.setText(String.valueOf(tituloTransfe));    
            lblCuenta.setText(String.valueOf(numCuenta));
            lblSaldo.setText((" $ ")+String.valueOf(saldoDisponible));  
            txtMonto.setText((" $ ")+String.valueOf(monto));  
            /*Comprueba el tipoTransfe de de transaccion que estamos haciendo y oculta la opcion de banco que no corresponde*/
            if(this.tipoTransfe==0){
                    lblBanco2.setVisible(false);
                    txtBanco.setVisible(false);
            }
            if(this.tipoTransfe==1){
                    lblBanco1.setVisible(false);
                    cmbBanco.setVisible(false);
            }
    }
    
/*Metodo que compruba si se cumple con el ingreso de los datos para poder habilitar el boton y continuar*/
    public void habilitarTrans(){
        if (!cmbBanco.getSelectedItem().equals("Seleccione una entidad") || !txtBanco.getText().isEmpty()) {
            if(!txtDatoNombre.getText().isEmpty() && !txtCorreo.getText().isEmpty()
                && !txtCuenta.getText().isEmpty()&& !txtIdentificacion.getText().isEmpty()
                && !txtMonto.getText().isEmpty()&& !txtTelefono.getText().isEmpty()
                && !jComboBox1.getSelectedItem().equals("Seleccione el tipo")
                && !jComboBox2.getSelectedItem().equals("Seleccione el tipo"))
            {
                btnTransferir.setEnabled(true);
            } else {
                btnTransferir.setEnabled(false);
            }
        }else{
            btnTransferir.setEnabled(false);
        }
        
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JComboBox<String> cmbBanco;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblBanco1;
    private javax.swing.JLabel lblBanco2;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTransferencia;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuVolver;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtDatoNombre;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtSobrenombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
