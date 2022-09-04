
package Ventanas;

import Clases.ManejosArchivos;
import static Ventanas.Login.usua1;

public class ExitosaLuz extends javax.swing.JFrame {
    String usuario;
    int tipoCuenta;
    int Pago;
    String nomComple;    
    String Contra;
    String Descri;
    int numCuenta;
    int saldo;
    
    public ExitosaLuz() {
        initComponents();
        this.setLocation(500, 150);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        valorpagado = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Contrato = new javax.swing.JLabel();
        des = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valorpagado.setText("0");
        jPanel1.add(valorpagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 125, -1));

        jLabel7.setText("Electricidad - Luz");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        Contrato.setText("0");
        jPanel1.add(Contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 125, -1));

        des.setText("Comentario");
        jPanel1.add(des, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton2.setText("Pagar otro servicio");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 140, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Pago exitoso");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Has pagado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Servicio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Número de Contrato:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Asunto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 317, 246));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void setValorpago(int Pago){
        this.Pago = Pago;
        valorpagado.setText(String.valueOf(Pago));
    }

    public void setContrato(String Contra){
        this.Contra = Contra;
        Contrato.setText(Contra);
    }
    public void setDescripcion(String Descri){
        this.Descri = Descri;
        des.setText(Descri);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       //actualizarSaldoCuenta();
       actualizarSaldoCuenta();
       ServiciosBasicos regresa = new ServiciosBasicos();
       regresa.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
       regresa.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    /*Recibe los valores de la numCuenta nomComple*/
    public void mostrarCuentaCompleta(String nomComple, int numCuenta, float saldo){
        this.nomComple=nomComple;
        this.numCuenta=numCuenta;
        this.saldo=(int)saldo;
    }
    public void usuario(String usuario,int tipoCuenta){
    this.usuario=usuario;
    this.tipoCuenta=tipoCuenta;
    }
    
    public void actualizarSaldoCuenta(){        
        this.saldo=this.saldo-Pago;
        ManejosArchivos u1=new ManejosArchivos();
        u1.pagar(this.usuario, this.tipoCuenta, this.saldo);
        usua1.setValorluz(0);        
       /* 
        if (Home.tipoCuenta==0) {
                this.saldo=(saldo-(Pago));
                usua1.setValorluz(0);
                usua1.setSaldoCorriente(this.saldo);
        }else if(Home.tipoCuenta==1){
                this.saldo=(saldo-(Pago));
                usua1.setValorluz(0);
                usua1.setSaldoAhorro(this.saldo);
        }else if(Home.tipoCuenta==2){
                this.saldo=(saldo-(Pago));
                usua1.setValorluz(0);
                usua1.setSaldoCredito(this.saldo);
        }*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contrato;
    private javax.swing.JLabel des;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel valorpagado;
    // End of variables declaration//GEN-END:variables
}
