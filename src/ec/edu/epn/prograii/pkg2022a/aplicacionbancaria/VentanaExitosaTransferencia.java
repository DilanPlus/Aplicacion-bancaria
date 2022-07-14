/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.epn.prograii.pkg2022a.aplicacionbancaria;
import static ec.edu.epn.prograii.pkg2022a.aplicacionbancaria.Login.usua1;
/**
 *
 * @author Elizabeth
 */
public class VentanaExitosaTransferencia extends javax.swing.JFrame {
    /*Variables que reciben los valores de la ventan anterior*/
    String NombRec;
    String Ncuenta;
    String CorreoRec;
    float MontoRec;
    String Ncomp;
    String Banco;
    String TipCuent;

    String usuario;
    String transferencia;
    int tipo;
    int cuenta;
    float saldo;

    /**
     * Creates new form VentanaExitosa
     */
    
    public VentanaExitosaTransferencia() {
        initComponents();
        this.setLocation(450, 150);
    }
    
    /*Metodos que reciben los datos de la cuenta destinatario*/
    public void setNombR(String NombRec){
        this.NombRec=NombRec;
        lblNomRec.setText(NombRec);
    }

    public void setNcuenta(String Ncuenta) {
        this.Ncuenta = Ncuenta;
        lblNcuent.setText(Ncuenta);
    }
     public void setCorreo(String CorreoRec) {
        this.CorreoRec = CorreoRec;
        lblCorreoRec.setText(CorreoRec);
    }
      public void setMonto(float MontoRec) {
        this.MontoRec = MontoRec;
        lblMontoTrans.setText(String.valueOf(MontoRec));
    }
    public void setNcomp(String Ncomp){
        this.Ncomp=Ncomp;
        lblNcomp.setText(Ncomp);
    }
    
     public void setBanco(String Banco){
        this.Banco=Banco;
        lblBanco.setText(Banco);
    }
     
      public void setTipCuent(String TipCuent){
        this.TipCuent=TipCuent;
        lblTipCuent.setText(TipCuent);
    }
    
