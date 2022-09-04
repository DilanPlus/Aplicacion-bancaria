
package Ventanas;

import Clases.*;
import static Ventanas.Home.tipoCuenta;
import static Ventanas.Login.usuario;



public class ExitosaTransferencia extends javax.swing.JFrame {
    /*Variables que reciben los valores de la ventan anterior*/
    String usuarioA;
    String NombRec;
    String Ncuenta;
    String CorreoRec;
    float MontoRec;
    String Ncomp;
    String Banco;
    String TipCuent;

    String nomComple;
    String tituloTransfe;
    int tipoTransfe;
    int numCuenta;
    float saldo;

    public ExitosaTransferencia() {
        initComponents();
        this.setLocation(450, 150);
    }
    
    /*Metodos que reciben los datos de la numCuenta destinatario*/
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
    
    /*Metodo que recibe los datos de la numCuenta nomComple*/  
    public void mostrarCuentaCompleta(String usuario, String tituloTransfe, int tipoTransfe, int numCuenta, float saldo){
        this.nomComple=usuario;
        this.tituloTransfe=tituloTransfe;
        this.tipoTransfe=tipoTransfe;
        this.numCuenta=numCuenta;
        this.saldo=saldo;

        lblTransferencia.setText(tituloTransfe);    
        /*Metodo que compruba que tipoTransfe de tituloTransfe se realizo y de acuerdo a eso pone una comision*/
        if (this.tipoTransfe==0) {
            /*Verifica si el banco del destinario es el mismo que la del nomComple*/
            if (Banco.equals("Banco Pichincha")) {
                this.tipoTransfe=3;
                txtComision.setText("0 %");
            }else{
                this.tipoTransfe=4;
                txtComision.setText("15 %");
            }
        }else if(this.tipoTransfe==1){
                this.tipoTransfe=5;
                txtComision.setText("20 %");
        }
    }
    /*Actualiza los valores base de la numCuenta del nomComple de acuerdo al tipoTransfe de tituloTransfe que se realizo*/
    /*Se verifica la numCuenta que estamos utilizado para actualizar los valores en dicha numCuenta*/
    
    public void actualizarSaldoCuenta(){        
        ManejosArchivos u1=new ManejosArchivos();        
        /*Pagar con la numCuenta Corriente*/
        if (tipoCuenta==0) {
            if (this.tipoTransfe==3) {
                this.saldo= (float)saldo-(MontoRec+(MontoRec*0));
                u1.pagar(usuario, 0, this.saldo);            
                
            }else if(this.tipoTransfe==4){
                this.saldo= (float) (saldo-(MontoRec+(MontoRec*0.15)));
                u1.pagar(usuario, 0,this.saldo);
                
            }else if(this.tipoTransfe==5){
                this.saldo= (float)(saldo-(MontoRec+(MontoRec*0.2)));
                u1.pagar(usuario, 0, this.saldo);
            }
            
         /*Pagar con la numCuenta ahorro*/
        }else if(tipoCuenta==1){
            
            if (this.tipoTransfe==3) {
                this.saldo= (float)saldo-(MontoRec+(MontoRec*0));
                u1.pagar(usuario, 1, this.saldo);              
                
            }else if(this.tipoTransfe==4){
                this.saldo= (float) (saldo-(MontoRec+(MontoRec*0.15)));
                u1.pagar(usuario, 1, this.saldo);
                
            }else if(this.tipoTransfe==5){
                this.saldo= (float)(saldo-(MontoRec+(MontoRec*0.2)));
                u1.pagar(usuario, 1, this.saldo);
            }
        /*Pagar con la numCuenta Credito*/
        }else if(tipoCuenta==2){            
            if (this.tipoTransfe==3) {
                this.saldo= (float)saldo-(MontoRec+(MontoRec*0));
                u1.pagar(usuario, 2, this.saldo);              
                
            }else if(this.tipoTransfe==4){
                this.saldo= (float) (saldo-(MontoRec+(MontoRec*0.15)));
                u1.pagar(usuario, 2, this.saldo);
                
            }else if(this.tipoTransfe==5){
                this.saldo= (float)(saldo-(MontoRec+(MontoRec*0.2)));
                u1.pagar(usuario, 2, this.saldo);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 384, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
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

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
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
        btnAcept.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnAcept.setForeground(new java.awt.Color(255, 255, 255));
        btnAcept.setText("ACEPTAR");
        btnAcept.setBorder(null);
        btnAcept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptActionPerformed(evt);
            }
        });
        jPanel1.add(btnAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 110, 40));

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
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Vuelve a la ventana detalle actualizando los valores base*/
    private void btnAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptActionPerformed
        actualizarSaldoCuenta();
        ParaTransferir_Credito_ServiciosBasicos detalle = new ParaTransferir_Credito_ServiciosBasicos();
        detalle.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAceptActionPerformed


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
    public static javax.swing.JLabel txtComision;
    // End of variables declaration//GEN-END:variables
}
