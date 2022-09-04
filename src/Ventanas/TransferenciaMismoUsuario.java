
package Ventanas;

import Atxy2k.CustomTextField.RestrictedTextField;
import static Ventanas.Login.usuario;
import Clases.*;
import javax.swing.JOptionPane;

public class TransferenciaMismoUsuario extends javax.swing.JFrame {
    
    ManejosArchivos u1=new ManejosArchivos();
    /*Variables que recibiran los datos de la numCuenta de otras  ventanas*/
    String nomComple;
    int numCuenta;
    float saldo;
    
    public TransferenciaMismoUsuario() {
        initComponents();
        this.setLocation(500, 150); 
        mostrarCuentaCompleta();
        RestrictedTextField num = new RestrictedTextField(txtMonto);
        num.setOnlyNums(true);
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionCuentas = new javax.swing.ButtonGroup();
        fondoPantalla = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSaldoCorriente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblSaldoAhorro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtMonto = new javax.swing.JTextField();
        pntC_A = new javax.swing.JRadioButton();
        pntA_C = new javax.swing.JRadioButton();
        btnTransferir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        fondoPantalla.setBackground(new java.awt.Color(255, 255, 255));
        fondoPantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        jLabel1.setText("Transferencia entre tus mismas cuentas");
        fondoPantalla.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel2.setText("Saldo disponible en cuenta corriente   : ");
        fondoPantalla.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 230, -1));

        lblSaldoCorriente.setText("g");
        fondoPantalla.add(lblSaldoCorriente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 130, 20));

        jLabel4.setText("Saldo disponible en cuenta ahorro       : ");
        fondoPantalla.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 220, -1));

        lblSaldoAhorro.setText(" ");
        fondoPantalla.add(lblSaldoAhorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 130, -1));
        fondoPantalla.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 410, 10));
        fondoPantalla.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 410, 10));

        txtMonto.setBackground(new java.awt.Color(204, 255, 255));
        txtMonto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        txtMonto.setText("10");
        fondoPantalla.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 150, 30));

        pntC_A.setBackground(new java.awt.Color(255, 255, 255));
        seleccionCuentas.add(pntC_A);
        pntC_A.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pntC_A.setText("Corriente  ---->   Ahorro");
        pntC_A.setBorder(null);
        pntC_A.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pntC_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pntC_AActionPerformed(evt);
            }
        });
        fondoPantalla.add(pntC_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        pntA_C.setBackground(new java.awt.Color(255, 255, 255));
        seleccionCuentas.add(pntA_C);
        pntA_C.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        pntA_C.setText("Ahorro      ---->  Corriente");
        pntA_C.setBorder(null);
        pntA_C.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fondoPantalla.add(pntA_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        btnTransferir.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnTransferir.setText("Transferir");
        btnTransferir.setBorder(null);
        btnTransferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });
        fondoPantalla.add(btnTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 90, 30));

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
            .addComponent(fondoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pntC_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pntC_AActionPerformed
        
    }//GEN-LAST:event_pntC_AActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed

        if(!(pntC_A.isSelected()) && !(pntA_C.isSelected())){
           javax.swing.JOptionPane.showMessageDialog(this, "Seleccione alguna opción de transferencia");
       }else{
            if(txtMonto.getText().isEmpty()){
                JOptionPane.showInternalMessageDialog(null, "Debe ingresar un valor");
            }else{
            /* transformamos el txt a int */
               int monto = Integer.parseInt(txtMonto.getText());
               System.out.println("Su monto es: "+monto);
           //Obtenemos los saldos CORRIENTE saldoAhorro AHORRO del usuario
           int saldoCorriente=Integer.parseInt(u1.obtenerSaldoCorrienteUsuario(usuario));
           int saldoAhorro=Integer.parseInt(u1.obtenerSaldoAhorroUsuario(usuario));
           
            //verificamos que opcion se eligio          
                if(pntC_A.isSelected()){ 
                    if(monto<=saldoCorriente) {
                        //Se resta el monto del Saldo Corriente 
                        saldoCorriente=saldoCorriente-monto;                        
                        u1.pagar(usuario,0,saldoCorriente);   
                        
                       // Se suma el monto al Saldo Ahorro 
                       saldoAhorro=saldoAhorro+monto;
                       u1.pagar(usuario,1,saldoAhorro);
                       
                       //Mensaje de Exito//
                       javax.swing.JOptionPane.showMessageDialog(this, "Transferencia Exitosa");                       
                        Home home =new Home();
                        home.setVisible(true);
                        this.setVisible(false);
                     }else{
                        javax.swing.JOptionPane.showMessageDialog(this, "No tiene los fondos suficientes para la transferencia");
                    }

                }
                if(pntA_C.isSelected()){
                    
                    System.out.println("Se selecciono A _  C");
                            
                    if(monto<=saldoAhorro){
                        //Se resta el monto del Saldo Ahorro 
                       saldoAhorro=saldoAhorro-monto;
                       u1.pagar(usuario,1,saldoAhorro);
                       
                       // Se suma el monto al Saldo Corriente
                       saldoCorriente=saldoCorriente+monto;
                       u1.pagar(usuario,0,saldoCorriente);
                       
                      // Mensaje de Exito
                      javax.swing.JOptionPane.showMessageDialog(this, "Transferencia Exitosa");
                        Home home =new Home();
                        home.setVisible(true);
                        this.setVisible(false);
                     }else{
                        javax.swing.JOptionPane.showMessageDialog(this, "No tiene los fondos suficientes para la transferencia");
                    }
           
                } 
                
            }
          
        }
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
                        Home home =new Home();
                        home.setVisible(true);
                        this.setVisible(false);
    }//GEN-LAST:event_menuInicioMouseClicked

    /*Metodo que recibe los datos de la numCuenta saldoAhorro los muestra en pantalla*/
    public void mostrarCuentaCompleta(){        
        lblSaldoCorriente.setText(" $ "+u1.obtenerSaldoCorrienteUsuario(usuario));
        lblSaldoAhorro.setText(" $ "+u1.obtenerSaldoAhorroUsuario(usuario));
        System.out.println(u1.obtenerSaldoCorrienteUsuario(usuario));
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransferir;
    private javax.swing.JPanel fondoPantalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblSaldoAhorro;
    private javax.swing.JLabel lblSaldoCorriente;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JRadioButton pntA_C;
    private javax.swing.JRadioButton pntC_A;
    private javax.swing.ButtonGroup seleccionCuentas;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