    /*Metodo que recibe los datos de la cuenta usuario*/  
    public void mostrarCuentaCompleta(String usuario, String transferencia, int tipo, int cuenta, float saldo){
    this.usuario=usuario;
    this.transferencia=transferencia;
    this.tipo=tipo;
    this.cuenta=cuenta;
    this.saldo=saldo;
    
    lblTransferencia.setText(transferencia);
    
    /*Metodo que compruba que tipo de transferencia se realizo y de acuerdo a eso pone una comision*/
    if (tipo==0) {
        /*Verifica si el banco del destinario es el mismo que la del usuario*/
        if (Banco.equals("Banco Pichincha")) {
            this.tipo=2;
            txtComision.setText(String.valueOf(0.0));
        }
            txtComision.setText(String.valueOf(0.5));
        }else if(tipo==1){
            txtComision.setText(String.valueOf(2));
        }
    }
    /*Actualiza los valores base de la cuenta del usuario de acuerdo al tipo de transferencia que se realizo*/
    /*Se verifica la cuenta que estamos utilizado para actualizar los valores en dicha cuenta*/
    public void actualizarSaldoCuenta(){
        if (Home.tipoCuenta==0) {
            if (tipo==0) {
                this.saldo= (float)(saldo-(MontoRec+0.5));
                usua1.setSaldoCorriente(this.saldo);
            }else if(tipo==1){
                this.saldo= (float)(saldo-(MontoRec+2));
                usua1.setSaldoCorriente(this.saldo);
            }else if(tipo==2){
                this.saldo= (float)(saldo-(MontoRec+0));
            }
        }else if(Home.tipoCuenta==1){
            if (tipo==0) {
                this.saldo= (float)(saldo-(MontoRec+0.5));
                usua1.setSaldoCorriente(this.saldo);
            }else if(tipo==1){
                this.saldo= (float)(saldo-(MontoRec+2));
                usua1.setSaldoCorriente(this.saldo);
            }else if(tipo==2){
                this.saldo= (float)(saldo-(MontoRec+0));
            }
        }else if(Home.tipoCuenta==2){
            if (tipo==0) {
                this.saldo= (float)(saldo-(MontoRec+0.5));
                usua1.setSaldoCorriente(this.saldo);
            }else if(tipo==1){
                this.saldo= (float)(saldo-(MontoRec+2));
                usua1.setSaldoCorriente(this.saldo);
            }else if(tipo==2){
                this.saldo= (float)(saldo-(MontoRec+0));
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        lblTransferencia = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblBanco = new javax.swing.JLabel();
        lblNomRec = new javax.swing.JLabel();
        lblNcuent = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCorreoRec = new javax.swing.JLabel();
        btnAcept = new javax.swing.JButton();
        lblMontoTrans = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNcomp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTipCuent = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtComision = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuVolver = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 384, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("Comision por transferencia:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setText("Banco Destino:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel8.setBackground(new java.awt.Color(102, 0, 0));
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("N° Comprobante");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lblBanco.setText("jLabel12");
        jPanel1.add(lblBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        lblNomRec.setText("                                                ");
        jPanel1.add(lblNomRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 327, 21));

        lblNcuent.setText("                                                                  ");
        jPanel1.add(lblNcuent, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 257, 22));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("¡¡¡TRANSFERENCIA EXITOSA!!!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 520, 41));

        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("Tipo de cuenta:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Datos de la transferencia: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lblCorreoRec.setText("                                                ");
        jPanel1.add(lblCorreoRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 327, -1));

        btnAcept.setBackground(new java.awt.Color(51, 153, 0));
        btnAcept.setForeground(new java.awt.Color(255, 255, 255));
        btnAcept.setText("ACEPTAR");
        btnAcept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptActionPerformed(evt);
            }
        });
        jPanel1.add(btnAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, 42));

        lblMontoTrans.setText("                                              ");
        jPanel1.add(lblMontoTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Monto Transferido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        lblNcomp.setText("                                       ");
        jPanel1.add(lblNcomp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 176, 24));

        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Nombre del beneficiario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        lblTipCuent.setText("                                                         ");
        jPanel1.add(lblTipCuent, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setText("N° de cuenta del beneficiario:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtComision.setText("                                              ");
        jPanel1.add(txtComision, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Correo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 378));

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

    /*Vuelve a la ventana detalle actualizando los valores base*/
    private void btnAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptActionPerformed
        actualizarSaldoCuenta();
        VentanaDetalle detalle = new VentanaDetalle();
        detalle.mostrarCuentaCompleta(usuario, cuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAceptActionPerformed

    /*Vuelve a la ventana anterior*/
    private void menuVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVolverMouseClicked
        VentanaDatosTransferencia transfDatos= new VentanaDatosTransferencia();
        transfDatos.mostrarCuentaCompleta(usuario, transferencia, tipo, cuenta, saldo, MontoRec);
        transfDatos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuVolverMouseClicked

    private void menuVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVolverActionPerformed

    }//GEN-LAST:event_menuVolverActionPerformed

    /*Vuelve a la vetana detalle*/
    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        VentanaDetalle detalle = new VentanaDetalle();
        detalle.mostrarCuentaCompleta(usuario, cuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInicioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblBanco;
    public static javax.swing.JLabel lblCorreoRec;
    public static javax.swing.JLabel lblMontoTrans;
    public static javax.swing.JLabel lblNcomp;
    public static javax.swing.JLabel lblNcuent;
    public static javax.swing.JLabel lblNomRec;
    public static javax.swing.JLabel lblTipCuent;
    private javax.swing.JLabel lblTransferencia;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuVolver;
    public static javax.swing.JLabel txtComision;
    // End of variables declaration//GEN-END:variables
}
