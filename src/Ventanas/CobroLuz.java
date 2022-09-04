
package Ventanas;
import static Ventanas.Login.usua1;
import Atxy2k.CustomTextField.RestrictedTextField;


import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CobroLuz extends javax.swing.JFrame {
    String usuario;
    int tipoCuenta;
    float valorluz;
    String nomComple;
    int numCuenta;
    float saldo;
    public Timer tiempo;
   
    
    public CobroLuz() {
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        Txtcontrato = new javax.swing.JTextField();
        lblSaldo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        TxtDescrip = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Cont = new javax.swing.JButton();
        lblCuenta = new javax.swing.JLabel();
        lblpagar = new javax.swing.JLabel();
        lblpago = new javax.swing.JLabel();
        lblmontoluz = new javax.swing.JLabel();
        Txtpago = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Pag = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Nº");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        Txtcontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcontratoActionPerformed(evt);
            }
        });
        jPanel1.add(Txtcontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 388, -1));

        lblSaldo.setText("000000");
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel4.setText("*Descripción:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        TxtDescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescripActionPerformed(evt);
            }
        });
        jPanel1.add(TxtDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 388, -1));

        jLabel18.setText("Saldo");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        Cont.setText("Continuar");
        Cont.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContActionPerformed(evt);
            }
        });
        jPanel1.add(Cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        lblCuenta.setText("000000");
        jPanel1.add(lblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        lblpagar.setText("El valor a pagar es de:");
        jPanel1.add(lblpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lblpago.setText("Pago:");
        jPanel1.add(lblpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        lblmontoluz.setText("0");
        jPanel1.add(lblmontoluz, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 232, -1));

        Txtpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtpagoActionPerformed(evt);
            }
        });
        jPanel1.add(Txtpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 232, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setText("Cobro - Electrecidad-Luz");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Cancel.setText("Cancelar");
        Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel2.setText("Completa el formulario para pagar el servicio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        Pag.setText("Pagar");
        Pag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagActionPerformed(evt);
            }
        });
        jPanel1.add(Pag, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jLabel3.setText("*Cuenta Contrato:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            ServiciosBasicos regresar = new ServiciosBasicos();
            regresar.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
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
        ServiciosBasicos regres= new ServiciosBasicos();
         regres.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
       regres.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void PagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagActionPerformed
        /*Verifica si el valor s pagar se ingreso*/
        if(Txtpago.getText().isEmpty()){
            JOptionPane.showInternalMessageDialog(null, "Por favor, pague la completitud del valor");
        }else{   
            int montoLuzA_Pagar = Integer.parseInt(lblmontoluz.getText());
            int pagarLuz = Integer.parseInt(Txtpago.getText());
            /*Verificamos si se paga la cantidad completa*/
            if(pagarLuz!=montoLuzA_Pagar){
                 JOptionPane.showInternalMessageDialog(null, "Por favor, pague la completitud del valor");
            } else{  
                /*Abrimos la ventana de de exito y pasamos los datos necesarios*/
                ExitosaLuz pagar = new ExitosaLuz();
                pagar.mostrarCuentaCompleta(nomComple,numCuenta, saldo);
                pagar.setValorpago(pagarLuz);
                pagar.setContrato(Txtcontrato.getText());
                pagar.setDescripcion(TxtDescrip.getText());
                
                pagar.usuario(this.usuario,this.tipoCuenta);
                pagar.setVisible(true);
                this.dispose();
                }
        }
    }//GEN-LAST:event_PagActionPerformed

    private void TxtpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtpagoActionPerformed
         
    }//GEN-LAST:event_TxtpagoActionPerformed

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        ParaTransferir_Credito_ServiciosBasicos detalle = new ParaTransferir_Credito_ServiciosBasicos();
        detalle.mostrarCuentaCompleta(nomComple, numCuenta, saldo);
        detalle.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuInicioMouseClicked
 public void mostrarCuentaCompleta(String nomComple, int numCuenta, float saldo){
    this.nomComple=nomComple;
    this.numCuenta=numCuenta;
    this.saldo=saldo;
    
    lblNombre.setText(String.valueOf(nomComple));
    lblCuenta.setText(String.valueOf(numCuenta));
    lblSaldo.setText((" $ ")+String.valueOf(saldo));  
    }
 //
  public void usuario(String usuario,int tipoCuenta){
    this.usuario=usuario;
    this.tipoCuenta=tipoCuenta;
    }
  //

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblmontoluz;
    private javax.swing.JLabel lblpagar;
    private javax.swing.JLabel lblpago;
    private javax.swing.JMenu menuInicio;
    // End of variables declaration//GEN-END:variables
}
