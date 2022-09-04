
package Ventanas;

import static Ventanas.Login.usua1;
import javax.swing.JOptionPane;
import Atxy2k.CustomTextField.RestrictedTextField;




public class CobroAgua extends javax.swing.JFrame {
    /*Variables que reciben los datos de la numCuenta*/
    String usuario;
    int tipoCuenta;
    float valoragua;
    String nomComple;
    int numCuenta;
    float saldo;

    public CobroAgua() {
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

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 0), new java.awt.Dimension(2, 32767));
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Lblsumi = new javax.swing.JLabel();
        suministro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Pagua = new javax.swing.JButton();
        lblCuenta = new javax.swing.JLabel();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuVolver = new javax.swing.JMenu();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 374, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Completa el formulario para pagar el servicio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 337, -1));

        Lblsumi.setText("*Número de suministro:");
        jPanel1.add(Lblsumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        suministro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suministroActionPerformed(evt);
            }
        });
        jPanel1.add(suministro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 402, -1));

        jLabel2.setText("*Descripción:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        jPanel1.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 402, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel3.setText("Cobro - Agua Potable");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Pagua.setText("Continuar");
        Pagua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pagua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaguaActionPerformed(evt);
            }
        });
        jPanel1.add(Pagua, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        lblCuenta.setText("000000");
        jPanel1.add(lblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        Valoragua.setText("El valor a pagar es de:");
        jPanel1.add(Valoragua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        Valorpagoagua.setText("0");
        Valorpagoagua.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ValorpagoaguaPropertyChange(evt);
            }
        });
        jPanel1.add(Valorpagoagua, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 263, -1));

        Pagaragua.setText("Pago:");
        jPanel1.add(Pagaragua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        Txtpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtpagoActionPerformed(evt);
            }
        });
        jPanel1.add(Txtpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 263, -1));

        PagarAgua.setText("Pagar");
        PagarAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarAguaActionPerformed(evt);
            }
        });
        jPanel1.add(PagarAgua, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        Cance.setText("Cancelar");
        Cance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanceActionPerformed(evt);
            }
        });
        jPanel1.add(Cance, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel17.setText("Nº");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        lblSaldo.setText("000000");
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel18.setText("Saldo");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 455, 390));

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

    private void suministroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suministroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suministroActionPerformed

     /*Metodo que vuelve a la ventana servicios basicos*/
    private void CanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanceActionPerformed
       ServiciosBasicos regresar = new ServiciosBasicos();
       regresar.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
       regresar.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CanceActionPerformed

    private void PaguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaguaActionPerformed
        /*Verifica si el valor de agua es cero (pagado) por lo tanto se regresara a la anterior ventana*/
        if (usua1.getValoragua()==0) {
            JOptionPane.showInternalMessageDialog(null, "El servicio de agua potable ya esta pagado, GRACIAS");
            ServiciosBasicos regresar = new ServiciosBasicos();
            regresar.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
            regresar.setVisible(true);
            this.dispose();
        }else{
            //Verifica si se lleno todos los datos necesarios muestra ciertos componentes
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
            int montoAguaA_pagar = Integer.parseInt(Valorpagoagua.getText());
            int pagarAgua = Integer.parseInt(Txtpago.getText());
            /*Verificamos si se paga la cantidad completa*/
            if(pagarAgua!=montoAguaA_pagar){
                JOptionPane.showInternalMessageDialog(null, "Por favor, pague la completitud del valor");
            }else {   
                /*Abrimos la ventana de de exito y pasamos los datos necesarios*/
                ExitosaAgua pagar = new ExitosaAgua();
                pagar.mostrarCuentaCompleta(nomComple,numCuenta, saldo);
                pagar.setValorpago(pagarAgua);
                pagar.setSuministro(suministro.getText());
                pagar.setDescripcion(descripcion.getText());
                
                pagar.usuario(this.usuario,this.tipoCuenta);
                pagar.setVisible(true);
                this.dispose();
                }
        }
    }//GEN-LAST:event_PagarAguaActionPerformed

    private void TxtpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtpagoActionPerformed
        
    }//GEN-LAST:event_TxtpagoActionPerformed

    private void ValorpagoaguaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ValorpagoaguaPropertyChange
      
    }//GEN-LAST:event_ValorpagoaguaPropertyChange

    /*Volvemos a la ventana detalle*/
    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        ParaTransferir_Credito_ServiciosBasicos detalle = new ParaTransferir_Credito_ServiciosBasicos();
        detalle.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInicioMouseClicked

    /*Volvemos a la ventana anterior*/
    private void menuVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVolverMouseClicked
        ServiciosBasicos servicios= new ServiciosBasicos();
        servicios.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
        servicios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVolverMouseClicked

    private void menuVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVolverActionPerformed

    }//GEN-LAST:event_menuVolverActionPerformed
    
    /*Metodo que recibe y muestra los valores de la numCuenta*/
    public void mostrarCuentaCompleta(String usuario, int cuenta, float saldo){
    this.nomComple=usuario;
    this.numCuenta=cuenta;
    this.saldo=saldo;
    
    lblNombre.setText(String.valueOf(usuario));
    lblCuenta.setText(String.valueOf(cuenta));
    lblSaldo.setText((" $ ")+String.valueOf(saldo));  
    }
    
    //
    public void usuario(String usuario,int tipoCuenta){
    this.usuario=usuario;
    this.tipoCuenta=tipoCuenta;
    }
    //
    

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuVolver;
    private javax.swing.JTextField suministro;
    // End of variables declaration//GEN-END:variables
}
