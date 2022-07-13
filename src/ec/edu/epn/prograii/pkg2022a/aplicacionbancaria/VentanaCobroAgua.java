/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.epn.prograii.pkg2022a.aplicacionbancaria;

import javax.swing.JOptionPane;
import Atxy2k.CustomTextField.RestrictedTextField;
import static ec.edu.epn.prograii.pkg2022a.aplicacionbancaria.VentanaDetalle.lblCuenta;
import static ec.edu.epn.prograii.pkg2022a.aplicacionbancaria.Login.usua1;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
public class VentanaCobroAgua extends javax.swing.JFrame {
    /*Variables que reciben los datos de la cuenta*/
    float valoragua;
    String usuario;
    int cuenta;
    float saldo;

    public VentanaCobroAgua() {
        initComponents();
        this.setLocation(450, 0);
        
        /*Oculta ciertos componentes de la ventana y restringe el valores*/
        Valoragua.setVisible(false);
        Valorpagoagua.setVisible(false);
        Pagaragua.setVisible(false);
        Txtpago.setVisible(false);
        Cance.setVisible(false);
        PagarAgua.setVisible(false);
        RestrictedTextField restricted = new RestrictedTextField(suministro);
        restricted.setLimit(15);
        restricted.setOnlyNums(true);
    }
     /*Metodo que recibe los datos de la ventana anterior de el valor de agua*/
    public void setValor(float valoragua){
        this.valoragua = valoragua;
        Valorpagoagua.setText(String.valueOf(valoragua));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Lblsumi = new javax.swing.JLabel();
        suministro = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        jLabel2 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Pagua = new javax.swing.JButton();
        Valoragua = new javax.swing.JLabel();
        Valorpagoagua = new javax.swing.JLabel();
        Pagaragua = new javax.swing.JLabel();
        Txtpago = new javax.swing.JTextField();
        PagarAgua = new javax.swing.JButton();
        Cance = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuVolver = new javax.swing.JMenu();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setText("Completa el formulario para pagar el servicio");

        Lblsumi.setText("*Número de suministro:");

        suministro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suministroActionPerformed(evt);
            }
        });

        jLabel2.setText("*Descripción:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Cobro - Agua Potable");

        Pagua.setText("Continuar");
        Pagua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pagua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaguaActionPerformed(evt);
            }
        });

        Valoragua.setText("El valor a pagar es de:");

        Valorpagoagua.setText("0");
        Valorpagoagua.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ValorpagoaguaPropertyChange(evt);
            }
        });

        Pagaragua.setText("Pago:");

        Txtpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtpagoActionPerformed(evt);
            }
        });

        PagarAgua.setText("Pagar");
        PagarAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarAguaActionPerformed(evt);
            }
        });

        Cance.setText("Cancelar");
        Cance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanceActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Valoragua)
                                    .addComponent(Pagaragua))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Valorpagoagua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(descripcion)
                                .addComponent(suministro)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(Lblsumi)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(65, 65, 65))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNombre)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblCuenta))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblSaldo))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Pagua)
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(Cance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PagarAgua)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
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
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lblsumi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suministro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pagua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Valoragua)
                    .addComponent(Valorpagoagua, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pagaragua)
                    .addComponent(Txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PagarAgua)
                    .addComponent(Cance))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void suministroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suministroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suministroActionPerformed

     /*Metodo que vuelve a la ventana servicios basicos*/
    private void CanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanceActionPerformed
       VentanaServiciosBasicos regresar = new VentanaServiciosBasicos();
       regresar.mostrarCuentaCompleta(usuario, cuenta, saldo);
       regresar.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CanceActionPerformed

    private void PaguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaguaActionPerformed
        /*Verifica si el valor de agua es cero (pagado) por lo tanto se regresara a la anterior ventana*/
        if (usua1.getValoragua()==0) {
            JOptionPane.showInternalMessageDialog(null, "El servicio de agua potable ya esta pagado, GRACIAS");
            VentanaServiciosBasicos regresar = new VentanaServiciosBasicos();
            regresar.mostrarCuentaCompleta(usuario, cuenta, saldo);
            regresar.setVisible(true);
            this.dispose();
        }else{
            /*Verifica si se lleno todos los datos necesarios muestra ciertos componentes*/
            if(suministro.getText().isEmpty()){
                JOptionPane.showInternalMessageDialog(null, "Ingrese el número de suministro");
            }if(descripcion.getText().isEmpty()){
                JOptionPane.showInternalMessageDialog(null, "Ingrese una descripción");
            }else{  
            Valoragua.setVisible(true);
            Valorpagoagua.setVisible(true);
            Pagaragua.setVisible(true);
            Txtpago.setVisible(true);
            Cance.setVisible(true);
            PagarAgua.setVisible(true);
        }
        }
    }//GEN-LAST:event_PaguaActionPerformed

    private void PagarAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarAguaActionPerformed
        /*Verifica si el valor s pagar se ingreso*/
        if(Txtpago.getText().isEmpty()){
            JOptionPane.showInternalMessageDialog(null, "Por favor, pague la completitud del valor");
         }else{  
            double doubleValue = Double.parseDouble(Valorpagoagua.getText());
            double doublepago = Double.parseDouble(Txtpago.getText());
        /*Verificamos si se paga la cantidad completa*/
        if(doublepago!=doubleValue){
            JOptionPane.showInternalMessageDialog(null, "Por favor, pague la completitud del valor");
        }else {   
            /*Abrimos la ventana de de exito y pasamos los datos necesarios*/
            VentanaExitosaAgua pagar = new VentanaExitosaAgua();
            pagar.mostrarCuentaCompleta(usuario,cuenta, saldo);
            pagar.setValorpago(Float.parseFloat(Txtpago.getText()));
            pagar.setSuministro(suministro.getText());
            pagar.setDescripcion(descripcion.getText());
            pagar.setVisible(true);
            this.dispose();}
        }
    }//GEN-LAST:event_PagarAguaActionPerformed

    private void TxtpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtpagoActionPerformed
        
    }//GEN-LAST:event_TxtpagoActionPerformed

    private void ValorpagoaguaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ValorpagoaguaPropertyChange
      
    }//GEN-LAST:event_ValorpagoaguaPropertyChange

    /*Volvemos a la ventana detalle*/
    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        VentanaDetalle detalle = new VentanaDetalle();
        detalle.mostrarCuentaCompleta(usuario, cuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInicioMouseClicked

    /*Volvemos a la ventana anterior*/
    private void menuVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVolverMouseClicked
        VentanaServiciosBasicos servicios= new VentanaServiciosBasicos();
        servicios.mostrarCuentaCompleta(usuario, cuenta, saldo);
        servicios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVolverMouseClicked

    private void menuVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVolverActionPerformed

    }//GEN-LAST:event_menuVolverActionPerformed
    
    /*Metodo que recibe y muestra los valores de la cuenta*/
    public void mostrarCuentaCompleta(String usuario, int cuenta, float saldo){
    this.usuario=usuario;
    this.cuenta=cuenta;
    this.saldo=saldo;
    
    lblNombre.setText(String.valueOf(usuario));
    lblCuenta.setText(String.valueOf(cuenta));
    lblSaldo.setText((" $ ")+String.valueOf(saldo));  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cance;
    private javax.swing.JLabel Lblsumi;
    private javax.swing.JButton PagarAgua;
    private javax.swing.JLabel Pagaragua;
    private javax.swing.JButton Pagua;
    private javax.swing.JTextField Txtpago;
    private javax.swing.JLabel Valoragua;
    private javax.swing.JLabel Valorpagoagua;
    private javax.swing.JTextField descripcion;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuVolver;
    private javax.swing.JTextField suministro;
    // End of variables declaration//GEN-END:variables
}
