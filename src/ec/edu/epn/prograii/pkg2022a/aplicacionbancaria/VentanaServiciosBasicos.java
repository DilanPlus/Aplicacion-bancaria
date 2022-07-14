/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.epn.prograii.pkg2022a.aplicacionbancaria;

import static ec.edu.epn.prograii.pkg2022a.aplicacionbancaria.VentanaDetalle.lblCuenta;
import static ec.edu.epn.prograii.pkg2022a.aplicacionbancaria.Login.usua1;
import java.util.HashSet;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
public class VentanaServiciosBasicos extends javax.swing.JFrame {
    /*Variables que reciben los datos de la cuenta*/
    String usuario;
    int cuenta;
    float saldo;

    
    public VentanaServiciosBasicos() {
        initComponents();
        /*Oculta ciertos componentes de la ventana*/
        this.setLocation(500, 150);
        
        Acep.setEnabled(false);
         Aceptar2.setEnabled(false);
        listaagua.setVisible(false);
        listaluz.setVisible(false);
        Acep.setVisible(false);
        Aceptar2.setVisible(false);
        Can.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sumin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        TituloSB = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        Aguapotable = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        listaagua = new javax.swing.JComboBox<>();
        listaluz = new javax.swing.JComboBox<>();
        Luz = new javax.swing.JButton();
        Can = new javax.swing.JButton();
        Acep = new javax.swing.JButton();
        Aceptar2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuVolver = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Sumin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 317, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Nº");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        lblSaldo.setText("000000");
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        TituloSB.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        TituloSB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloSB.setText("Servicios Básicos");
        jPanel1.add(TituloSB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        Aguapotable.setText("Agua Potable");
        Aguapotable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aguapotable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AguapotableActionPerformed(evt);
            }
        });
        jPanel1.add(Aguapotable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, -1));

        jLabel6.setText("Saldo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        lblCuenta.setText("000000");
        jPanel1.add(lblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        listaagua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoge la empresa", "Agua Potable Cantón Mejía - EPAA", "Quito - EPMAPS", "Agua Potable Esmeraldas EPMAPS", "Pedro Vicente - EPMAPA" }));
        listaagua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaagua.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaaguaItemStateChanged(evt);
            }
        });
        listaagua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaaguaActionPerformed(evt);
            }
        });
        listaagua.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                listaaguaPropertyChange(evt);
            }
        });
        jPanel1.add(listaagua, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        listaluz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoge la empresa", "Quito - Servicio eléctrico nacional", "Guayaquil - Servicio eléctrico nacional", "Cuenca  - Servicio eléctrico nacional", "CNEL (Excepto Cuenca", "Guayaqil y Quito)" }));
        listaluz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaluzItemStateChanged(evt);
            }
        });
        jPanel1.add(listaluz, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 219, -1));

        Luz.setText("Electricidad - Luz");
        Luz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Luz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuzActionPerformed(evt);
            }
        });
        jPanel1.add(Luz, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        Can.setText("Cancelar");
        Can.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanActionPerformed(evt);
            }
        });
        jPanel1.add(Can, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        Acep.setText("Aceptar");
        Acep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Acep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcepActionPerformed(evt);
            }
        });
        jPanel1.add(Acep, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        Aceptar2.setText("Aceptar");
        Aceptar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar2ActionPerformed(evt);
            }
        });
        jPanel1.add(Aceptar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 428, 311));

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

    private void listaaguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaaguaActionPerformed
        
    }//GEN-LAST:event_listaaguaActionPerformed

    /*Oculta ciertos componentes de la ventana*/
    private void AguapotableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AguapotableActionPerformed
         listaagua.setVisible(true);
         Luz.setVisible(false);
         listaluz.setVisible(false);
         Acep.setVisible(true);
         Can.setVisible(true);
    }//GEN-LAST:event_AguapotableActionPerformed

    private void listaaguaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_listaaguaPropertyChange
  
    }//GEN-LAST:event_listaaguaPropertyChange
    
    /*Oculta y muestra ciertos componentes de la ventana*/
    private void LuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuzActionPerformed
          listaluz.setVisible(true);
         Aguapotable.setVisible(false);
         listaagua.setVisible(false);
         Aceptar2.setVisible(true);
         Can.setVisible(true);
    }//GEN-LAST:event_LuzActionPerformed

    /*Oculta y muestra ciertos componentes de la ventana*/
    private void CanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanActionPerformed
        Luz.setVisible(true);
        Aguapotable.setVisible(true);
        listaluz.setVisible(false);
        listaagua.setVisible(false);
        Acep.setVisible(false);
        Aceptar2.setVisible(false);
        Can.setVisible(false);
                 
    }//GEN-LAST:event_CanActionPerformed

    /*Muestra la centana de cobro de agua y pasa los datos de cuenta*/
    private void AcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcepActionPerformed
        VentanaCobroAgua newpago = new VentanaCobroAgua();
        newpago.mostrarCuentaCompleta(usuario,cuenta,saldo);
        newpago.setValor(usua1.getValoragua());
        newpago.setVisible(true);
        this.dispose();
       
          
      
    }//GEN-LAST:event_AcepActionPerformed

    /*Muestra la centana de cobro de luz y pasa los datos de cuenta*/
    private void Aceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar2ActionPerformed
        VentanaCobroLuz newpago = new VentanaCobroLuz();
        newpago.mostrarCuentaCompleta(usuario,cuenta,saldo);
        newpago.setValor(usua1.getValorluz());
        newpago.setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_Aceptar2ActionPerformed
    
    /*Metodo que compruba si se cumple el escoger la empresa para poder habilitar el boton y continuar*/
    public void empresaluz(){
        if(!listaluz.getSelectedItem().equals("Escoge la empresa")){
            Aceptar2.setEnabled(true);
        }else{
            Aceptar2.setEnabled(false);
        }
    }
    /*Metodo que compruba si se cumple el escoger la empresa para poder habilitar el boton y continuar*/
    public void empresaagua(){
        if(!listaagua.getSelectedItem().equals("Escoge la empresa")){
            Acep.setEnabled(true);
        }else{
            Acep.setEnabled(false);
        }
    }
    
    /*Metodos ItemStateChanged para comprobar si se uso los componente de la ventana*/
    private void listaaguaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaaguaItemStateChanged
        empresaagua();
    }//GEN-LAST:event_listaaguaItemStateChanged

    private void listaluzItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaluzItemStateChanged
        empresaluz();        
    }//GEN-LAST:event_listaluzItemStateChanged

    /*Vuelve a la ventana detalle*/
    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        VentanaDetalle detalle = new VentanaDetalle();
        detalle.mostrarCuentaCompleta(usuario, cuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInicioMouseClicked

    /*Vuelve a la ventana anterior*/
    private void menuVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVolverMouseClicked
        VentanaDetalle detalle= new VentanaDetalle();
        detalle.mostrarCuentaCompleta(usuario, cuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVolverMouseClicked

    private void menuVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVolverActionPerformed

    }//GEN-LAST:event_menuVolverActionPerformed

    /*Metodo que recibe y muestra los datos de la cuenta*/
    public void mostrarCuentaCompleta(String usuario, int cuenta, float saldo){
    this.usuario=usuario;
    this.cuenta=cuenta;
    this.saldo=saldo;
    
    lblNombre.setText(String.valueOf(usuario));
    lblCuenta.setText(String.valueOf(cuenta));
    lblSaldo.setText((" $ ")+String.valueOf(saldo));  
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acep;
    private javax.swing.JButton Aceptar2;
    private javax.swing.JButton Aguapotable;
    private javax.swing.JButton Can;
    private javax.swing.JButton Luz;
    private javax.swing.JLabel Sumin;
    private javax.swing.JLabel TituloSB;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JComboBox<String> listaagua;
    private javax.swing.JComboBox<String> listaluz;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuVolver;
    // End of variables declaration//GEN-END:variables
}
