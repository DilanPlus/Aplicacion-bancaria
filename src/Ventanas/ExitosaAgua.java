
package Ventanas;
import Clases.ManejosArchivos;
import static Ventanas.Login.usua1;

public class ExitosaAgua extends javax.swing.JFrame {
    /*Variables que reciben los datos de la numCuenta*/
    String usuario;
    int tipoCuenta;
    int Pago;
    String Sumi;
    String Descri;
    String nomComple;
    int numCuenta;
    int saldo;
   
    public ExitosaAgua() {
        initComponents();
        this.setLocation(500, 150);
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblserv = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        lblasunto = new javax.swing.JLabel();
        lblpagoo = new javax.swing.JLabel();
        lblagua = new javax.swing.JLabel();
        lblnumero = new javax.swing.JLabel();
        Descr = new javax.swing.JLabel();
        IrSB = new javax.swing.JButton();
        TituPago = new javax.swing.JLabel();
        lblhaspagado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblserv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblserv.setText("Servicio:");
        jPanel2.add(lblserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNum.setText("Número de Suministro:");
        jPanel2.add(lblNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        lblasunto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblasunto.setText("Asunto:");
        jPanel2.add(lblasunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lblpagoo.setText("0");
        jPanel2.add(lblpagoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 127, -1));

        lblagua.setText("Agua Potable");
        jPanel2.add(lblagua, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 127, -1));

        lblnumero.setText("0");
        jPanel2.add(lblnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 127, -1));

        Descr.setText("Comentario");
        jPanel2.add(Descr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 127, -1));

        IrSB.setBackground(new java.awt.Color(255, 153, 153));
        IrSB.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        IrSB.setText("Pagar otro servicio");
        IrSB.setBorder(null);
        IrSB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IrSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrSBActionPerformed(evt);
            }
        });
        jPanel2.add(IrSB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 205, 140, 40));

        TituPago.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        TituPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituPago.setText("Pago exitoso");
        jPanel2.add(TituPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        lblhaspagado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblhaspagado.setText("Has pagado: ");
        jPanel2.add(lblhaspagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 254));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*Metodos que reciben los datos necesarios para la transaccion*/
    public void setValorpago(int Pago){
        this.Pago = Pago;
        lblpagoo.setText(String.valueOf(Pago));
    }

    public void setSuministro(String Sumi){
        this.Sumi= Sumi;
        lblnumero.setText(Sumi);
    }

    public void setDescripcion(String Descri){
        this.Descri = Descri;
        Descr.setText(Descri);
    }
    
    /*Actualiza los valores base de la numCuenta y volvemos a la ventana servicios basicos*/
    private void IrSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrSBActionPerformed
       //actualizarSaldoCuenta();
       actualizarSaldoCuenta();
       ServiciosBasicos regresa = new ServiciosBasicos();
       regresa.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
       regresa.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_IrSBActionPerformed
    
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
        ManejosArchivos u2=new ManejosArchivos();
        u2.pagar(this.usuario, this.tipoCuenta, this.saldo);
        usua1.setValoragua(0);        
    }   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descr;
    private javax.swing.JButton IrSB;
    private javax.swing.JLabel TituPago;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblagua;
    private javax.swing.JLabel lblasunto;
    private javax.swing.JLabel lblhaspagado;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JLabel lblpagoo;
    private javax.swing.JLabel lblserv;
    // End of variables declaration//GEN-END:variables
}
